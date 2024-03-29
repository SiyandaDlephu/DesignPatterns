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
public class MercuryHandler extends PlanetHandler{

    public MercuryHandler(PlanetHandler successor) {
        super(successor);
    }
    
    public void handleRequest(PlanetEnum request)
    {
        if(request == PlanetEnum.MERCURY)
        {
            System.out.println("Mercuryhandler handles " + request);
            System.out.println("Mercutly is hot");
        }
        else
        {
            System.out.println("Mercuryhandler handles " + request);
            if(successor != null)
            {
                successor.handleRequest(request);
            }
        }
    }
    
}
