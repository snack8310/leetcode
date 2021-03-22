package com.snack.leetcode.n355;

import java.util.*;

public class Twitter2 {

    Map<Integer, User> userMap;
    int timestamp;
    int max;

    /**
     * Initialize your data structure here.
     */
    public Twitter2() {
        userMap = new HashMap<>();
        timestamp = 0;
        max = 10;
    }

    /**
     * Compose a new tweet.
     */
    public void postTweet(int userId, int tweetId) {
        timestamp++;
        if (!userMap.containsKey(userId)) {
            userMap.put(userId, new User(userId));
        }
        User u = userMap.get(userId);
        u.post(tweetId, timestamp);
    }

    /**
     * Retrieve the 10 most recent tweet ids in the user's news feed. Each item in the news feed must be posted by users who the user followed or by the user herself. Tweets must be ordered from most recent to least recent.
     */
    public List<Integer> getNewsFeed(int userId) {
        List<Integer> res = new ArrayList<>();
        if (!userMap.containsKey(userId)) {
            userMap.put(userId, new User(userId));
        }
        Set<Integer> followers = userMap.get(userId).followed;
        PriorityQueue<Tweet> queue = new PriorityQueue<>((a, b) -> (b.time - a.time));
        for (Integer u : followers) {
            Tweet tweet = userMap.get(u).head;
            while (tweet != null) {
                queue.add(tweet);
                tweet = tweet.next;
            }
        }
        while (!queue.isEmpty()) {
            if (res.size() >= max) {
                break;
            }
            res.add(queue.poll().id);
        }
        return res;
    }

    /**
     * Follower follows a followee. If the operation is invalid, it should be a no-op.
     */
    public void follow(int followerId, int followeeId) {
        if (!userMap.containsKey(followeeId)) {
            userMap.put(followeeId, new User(followeeId));
        }
        if (!userMap.containsKey(followerId)) {
            userMap.put(followerId, new User(followerId));
        }
        userMap.get(followerId).follow(followeeId);
    }

    /**
     * Follower unfollows a followee. If the operation is invalid, it should be a no-op.
     */
    public void unfollow(int followerId, int followeeId) {
        if (!userMap.containsKey(followerId)) {
            userMap.put(followerId, new User(followerId));
        }
        userMap.get(followerId).unfollow(followeeId);
    }

    private class Tweet {
        int id;
        int time;
        Tweet next;

        public Tweet(int id, int time) {
            this.id = id;
            this.time = time;
            this.next = null;
        }
    }

    private class User {
        int id;
        Set<Integer> followed;
        Tweet head;

        public User(int id) {
            this.id = id;
            followed = new HashSet<>();
            follow(id);
        }

        public void follow(int userId) {
            followed.add(userId);
        }

        public void unfollow(int userId) {
            if (id == userId) {
                return;
            }
            followed.remove(userId);
        }

        public void post(int tweetId, int timestamp) {
            Tweet twt = new Tweet(tweetId, timestamp);
            twt.next = head;
            head = twt;
        }
    }
}


