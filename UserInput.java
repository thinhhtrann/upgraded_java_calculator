import java.util.Scanner;
import java.util.InputMismatchException;

public class UserInput {

	public static void main (String[] args){

	Scanner input = new Scanner(System.in);
		try {
		System.out.println("number a: " );
		int a = input.nextInt();
		System.out.println("number b: ");
		int b = input.nextInt();
		int c = a + b;
		System.out.println("a + b = " + c);
			
		} catch (InputMismatchException error) {
			System.out.println("there is an error.");
		}
	input.close();
	}
}
