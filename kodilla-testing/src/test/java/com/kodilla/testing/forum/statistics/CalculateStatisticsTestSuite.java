package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculateStatisticsTestSuite {


    @Test //posts = 0
    public void testCalculateStatisticsWithMock1() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> listUsers = new ArrayList<String>();
        listUsers.add("User 1");
        listUsers.add("User 2");
        listUsers.add("User 3");
        int quantityOfPosts = 0;
        int quantityOfComments = 0;
        when(statisticsMock.usersNames()).thenReturn(listUsers);
        when(statisticsMock.postsCount()).thenReturn(quantityOfPosts);
        when(statisticsMock.commentsCount()).thenReturn(quantityOfComments);


        CalculateStatistics calculateStatistics = new CalculateStatistics();

        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);


        //Then
        //System.out.println(example);
        //System.out.println(stat);
        Assert.assertEquals(3, calculateStatistics.getNumberOfUsers());
    }
    /*

    @Test //posts = 1000
    public void testCalculateStatisticsWithMock2() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> listUsers = new ArrayList<String>();
        listUsers.add("User 1");
        listUsers.add("User 2");
        listUsers.add("User 3");
        int quantityOfPosts = 1000;
        int quantityOfComments = 0;
        when(statisticsMock.usersNames()).thenReturn(listUsers);
        when(statisticsMock.postsCount()).thenReturn(quantityOfPosts);
        when(statisticsMock.commentsCount()).thenReturn(quantityOfComments);
        ArrayList<Double> example = new ArrayList<Double>();
        example.add((double)listUsers.size());
        example.add((double)quantityOfPosts);
        example.add((double)quantityOfComments);
        if (listUsers.size() > 0) {
            example.add((double)quantityOfPosts/listUsers.size());
        } else {
            example.add(0.0);
        }
        if (listUsers.size() > 0) {
            example.add((double)quantityOfComments/listUsers.size());
        } else {
            example.add(0.0);
        }
        if (quantityOfPosts > 0) {
            example.add((double)quantityOfComments/quantityOfPosts);
        } else {
            example.add(0.0);
        }

        CalculateStatistics calculateStatistics = new CalculateStatistics();

        //When
        //ArrayList<Double> stat = calculateStatistics.calculateAdvStatistics(statisticsMock);


        //Then
        //System.out.println(stat);
        //Assert.assertEquals(example, stat);
    }

    @Test //comments = 0
    public void testCalculateStatisticsWithMock3() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> listUsers = new ArrayList<String>();
        listUsers.add("User 1");
        listUsers.add("User 2");
        listUsers.add("User 3");
        int quantityOfPosts = 1000;
        int quantityOfComments = 0;
        when(statisticsMock.usersNames()).thenReturn(listUsers);
        when(statisticsMock.postsCount()).thenReturn(quantityOfPosts);
        when(statisticsMock.commentsCount()).thenReturn(quantityOfComments);
        ArrayList<Double> example = new ArrayList<Double>();
        example.add((double)listUsers.size());
        example.add((double)quantityOfPosts);
        example.add((double)quantityOfComments);
        if (listUsers.size() > 0) {
            example.add((double)quantityOfPosts/listUsers.size());
        } else {
            example.add(0.0);
        }
        if (listUsers.size() > 0) {
            example.add((double)quantityOfComments/listUsers.size());
        } else {
            example.add(0.0);
        }
        if (quantityOfPosts > 0) {
            example.add((double)quantityOfComments/quantityOfPosts);
        } else {
            example.add(0.0);
        }

        CalculateStatistics calculateStatistics = new CalculateStatistics();

        //When
        ArrayList<Double> stat = calculateStatistics.calculateAdvStatistics(statisticsMock);


        //Then
        System.out.println(stat);
        Assert.assertEquals(example, stat);
    }

    @Test //comments < posts
    public void testCalculateStatisticsWithMock4() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> listUsers = new ArrayList<String>();
        listUsers.add("User 1");
        listUsers.add("User 2");
        listUsers.add("User 3");
        int quantityOfPosts = 500;
        int quantityOfComments = 200;
        when(statisticsMock.usersNames()).thenReturn(listUsers);
        when(statisticsMock.postsCount()).thenReturn(quantityOfPosts);
        when(statisticsMock.commentsCount()).thenReturn(quantityOfComments);
        ArrayList<Double> example = new ArrayList<Double>();
        example.add((double)listUsers.size());
        example.add((double)quantityOfPosts);
        example.add((double)quantityOfComments);
        if (listUsers.size() > 0) {
            example.add((double)quantityOfPosts/listUsers.size());
        } else {
            example.add(0.0);
        }
        if (listUsers.size() > 0) {
            example.add((double)quantityOfComments/listUsers.size());
        } else {
            example.add(0.0);
        }
        if (quantityOfPosts > 0) {
            example.add((double)quantityOfComments/quantityOfPosts);
        } else {
            example.add(0.0);
        }

        CalculateStatistics calculateStatistics = new CalculateStatistics();

        //When
        ArrayList<Double> stat = calculateStatistics.calculateAdvStatistics(statisticsMock);


        //Then
        System.out.println(stat);
        Assert.assertEquals(example, stat);
    }

    @Test //posts < comments
    public void testCalculateStatisticsWithMock5() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> listUsers = new ArrayList<String>();
        listUsers.add("User 1");
        listUsers.add("User 2");
        listUsers.add("User 3");
        int quantityOfPosts = 200;
        int quantityOfComments = 500;
        when(statisticsMock.usersNames()).thenReturn(listUsers);
        when(statisticsMock.postsCount()).thenReturn(quantityOfPosts);
        when(statisticsMock.commentsCount()).thenReturn(quantityOfComments);
        ArrayList<Double> example = new ArrayList<Double>();
        example.add((double)listUsers.size());
        example.add((double)quantityOfPosts);
        example.add((double)quantityOfComments);
        if (listUsers.size() > 0) {
            example.add((double)quantityOfPosts/listUsers.size());
        } else {
            example.add(0.0);
        }
        if (listUsers.size() > 0) {
            example.add((double)quantityOfComments/listUsers.size());
        } else {
            example.add(0.0);
        }
        if (quantityOfPosts > 0) {
            example.add((double)quantityOfComments/quantityOfPosts);
        } else {
            example.add(0.0);
        }

        CalculateStatistics calculateStatistics = new CalculateStatistics();

        //When
        ArrayList<Double> stat = calculateStatistics.calculateAdvStatistics(statisticsMock);


        //Then
        System.out.println(stat);
        Assert.assertEquals(example, stat);
    }

    @Test //users = 0
    public void testCalculateStatisticsWithMock6() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> listUsers = new ArrayList<String>();
        int quantityOfPosts = 0;
        int quantityOfComments = 0;
        when(statisticsMock.usersNames()).thenReturn(listUsers);
        when(statisticsMock.postsCount()).thenReturn(quantityOfPosts);
        when(statisticsMock.commentsCount()).thenReturn(quantityOfComments);
        ArrayList<Double> example = new ArrayList<Double>();
        example.add((double)listUsers.size());
        example.add((double)quantityOfPosts);
        example.add((double)quantityOfComments);
        if (listUsers.size() > 0) {
            example.add((double)quantityOfPosts/listUsers.size());
        } else {
            example.add(0.0);
        }
        if (listUsers.size() > 0) {
            example.add((double)quantityOfComments/listUsers.size());
        } else {
            example.add(0.0);
        }
        if (quantityOfPosts > 0) {
            example.add((double)quantityOfComments/quantityOfPosts);
        } else {
            example.add(0.0);
        }

        CalculateStatistics calculateStatistics = new CalculateStatistics();

        //When
        ArrayList<Double> stat = calculateStatistics.calculateAdvStatistics(statisticsMock);


        //Then
        System.out.println(stat);
        Assert.assertEquals(example, stat);
    }

    @Test //users = 100
    public void testCalculateStatisticsWithMock7() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> listUsers = new ArrayList<String>();
        for(int n = 0; n < 100; n++){
            String name = "User ";
            name = name + n;
            listUsers.add(name);
        }
        int quantityOfPosts = 2500;
        int quantityOfComments = 1000;
        when(statisticsMock.usersNames()).thenReturn(listUsers);
        when(statisticsMock.postsCount()).thenReturn(quantityOfPosts);
        when(statisticsMock.commentsCount()).thenReturn(quantityOfComments);
        ArrayList<Double> example = new ArrayList<Double>();
        example.add((double)listUsers.size());
        example.add((double)quantityOfPosts);
        example.add((double)quantityOfComments);
        if (listUsers.size() > 0) {
            example.add((double)quantityOfPosts/listUsers.size());
        } else {
            example.add(0.0);
        }
        if (listUsers.size() > 0) {
            example.add((double)quantityOfComments/listUsers.size());
        } else {
            example.add(0.0);
        }
        if (quantityOfPosts > 0) {
            example.add((double)quantityOfComments/quantityOfPosts);
        } else {
            example.add(0.0);
        }

        CalculateStatistics calculateStatistics = new CalculateStatistics();

        //When
        ArrayList<Double> stat = calculateStatistics.calculateAdvStatistics(statisticsMock);


        //Then
        System.out.println(stat);
        Assert.assertEquals(example, stat);
    }

     */
}
