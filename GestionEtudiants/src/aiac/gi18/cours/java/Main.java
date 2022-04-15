package aiac.gi18.cours.java;

import aiac.gi18.java.complexe.Complexe;
import aiac.gi18.java.complexe.ListComplexe;

public class Main {
	public static void main(String[] args) {
			
		Etudiant c1=new Etudiant(1,"aicha");
		Etudiant c2=new Etudiant(2,"brahim");
		Etudiant c3=new Etudiant(3,"bouchra");
		Etudiant c4=new Etudiant(3,"omar");

		ListEtudiants myList=new ListEtudiants();
		myList.add(c1);
		myList.add(c2);
		myList.add(c3);
		myList.add(c4);
		
		System.out.println(myList);


	}
}
