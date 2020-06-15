package com.kodilla.testing.forum.statistics;

import com.kodilla.testing.library.Book;
import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculateStatisticsTestSuite {

    private ArrayList<String> generateListOfUsers(int usersQuantity) {
        ArrayList<String> resultList = new ArrayList<String>();
        for(int n = 1; n <= usersQuantity; n++){
            resultList.add("User " + n);
        }
        return resultList;
    }


    @Test
    public void testCalculateStatisticsWhenPostsZero() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> listUsers = generateListOfUsers(50);
        int quantityOfPosts = 0;
        int quantityOfComments = 0;
        Double NumberOfPostsPerUser = 0.0;
        Double NumberOfCommentsPerUser = 0.0;
        Double NumberOfCommentsPerPost = 0.0;
        when(statisticsMock.usersNames()).thenReturn(listUsers);
        when(statisticsMock.postsCount()).thenReturn(quantityOfPosts);
        when(statisticsMock.commentsCount()).thenReturn(quantityOfComments);
        CalculateStatistics calculateStatistics = new CalculateStatistics();

        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(50, calculateStatistics.getNumberOfUsers());
        Assert.assertEquals(NumberOfPostsPerUser, calculateStatistics.getNumberOfPostsPerUser());
        Assert.assertEquals(NumberOfCommentsPerUser, calculateStatistics.getNumberOfCommentsPerUser());
        Assert.assertEquals(NumberOfCommentsPerPost, calculateStatistics.getNumberOfCommentsPerPost());
    }

    @Test
    public void testCalculateStatisticsWhenPosts1000() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> listUsers = generateListOfUsers(1000);
        int quantityOfUsers = listUsers.size();
        int quantityOfPosts = 1000;
        int quantityOfComments = 1000;
        Double NumberOfPostsPerUser = (double)quantityOfPosts/listUsers.size();
        Double NumberOfCommentsPerUser = (double)quantityOfComments/listUsers.size();
        Double NumberOfCommentsPerPost = (double)quantityOfComments/quantityOfPosts;
        when(statisticsMock.usersNames()).thenReturn(listUsers);
        when(statisticsMock.postsCount()).thenReturn(quantityOfPosts);
        when(statisticsMock.commentsCount()).thenReturn(quantityOfComments);
        CalculateStatistics calculateStatistics = new CalculateStatistics();

        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(quantityOfUsers, calculateStatistics.getNumberOfUsers());
        Assert.assertEquals(NumberOfPostsPerUser, calculateStatistics.getNumberOfPostsPerUser());
        Assert.assertEquals(NumberOfCommentsPerUser, calculateStatistics.getNumberOfCommentsPerUser());
        Assert.assertEquals(NumberOfCommentsPerPost, calculateStatistics.getNumberOfCommentsPerPost());
    }

    @Test
    public void testCalculateStatisticsWhenCommentsZero() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> listUsers = generateListOfUsers(500);
        int quantityOfUsers = listUsers.size();
        int quantityOfPosts = 2500;
        int quantityOfComments = 0;
        Double NumberOfPostsPerUser = (double)quantityOfPosts/listUsers.size();
        Double NumberOfCommentsPerUser = (double)quantityOfComments/listUsers.size();
        Double NumberOfCommentsPerPost = (double)quantityOfComments/quantityOfPosts;
        when(statisticsMock.usersNames()).thenReturn(listUsers);
        when(statisticsMock.postsCount()).thenReturn(quantityOfPosts);
        when(statisticsMock.commentsCount()).thenReturn(quantityOfComments);
        CalculateStatistics calculateStatistics = new CalculateStatistics();

        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(quantityOfUsers, calculateStatistics.getNumberOfUsers());
        Assert.assertEquals(NumberOfPostsPerUser, calculateStatistics.getNumberOfPostsPerUser());
        Assert.assertEquals(NumberOfCommentsPerUser, calculateStatistics.getNumberOfCommentsPerUser());
        Assert.assertEquals(NumberOfCommentsPerPost, calculateStatistics.getNumberOfCommentsPerPost());
    }

    @Test
    public void testCalculateStatisticsWhenNumberOfCommentsLesserNumberOfPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> listUsers = generateListOfUsers(1500);
        int quantityOfUsers = listUsers.size();
        int quantityOfPosts = 2500;
        int quantityOfComments = 2000;
        Double NumberOfPostsPerUser = (double)quantityOfPosts/listUsers.size();
        Double NumberOfCommentsPerUser = (double)quantityOfComments/listUsers.size();
        Double NumberOfCommentsPerPost = (double)quantityOfComments/quantityOfPosts;
        when(statisticsMock.usersNames()).thenReturn(listUsers);
        when(statisticsMock.postsCount()).thenReturn(quantityOfPosts);
        when(statisticsMock.commentsCount()).thenReturn(quantityOfComments);
        CalculateStatistics calculateStatistics = new CalculateStatistics();

        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(quantityOfUsers, calculateStatistics.getNumberOfUsers());
        Assert.assertEquals(NumberOfPostsPerUser, calculateStatistics.getNumberOfPostsPerUser());
        Assert.assertEquals(NumberOfCommentsPerUser, calculateStatistics.getNumberOfCommentsPerUser());
        Assert.assertEquals(NumberOfCommentsPerPost, calculateStatistics.getNumberOfCommentsPerPost());
    }

    @Test
    public void testCalculateStatisticsWhenNumberOfCommentsBiggerNumberOfPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> listUsers = generateListOfUsers(1500);
        int quantityOfUsers = listUsers.size();
        int quantityOfPosts = 2500;
        int quantityOfComments = 6000;
        Double NumberOfPostsPerUser = (double)quantityOfPosts/listUsers.size();
        Double NumberOfCommentsPerUser = (double)quantityOfComments/listUsers.size();
        Double NumberOfCommentsPerPost = (double)quantityOfComments/quantityOfPosts;
        when(statisticsMock.usersNames()).thenReturn(listUsers);
        when(statisticsMock.postsCount()).thenReturn(quantityOfPosts);
        when(statisticsMock.commentsCount()).thenReturn(quantityOfComments);
        CalculateStatistics calculateStatistics = new CalculateStatistics();

        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(quantityOfUsers, calculateStatistics.getNumberOfUsers());
        Assert.assertEquals(NumberOfPostsPerUser, calculateStatistics.getNumberOfPostsPerUser());
        Assert.assertEquals(NumberOfCommentsPerUser, calculateStatistics.getNumberOfCommentsPerUser());
        Assert.assertEquals(NumberOfCommentsPerPost, calculateStatistics.getNumberOfCommentsPerPost());
    }

    @Test
    public void testCalculateStatisticsWhenNumberOfUsersZero() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> listUsers = generateListOfUsers(0);
        int quantityOfUsers = listUsers.size();
        int quantityOfPosts = 0;
        int quantityOfComments = 0;
        Double NumberOfPostsPerUser = 0.0;
        Double NumberOfCommentsPerUser = 0.0;
        Double NumberOfCommentsPerPost = 0.0;
        when(statisticsMock.usersNames()).thenReturn(listUsers);
        when(statisticsMock.postsCount()).thenReturn(quantityOfPosts);
        when(statisticsMock.commentsCount()).thenReturn(quantityOfComments);
        CalculateStatistics calculateStatistics = new CalculateStatistics();

        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(quantityOfUsers, calculateStatistics.getNumberOfUsers());
        Assert.assertEquals(NumberOfPostsPerUser, calculateStatistics.getNumberOfPostsPerUser());
        Assert.assertEquals(NumberOfCommentsPerUser, calculateStatistics.getNumberOfCommentsPerUser());
        Assert.assertEquals(NumberOfCommentsPerPost, calculateStatistics.getNumberOfCommentsPerPost());
    }

    @Test
    public void testCalculateStatisticsWhenNumberOfUsers100() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> listUsers = generateListOfUsers(100);
        int quantityOfUsers = listUsers.size();
        int quantityOfPosts = 500;
        int quantityOfComments = 300;
        Double NumberOfPostsPerUser = (double)quantityOfPosts/listUsers.size();
        Double NumberOfCommentsPerUser = (double)quantityOfComments/listUsers.size();
        Double NumberOfCommentsPerPost = (double)quantityOfComments/quantityOfPosts;
        when(statisticsMock.usersNames()).thenReturn(listUsers);
        when(statisticsMock.postsCount()).thenReturn(quantityOfPosts);
        when(statisticsMock.commentsCount()).thenReturn(quantityOfComments);
        CalculateStatistics calculateStatistics = new CalculateStatistics();

        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(quantityOfUsers, calculateStatistics.getNumberOfUsers());
        Assert.assertEquals(NumberOfPostsPerUser, calculateStatistics.getNumberOfPostsPerUser());
        Assert.assertEquals(NumberOfCommentsPerUser, calculateStatistics.getNumberOfCommentsPerUser());
        Assert.assertEquals(NumberOfCommentsPerPost, calculateStatistics.getNumberOfCommentsPerPost());
    }
}
