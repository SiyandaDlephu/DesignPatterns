/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.siyanda.designpatterns.test;

import com.siyanda.behavioralDesignPatterns.Mediator.AmericanSeller;
import com.siyanda.behavioralDesignPatterns.Mediator.Buyer;
import com.siyanda.behavioralDesignPatterns.Mediator.FrenchBuyer;
import com.siyanda.behavioralDesignPatterns.Mediator.Mediator;
import com.siyanda.behavioralDesignPatterns.Mediator.SwedishBuyer;
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
public class MediatorTest {
    
    public MediatorTest() {
    }

   @Test
   public void mediatorTesting()
   {
       Mediator m = new Mediator();
       
       Buyer swedishBuyer = new SwedishBuyer(m);
       Buyer frenchBuyer = new FrenchBuyer(m);
       float sellingPriceInDollars = 10.0f;
       AmericanSeller americanSeller = new AmericanSeller(m, sellingPriceInDollars);
       
       float swedishBidInKronor = 55.0f;
       while(!swedishBuyer.attemptToPurchase(swedishBidInKronor))
       {
           swedishBidInKronor +=15.0f;
       }
       
        float swedishBidInEuros = 3.0f;
       while(!swedishBuyer.attemptToPurchase(swedishBidInKronor))
       {
           swedishBidInKronor +=15.0f;
       }
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
