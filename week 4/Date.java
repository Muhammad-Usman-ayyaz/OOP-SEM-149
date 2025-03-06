
class Date{
	private int day;
	private int month;
	private int year;
	Date(int day ,int month , int year ){
		this.day=day;
		this.month=month;
		this.year=year;
	}
	Date(Date other){
		this.day=other.day;
		this.month=other.month;
		this.year=other.year;
	}
	public void setday(int d){
		day=d;
	}
	public void setmonth(int m){
		month=m;
	}
	public void setyear(int y){
		year=y;
	}
	public int getday(){
		return day;
	}
	public int getmonth(){
		return month;
	}
	public int getyear(){
		return year;
	}
	public boolean equals(Object obj){
		Date date= (Date) obj;
		return date==obj?true:false;
	}
	
	public void display() {
    System.out.println(day + "/" + month + "/" + year);
	}

	
}