package com.bridgelabz.hospital;

import com.bridgelabz.hospital.Hospital;
import com.bridgelabz.hospital.Patient;

import java.util.ArrayList;
import java.util.List;

public class PatientManagement {
    private List<Patient> patients;
    private List<Hospital> hospitals;
    public PatientManagement() {
        this.patients = new ArrayList<>();
        this.hospitals = new ArrayList<>();
    }
    public void addPatient(Patient patient) {
        patients.add(patient);
        patient.getHospital().addPatient(patient);
    }
    public void removePatient(Patient patient) {
        patients.remove(patient);
        patient.getHospital().removePatient(patient);
    }
    @Override
    public String toString() {
        return "PatientManagement{" +
                "patients=" + patients +
                ", hospitals=" + hospitals +
                '}';
    }
}