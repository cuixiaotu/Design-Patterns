package com.day01.demo1;
import Observer.CurrentConditionsDisplay;
import Observer.StatisticsDisplay;
import Observer.Subject;
import Observer.WeatherData;
import Strategy.FlyRocketPowered;
import Strategy.RedHatDuck;

class main {
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


        weatherData.setMeasurements(231,231,412);

        /* Observer pull */



    }

}


