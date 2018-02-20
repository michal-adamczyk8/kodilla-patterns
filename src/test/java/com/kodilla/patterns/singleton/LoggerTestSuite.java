package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {
    @Test
    public void testGetLastLog() {
        //Given
        Logger logger = Logger.getInstance();
        logger.log("michal.adamczyk8");
        //When
        String result = logger.getLastLog();
        //Then
        Assert.assertEquals("michal.adamczyk8", result);
    }
}
