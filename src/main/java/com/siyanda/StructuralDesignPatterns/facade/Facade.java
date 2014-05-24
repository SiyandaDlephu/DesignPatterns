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
public class Facade {
    
    public int cubeX(int x)
    {
        Class1 class1 = new Class1();
        return class1.doSomethingCOmplicated(x);
    }
    
    public int cubeXtTime2 (int x)
    {
        Class1 class1 = new Class1();
        Class2 class2 = new Class2();
        
        return class2.doANotherThing(class1, x);
    }
    
    public int eToSixthPowerTimes2(int x)
    {
        Class1 class1 = new Class1();
        Class2 class2 = new Class2();
        Class3 class3 = new Class3();
        
        return class3.doMoreStuff(class1, class2, x);
    }
}
