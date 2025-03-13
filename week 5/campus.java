public class campus{
	Department dep[]=new Department[2];
	private String campusname;
	person director = new person("usman","director");
    private String campusaddress="lahore , pakistan";
	public campus(String campusname,Department d,lab l , pc p){
		for(int i=0;i<dep.length;i++){
			dep[i]=new Department(d.getdepname(),new person("Head" + i, "HOD"),l,p);
		}
		this.campusname=campusname;
	}
	public void getcampusaddress(String ca){
		campusaddress=ca;
	}
	public String setcampusaddress(){
		return campusaddress;
	}
	public void campusdisplay(){
		for(int i=0;i<dep.length;i++){
			System.out.println(dep[i]);
		}
	}
}