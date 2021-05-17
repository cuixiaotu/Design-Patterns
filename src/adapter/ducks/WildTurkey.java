package adapter.ducks;

public class WildTurkey implements Turkey{
    @Override
    public void gobble() {
        System.out.println(" WildTurkey Gobble gobble");
    }

    @Override
    public void fly() {
        System.out.println("WildTurkey I'm flying a short distance");
    }
}
