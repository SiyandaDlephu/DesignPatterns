/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.siyanda.designpatterns.test;

import com.siyanda.StructuralDesignPatterns.composite.Composite;
import com.siyanda.StructuralDesignPatterns.composite.Leaf;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author inathi-zenande
 */
public class ComponentTest {
    
    public ComponentTest() {
    }

    @Test
    public void componentTesting()
    {
        Leaf leaf1 = new Leaf("Bob");
        Leaf leaf2 = new Leaf("Fred");
        Leaf leaf3 = new Leaf("Sue");
        Leaf leaf4 = new Leaf("Ellen");
        Leaf leaf5 = new Leaf("Joe");
        
        Composite composite1 = new Composite();
        composite1.add(leaf1);
        composite1.add(leaf2);
        
        Composite composite2 = new Composite();
        composite2.add(leaf3);
        composite2.add(leaf4);
        
        Composite composite3 = new Composite();
        composite3.add(composite1);
        composite3.add(composite2);
        composite1.add(leaf5);
        
        System.out.println("calling 'sayHello' on leaf1");
        leaf1.sayHello();
        
       System.out.println("calling 'sayHello' on composite1");
        composite1.sayHello();
        
        System.out.println("calling 'sayHello' on composite2");
        composite2.sayHello();
        
        System.out.println("calling 'sayGoodBye' on composite3");
        composite3.sayHello();
    }
    
    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
