package Decorator;

abstract public class Beverage {
    String description = "Unkown Beverage";

    public String getDescription() {
        return description;
    }

    abstract public double cost();
}
