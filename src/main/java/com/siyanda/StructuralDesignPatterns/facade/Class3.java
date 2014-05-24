/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.siyanda.StructuralDesignPatterns.facade;

/**
 *
 * @author inathi-zenande
 */
public class Class3 {
    
    public int doMoreStuff(Class1 class1, Class2 class2, int x)
    {
        return class1.doSomethingCOmplicated(x) * class2.doANotherThing(class1, x);
    }
}
