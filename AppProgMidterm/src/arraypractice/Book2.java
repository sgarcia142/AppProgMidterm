package arraypractice;

import java.util.Comparator;

public class Book2 implements Comparable<Book2>{
	private String title;
	private String author;
	
	public Book2(String n, String a) {
		this.title = n;
		this.author = a;
	}

	public int compareTo(Book2 b) {
		return b.getTitle().compareTo(this.title);
	}
	
	public static Comparator<Book2> BookComparator = new Comparator<Book2>() {
		public int compare(Book2 book1, Book2 book2) {
			int titleScore = book1.getTitle().compareTo(book2.getTitle());
			int authorScore = book1.getAuthor().compareTo(book2.getAuthor());
			return titleScore + authorScore;
		}
	};
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

}
