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
public class LivingAnimal implements Animal{

    @Override
    public void describe() {
        System.out.println("\n I am n animal");
    }
    
}
