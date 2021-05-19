package templatemethod.barista;

public class Tea extends CaffeineBeverage{

    @Override
    void addCondiments() {
        System.out.println("Add Lemon");
    }

    @Override
    void brew() {
        System.out.println("Dripping Tea through filter");
    }
}
