package com.example.fire_brigade_system.IncidentCommander;

import com.example.fire_brigade_system.User;

import java.time.LocalDate;
import java.util.Random;

public class IncidentCommander extends User {
    public IncidentCommander( String name, String phoneNO, String email, String address, String gender, String password, LocalDate dob) {
        super( name, phoneNO, email, address, gender, password, dob);
        this.setId(this.generateID());
    }

    @Override
    public String toString() {
        return
                super.toString();
    }

    @Override
    public String generateID() {
        return "inCommander";
    }

}
