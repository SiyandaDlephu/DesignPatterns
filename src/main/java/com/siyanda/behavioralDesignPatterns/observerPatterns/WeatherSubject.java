/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.siyanda.behavioralDesignPatterns.observerPatterns;

/**
 *
 * @author inathi-zenande
 */
public interface WeatherSubject {
    public void addObserver(WeatherObserver weatherObserver);

    public void removeObserver(WeatherObserver weatherObserver);

    public void doNotify();
}
