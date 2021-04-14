package com.snack.leetcode.n208;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TrieTest {

    Trie trie;

    @Before
    public void setUp() throws Exception {
        trie = new Trie();
    }

    @Test
    public void Trie() {
        trie.insert("apple");
        boolean out = trie.search("apple");
        Assert.assertTrue(out);
    }

    @Test
    public void Trie2() {
        trie.insert("apple");
        trie.search("apple");
        boolean out = trie.search("app");
        Assert.assertFalse(out);
    }

    @Test
    public void Trie3() {
        trie.insert("apple");
        trie.search("apple");
        trie.search("app");
        boolean out = trie.startsWith("app");
        Assert.assertTrue(out);
    }

    @Test
    public void Trie4() {
        trie.insert("apple");
        trie.search("apple");
        trie.search("app");
        trie.insert("app");
        boolean out = trie.search("app");
        Assert.assertTrue(out);
    }

    @Test
    public void Trie5() {
        trie.insert("apple");
        trie.search("apple");
        trie.search("app");
        trie.insert("app");
        boolean out = trie.search("applen");
        Assert.assertFalse(out);
    }
}