package aiac.gi18.cours.java;

public class Etudiant implements Comparable<Etudiant>{
	private String nom;
	private int  id;
	private double note;
	
	Etudiant(int id, String nom){
		this.nom=nom;
		this.id=id;
		note=10;
	}
	
	@Override
	public String toString() {
		return nom +" : "+ note;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj.id == this.id) return true;
		return false;
	}
}
