/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.siyanda.designpatterns.creationalDesignPatterns.abstractFactoryPattern;

import com.siyanda.designpatterns.creationalDesignPatterns.factorymethod.Animal;

/**
 *
 * @author inathi-zenande
 */
public class ReptileFactory extends SpeciesFactory {

    @Override
    public Animal getAnimal(String type) {
        if ("snake".equals(type)) {
                return new Snake();
        } else {
                return new Tyrannosaurus();
        }
    }

}
