/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.siyanda.designpatterns.test;

import com.siyanda.behavioralDesignPatterns.command.Command;
import com.siyanda.behavioralDesignPatterns.command.Dinner;
import com.siyanda.behavioralDesignPatterns.command.DinnerCommand;
import com.siyanda.behavioralDesignPatterns.command.Lunch;
import com.siyanda.behavioralDesignPatterns.command.LunchCommand;
import com.siyanda.behavioralDesignPatterns.command.MealInvoker;
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
public class CommandTest {
    
    public CommandTest() {
    }

     @Test
     public void testCommand() {
        Lunch lunch = new Lunch(); // receiver
        Command lunchCommand = new LunchCommand(lunch); // concrete command

        Dinner dinner = new Dinner(); // receiver
        Command dinnerCommand = new DinnerCommand(dinner); // concrete command

        MealInvoker mealInvoker = new MealInvoker(lunchCommand); // invoker
        Assert.assertEquals(mealInvoker.invoke(), "Lunch is being made");

        mealInvoker.setCommand(dinnerCommand);
        Assert.assertEquals(mealInvoker.invoke(), "Dinner is being made");
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
