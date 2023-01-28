package code;

import java.util.Scanner;

public class ExempleException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner sc=new Scanner(System.in);
 System.out.println("donnez votre nom:");
String nom=sc.nextLine();
 System.out.println("donnez votre age:");
 try
 {
 int age=sc.nextInt();
 }
 catch(Exception ex)
 {
	 System.out.println("l'age doit être numérique");
	 
 }
	}

}
