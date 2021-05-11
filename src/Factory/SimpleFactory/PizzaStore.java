package Factory.SimpleFactory;


public class PizzaStore {
    PizzaFactory factory;

    public PizzaStore(PizzaFactory factory){
        this.factory = factory;
    }

    public Pizza orderPizza(String type) {
        Pizza pizza = factory.createPizza(type);
        System.out.println("--- Making a " + pizza.getName() + " ---");
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}