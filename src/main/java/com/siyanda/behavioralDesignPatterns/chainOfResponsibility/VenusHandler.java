/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.siyanda.behavioralDesignPatterns.chainOfResponsibility;

import static com.siyanda.behavioralDesignPatterns.chainOfResponsibility.PlanetEnum.VENUS;

/**
 *
 * @author inathi-zenande
 */
public class VenusHandler extends PlanetHandler{

    public VenusHandler(PlanetHandler successor) {
        super(successor);
    }

    
      public void handleRequest(PlanetEnum request)
    {
        if(request == PlanetEnum.VENUS)
        {
            System.out.println("VENUShundler handles " + request);
            System.out.println("VENUShundler is hot");
        }
        else
        {
            System.out.println("VENUShundler handles " + request);
            if(successor != null)
            {
                successor.handleRequest(request);
            }
        }
    }
    
}
