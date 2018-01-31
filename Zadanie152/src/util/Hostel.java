package util;

import data.Patient;

public class Hostel {
	public static final int MAX_PATIENTS_NUM = 10;
	private Patient[] patients;
	private int regPatients;
	
	public Hostel() {
		patients = new Patient[MAX_PATIENTS_NUM];
		regPatients = 0;		
	}
	
	public void addPatient(Patient patient) {
		if (regPatients < MAX_PATIENTS_NUM) {
			patients[regPatients] = patient;
			regPatients++;
		}else {
			System.out.println("Zapisano maksymaln¹ liczbê pacjentów, zapraszamy jutro.");
		}		
	}
	public void printPatients() {
		for (int i = 0; i < regPatients; i++) {
			System.out.println(patients[i].getFirstName() + " " + patients[i].getLastName()+ " " +
					patients[i].getPesel());			
		}
	}
}
