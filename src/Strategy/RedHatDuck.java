package Strategy;

public class RedHatDuck extends Duck{


    public RedHatDuck(){
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    public void display(){
        System.out.println("I'am Red Hat Duck");
    }
}
