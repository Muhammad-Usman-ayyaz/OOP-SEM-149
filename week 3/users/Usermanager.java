import main.Loginsystem;

public class Usermanager{
	 static final String  username="uzi";
	 static final  String password="12";

	public static class I1{
		public static boolean aunthenticate(String user, String pass){
			if((user.equals(username)) && (pass.equals(pass))){
				return true;
			}
			else{
				return false;
			}
		}
	}
		
}