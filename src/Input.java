import java.util.Scanner;

public class Input {
	
		public static int getFirstValue(Scanner scan) {
			System.out.printf("ù ��° �Է� ��: ");
			int firstNumber = scan.nextInt();
			System.out.println(firstNumber);
			return firstNumber;
		}
		
		public static String getSymbol(Scanner scan) {
			System.out.printf("�����ȣ: ");
			String symbol = scan.next();
			System.out.println(symbol);
			return symbol;
		}
		
		public static int getSecondValue(Scanner scan) {
			System.out.printf("�� ��° �Է� ��: ");
			int secondNumber = scan.nextInt();
			System.out.println(secondNumber);
			return secondNumber;
		}
}
