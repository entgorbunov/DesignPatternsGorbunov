package org.example.basepatterns.structural.composite.test;

import org.example.basepatterns.behavioral.observer.Publisher;

import java.util.List;

/*
Контейнер (или композит) это составной компонент дерева. Он содержит набор дочерних типов, но ничего не знает об
их типах. Это могут быть как простые компоненты — листья, так и другие контейнеры — компоненты.
Это не является проблемой, если все дочерние компоненты следуют одному интерфейсу.
 */
public class BoxContainer implements PackageComponent{
    private final List<PackageComponent> childrenComponents;

    public BoxContainer(List<PackageComponent> childrenComponents) {
        this.childrenComponents = childrenComponents;
    }

    public void add(PackageComponent packageComponent) {
        childrenComponents.add(packageComponent);
    }

    public void remove(int index) {
        childrenComponents.remove(index);
    }

    public List<PackageComponent> get() {
        return childrenComponents;
    }

    @Override
    public int countPrice() {
        return childrenComponents.stream()
                .map(PackageComponent::countPrice)
                .mapToInt(Integer::intValue).sum();
    }

}
