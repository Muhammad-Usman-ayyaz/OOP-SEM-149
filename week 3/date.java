class Date {
    private int date;
    private int month;
    private int year;

    // Default constructor
    Date() {
      this(1);
    }

    // Constructor with month and year
    Date(int month, int year) {
       this(1,month,year);
    }

  
    Date(int month, int day, int year) { 
        this.month = month;
        this.date = day;
        this.year = year;
    }

   
    Date(int month) {
        this(month);
    }

    // Setter methods
    public void setDate(int date) {
       if(date<1 && date > 31 ){
		System.out.println("invalid date:")
	}
	else{
		this.date=date;
	
	}
    }

    public void setMonth(int month) {
  	if(month<1 || month>12){
		System.out.println("Invalid Month. Please enter a value between 1 and 12.");

			  }
        this.month = month;
    }

    public void setYear(int year) {
	
        this.year = year;
    }

    // Print method
    public void print() {
        System.out.println("Date: " + date + "/" + month + "/" + year);
    }

	public static void main(String args[]){
	Date d = new Date()	;
	d.print();
}

    
}
