package com.kodilla.testing.forum.statistics;

public class CalculateForumStatistics {
    private int userQuantity;
    private int postsQuantity;
    private int commentsQuantity;
    private double averagePostsPerUser;
    private double averageCommentsPerUser;
    private double averageCommentsPerPost;

    Statistics statistics;

    public CalculateForumStatistics(Statistics statistics) {
        this.statistics = statistics;
    }

    public void calculateAdvStatistics (Statistics statistics) {
        userQuantity = statistics.userNames().size();
        postsQuantity = statistics.postCount();
        commentsQuantity = statistics.commentsCount();
        averagePostsPerUser = postsQuantity/userQuantity;
        averageCommentsPerUser = commentsQuantity/userQuantity;
        averageCommentsPerPost = commentsQuantity/postsQuantity;
    }

    public int getUserQuantity() {
        return userQuantity;
    }

    public int getPostsQuantity() {
        return postsQuantity;
    }

    public int getCommentsQuantity() {
        return commentsQuantity;
    }

    public double getAveragePostsPerUser() {
        return averagePostsPerUser;
    }

    public double getAverageCommentsPerUser() {
        return averageCommentsPerUser;
    }

    public double getAverageCommentsPerPost() {
        return averageCommentsPerPost;
    }
}
