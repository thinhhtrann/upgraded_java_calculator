import java.util.Scanner;
import java.util.InputMismatchException;
import java.lang.ArithmeticException;

public class MethodInput {
	public static int getNumInput(Scanner input){
		int n;
		while (true) {
			try {
				System.out.print("Enter number: ");
				n = input.nextInt();
				break;
			} catch (InputMismatchException Error) {
				System.out.println("Input must be a number.");
				input.nextLine();
				continue;
			}
		}
		return n;
	}

	public static String getOperatorInput(Scanner input){
		String i;
		String o;
		while (true) {
			System.out.print("Enter Operator + - x /: ");
			i = input.next();
			if (i.equals("+") || i.equals("-") || i.equals("x") || i.equals("/")){
				o = i;
				break;
			} else {
				System.out.println("Operator must be valid");
				input.nextLine();
				continue;
			}
		}

		return o;
	}

	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		int a = getNumInput(input);
		int b = getNumInput(input);
		int result = 0;
		String operator = getOperatorInput(input);
		
		while (true) {
			switch (operator) {
				case "+":
					result = a + b;
					break;
				case "-":
					result = a - b;
					break;
				case "x":
					result = a * b;
					break;
				case "/":
					while (true) {
						try {
							result = a / b;
							break;
						} catch (ArithmeticException Error) {
							System.out.println("Denominator cannot be 0 when dividing.");
							b = getNumInput(input);
							continue;
						}
					}
					break;
				default:
					System.out.println("invalid operator");
					operator = getOperatorInput(input);
					continue;
					
			}
			break;
		}
		
		System.out.println("result: " + result);
		input.close();
	}
}
