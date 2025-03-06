public class demo{
	public static void main(String args[]){
		Address a=new Address("yui","seygd");
		String s=a.getstreet();
		System.out.println(s);
		person p=new person("usman","incharge ",a);
		person p1=new person("usman","staff ",a);
		String k=p.getname();
		System.out.println(k);
		Date d=new Date(1,2,3);
		books b=new books("harry potter","7292919828201",4,d,j);
		int o=b.getedition();
		System.out.println(o);
		library l=new libary("usman name",b,p,p1)
	}
}