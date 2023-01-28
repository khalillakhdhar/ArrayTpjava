package code;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Etudiant e1=new Etudiant("ahmed", "c1", null);
Etudiant e2=new Etudiant("Mohamed", "c1", null);
e1.addnote(4);
e1.addnote(12);
e2.addnote(-2);
e2.addnote(20);
e1.addnote(22);
e2.addnote(18);
e1.calculeMoyenne();
e2.calculeMoyenne();
System.out.println(e1.toString());
System.out.println(e2.toString());		
		
		
	}

}
