package slideQ7;

public class PrintFrag2 {
	public static void printFrag() {
		char[] letters = {'A', 'B', '2', 'L', 'U', 'H', 'K', 'm', 'G', 'c', 'Z'};
		int numbers[] = {3,4,9,6};
		String printMe = "";
		
		for(int index : numbers) {
			printMe += letters[index];
		}
		
		System.out.println(printMe + "!");
	}
}
