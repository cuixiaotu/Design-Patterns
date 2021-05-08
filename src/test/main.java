package test;

import Observer.CurrentConditionsDisplay;
import Observer.StatisticsDisplay;
import Observer.WeatherData;

import Strategy.FlyRocketPowered;
import Strategy.RedHatDuck;


public class main {
    public static void main(String[] args) {

        /* Strategy */
        /*
        RedHatDuck redHatDuck = new RedHatDuck();
        redHatDuck.swim();
        redHatDuck.performFly();
        redHatDuck.setFlyBehavior(new FlyRocketPowered());
        redHatDuck.performFly();
        redHatDuck.performQuack();
        */

        /* Observer push */
        WeatherData weatherData = new WeatherData();
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(123,123,123);
        /* Observer B */
    }




}

