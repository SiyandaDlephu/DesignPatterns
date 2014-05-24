/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.siyanda.designpatterns.test;

import com.siyanda.behavioralDesignPatterns.chainOfResponsibility.MercuryHandler;
import com.siyanda.behavioralDesignPatterns.chainOfResponsibility.PlanetEnum;
import com.siyanda.behavioralDesignPatterns.chainOfResponsibility.PlanetHandler;
import org.testng.Assert;
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
public class ChainOfResponsibilityTest {
    
    public ChainOfResponsibilityTest() {
    }

    @Test
    public void chainOfResponsibiltyTest()
    {
      
       PlanetHandler chain = setUpChain();

        Assert.assertEquals(chain.handleRequest(PlanetEnum.VENUS), "Mercury");
        Assert.assertEquals(chain.handleRequest(PlanetEnum.MERCURY), "Mercury");
        Assert.assertEquals(chain.handleRequest(PlanetEnum.EARTH), "Mercury");
        chain.handleRequest(PlanetEnum.JUPITER);
	
    }
    
    public static PlanetHandler setUpChain() {
        PlanetHandler mercuryHandler = new MercuryHandler();
        PlanetHandler venusHandler = new VenusHandler();
        PlanetHandler earthHandler = new EarthHandler();

        mercuryHandler.setSuccessor(venusHandler);
        venusHandler.setSuccessor(earthHandler);

        return mercuryHandler;
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
