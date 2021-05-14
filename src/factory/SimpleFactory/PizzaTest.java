package factory.SimpleFactory;

public class PizzaTest {

    public static void main(String[] args) {
        PizzaFactory factory = new PizzaFactory();
        PizzaStore pizzaStore = new PizzaStore(factory);

        pizzaStore.orderPizza("pepperoni");

        pizzaStore.orderPizza("cheese");

    }
}
