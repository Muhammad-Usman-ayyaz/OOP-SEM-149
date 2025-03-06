
class books{
	private String title;
	private String issm;
	private int edition;
	Date dop;
	person author;
	books(String t,String is , int e ,Date dop,person author){
		title=t;
		issm=is;
		edition=e;
		this.dop=dop;
		this.author=author;
	}
	books(books b){
		this.title=b.title;
		this.issm=b.issm;
		this.edition=b.edition;
		this.dop=b.dop;
	}
	
	public void settitle(String title){
		this.title=title;
	}
	public void setissm(String isssm){
		this.issm=issm;
	}
	public void setedition(int y){
		edition=y;
	}
	public void setdate(Date dop){
		this.dop=dop;
	}
	public void setauthor(person author){
		this.author=author;
	}
	public String gettitle(){
		return title;
	}
	public String getissm(){
		return issm;
	}
	public int getedition(){
		return edition;
	}
	public Date getdate(){
		return dop;
	}
	public person getauthor(){
		return author;
	}
	
	
}