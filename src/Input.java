import java.util.Scanner;

public class Input {
	
		public static int getFirstValue(Scanner scan) {
			System.out.printf("첫 번째 입력 값: ");
			int firstNumber = scan.nextInt();
			System.out.println(firstNumber);
			return firstNumber;
		}
		
		public static String getSymbol(Scanner scan) {
			System.out.printf("연산기호: ");
			String symbol = scan.next();
			System.out.println(symbol);
			return symbol;
		}
		
		public static int getSecondValue(Scanner scan) {
			System.out.printf("두 번째 입력 값: ");
			int secondNumber = scan.nextInt();
			System.out.println(secondNumber);
			return secondNumber;
		}
}
