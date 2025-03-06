public class demo{
	public static void main(String args[]){
		Address a=new Address("yui","seygd");
		String s=a.getstreet();
		System.out.println(s);
		person j=new person("u","g",a);
		String k=j.getname();
		System.out.println(k);
		Date d=new Date(1,2,3);
		books b=new books("y","seygd",4,d,j);
		int o=b.getedition();
		System.out.println(o);
	}
}