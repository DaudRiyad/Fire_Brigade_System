package com.example.fire_brigade_system.FireInspector;
import com.example.fire_brigade_system.User;
import com.example.fire_brigade_system.User;

import java.time.LocalDate;
import java.util.Objects;
import java.util.Random;

public class FireInspector extends com.example.fire_brigade_system.User {

    private static final String Password = "";

    public FireInspector(String name, String phoneNO, String email, String address, String gender, String password, LocalDate dob) {
        super(name, phoneNO, email, address, gender, Password, dob);
        this.setId(this.generateID());
    }

    @Override
    public String generateID() {
        String id = "";

        Random random = new Random();
        id = Integer.toString(random.nextInt(1000000, 9999999));

        return id;
    }

    @Override
    public boolean login(String id, String password) {
        if (Objects.equals(id, this.getId()) && Objects.equals(password, this.getPassword())) {
            return true ;
        }
        return false ;
    }
}
