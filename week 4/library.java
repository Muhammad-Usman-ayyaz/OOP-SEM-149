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
}