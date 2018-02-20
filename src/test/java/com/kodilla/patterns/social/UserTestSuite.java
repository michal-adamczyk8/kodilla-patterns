package com.kodilla.patterns.social;

import com.kodilla.patterns.social.media.TwitterPublisher;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User ricky = new Millenials("Ricky LeFlour");
        User julian = new YGeneration("Julian the Muscle");
        User bubbles = new ZGeneration("Bubbles");
        //When
        String rickyPost = ricky.sharePost();
        System.out.println("Ricky says: " + rickyPost);
        String julianPost = julian.sharePost();
        System.out.println("Julian says " + julianPost);
        String bubblesPost = bubbles.sharePost();
        System.out.println("Bubbles says " + bubblesPost);
        //Then
        Assert.assertEquals(rickyPost, "Snapchat");
        Assert.assertEquals(julianPost, "Facebook");
        Assert.assertEquals(bubblesPost, "Twitter");
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User ricky = new Millenials("Ricky LeFleur");
        //When
        String rickyPost = ricky.sharePost();
        System.out.println("First Ricky was saying: " + rickyPost);
        ricky.chooseMedia(new TwitterPublisher());
        String rickyPost2 = ricky.sharePost();
        System.out.println("Now Ricky is saying: " + rickyPost2);
        //Then
        Assert.assertEquals("Twitter", rickyPost2);
    }
}
