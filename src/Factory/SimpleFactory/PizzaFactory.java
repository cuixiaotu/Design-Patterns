package Factory.SimpleFactory;

public class PizzaFactory {
    public Pizza createPizza(String item) {
        Pizza pizza = null;
        if (item.equals("cheese")) {
            pizza =  new CheesePizza();
        } else if (item.equals("veggie")) {
            pizza = new VeggiePizza();
        } else if (item.equals("clam")) {
            pizza = new ClamPizza();
        } else if (item.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        }
        return pizza;
    }
}
