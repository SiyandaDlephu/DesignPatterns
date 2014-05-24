/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.siyanda.StructuralDesignPatterns.decorator;

/**
 *
 * @author inathi-zenande
 */
public class LegDecorator extends AnimalDecorator{

    public LegDecorator(Animal animal) {
        super(animal);
    }

    @Override
    public void describe() {
       animal.describe();
        System.out.println("I have legs");
        dance();
    }
    
    public void dance()
    {
        System.out.println("i can dance");
    }
}