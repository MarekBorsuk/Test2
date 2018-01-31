package app;

import java.util.Scanner;

import data.Patient;
import util.Hostel;

public class HospitalApp {
	public static final int EXIT = 0;
	public static final int ADD_PATIENT = 1;
	public static final int PRINT_PATIENTS = 2;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int option = -1;
		
		Hostel hostel = new Hostel();
		
		while (option != EXIT) {
			System.out.println("Dostêpne opcje: ");
			System.out.println("0 - wyjœcie z programu");
			System.out.println("1 - dodanie pacjenta");
			System.out.println("2 - wyœwietlanie listy pacjentów");
			
			System.out.println("Wybierz opcjê: ");
			option = input.nextInt();
			input.nextLine();
			
			switch (option) {
			case EXIT:
				System.out.println("Zamykam program!");
				break;
			case ADD_PATIENT:
				Patient patient = new Patient();
				System.out.println("Imiê: ");
				patient.setFirstName(input.nextLine());
				System.out.println("Nazwisko: ");
				patient.setLastName(input.nextLine());
				System.out.println("Podaj pesel: ");
				patient.setPesel(input.nextLine());
				hostel.addPatient(patient);
				break;
			case PRINT_PATIENTS:
				hostel.printPatients();	
				break;

			default:
				System.out.println("Nie znaleziono takie opcji.");
			}
		}
		input.close();

	}

}
