class lab{
	private String labname;
	person labstaff[]=new person[3];
	pc pcs[]= new pc[4];
	public lab(String labname , pc o) {
        this.labname = labname; 
        
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
	
	public String toString() {
        String result = "Lab Name: " + labname + "\nLab Staff:\n";

        for (person p : labstaff) {
            result += p.toString() + "\n";
        }

        result += "PCs:\n";
        for (pc p : pcs) {
            result += p.toString() + "\n";
        }

        return result;
    }
	
}

