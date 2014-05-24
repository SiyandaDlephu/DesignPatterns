/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.siyanda.StructuralDesignPatterns.composite;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author inathi-zenande
 */
public class Composite implements Component{

    List<Component> components = new ArrayList<Component>();
    
    @Override
    public void sayHello() {
        
        for(Component component : components)
        {
            component.sayHello();
        }
    }

    @Override
    public void sayGoodBye() {
       
        for(Component component : components)
        {
            component.sayGoodBye();
        }
    }
    
    public void add(Component component)
    {
        components.add(component);
    }
    public void remove(Component component)
    {
        components.remove(component);
    }
    
    public List<Component> getComponents()
    {
        return components;
    }
    public Component getComponent(int index)
    {
        return components.get(index);
    }
}
