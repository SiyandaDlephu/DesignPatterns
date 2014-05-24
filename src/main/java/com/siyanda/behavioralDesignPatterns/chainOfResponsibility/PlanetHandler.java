/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.siyanda.behavioralDesignPatterns.chainOfResponsibility;

/**
 *
 * @author inathi-zenande
 */
public abstract class PlanetHandler {
    
    PlanetHandler successor;

    public PlanetHandler(PlanetHandler successor) {
        this.successor = successor;
    }
    
    public void setSuccessor(PlanetHandler successor)
    {
        this.successor = successor;
    }
    
    public abstract void handleRequest(PlanetEnum request);
}
