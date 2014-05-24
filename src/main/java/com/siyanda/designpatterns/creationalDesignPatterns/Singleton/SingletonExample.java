/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.siyanda.designpatterns.creationalDesignPatterns.Singleton;

/**
 *
 * @author inathi-zenande
 */
public class SingletonExample {
    
    private static SingletonExample singletonExample = null;
    private String text = "Hello";

    public SingletonExample() {
    }
    
   public static SingletonExample getInstance()
   {
       if(singletonExample == null)
       {
           singletonExample = new SingletonExample();
       }
       return singletonExample;
   }
   
   public String sayHello()
   {
       return text;
   }
}
