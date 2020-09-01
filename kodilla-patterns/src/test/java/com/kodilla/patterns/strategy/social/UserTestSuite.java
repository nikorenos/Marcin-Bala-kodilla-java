package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.canals.TwitterPublisher;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User mirek = new Millenials("Mirek");
        User jasiek = new YGeneration("Jasiek");
        User waldek = new ZGeneration("Waldek");

        //When
        String mirekShouldPost = mirek.sharePost();
        System.out.println("Mirek should: " + mirekShouldPost);
        String jasiekShouldPost = jasiek.sharePost();
        System.out.println("Jasiek should: " + jasiekShouldPost);
        String waldekShouldPost = waldek.sharePost();
        System.out.println("Waldek should: " + waldekShouldPost);

        //Then
        Assert.assertEquals("share on Facebook", mirekShouldPost);
        Assert.assertEquals("share on Twitter", jasiekShouldPost);
        Assert.assertEquals("share on Snapchat", waldekShouldPost);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User mirek = new Millenials("mirek");

        //When
        String mirekShouldPost = mirek.sharePost();
        System.out.println("Mirek should: " + mirekShouldPost);
        mirek.changeShare(new TwitterPublisher());
        mirekShouldPost = mirek.sharePost();
        System.out.println("Mirek now should: " + mirekShouldPost);

        //Then
        Assert.assertEquals("share on Twitter", mirekShouldPost);
    }
}
