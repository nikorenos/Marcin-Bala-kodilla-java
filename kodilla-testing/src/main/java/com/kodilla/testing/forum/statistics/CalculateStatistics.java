package com.kodilla.testing.forum.statistics;

import java.util.ArrayList;


public class CalculateStatistics {

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
