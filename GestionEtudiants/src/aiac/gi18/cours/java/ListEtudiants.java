package aiac.gi18.cours.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.locks.Condition;

public class ListEtudiants extends ArrayList<Etudiant> implements aiac.gi18.cours.java.Condition{
	public boolean add(Etudiant e) {
		if (this.contains(e)) return false;
		return super.add(e);
	} 
	/*
	public ListEtudiants filtrer(Condition c) {
		if (this.estVrai(this(e))==true) return super.add(this(e));
		
	}*/
}
