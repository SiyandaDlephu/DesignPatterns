/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.siyanda.designpatterns.test;

import com.siyanda.designpatterns.creationalDesignPatterns.factorymethod.Animal;
import com.siyanda.designpatterns.creationalDesignPatterns.factorymethod.AnimalFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author inathi-zenande
 */
public class AnimalFactoryTest {
    
    public AnimalFactoryTest() {
    }
    
    
    @Test
      public void animalFactory()
      {
             AnimalFactory animalFactory = new AnimalFactory();
             
             Animal a1 = animalFactory.getANimal("feline");
             Assert.assertEquals(a1.makeSound(),"Meow");
             
             Animal a2 = animalFactory.getANimal("canine");
             Assert.assertEquals(a2.makeSound(), "woof");
             
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
