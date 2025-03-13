class person{
	private String name;
	private String role;
	
	person(String n,String ro ){
		name=n;
		role=ro;
		
	}
	person(person p){
		this.name=p.name;
		this.role=p.role;
		
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
	
	
	
	public String toString() {
    return String.format(" Name: %s \nRole: %s" ,name, role);
	}
}	