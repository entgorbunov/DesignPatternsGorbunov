package org.example.basepatterns.structural.decorator;

public class Sugar extends BeverageDecorator{
    public Sugar(Beverage beverage) {
        super(beverage);
    }

    @Override
    public int getCost() {
        return beverage.getCost() + 5;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " sugar";
    }
}
