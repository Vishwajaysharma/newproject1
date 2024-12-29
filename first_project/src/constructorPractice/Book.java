package constructorPractice;

public class Book {
	String title;
	String author;
	int price;
	
	
	
         public Book(String title, String author) {
	         this.title = title;
	         this.author = author;
              } 
         public Book(String title,	String author, int price) {
        		
        	this. title =  title;
        	 this.author = author;
        	 this.price = price;
         } 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book1 = 	new Book("gita" ,	"kamini" , 500);
	        System.out.println(book1.title);
	        System.out.println(book1.author);
	        System.out.println(book1.price);
	       Book book2 = 	new Book("admc" ,	"gmx"  );
	       System.out.println(book2.title);
	        System.out.println(book2.author);
	}

}
