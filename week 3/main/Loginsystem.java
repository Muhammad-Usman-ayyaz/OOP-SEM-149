package main;
import users.Usermanager;
import java.util.Scanner;
import java.io.Console;

public class LoginSystem{
		
		public static void main(String args[]){

			Scanner s1=new Scanner(System.in);
			Console c1=System.Console();
				
			passwordvalidator objA= new passwordvalidator();
			passwordvalidator.jp objB=objA.new jp();
			Usermanager.I1 objC=new Useranager.I1();


			System.out.print("Enter username: ");
			String user=s1.next();
			
			System.out.print("Enter password: ");
			String pass=c1.readPassword();

			ojB.Validate(pass);
			objC.aunthenticate(user,pass);
			if(objC.aunthenticate(user,pass)){
				System.out.println("Access Granted");
			}
			else{
				System.out.print("access denied")
			}
}
}