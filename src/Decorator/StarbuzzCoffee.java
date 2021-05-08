package Decorator;

public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new DarkRoast();
        System.out.println(beverage.getDescription()
                + " $" + beverage.cost());

        Beverage beverage1 = new Decaf();
        beverage1 = new Mocha(beverage1);
        System.out.println(beverage1.getDescription()
                + " $" + beverage1.cost());


        Beverage beverage2 = new Espresso();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Milk(beverage2);
        beverage2 = new Milk(beverage2);
        beverage2 = new Soy(beverage2);
        System.out.println(beverage2.getDescription()
                + " $" + beverage2.cost());

    }

}
