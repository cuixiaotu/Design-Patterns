package com.day01.demo1;
import Strategy.FlyRocketPowered;
import Strategy.RedHatDuck;

class main {
    public static void main(String[] args) {
        /* Strategy */
        RedHatDuck redHatDuck = new RedHatDuck();
        redHatDuck.swim();
        redHatDuck.performFly();
        redHatDuck.setFlyBehavior(new FlyRocketPowered());
        redHatDuck.performFly();
        redHatDuck.performQuack();


        /* Strategy */

    }

}


