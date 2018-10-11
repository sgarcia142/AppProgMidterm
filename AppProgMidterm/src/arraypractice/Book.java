package arraypractice;

import java.util.Comparator;

public class Book implements Comparable<Book>{
	private String Title;
	private String author;
	
	public Book(String n, String a) {
		this.Title = n;
		this.author = a;
	}
	
	public static Comparator<Book> BookComparator = new Comparator<Book>() {
		public int compare(Book book1, Book book2) {
			int titleScore = book1.getTitle().compareTo(book2.getTitle());
			int authorScore = book1.getAuthor().compareTo(book2.getAuthor());
			return titleScore + authorScore;
		}
	};
	
	public int compareTo(Book b) {
		return this.getTitle().compareTo(b.getTitle());
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		this.Title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String toString() {
		String output = this.getTitle() + " " + this.getAuthor();
		return output;
	}
}
