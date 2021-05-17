package adapter.ducks;

public class TurkeyTestDrive {
    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();
        Turkey duckAdapter = new DuckAdapter(duck);


        System.out.println("The DuckAdapter says...");
        duckAdapter.gobble();
        duckAdapter.fly();

        WildTurkey wildTurkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(wildTurkey);

        System.out.println("The turkeyAdapter says...");
        turkeyAdapter.quack();
        turkeyAdapter.fly();
    }

}
