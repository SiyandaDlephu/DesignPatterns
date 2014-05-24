/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.siyanda.StructuralDesignPatterns.adapter;

/**
 *
 * @author inathi-zenande
 */
public class TemperatureObjectReporter implements TemperatureInfo{

    CelciusReporter celciusReporter;

    public TemperatureObjectReporter() {
        celciusReporter = new CelciusReporter();
    }
    
    @Override
    public double getTemperatureInF() {
        return celciusReporter.getTemperature();
    }

    @Override
    public void setTemperatureInF(double temperatureInF) {
        celciusReporter.setTemperature(fToC(temperatureInF));
    }

    @Override
    public double getTemperatureInC() {
        return celciusReporter.getTemperature();
    }

    @Override
    public void setTemperatureInC(double temperatureInC) {
        celciusReporter.setTemperature(temperatureInC);
    }
    
    
    private double fToC(double f)
    {
        return((f - 32) *5/9);
    }
    
    private double cToF(double c)
    {
        return ((c*9 / 5) + 32);
    }
}
