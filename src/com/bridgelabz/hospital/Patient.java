package com.bridgelabz.hospital;

import com.bridgelabz.hospital.Hospital;

public class Patient {
    private String name;
    private int age;
    private String gender;
    private String address;
    private String phoneNumber;
    private Hospital hospital;

    public Patient(String name, int age, String gender, String address, String phoneNumber, Hospital hospital) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.hospital = hospital;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

}

