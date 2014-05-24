/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.siyanda.designpatterns.test;

import com.siyanda.StructuralDesignPatterns.decorator.Animal;
import com.siyanda.StructuralDesignPatterns.decorator.GrowlDecorator;
import com.siyanda.StructuralDesignPatterns.decorator.LegDecorator;
import com.siyanda.StructuralDesignPatterns.decorator.LivingAnimal;
import com.siyanda.StructuralDesignPatterns.decorator.WingDecorator;
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
public class DecoratorTest {
    
    public DecoratorTest() {
    }
    
    @Test
    public void decoratorTesting()
    {
        Animal animal = new LivingAnimal();
        animal.describe();
        
        animal = new LegDecorator(animal);
        animal.describe();
        
        animal = new WingDecorator(animal);
        animal.describe();
        
        animal = new GrowlDecorator(animal);
        animal = new GrowlDecorator(animal);
        animal.describe();
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
