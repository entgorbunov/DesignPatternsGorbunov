package org.example.basepatterns.structural.proxy;

public class ConcreteWeather extends Weather {

    @Override
    public void whoAmI() {
        System.out.println("\tMethod call from " +
                this.getClass().getSimpleName() + "class");
        System.out.println("\t\tWeather forecast is sunny\n");
    }
}
