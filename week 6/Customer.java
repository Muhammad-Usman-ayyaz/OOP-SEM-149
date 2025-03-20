public class Customer{
	private int customerid;
	private String name;
	private String phoneNumber;
	private String email;
	public Customer(int customerid,String name ,String phoneNumber,String email){
		this.customerid=customerid;
		this.name=name;
		this.phoneNumber=phoneNumber;
		this.email=email;
	}
	public boolean equals(Object obj){
		Customer customer = (Customer) obj;
		if(customer==obj){
			return true;
		}
		return false;
		
	}
    public int getCustomerId() {
        return customerid;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setCustomerId(int customerid) {
        this.customerid = customerid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }
	public void Display(){
		System.out.println("Name : " +name);
		System.out.println("Customer id : "+customerid);
		System.out.println("Phone numeber : "+phoneNumber);
		System.out.println("Email : "+ email);		
	}
}