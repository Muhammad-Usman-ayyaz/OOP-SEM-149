public class Ticket{
	int ticketid;
	Customer customer;
	int screennumber;
	int seatnumber;
	String movietitle;
	double price;
	public Ticket(int ticketid,Customer customer,int screennumber,int seatnumber,String movietitle,double price){
		this.ticketid=ticketid;
		this.customer=customer;
		this.screennumber=screennumber;
		this.seatnumber=seatnumber;
		this.movietitle=movietitle;
		this.price=price;
		
	}
	 public void displayTicket() {
        
        System.out.println("Ticket ID: " + ticketid);
        System.out.println("Movie Title: " + movietitle);
        System.out.println("Screen Number: " + screennumber);
        System.out.println("Seat Number: " + seatnumber);
        System.out.println("Price: $" + price);
		customer.Display(); 
        ;
    }
}