/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.siyanda.designpatterns.test;

import com.siyanda.designpatterns.creationalDesignPatterns.builder.ItalianMealBuilder;
import com.siyanda.designpatterns.creationalDesignPatterns.builder.JapaneseMealBuilder;
import com.siyanda.designpatterns.creationalDesignPatterns.builder.Meal;
import com.siyanda.designpatterns.creationalDesignPatterns.builder.MealBuilder;
import com.siyanda.designpatterns.creationalDesignPatterns.builder.MealDirector;
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
public class BuilderTest {
    
    public BuilderTest() {
    }

    @Test
    public void buiderTesting()
    {
        MealBuilder mealBuilder = new ItalianMealBuilder();
        MealDirector mealDirector = new MealDirector(mealBuilder);
        mealDirector.constructMeal();
        Meal meal = mealDirector.getMeal();
        Assert.assertEquals(meal.getMainCourse(), "pizza"," is the meal");
        
        mealBuilder = new JapaneseMealBuilder();
        mealDirector = new MealDirector(mealBuilder);
        mealDirector.constructMeal();
        meal = mealDirector.getMeal();
        Assert.assertEquals(meal.getMainCourse(), "chicken teriyaki");
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
