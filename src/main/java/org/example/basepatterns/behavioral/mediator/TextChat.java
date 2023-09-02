package org.example.basepatterns.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class TextChat implements Chat{
   public User admin;
    public List<User> users = new ArrayList<>();

    public void setAdmin(User admin) {
        this.admin = admin;
        System.out.println("У нас появился новый админ");
    }

    public void addUser(User user) {
        users.add(user);
        System.out.println("У нас появился новый пользователь");
    }
    @Override
    public void sendMessage(String message, User user) {
        for (User u : users) {
            u.getMessage(message);
        }
        admin.getMessage(message);
    }
}
