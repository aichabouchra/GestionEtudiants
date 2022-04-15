package aiac.gi18.cours.java;

import java.util.ArrayList;

import aiac.gi18.java.complexe.Condition;
import aiac.gi18.java.complexe.Etudiant;
import aiac.gi18.java.complexe.ListEtudiants;

public class ListEtudiants extends ArrayList<Etudiant> implements aiac.gi18.cours.java.Condition{
	public boolean add(Etudiant e) {
		if (this.contains(e)) {
			this.remove(this.indexOf(e));
			return super.add(e);
		}
		return super.add(e); 
	}

	@Override
	public boolean estVrai(Etudiant e) {
		if (e.getNote()>13) return true;
		return false;
	}
	
	public ListEtudiants filtrer(Condition c) {
		int i=0; 
		if (c.estVrai(this.get(i))==true) {
			Etudiant a=this.get(i);
			this.add(a);
			i++; 
		}
		return this;
	}
}
