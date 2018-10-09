package sampleQ3;

public class LibraryTest {

	public static void main( String[] args ){
	
		Library lib = new Library( "UTSA Library" );
	
		Book book1 = new Book("Effective Java", "Joshua Bloch");
		Book book2 = new Book("Sherlock Holmes", "Arthur Conan Doyle");
		lib.addBook( book1 );
	    lib.addBook( book2 );
	
		Book book3 = new Book("Sherlock Holmes", "Arthur Conan Doyle");
		boolean onShelf = lib.isAvailable( book3 ); 
	
		System.out.println( lib );
		System.out.println( "\"" + book3.getName() + "\"" + (onShelf ? "is" : "is not") + " available" );
	
		lib.checkOut( book3 );
		onShelf = lib.isAvailable( book3 );
		System.out.println( "\"" + book3.getName() + "\"" + (onShelf ? "is" : "is not") + " available"  );
	}

}
