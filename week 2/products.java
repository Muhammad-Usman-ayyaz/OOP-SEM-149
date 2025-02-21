class product{
		private String id="";
		private String product_name;
		private int quantity ; 
		private double price;
		private String category;
		int x=0;
		
		product(String y,int z,double w,String e ){
			
			 id = " ";
			 product_name=y;
			 quantity=z; 
			price=w;
			category=e;

		}
		void setproductname(String a){
			product_name=a;
		
		}
		String getproductname(){
			System.out.print("wassup");
			return product_name;
		
		}
		void setquantity(int b){
			quantity=b;
		
		}
		int getquantity(){
			return quantity;
		
		}
		void setprice(double c){
			price=c;
		
		}
		double getprice(){
			return price;
		
		}
		void setcategory(String d){
			product_name=d;
		
		}
		String getcategory(){
			return category;
		
		}
		void setid(int k){
			String s=Integer.toString(k);
			id="E"+String.format("%04d",k);
			
			
		}	
		void display(){
			
			System.out.println("--------------------------------------------------------");
			System.out.println(" ");
			System.out.println("Product id : "+id);
			System.out.println("Product name : "+product_name);
			System.out.println("Product price: "+price);
			System.out.println("Product quantity : "+quantity);
			System.out.println("Product category : "+category);
			System.out.println(" ");
			System.out.println("--------------------------------------------------------");
		
			

		}


	
		

}