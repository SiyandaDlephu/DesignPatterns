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
public class Class2 {
    
    public int doANotherThing(Class1 class1, int x)
    {
        return 2 * class1.doSomethingCOmplicated(x);
    }
}
