package com.kodilla.testing.forum.statistics;

import java.util.ArrayList;


public class CalculateStatistics {

    private int numberOfUsers;
    private Integer numberOfPosts;
    private Integer numberOfComments;
    private Double numberOfPostsPerUser;
    private Double numberOfCommentsPerUser;
    private Double numberOfCommentsPerPost;

    private ArrayList<Double> stats = new ArrayList<Double>();
    public void calculateAdvStatistics(Statistics statistics) {
        numberOfUsers = statistics.usersNames().size();
        numberOfPosts = statistics.postsCount();
        numberOfComments = statistics.commentsCount();

        if (numberOfUsers > 0) {
            numberOfPostsPerUser = (double)numberOfPosts/numberOfUsers;
            numberOfCommentsPerUser = (double)numberOfComments/numberOfUsers;
        } else {
            numberOfPostsPerUser = 0.0;
            numberOfCommentsPerUser = 0.0;
        }
        if (numberOfPosts > 0) {
            numberOfCommentsPerPost = (double)numberOfComments/numberOfPosts;
        } else {
            numberOfCommentsPerPost = 0.0;
        }
    }

    public int getNumberOfUsers() {
        return numberOfUsers;
    }

    public Integer getNumberOfPosts() {
        return numberOfPosts;
    }

    public Integer getNumberOfComments() {
        return numberOfComments;
    }
    public Double getNumberOfPostsPerUser() {
        return numberOfPostsPerUser;
    }

    public Double getNumberOfCommentsPerUser() {
        return numberOfCommentsPerUser;
    }

    public Double getNumberOfCommentsPerPost() {
        return numberOfCommentsPerPost;
    }

    /*
    private ArrayList<Double> stats = new ArrayList<Double>();
    public ArrayList<Double> calculateAdvStatistics(Statistics statistics) {
        stats.add((double)statistics.usersNames().size());
        stats.add((double)statistics.postsCount());
        stats.add((double)statistics.commentsCount());
        if (statistics.usersNames().size() > 0) {
            stats.add((double)statistics.postsCount()/statistics.usersNames().size());
        } else {
            stats.add(0.0);
        }
        if (statistics.usersNames().size() > 0) {
            stats.add((double)statistics.commentsCount()/statistics.usersNames().size());
        } else {
            stats.add(0.0);
        }
        if (statistics.postsCount() > 0) {
            stats.add((double) statistics.commentsCount() / statistics.postsCount());
        } else {
            stats.add(0.0);
        }

        return stats;
    }
     */

    public static void main(String[] args) {

        /*
        Statistics statisticsMock = mock(Statistics.class);
        List<String> listUsers = new ArrayList<>();
        when(statisticsMock.usersNames().size()).thenReturn(listUsers.size());

        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);

        calculateStatistics.calculateAdvStatistics(statisticsMock).size();
        calculateStatistics.quantityOfUsers();

         */


    }
}
