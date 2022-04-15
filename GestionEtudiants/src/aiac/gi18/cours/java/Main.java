package aiac.gi18.cours.java;


public class Main {
	public static void main(String[] args) {
			
		Etudiant c1=new Etudiant(1,"hamid");
		Etudiant c2=new Etudiant(2,"driss");
		Etudiant c3=new Etudiant(1,"youssef");
		
		c1.setNote(15); c2.setNote(12); c3.setNote(16);
		
		ListEtudiants mesEtudiants=new ListEtudiants();
		mesEtudiants.add(c1);
		mesEtudiants.add(c2);
		mesEtudiants.add(c3);
		
		System.out.println(mesEtudiants);
	}
}
