package org.example.basepatterns.structural.bridge.bridgeAndBuilder;

// Интерфейс строителя
interface Builder {
    void buildPartA();
    void buildPartB();
    Product getResult();
}

// Конкретный строитель для продукта типа A
class ConcreteBuilderA implements Builder {
    private Product product = new Product();

    @Override
    public void buildPartA() {
        product.addPart("Part A for Product A");
    }

    @Override
    public void buildPartB() {
        product.addPart("Part B for Product A");
    }

    @Override
    public Product getResult() {
        return product;
    }
}

// Конкретный строитель для продукта типа B
class ConcreteBuilderB implements Builder {
    private Product product = new Product();

    @Override
    public void buildPartA() {
        product.addPart("Part X for Product B");
    }

    @Override
    public void buildPartB() {
        product.addPart("Part Y for Product B");
    }

    @Override
    public Product getResult() {
        return product;
    }
}

// Абстракция директора
interface Director {
    void construct(Builder builder);
}

// Конкретный директор
class ConcreteDirector implements Director {
    @Override
    public void construct(Builder builder) {
        builder.buildPartA();
        builder.buildPartB();
    }
}

// Продукт
class Product {
    private StringBuilder parts = new StringBuilder();

    public void addPart(String part) {
        parts.append(part).append("\n");
    }

    public String getParts() {
        return parts.toString();
    }
}

public class Main {
    public static void main(String[] args) {
        Director director = new ConcreteDirector();

        Builder builderA = new ConcreteBuilderA();
        director.construct(builderA);
        Product productA = builderA.getResult();
        System.out.println("Product A parts:\n" + productA.getParts());

        Builder builderB = new ConcreteBuilderB();
        director.construct(builderB);
        Product productB = builderB.getResult();
        System.out.println("Product B parts:\n" + productB.getParts());
    }
}

