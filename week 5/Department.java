class Department{
	private  String depName;
	private  person depHead;
	lab labs[]=new lab[5];
	

	public Department(String depName, person Head , lab l,pc p){
		for(int i=0; i<labs.length; i++){
			labs[i]=new lab(l.getLabname(),p);
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
	 public String toString() {
        String result = "Department Name: " + depName + "\n" +
                        "Department Head: " + depHead.getname() + " (" + depHead.getrole() + ")\n" +
                        "Labs:\n";
        
        for (lab l : labs) {
            result += l.toString() + "\n";
        }
        
        return result;
    }
}
