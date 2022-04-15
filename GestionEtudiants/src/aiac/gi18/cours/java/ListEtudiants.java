package aiac.gi18.cours.java;

import java.util.ArrayList;

public class ListEtudiants extends ArrayList<Etudiant>{
	public boolean add(Etudiant e) {
		if (this.contains(e.id)) return false;
		return super.add(e);
	}
}
