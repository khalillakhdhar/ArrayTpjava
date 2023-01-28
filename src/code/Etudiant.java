package code;

import java.util.ArrayList;

public class Etudiant {
private String nom,classe,remarque;
private ArrayList<Integer> notes=new ArrayList<Integer>();
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getClasse() {
	return classe;
}
public void setClasse(String classe) {
	this.classe = classe;
}
public String getRemarque() {
	return remarque;
}
public void setRemarque(String remarque) {
	this.remarque = remarque;
}
public void addnote(int n)
{
if((n>=0)&&(n<=20))
{
notes.add(n);
System.out.println("la note est bien attribué à "+this.nom);
}
else
	System.out.println("la note doit être entre 0 et 20");

}

public double calculeMoyenne()
{
	double somme=0; // locale
	for(int n:notes)
	{
		somme+=n;
		
	}
double	moyenne =somme/notes.size();
if(moyenne>=10)
	this.setRemarque("réuissi");
else
	this.setRemarque("redoublement");
	
	return moyenne;
	
}
public Etudiant(String nom, String classe, String remarque) {
	super();
	this.nom = nom;
	this.classe = classe;
	this.remarque = remarque;
}
public Etudiant() {
	super();
}
@Override
public String toString() {
	return "Etudiant [nom=" + nom + ", classe=" + classe + ", remarque=" + remarque + ", calculeMoyenne()="
			+ calculeMoyenne() + "]";
}

}
