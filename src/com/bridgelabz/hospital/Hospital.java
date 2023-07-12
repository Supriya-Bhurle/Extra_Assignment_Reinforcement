package com.bridgelabz.hospital;

import java.util.ArrayList;
import java.util.List;

public class Hospital {

    private String hospitalName;
    private String hospitalAddress;
    private List<Patient> patients;

    public Hospital(String hospitalName, String hospitalAddress) {
        this.hospitalName= hospitalName;
        this.hospitalAddress = hospitalAddress;
        this.patients = new ArrayList<>();
    }

    public String getHospitalName() {
        return  hospitalName;
    }

    public String getHospitalAddress() {
        return hospitalAddress;
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public void removePatient(Patient patient) {
        patients.remove(patient);
    }

    public void printPatients() {
        for (Patient patient : patients) {
            System.out.println(patient.getName() + " (" + patient.getAge() + ", " + patient.getGender() + ")");
        }
    }
}