package com.springproject.booking.entity;

import jakarta.persistence.*;
import org.springframework.lang.NonNull;

@Entity
@Table(name="guest_information")
public class GuestInformation {

    @Id
    @NonNull
    @Column(name = "id")
    private int id;

    @Column(name = "phone_number", length = 10)
    @NonNull
    private String phoneNumber;


    @Column(name = "pin")
    @NonNull
    private String pin;

    @Column(name = "age")
    private int age;

    public int getId() {
        return id;
    }

    @NonNull
    public String getPhoneNumber() {
        return phoneNumber;
    }

    @NonNull
    public String getPin() {
        return pin;
    }

    public int getAge() {
        return age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPhoneNumber(@NonNull String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setPin(@NonNull String pin) {
        this.pin = pin;
    }

    public void setAge(int age) {
        this.age = age;
    }
}