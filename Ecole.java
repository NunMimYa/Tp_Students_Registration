package com.m2iformation.TPEcole;

import java.util.ArrayList;
import java.util.Scanner;

// TO IMPROVE
public class Ecole {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<El�ve> listeEleve = new ArrayList<>();
		ArrayList<El�ve> listeEleveBio = new ArrayList<>();
		ArrayList<El�ve> listeEleveLit = new ArrayList<>();
		ArrayList<El�ve> listeEleveChe = new ArrayList<>();
		ArrayList<Cours> listeCours = new ArrayList<>();

		char yes; 
		char no;
		int x;
		int y;
		int StudentNumberAdd=0;
		int NDisplineAdd=0;
		String dicipline;
		String answer;
		String firstname;
		String lastname;
		String choice; 
		int old;
		int year;	
		String discipline;
		int hours; 
		int yearD;
		int biology=0;
		int literature=0;
		int chemistry=0;

		///////////////////////////////////////////////////////////////////////////INSTANCIATIONS DE QUELQUES ELEVES MANUELLEMENT

		El�ve Jonas = new El�ve("Jonas", "LEMARCHAND", 16, 2, "Biology");
		El�ve Matthieu = new El�ve("Matthieu", "DUBOIS", 14, 1, "Literature");
		El�ve Etienne = new El�ve("Etienne", "PERRIN", 15, 2, "Chemistry");		
		listeEleve.add(Jonas);
		listeEleve.add(Matthieu);
		listeEleve.add(Etienne);



		////////////////////////////////////////////////////////////////////////////////////STUDENTS' REGISTER
		Scanner sc = new Scanner(System.in);
		System.out.println("STUDENTS' BOOKING: ");
		System.out.println("####################");
		System.out.println("WANT TO ADD A STUDENT ? Y -> [1]/N -> [0]");
		//		answer = sc.next();
		x = sc.nextInt();

		if (x==1) {
			do {
				StudentNumberAdd++;
				System.out.println("First Name: ");
				firstname = sc.next();
				System.out.println("Last Name: (in upper case)");
				lastname = sc.next();
				System.out.println("Age: ");
				old = sc.nextInt();
				System.out.println("Year: ");
				year = sc.nextInt();
				//				System.out.println("___________________");
				//				System.out.println(lastname + " " + firstname + " , " + old + " years old," + " year :" + year);
				System.out.println("#####################################");

				System.out.println("FOR WHICH DISCPLINE ? Biology -> [B]/Literature -> [L]/Chemistry -> [C]");
//				System.out.println("FOR WHICH DISCPLINE ? Biology/Literature/Chemistry");
				choice = sc.next();	
//				dicipline = sc.next();	
				
				switch (choice) {
				case "B":
					dicipline = "Biology";
					break;
				case "L":
					dicipline = "Literature";
					break;
				case "C":
					dicipline = "Chemistry";
					break;
				default:
					System.out.println("NOT A CORRECT CHOICE");
					continue;
				}
				////////////////////////////////////////////////////////////////////////////    AJOUT DE L ETUDIANT DANS UN TABLEAU ALL
				El�ve stu = new El�ve(firstname, lastname, old, year, dicipline);

				switch (dicipline) {
				case "Biology":
					//					dicipline = "Biology";	
					biology++;
					listeEleve.add(stu);
					listeEleveBio.add(stu);
					//					System.out.println("\n	###	Add "+ lastname + " " + firstname + " , " + old + " years old to Biology|  Year: " + year + "\n");
					System.out.println("\n" + lastname + " " + firstname + " | " + old + " | " + dicipline+ " | " + year + "\n");
					break;
				case "Literature":
					//					dicipline = "Literature";
					literature++;
					listeEleve.add(stu);
					listeEleveLit.add(stu);
					System.out.println("\n" + lastname + " " + firstname + " | " + old + " | " + dicipline+ " | " + year + "\n");
					break;
				case "Chemistry":
					//					dicipline = "Chemistry";
					chemistry++;
					listeEleve.add(stu);
					listeEleveChe.add(stu);
					System.out.println("\n" + lastname + " " + firstname + " | " + old + " | " + dicipline+ " | " + year + "\n");
					break;
				default:
					System.out.println("NOT A CORRECT CHOICE");
					continue;
				}				

				//			listeEleve.add(stu);
				System.out.println("NEED TO ADD AN ANOTHER STUDENT ? Y -> [1]/N -> [0]");
				x = sc.nextInt();
			}while (x==1);
			//		if (x == 1) 
		}else {
			System.out.println("GOODBYE");
		}	
		System.out.println("YOU ADD: " + StudentNumberAdd + " STUDENT(S)\n");
		//		System.out.println("GOODBYE");


		System.out.println("###################################	ALL\n");
		for (El�ve str: listeEleve) {
			System.out.println(str);
		}
		System.out.println("");
		System.out.println("###################################	BIOLOGY STUDENT(S) | "+biology+"\n");
		for (El�ve str: listeEleveBio) {
			System.out.println(str);
		}
		System.out.println("");
		System.out.println("###################################	LITERATURE STUDENT(S) | "+literature+"\n");
		for (El�ve str: listeEleveLit) {
			System.out.println(str);
		}
		System.out.println("");
		System.out.println("###################################	CHEMISTRY STUDENT(S) | "+chemistry+"\n");
		for (El�ve str: listeEleveChe) {
			System.out.println(str);
		}	
		System.out.println("");

		//////////////////////////////////////////////////////////////////////////////////////////////DISCIPLNES
		System.out.println("#####################################");
		System.out.println("#####################################");
		System.out.println("#####################################\n");
		System.out.println("DISCIPLINES' REGISTER: ");
		System.out.println("___________________");
		System.out.println("WANT TO ADD A DISCIPLNE ? Y -> [1]/N -> [0]");
		x = sc.nextInt();

		if (x==1) {
			do {
				NDisplineAdd++;
				System.out.println("Discipline: (Biology, Literature, Chemistry, Physics,  Economics...");
				discipline = sc.next();
				System.out.println("Hours number: ");
				hours = sc.nextInt();
				System.out.println("Year: ");
				yearD = sc.nextInt();
				System.out.println("___________________");
				System.out.println(discipline + ", " + hours + "H, " + yearD);

//				Cours dis = new Cours(discipline, hours, yearD);
//				listeCours.add(dis);		
				//			listeEleve.add(stu);
				for (Cours lc: listeCours) {
					System.out.println(lc);
				}
				System.out.println("NEED TO ADD AN ANOTHER DISCIPLINE ? Y -> [1]/N -> [0]");
				x = sc.nextInt();
			}while (x==1);
			//		if (x == 1) 
		}else {
			System.out.println("GOODBYE");
		}	
		System.out.println("YOU ADD: " + NDisplineAdd + " DISCIPLINE(S)");		

		Cours bio = new Cours("Biology", 21, 2, listeEleveBio);
		Cours lit = new Cours("English", 10, 1, listeEleveLit);
		Cours che = new Cours("Mathematic", 30, 3, listeEleveChe);
		listeCours.add(bio);
		listeCours.add(lit);
		listeCours.add(che);
		System.out.println("###################################	ALL\n");
		for (El�ve str: listeEleve) {
			System.out.println(str);
		}
		System.out.println("\n###################################	DISCIPLINES\n");
		for (Cours lc: listeCours) {
			System.out.println(lc);
		}
		System.out.println("\n							THANKS YOU ! HAVE A NICE DAY !");
	}
}
