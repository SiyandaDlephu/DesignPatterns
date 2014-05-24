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
public class BigBus extends Vehicle{
    public BigBus(Engine engine) {
		this.weightInKilos = 3000;
		this.engine = engine;
	}

	@Override
	public String drive() {
		//return("\nThe big bus is driving");
		int horsepower = engine.go();
		reportOnSpeed(horsepower);
                return("\nThe big bus is driving");
	}
}
