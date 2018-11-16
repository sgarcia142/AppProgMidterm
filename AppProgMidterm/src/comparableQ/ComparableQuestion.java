package comparableQ;



public class ComparableQuestion implements Comparable<ComparableQuestion>{
	private double rating;
	private String name;
	private int year;
	
	public int compareTo(ComparableQuestion m) {
		return this.year - m.year;
	}
	
	public ComparableQuestion(String nm, double rt, int yr) {
		this.name = nm;
		this.rating = rt;
		this.year = yr;
	}
	
	public double getRating() {return rating;}
	public String getName() {return name;}
	public int getYear() {return year;}
}
