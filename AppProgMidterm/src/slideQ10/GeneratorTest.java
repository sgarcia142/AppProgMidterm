package slideQ10;

public class GeneratorTest {

	public static void main(String[] args) {
		Generator gen = new NumberGenerator(4457.2,135.7,3043.2);

		String t=" 3";

		for( int i=0; i<gen.length(); i++ ){
			if( i==1 || i==2 || i==5 || i==7 )
				t = " 4";
			else t = " 3";
			System.out.println( gen.next() + t );
		}
	}

}
