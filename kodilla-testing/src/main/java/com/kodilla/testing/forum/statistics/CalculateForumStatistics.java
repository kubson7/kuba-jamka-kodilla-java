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

        if (userQuantity == 0){
            averagePostsPerUser = 0;
            averageCommentsPerUser = 0;
        } else {
            averagePostsPerUser = (double) postsQuantity/userQuantity;
            averageCommentsPerUser = (double) commentsQuantity/userQuantity;
        }

        if (postsQuantity == 0){
            averageCommentsPerPost = 0;
        } else {
            averageCommentsPerPost = (double) commentsQuantity/postsQuantity;
        }


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
