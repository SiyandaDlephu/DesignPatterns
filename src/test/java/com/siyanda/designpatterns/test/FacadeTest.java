/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.siyanda.designpatterns.test;

import com.siyanda.StructuralDesignPatterns.facade.Facade;
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
public class FacadeTest {
    
    public FacadeTest() {
    }

  @Test
  public void facadeTesting()
  {
      Facade facade = new Facade();
      int x =3;
      System.out.println("Cube of " + x +" :"+facade.cubeX(3));
      System.out.println("Cube of "+ x + " :"+facade.cubeXtTime2(3) );
      System.out.println(x +" ti sixth pwer times 2: "+ facade.eToSixthPowerTimes2(3));
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
