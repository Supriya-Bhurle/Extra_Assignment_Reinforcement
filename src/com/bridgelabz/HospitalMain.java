package com.bridgelabz;

public class HospitalMain {
    public static void main(String[] args) {
        // Create a patient
        Patient patient1 = new Patient("Rohit", 30, "male", "Medical Square Nagpur", "6756543429", new Hospital("Aastha Hospital", "Bardi Nagpur"));
        System.out.println("Name of the patient is " + patient1.getName() + " Age of the Patient is " + patient1.getAge() + " And Gender of the Patient is  " + patient1.getGender() + ")");
        System.out.println("Address of the patients is : " + patient1.getAddress());
        System.out.println("Phone Number of the Patient is : " + patient1.getPhoneNumber());


        // Print the patient's hospital
        System.out.println(patient1.getHospital().getHospitalName());






        Patient patient2 = new Patient("Rupali", 20, "Female", "Hingna Nagpur", "6712343429", new Hospital("Cristanand Hospital", "Dharmpeth Nagpur"));
        System.out.println("Name of the patient is " + patient2.getName() + " Age of the Patient is " + patient2.getAge() + " And Gender of the Patient is  " + patient2.getGender() + ")");
        System.out.println("Address of the patients is : " + patient2.getAddress());
        System.out.println("Phone Number of the Patient is : " + patient2.getPhoneNumber());


        // Print the patient's hospital
        System.out.println(patient2.getHospital().getHospitalName());



        // Add the patient to the patient management system
        PatientManagement patientMan = new PatientManagement();
        patientMan.addPatient(new Patient("Supriya",23,"Female","Vidya NAger","12345",new Hospital("Ganvir Hospital","Back of Git Petrol pump")));
        System.out.println("Before removing patient:");
        System.out.println(patientMan);
       // patientMan.removePatient(new Patient("John Doe", "123 Main Street", "123-456-7890"));
        System.out.println("After removing patient:");
        System.out.println(patientMan);
    }




    }

