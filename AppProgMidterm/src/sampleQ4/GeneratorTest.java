package sampleQ4;

public class GeneratorTest {

	public static void main(String[] args) {
		Generator gen = new LetterGenerator("one","twenty",2);

		String t=" 3";

		for( int i=0; i<gen.length(); i++ ){
			if( i==1 || i==2 || i==5 || i==7 )
				t = " 4";
			else t = " 3";
			System.out.println( gen.next() + t );
		}
	}

}
