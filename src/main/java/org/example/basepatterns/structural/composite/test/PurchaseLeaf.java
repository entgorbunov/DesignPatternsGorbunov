package org.example.basepatterns.structural.composite.test;
/*
Лист это простой компонент дерева, не имеющий ответвлений. Так как листу больше некому передавать выполнение,
классы листьев будут содержать большую часть полезного кода.
 */
public class PurchaseLeaf implements PackageComponent{
    private int price;

    public PurchaseLeaf(int price) {
        this.price = price;
    }

    @Override
    public int countPrice() {
        return price;
    }
}
