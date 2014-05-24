/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.siyanda.designpatterns.test;

import com.siyanda.designpatterns.creationalDesignPatterns.factorymethod.Dog;
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
public class PrototypeTest {
    
    public PrototypeTest() {
    }

    @Test
    public void prototypeTesting()
    {
        Person person1 = new Person("Fred");
        Assert.assertNotEquals(person1, " is person 1 ");
        Person person2 = (Person) person1.doClone();
        Assert.assertNotNull(person2, " is person 2");
        
//        Dog dog1 = new Dog("Wooof!");
//        Assert.assertNotEquals(dog1, " is dog1 ");
//        Dog dog2 = (Dog) dog1.doClone();
//        Assert.assertNotNull(dog2, " is dog2");
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
