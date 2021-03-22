package com.snack.leetcode.n355;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class TwitterTest {

    Twitter twitter;

    @Before
    public void setUp() throws Exception {
        twitter = new Twitter();
    }

    @Test
    public void postTweet() {
        twitter.postTweet(1, 5);
        List<Integer> newsFeed = twitter.getNewsFeed(1);
        Integer[] expertFeed = {5};
        Assert.assertArrayEquals(expertFeed, newsFeed.toArray(new Integer[newsFeed.size()]));
        twitter.follow(1, 2);
        twitter.postTweet(2, 6);
        Integer[] expertFeed1 = {6, 5};
        newsFeed = twitter.getNewsFeed(1);
        Assert.assertArrayEquals(expertFeed1, newsFeed.toArray(new Integer[newsFeed.size()]));
        twitter.unfollow(1, 2);
        Integer[] expertFeed2 = {5};
        newsFeed = twitter.getNewsFeed(1);
        Assert.assertArrayEquals(expertFeed2, newsFeed.toArray(new Integer[newsFeed.size()]));
    }

    @Test
    public void postTweet2() {
        twitter.postTweet(1, 1);
        List<Integer> newsFeed = twitter.getNewsFeed(1);
        Integer[] expertFeed = {1};
        Assert.assertArrayEquals(expertFeed, newsFeed.toArray(new Integer[newsFeed.size()]));
        twitter.follow(2, 1);
        Integer[] expertFeed1 = {1};
        newsFeed = twitter.getNewsFeed(2);
        Assert.assertArrayEquals(expertFeed1, newsFeed.toArray(new Integer[newsFeed.size()]));
        twitter.unfollow(2, 1);
        Integer[] expertFeed2 = {};
        newsFeed = twitter.getNewsFeed(2);
        Assert.assertArrayEquals(expertFeed2, newsFeed.toArray(new Integer[newsFeed.size()]));
    }
}