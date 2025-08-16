package com.example.fire_brigade_system;

import java.time.LocalDate;
import java.util.Objects;

public abstract class User {
    private String id, name, phoneNO, email, address, gender, password;
    private LocalDate dob;


    public User(String name, String phoneNO, String email, String address, String gender, String password, LocalDate dob) {
        this.id = this.generateID();
        this.name = name;
        this.phoneNO = phoneNO;
        this.email = email;
        this.address = address;
        this.gender = gender;
        this.password = password;
        this.dob = dob;
    }

    public String getId() {

        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNO() {
        return phoneNO;
    }

    public void setPhoneNO(String phoneNO) {
        this.phoneNO = phoneNO;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return
                " id='" + id + '\n' +
                        " name='" + name + '\n' +
                        " phoneNO='" + phoneNO + '\n' +
                        " email='" + email + '\n' +
                        " address='" + address + '\n' +
                        " gender='" + gender + '\n' +
                        " password='" + password + '\n' +
                        " dob=" + dob
                ;
    }

    public abstract String generateID();

    public boolean login(String id, String password) {
        if (Objects.equals(id, this.getId()) && Objects.equals(password, this.getPassword())) {
            return true;
        }
        return false;
    }

}
