class libarary{
	String name;
	books book;
	person incharge;
	person staff;
	library(String name,books book,person incharge,person staff){
		this.name=name;
		this.book=book;
		this.incharge=incharge;
		this.staff=staff;
		
	}
	library(libray l){
		this.name=l.name;
		this.book=l.book;
		this.incharge=l.incharge;
		this.staff=l.staff;
	}
	
public void display() {
    System.out.println("Library Name: " + name);
    System.out.println("Book Details: ");
    book.display();
    System.out.println("Incharge: ");
    incharge.display();
    System.out.println("Staff: ");
    staff.display();
}

}