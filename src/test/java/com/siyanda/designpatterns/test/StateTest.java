/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.siyanda.designpatterns.test;

import com.siyanda.behavioralDesignPatterns.state.SadState;
import com.siyanda.designpatterns.creationalDesignPatterns.prototype.Person;
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
public class StateTest {
    
    public StateTest() {
    }

    @Test
     public void testState() {
        Person person = new Person(new HappyState());
        Assert.assertEquals(person.sayHello(), "Hello, friend!");
        Assert.assertEquals(person.sayGoodbye(), "Bye, friend!");

        person.setEmotionalState(new SadState());
        Assert.assertEquals(person.sayHello(), "Hello. Sniff, sniff.");
        Assert.assertEquals(person.sayGoodbye(), "Bye. Sniff, sniff.");
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
