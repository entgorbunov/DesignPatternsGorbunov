package org.example.basepatterns.structural.adapter.test;



public class Main {
    public static void main(String[] args) {
        Letter letter = new Letter("Вы выйграли миллион!!!");
        ShortMessageLetterAdapter adapter = new ShortMessageLetterAdapter(letter);
        System.out.println(createTitle(adapter));
    }

    private static String createTitle(ShortMessage shortMessage) {
        return "Новое сообщение: " + shortMessage.getShortMessage();
    }
}
