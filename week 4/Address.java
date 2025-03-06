class Address{
	private String street;
	private String city;
	Address(String street , String city){
		this.street=street;
		this.city=city;
	}
	Address(Address a){
		this.street=a.street;
		this.city=a.city;
		
	}
	public boolean equals(Object obj){
		Address ad= (Address) obj;
		return ad==obj?true:false;
	}
	public String getstreet(){
		return street;
	}
	public void setstreet(String st){
		street=st;
	}
	public String getcity(){
		return city;
	}
	public void setcity(String cit){
		city=cit;
	
	public void display() {
		System.out.println("Street: " + street);
		System.out.println("City: " + city);
	}

}