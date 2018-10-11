package userinputpractice;
import java.util.Scanner;

public class UserInput {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number");
		int n = scan.nextInt();
		System.out.println(evenOdd(n));
		scan.close();
	}
	
	public static String evenOdd(int n) {
		if(n%2==0)
			return "Even";
		return "Odd";
	}
}
