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
	
	public double getNote() {
		return note;
	}
	public void setNote(double note) {
		this.note = note; 
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return nom +" : "+ note;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (((Etudiant)obj).id == this.id) return true;
		return false;
	}
	
	public int compareTo(Etudiant e) {
		if (this.note > e.note ) return -1;
		if (this.note < e.note) return 1;
		return 0;
	}
}
