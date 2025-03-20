public class Screen{
	int screennumber;
	 String movietitle;
	Seat seats[][];
	int counter=1;
	
	public Screen(int screennumber,String movietitle,int rows,int cols){
		this.screennumber=screennumber;
		this.movietitle=movietitle;
		this.seats = new Seat[rows][cols];
		for (int i = 0; i < rows; i++) {
            seatType type=seatType.VIP; 
            if (i >= 2) {
                type = seatType.RECLINER;
            }
			if(i>3){
                type = seatType.REGULAR;
            }
			for (int j = 0; j < cols; j++) {
                seats[i][j] = new Seat(counter, i, type,type.getPrice());
                counter++;
            }
        }
	}
	public boolean bookSeat(int row , int col , Customer cus){
		cus.Display();
		return seats[row][col].bookseat();
	}
	public void displayScreen() {
        System.out.println("Screen Number: " + screennumber);
        System.out.println("Movie Title: " + movietitle);
        System.out.println("Seating Arrangement: ");

        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                Seat seat = seats[i][j];
                System.out.print("[" + seat.gettype() + "] ");
            }
            System.out.println(); 
        }
	}
}

	
