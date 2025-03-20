public class man{
	public static void main(String args[]){
		Screen scr =new Screen(1,"return of usman",5,5);
		scr.displayScreen();
		Screen scr1 =new Screen(2,"return of guzman ",5,5);
		Customer customer = new Customer(001,"uzi","02909383702","none@ui.com");
		customer.Display();
		Cinema cin = new Cinema("you" , "345 b 2huewc", 2);
		cin.addscreen(0,scr);
		cin.addscreen(1,scr1);
		cin.displaycinema();
		Ticket t = new Ticket(123,customer,0,6,"return of usman",100.00);
		t.displayTicket();
		
	}
	
}