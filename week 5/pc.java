public class pc{
	private String id,type;
	private String ramsize,disksize;
	public pc(String id , String type , String ramsize , String disksize){
		this.id=id;
		this.type=type;
		this.ramsize=ramsize;
		this.disksize=disksize;
		
	}
	public String getId() {
    return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getRamsize() {
		return ramsize;
	}

	public void setRamsize(String ramsize) {
		this.ramsize = ramsize;
	}

	public String getDisksize() {
		return disksize;
	}
	public void setDisksize(String  disksize) {
		this.disksize = disksize;
	}
	public String toString(){
		return String.format(" Pc id : %s  \n Pc type: %s \n Pc ram size : %s \n Pc disk size : %s " ,id , type , ramsize,disksize);
	}


	
	
}