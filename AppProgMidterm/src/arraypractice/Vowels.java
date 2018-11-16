package arraypractice;

public class Vowels {
	public static int countVowels(String s) {
		int numVowels = 0;
		char[] c = {'a','e','i','o','u'};
		for(int i = 0; i < s.length(); i++) {
			for(int j = 0; j < c.length; j++) {
				if(s.charAt(i) == c[j])
					numVowels++;
			}
		}
		return numVowels;
	}
}
