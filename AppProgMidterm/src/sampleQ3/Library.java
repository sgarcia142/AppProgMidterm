package sampleQ3;

import java.util.ArrayList;

public class Library {
	
	private String name;
	private ArrayList<Book> books;

	public Library(String n) {
		this.name = n;
		this.books = new ArrayList<Book>();
	}
	
	public void addBook(Book b) {
		books.add(b);
	}
	
	public boolean isAvailable(Book b) {
		for(int i = 0; i < books.size(); i++) {
			if(b.getName().equals(books.get(i).getName()))
				return true;
		}
		return false;
	}
	
	public void checkOut(Book b) {
		for(int i = 0; i < books.size(); i++) {
			if(b.getName().equals(books.get(i).getName()))
				books.remove(i);
		}
	}
	
	public String toString() {
		String output = "";
		output = "The " + this.name + "collection includes:\n";
		for(int i = 0; i < books.size(); i++) {
			output += "   (" + (i+1) + ")" + books.get(i).getName() + "by" + books.get(i).getAuthor() + "\n";
		}
		return output;
	}
}
