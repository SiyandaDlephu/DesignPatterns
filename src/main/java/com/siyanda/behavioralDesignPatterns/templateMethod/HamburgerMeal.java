/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.siyanda.behavioralDesignPatterns.templateMethod;

/**
 *
 * @author inathi-zenande
 */
public class HamburgerMeal extends Meal{

    @Override
    public void prepareIngredients() {
        System.out.println("Getting burgers buns and french f r i e s");
    }

    @Override
    public void cook() {
        System.out.println("Cooking ground beef in pan");
    }

    @Override
    public void eat()
    {
        System.out.println("The cheese Burger are tasty");
    }
    
    @Override
    public void cleanUp() {
         System.out.println("Doing the dishes");
    }
    
}
