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
public class CheeseBurgerMean extends Meal{

    @Override
    public void prepareIngredients() {
        System.out.println("Getting ground beef and cheese");
    }

    @Override
    public void cook() {
        System.out.println("");
    }

    @Override
    public void cleanUp() {
        System.out.println("");
    }
    
}
