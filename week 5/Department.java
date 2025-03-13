class Department{
	private  String depName;
	private  person depHead;
	lab lab[]=new lab[25];
	

	public Department(String depName, person Head , lab l,pc p){
		for(int i=0; i<lab.length; i++){
			lab[i]=new lab(l.getLabname(),p);
		}
		this.depName=depName;
		this.depHead=new person(Head.getname(),Head.getrole());
		
		
	}
	public String getdepname(){
		return depName;
	}
	public void setdepname(String depname){
		depName=depname;
	}
	public void diplay(){
		System.out.println("Department name : "+depName+"\n Departement head : " + depHead.getname()+depHead.getrole());
		for(int i=0;i<lab.length;i++){
			lab[i].display();
			
		}
	}
}
