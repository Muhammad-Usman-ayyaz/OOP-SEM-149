public class test{

	public static void main(String arg[]){
		int g=0;
		product p=new product("nuggets",3,18.9,"frozen");
		
		product p1=new product("nuggets",3,18.9,"frozen");
		product p2=new product("nugg",3,18.9,"frozen");
		product p3=new product("nugget",3,18.9,"frozen");
		product p4=new product("nugge",3,18.9,"frozen");
		p.setid(g++);
		p1.setid(g++);
		p.display();
		p1.display();
		
		
		
		
	}
}