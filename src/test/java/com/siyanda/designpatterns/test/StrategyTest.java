/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.siyanda.designpatterns.test;

import com.siyanda.behavioralDesignPatterns.Strategy.Context;
import com.siyanda.behavioralDesignPatterns.Strategy.HikeStrategy;
import com.siyanda.behavioralDesignPatterns.Strategy.SkiStrategy;
import com.siyanda.behavioralDesignPatterns.Strategy.Strategy;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author inathi-zenande
 */
public class StrategyTest {
    
    public StrategyTest() {
    }
 @Test
    public void stragegyTesting() {
        int temperatureInF = 60;

        Strategy skiStrategy = new SkiStrategy();
        Context context = new Context(temperatureInF, skiStrategy);

        Assert.assertEquals(context.getResult(), false);

        Strategy hikeStrategy = new HikeStrategy();
        context.setStrategy(hikeStrategy);

        Assert.assertEquals(context.getResult(), true);
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
