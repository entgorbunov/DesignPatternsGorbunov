package org.example.basepatterns.structural.bridge.bridgeAndAbstractFactory;

// Абстракция компонента
interface UIComponent {
    void display();
}

// Реализация компонента
interface UIStyle {
    void applyStyle();
}

// Конкретная реализация стиля - светлый
class LightStyle implements UIStyle {
    @Override
    public void applyStyle() {
        System.out.println("Applying light style…");
    }
}

// Конкретная реализация стиля — темный
class DarkStyle implements UIStyle {
    @Override
    public void applyStyle() {
        System.out.println("Applying dark style...");
    }
}

// Абстрактная фабрика
interface UIFactory {
    UIComponent createButton();
    UIComponent createTextField();
}

// Конкретная фабрика с светлым стилем
class LightUIFactory implements UIFactory {
    @Override
    public UIComponent createButton() {
        return new Button(new LightStyle());
    }

    @Override
    public UIComponent createTextField() {
        return new TextField(new LightStyle());
    }
}

// Конкретная фабрика с темным стилем
class DarkUIFactory implements UIFactory {
    @Override
    public UIComponent createButton() {
        return new Button(new DarkStyle());
    }

    @Override
    public UIComponent createTextField() {
        return new TextField(new DarkStyle());
    }
}

// Компонент Кнопка
class Button implements UIComponent {
    private UIStyle style;

    public Button(UIStyle style) {
        this.style = style;
    }

    @Override
    public void display() {
        style.applyStyle();
        System.out.println("Button displayed");
    }
}

// Компонент Текстовое поле
class TextField implements UIComponent {
    private UIStyle style;

    public TextField(UIStyle style) {
        this.style = style;
    }

    @Override
    public void display() {
        style.applyStyle();
        System.out.println("TextField displayed");
    }
}

public class Main {
    public static void main(String[] args) {
        // Создание компонентов с разными стилями через абстрактную фабрику
        UIFactory lightFactory = new LightUIFactory();
        UIComponent lightButton = lightFactory.createButton();
        UIComponent lightTextField = lightFactory.createTextField();

        UIFactory darkFactory = new DarkUIFactory();
        UIComponent darkButton = darkFactory.createButton();
        UIComponent darkTextField = darkFactory.createTextField();

        // Отображение компонентов
        lightButton.display();
        lightTextField.display();

        darkButton.display();
        darkTextField.display();
    }
}

