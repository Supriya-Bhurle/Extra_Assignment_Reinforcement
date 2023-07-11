package com.bridgelabz;

import java.util.ArrayList;

public class Doctor {
    private String  doctorName;
    private String  doctorSpeciality;
    String  doctorStatus;
    ArrayList<Patient> doctorPatientList= new ArrayList<Patient>();
    Doctor(String c, String cc)
    {
        this.doctorName=c;
        this.doctorSpeciality=cc;

    }
    public String  getDoctorName()
    {
        return doctorName;
    }

    public ArrayList<Patient> getDoctorPatientList()
    {
        return doctorPatientList;
    }

    public void addPatientsToDoctor(Patient o)
    {
        doctorPatientList.add(o);
    }

    String getDoctorspeciality()
    {
        return doctorSpeciality;
    }
    public String toString()
    {
        return (doctorName+""+doctorSpeciality);
    }

}

