package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculateForumStatisticsTestCase {
    @Test
    public void testCalculateAdvStatisticsTest1() {
        // gdy liczba postów = 0
        //gdy liczba użytkowników = 0
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> users = new ArrayList<String>();

        when(statisticsMock.userNames()).thenReturn(users);
        int postsNumber = 0;
        when(statisticsMock.postCount()).thenReturn(postsNumber);
        int commentsNumber = 8;
        when(statisticsMock.commentsCount()).thenReturn(commentsNumber);

        CalculateForumStatistics forumStatistics = new CalculateForumStatistics(statisticsMock);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(0, forumStatistics.getAveragePostsPerUser(),0.1);
        Assert.assertEquals(0,forumStatistics.getUserQuantity());
    }

    @Test
    public void testCalculateAdvStatisticsTest2() {
        // gdy liczba postów = 1000
        // gdy liczba komentarzy < liczba postów
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> users = new ArrayList<String>();
        users.add("User 1");
        users.add("User 2");
        users.add("User 3");
        users.add("User 4");
        users.add("User 5");
        when(statisticsMock.userNames()).thenReturn(users);
        int postsNumber = 1000;
        when(statisticsMock.postCount()).thenReturn(postsNumber);
        int commentsNumber = 500;
        when(statisticsMock.commentsCount()).thenReturn(commentsNumber);

        CalculateForumStatistics forumStatistics = new CalculateForumStatistics(statisticsMock);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(1000, forumStatistics.getPostsQuantity());
        Assert.assertEquals(0.5,forumStatistics.getAverageCommentsPerPost(),0.1);
    }

    @Test
    public void testCalculateAdvStatisticsTest3() {
        // gdy liczba komentarzy = 0
        // gdy liczba użytkowników = 100
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> users = new ArrayList<String>();
        for (int i=0; i <100; i++){
            users.add("User"+i);
        }
        when(statisticsMock.userNames()).thenReturn(users);
        int postsNumber = 500;
        when(statisticsMock.postCount()).thenReturn(postsNumber);
        int commentsNumber = 66;
        when(statisticsMock.commentsCount()).thenReturn(commentsNumber);

        CalculateForumStatistics forumStatistics = new CalculateForumStatistics(statisticsMock);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(100, forumStatistics.getUserQuantity());
    }

}
