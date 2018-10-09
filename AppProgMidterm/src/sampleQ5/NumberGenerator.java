package sampleQ5;

/**
 * A LetterGenerator generates letters.
 * @author Amanda Danko
 */
public class NumberGenerator extends AbstractGenerator {
	
	//TODO: write this class, either extending AbstractGenerator or implementing Generator
	private String a,b,c;
	
	public NumberGenerator(double x, double y, double z) {
		this.a = String.valueOf(x);
		this.b = String.valueOf(y);
		this.c = String.valueOf(z);
	}
	
	public char getValueAt(int index) {
		return this.a.charAt(index);
	}
	
	public int length() {
		return a.length();
	}
}
 