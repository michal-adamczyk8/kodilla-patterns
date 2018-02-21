package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigMacTestSuite {
    @Test
    public void testBigMacBuilder() {
        //Given
        BigMac bigMac = new BigMac.BigMacBuilder()
                .roll(true)
                .burgers(3)
                .sauce("1000 wysp")
                .ingredients("bekon")
                .ingredients("krewetki")
                .ingredients("papryczki")
                .build();

        System.out.println(bigMac);
        //When
        int howManyIngredients = bigMac.getIngredients().size();
        //Then
        Assert.assertEquals(3,howManyIngredients);
    }
}
