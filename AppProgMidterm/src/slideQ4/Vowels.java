package slideQ4;

public class Vowels {
	public static int numVowels(String str) {
		int numVowels=0;
		char[] ch = {'a','e','i','o','u'};
		for(int i=0;i<str.length();i++) {
			for(int j=0;j<ch.length;j++) {
				if(str.charAt(i)==ch[j]) {
					numVowels++;
				}
			}
		}
		return numVowels;
	}
}
