/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.siyanda.designpatterns.test;

import com.siyanda.designpatterns.creationalDesignPatterns.abstractFactoryPattern.AbstractFactory;
import com.siyanda.designpatterns.creationalDesignPatterns.abstractFactoryPattern.SpeciesFactory;
import com.siyanda.designpatterns.creationalDesignPatterns.factorymethod.Animal;
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
public class AbstractFactoryPatternTest {
    
    public AbstractFactoryPatternTest() {
    }

    @Test
    public void abstractFactoryTesting()
    {
        AbstractFactory abstractFactory = new AbstractFactory();
        
        SpeciesFactory speciesFactory1 = abstractFactory.getSpeciesFactory("reptile");
        Animal a1 = speciesFactory1.getAnimal("tyrannosaurus");
        Assert.assertEquals(a1.makeSound(), "Roar");
        Animal a2 = speciesFactory1.getAnimal("snake");
        Assert.assertEquals(a2.makeSound(), "Hiss");
        
        SpeciesFactory speciesFactory2 = abstractFactory.getSpeciesFactory("mammal");
        Animal a3 = speciesFactory2.getAnimal("dog");
        Assert.assertEquals(a3.makeSound(), "woof");
        Animal a4 = speciesFactory2.getAnimal("cat");
        Assert.assertEquals(a4.makeSound(), "Meow");
        
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
