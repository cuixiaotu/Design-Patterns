package decorator;

abstract public class CondimentDecorator extends Beverage{
    Beverage beverage;
    abstract public String getDescription();
}
