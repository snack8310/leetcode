package com.snack.leetcode.n1258;

import java.util.*;

public class Solution {
    Map<String, Set<String>> dict = new HashMap<>();
    Map<String, String> hashDict = new HashMap<>();

    public List<String> generateSentences(List<List<String>> synonyms, String text) {
        createDict(synonyms);
        List<String[]> wordList = getWords(text);
        List<String> ret = new ArrayList<>();
        List<String> path = new ArrayList<>();
        dfs(wordList, path, ret);
        return ret;
    }

    private List<String[]> getWords(String text) {
        // 替换
        String[] words = text.split(" ");
        List<String[]> wordList = new ArrayList<>();
        for (String word : words) {
            if (hashDict.containsKey(word)) {
                Set<String> set = dict.get(hashDict.get(word));
                wordList.add(set.toArray(new String[set.size()]));
            } else {
                wordList.add(new String[]{word});
            }
        }
        return wordList;
    }

    private void dfs(List<String[]> wordList, List<String> path, List<String> ret) {
        if (path.size() == wordList.size()) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < path.size(); i++) {
                sb.append(path.get(i));
                if (i != path.size() - 1) {
                    sb.append(" ");
                }
            }
            ret.add(sb.toString());
            return;
        }
        int index = path.size();
        String[] words = wordList.get(index);
        for (int i = 0; i < words.length; i++) {
            path.add(words[i]);
            dfs(wordList, path, ret);
            path.remove(path.size() - 1);
        }
        return;
    }

    private void createDict(List<List<String>> synonyms) {
        for (List<String> synonym : synonyms) {
            Collections.sort(synonym);
            String key = synonym.get(0);
            //hash
            if (hashDict.containsKey(key)) {
                key = hashDict.get(key);
            }
            //save dict
            Set<String> set = dict.getOrDefault(key, new TreeSet<>());
            for (int i = 0; i < synonym.size(); i++) {
                set.add(synonym.get(i));
                if (dict.containsKey(hashDict.get(synonym.get(i)))) {
                    set.addAll(dict.get(hashDict.get(synonym.get(i))));
                    dict.remove(hashDict.get(synonym.get(i)));
                }
            }
            dict.put(key, set);
            for (String hs : set) {
                hashDict.put(hs, key);
            }
        }
    }
}
