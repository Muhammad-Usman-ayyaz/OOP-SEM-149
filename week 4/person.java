class person{
	private String name;
	private String role;
	Address address;
	person(String n,String ro , Address address){
		name=n;
		role=ro;
		this.address=address;
	}
	person(person p){
		this.name=p.name;
		this.role=p.role;
		this.address=p.address;
	}
	public boolean equals(Object obj){
		person p= (person) obj;
		return p==obj?true:false;
	}
	public void setname(String name){
		this.name=name;
	}
	public String getname(){
		return name ;
	}
	public void setrole(String role){
		this.role=role;
	}
	public String getrole(){
		return role;
	}
	public void setaddress(Address address){
		this.address=address;
	}
	public Address getaddreess(){
		return address;
	}
	public void display() {
		System.out.println("Name: " + name);
		System.out.println("Role: " + role);
		System.out.println("Address:");
		address.display();
	}

}