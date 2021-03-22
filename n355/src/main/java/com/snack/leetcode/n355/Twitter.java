package com.snack.leetcode.n355;

import java.util.*;

public class Twitter {

    Map<Integer, Set<Integer>> follows;
    Map<Integer, List<Tweet>> tweets;

    /**
     * Initialize your data structure here.
     */
    public Twitter() {
        follows = new HashMap<>();
        tweets = new HashMap<>();
    }

    /**
     * Compose a new tweet.
     */
    public void postTweet(int userId, int tweetId) {
        Set<Integer> user_follows = findFollows(userId);
        List<Tweet> user_tweets;
        for (Integer follow_id : user_follows) {
            user_tweets = getTweets(follow_id);
            user_tweets.add(new Tweet(userId, tweetId));
            updateTweet(follow_id, user_tweets);
        }
    }

    private void updateTweet(Integer user, List<Tweet> user_tweets) {
        tweets.put(user, user_tweets);
    }

    private List<Tweet> getTweets(Integer follow_id) {
        List<Tweet> user_tweets = tweets.get(follow_id);
        if (user_tweets == null) {
            user_tweets = new ArrayList<>();
        }
        return user_tweets;
    }

    /**
     * Retrieve the 10 most recent tweet ids in the user's news feed. Each item in the news feed must be posted by users who the user followed or by the user herself. Tweets must be ordered from most recent to least recent.
     */
    public List<Integer> getNewsFeed(int userId) {
        List<Tweet> user_tweets = getTweets(userId);
        List<Integer> newsFeed = new ArrayList<>();
        for (int i = user_tweets.size() - 1; i >= 0; i--) {
            newsFeed.add(user_tweets.get(i).tweetId);
        }
        return newsFeed;
    }

    /**
     * Follower follows a followee. If the operation is invalid, it should be a no-op.
     */
    public void follow(int followerId, int followeeId) {
        Set<Integer> followerIds = findFollows(followeeId);
        followerIds.add(followerId);
        updateFollows(followeeId, followerIds);
    }

    private void updateFollows(int followeeId, Set<Integer> followerIds) {
        follows.put(followeeId, followerIds);
    }

    /**
     * Follower unfollows a followee. If the operation is invalid, it should be a no-op.
     */
    public void unfollow(int followerId, int followeeId) {
        Set<Integer> followerIds = findFollows(followeeId);
        followerIds.remove(followerId);
        removeTweets(followerId, followeeId);
        updateFollows(followeeId, followerIds);
    }

    private void removeTweets(int followerId, int followeeId) {
        List<Tweet> tweets = getTweets(followerId);
        tweets.removeIf(tweet -> tweet.getUserId() == followeeId);
        updateTweet(followerId, tweets);
    }

    private Set<Integer> findFollows(int followeeId) {
        Set<Integer> followerIds = follows.get(followeeId);
        if (followerIds == null) {
            followerIds = new HashSet<>();
            followerIds.add(followeeId);
            updateFollows(followeeId, followerIds);
        }
        return followerIds;
    }

    private class Tweet {
        int userId;
        int tweetId;

        public int getUserId() {
            return userId;
        }

        public int getTweetId() {
            return tweetId;
        }

        public Tweet(int userId, int tweetId) {
            this.userId = userId;
            this.tweetId = tweetId;
        }
    }
}


