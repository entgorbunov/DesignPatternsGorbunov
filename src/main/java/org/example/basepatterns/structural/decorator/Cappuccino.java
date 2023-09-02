package org.example.basepatterns.structural.decorator;

public class Cappuccino extends BeverageDecorator{
    public Cappuccino(Beverage beverage) {
        super(beverage);
    }

    @Override
    public int getCost() {
        return beverage.getCost() + 5;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " cappuccino";
    }
}
