package aiac.gi18.cours.java;

import java.util.ArrayList;

import aiac.gi18.java.complexe.Etudiant;

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
}
