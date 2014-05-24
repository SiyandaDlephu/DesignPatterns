/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.siyanda.designpatterns.test;

import com.siyanda.behavioralDesignPatterns.templateMethod.CheeseBurgerMean;
import com.siyanda.behavioralDesignPatterns.templateMethod.HamburgerMeal;
import com.siyanda.designpatterns.creationalDesignPatterns.builder.Meal;
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
public class TemplateMethodTest {
    
    public TemplateMethodTest() {
    }

    @Test
    public void templateTesting()
    {
        HamburgerMeal meal1 = new HamburgerMeal();
        meal1.doMeal();
        
        System.out.println("");
        
        CheeseBurgerMean meal2 = new CheeseBurgerMean();
        meal2.doMeal();
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
