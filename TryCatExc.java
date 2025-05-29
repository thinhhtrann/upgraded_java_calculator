import java.util.Scanner;
import java.util.InputMismatchException;
import java.lang.ArithmeticException;
public class TryCatExc {
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		int a = 0;
		int b = 0;
		int c = 0;

		while (true) {
			try {
				System.out.print("enter number a: ");
				a = input.nextInt();
				break;
			} catch (InputMismatchException error) {
				System.out.println("a must be a number.");
				input.nextLine();
			}
		}

		while (true) {
			try {
				System.out.print("enter number b: ");
				b = input.nextInt();
				break;
			} catch (InputMismatchException error) {
				System.out.println("b must be a number.");
				input.nextLine();
			}
		}
		
		System.out.print("enter your calculation + - * /: ");
		String d = input.next();
		
		while (true) {
			if (d.equals("/")){
			
				try {
					c = a / b;
					break;
				} catch (ArithmeticException error) {
					System.out.println("b cannot 0 when divide.");
					while (true) {
						try {
							System.out.print("enter number b: ");
							b = input.nextInt();
							break;
						} catch (InputMismatchException Error) {
							System.out.println("b must be a number.");
							input.nextLine();
						}
					}
					input.nextLine();
				}
			
			} else {
				if (d.equals("+")){
					c = a + b;
					break;
				} else if (d.equals("-")){
					c = a - b;
					break;
				} 
				if (d.equals("*")){
					c = a * b;
					break;
				}	
			} 
		}

		System.out.println("a " + d + " b" + " = " + c);
		input.close();
	} 
}
