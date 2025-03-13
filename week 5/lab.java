class lab{
	private String labname;
	person labstaff[]=new person[5];
	pc pcs[]= new pc[50];
	public lab(String labname , pc o) {
        this.labname = "";
        
        for(int i=0;i<pcs.length;i++){
			pcs[i]=new pc(o.getId(),o.getType(),o.getRamsize(),o.getDisksize());
			
		}
		for(int i=0;i<labstaff.length;i++){
			labstaff[i]=new person("person"+i,"staff");
			
		}
    }

   
    public String getLabname() {
        return labname;
    }

    public void setLabname(String labname) {
        this.labname = labname;
    }
	
	public void display(){
		System.out.println("Lab name :" + labname);
		for(int i=0;i<pcs.length;i++){
			System.out.println(pcs[i]);
			
		}
		for(int i=0;i<labstaff.length;i++){
			System.out.println(labstaff[i]);
			
		}
		
	}
	
}

