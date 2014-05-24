/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.siyanda.StructuralDesignPatterns.bridge;

import com.sun.xml.internal.ws.api.pipe.Engine;

/**
 *
 * @author inathi-zenande
 */
public class SmallCar extends Vehicle{
    public SmallCar(Engine engine) {
        this.weightInKilos = 600;
        this.engine = engine;
    }

    @Override
    public String drive() {
        //return("\nThe small car is driving");
        int horsepower = engine.go();
        reportOnSpeed(horsepower);
        return("\nThe small car is driving");
    }
}
