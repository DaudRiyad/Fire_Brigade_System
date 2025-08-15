package com.example.fire_brigade_system.managers;



import com.example.fire_brigade_system.Models.User;
import java.util.ArrayList;
import java.util.List;

public class UserManager {
    private static final List<User> users = new ArrayList<>();

    public static boolean validateLogin(String userId, String password) {
        return users.stream().anyMatch(u -> u.getUserId().equals(userId) && u.getPassword().equals(password));
    }

    public static boolean userIdExists(String userId) {
        return users.stream().anyMatch(u -> u.getUserId().equals(userId));
    }

    public static void addUser(User user) {
        users.add(user);
    }

    public static User findUserByIdAndPhone(String userId, String phone) {
        return users.stream()
                .filter(u -> u.getUserId().equals(userId) && u.getPhone().equals(phone))
                .findFirst()
                .orElse(null);
    }
}
