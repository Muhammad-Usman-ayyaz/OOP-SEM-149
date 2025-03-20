public class Cinema{
	String name;
	String location;
	Screen screens[];
	public Cinema(String name , String location , int total){
		this.name=name;
		this.location=location;
		screens=new Screen[total];
		
		
	}
	public void addscreen(int index , Screen screen){
		screens[index]=screen;
	}
	public void displaycinema(){
		System.out.println(" Name : " + name);
		System.out.println(" location : " + location);
		for(int i =0 ; i < screens.length ; i++){
			screens[i].displayScreen();
		}
	}
}