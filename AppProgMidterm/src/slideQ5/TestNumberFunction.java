package slideQ5;
import java.util.Scanner;

public class TestNumberFunction {
	public static void main(String[] args) {
		Scanner input;
		input = new Scanner(System.in);
		System.out.println("Please select and integer value");
		int x = input.nextInt();
		System.out.println(NumberFunction.evenOdd(x));
		input.close();
	}
	
}
