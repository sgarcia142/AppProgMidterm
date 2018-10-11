package arraypractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayPractice {

	public static void main(String[] args) {
		Book book1 = new Book("Java SE 8", "Deitel");
		Book book2 = new Book("Effective Java", "James Bloch");
				
		Book[] books = new Book[2];
		books[0] = book1;
		books[1] = book2;
		
		for(Book b : books) {
			System.out.println(b);
		}
		
		Arrays.sort(books);
		
		for(Book b : books) {
			System.out.println(b);
		}
		
		System.out.print("\n\n");
		ArrayList<Book> bookList = new ArrayList<Book>();
		bookList.add(book1);
		bookList.add(book2);
		
		for(Book b : bookList) {
			System.out.println(b);
		}
		
		bookList.sort(Book.BookComparator);
		
		for(Book b : bookList) {
			System.out.println(b);
		}
		
		Iterator<Book> itr = bookList.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.toString());
			itr.next();
		}
		String str = "Let's make a cool string.";
		String[] a = str.split(" ");
		System.out.println(a.length);
		
	}
	
}
