package sampleQ5;

/**
 * A LetterGenerator generates letters.
 * @author Amanda Danko
 */
public class LetterGenerator extends AbstractGenerator {
	private String a,b,c;
		
	public LetterGenerator( String x, String y, int z ){
		this.a = x;
		this.b = y;
		this.c = String.valueOf( z );
	}
		
	public char getValueAt(int index){
		return this.a.charAt( index );
	}
		
	public int length(){
		return a.length();
	}
}
