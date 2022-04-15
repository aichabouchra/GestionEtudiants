package aiac.gi18.cours.java;

import java.util.ArrayList;
import java.util.concurrent.locks.Condition;

public class ListEtudiants extends ArrayList<Etudiant> {
	public boolean add(Etudiant e) {
		if (this.contains(e)) return false;
		return super.add(e);
	} 
	/*
	@Override
	public boolean estVrai(Etudiant e) {
		
	}*/
}
