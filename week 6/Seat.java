enum seatType {
    REGULAR(100), 
    RECLINER(200), 
    VIP(300); 

    private final int price; 


    seatType(int price) {
        this.price = price;
    }
	public int getPrice() {
        return price;
    }
}
public class Seat{
	private int seatnumber;
	private int rownumber;
	private seatType type;
	private double price;
	private boolean isbooked;
	public Seat(int seatnumber,int rownumber,seatType type,double price){
		this.seatnumber=seatnumber;
		this.rownumber=rownumber;
		this.type=type;
		this.price=price;
	}
	public boolean bookseat(){
		isbooked=true;
		return isbooked;
	}
	public void setType(seatType type) {
        this.type = type;
    }
	public seatType gettype(){
		return type;
	}

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isBooked() {
        return isbooked;
    }

    public void setBooked(boolean booked) {
        isbooked = booked;
    }
	

    public int getSeatnumber() {
        return seatnumber;
    }

    public void setSeatnumber(int seatnumber) {
        this.seatnumber = seatnumber;
    }

    public int getRownumber() {
        return rownumber;
    }

    public void setRownumber(int rownumber) {
        this.rownumber = rownumber;
    }
	public void display() {
    System.out.println("Seat Number: " + seatnumber);
    System.out.println("Row Number: " + rownumber);
    System.out.println("Seat Type: " + type);
    System.out.println("Price: $" + price);
    System.out.println("Booked: " + (isbooked ? "Yes" : "No"));
	}




	
}