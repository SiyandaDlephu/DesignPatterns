/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.siyanda.designpatterns.test;

import com.siyanda.StructuralDesignPatterns.adapter.TemperatureClassReporter;
import com.siyanda.StructuralDesignPatterns.adapter.TemperatureInfo;
import com.siyanda.StructuralDesignPatterns.adapter.TemperatureObjectReporter;
import org.springframework.util.Assert;
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
public class AdapterTest {
    
    public AdapterTest() {
    }

    @Test
    public void adapterTesting()
    {
        Assert.hasText("Class adapter test");
        TemperatureInfo tempInfo = new TemperatureClassReporter();
        testTempInfo(tempInfo);
        
        Assert.hasText("nobject adapter test");
        tempInfo = new TemperatureObjectReporter();
        testTempInfo(tempInfo);
        
        
    }
    
    @Test
    public static void testTempInfo(TemperatureInfo tempInfo)
    {
        tempInfo.setTemperatureInC(0);
        assertEquals(tempInfo.getTemperatureInC(), " is temp in C");
        assertEquals(tempInfo.getTemperatureInF(), " is temp in F");
        
        tempInfo.setTemperatureInF(85);
        assertEquals(tempInfo.getTemperatureInC(), " is temp in C");
        assertEquals(tempInfo.getTemperatureInF(), " is temp in F");
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
