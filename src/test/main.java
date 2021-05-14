package test;

import observer.CurrentConditionsDisplay;
import observer.StatisticsDisplay;
import observer.WeatherData;


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

