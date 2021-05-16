package com.snack.leetcode.n792;

import java.util.ArrayList;
import java.util.List;

public class Solution2 {

    public int numMatchingSubseq(String s, String[] words) {
        int ans = 0;
        List<Node>[] heads = new ArrayList[26];
        for (int i = 0; i < 26; ++i) {
            heads[i] = new ArrayList<Node>();
        }
        for (String word : words) {
            List<Node> nodes = heads[word.charAt(0) - 'a'];
            if (nodes == null) {
                nodes = new ArrayList<>();
            }
            nodes.add(new Node(word, 0));
            heads[word.charAt(0) - 'a'] = nodes;
        }
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            List<Node> nodes = heads[ch - 'a'];
            heads[ch - 'a'] = new ArrayList<>();
            for (Node node : nodes) {
                node.index++;
                if (node.index == node.word.length()) {
                    ans++;
                    continue;
                }
                heads[node.word.charAt(node.index) - 'a'].add(node);
            }
//            nodes.clear();
        }
        return ans;
    }
}

class Node {
    String word;
    int index;

    public Node(String w, int i) {
        word = w;
        index = i;
    }
}