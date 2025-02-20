import java.util.Scanner;
public class test2{
	

	public static void main(String arg[]){
		Scanner scanner=new Scanner(System.in);
		String x=userinfo.username;
		String p=userinfo.password;
		String user2="";
		user2=scanner.nextLine();
		String pass2="";
		pass2=scanner.nextLine();
		if(x.equals(user2)){
			System.out.println("Acceess Granted");

		}else{
			System.out.println("Acces denied");

		}
		if(p.equals(pass2)){
			System.out.println("Acceess Granted");

		}else{
			System.out.println("Acces denied");

		}
		
		
		
		
		
	
	}
}