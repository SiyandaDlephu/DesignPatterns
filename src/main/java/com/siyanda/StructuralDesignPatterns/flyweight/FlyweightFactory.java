/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.siyanda.StructuralDesignPatterns.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author inathi-zenande
 */
public class FlyweightFactory {
    
    private static FlyweightFactory flyweightFactory;
    private Map<String, Flyweight> flyweightPool;

    public FlyweightFactory() {
        
        flyweightPool = new HashMap<String, Flyweight>();
    }
    
    public static FlyweightFactory getInstance()
    {
        if(flyweightFactory == null)
        {
            flyweightFactory = new FlyweightFactory();
        }
        return flyweightFactory;
    }
    
    public Flyweight getFlyweight(String key)
    {
        if(flyweightPool.containsKey(key))
        {
            return flyweightPool.get(key);
        }
        else
        {
            Flyweight flyweight;
            if("add".equals(key))
            {
                flyweight = new FlyweightAdder();
            }
            else
            {
                flyweight = new FlyweightMultiplier();
            }
            flyweightPool.put(key, flyweight);
            return flyweight;
        }
    }
}
