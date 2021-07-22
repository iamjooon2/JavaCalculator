import java.util.Scanner; //���� �Է¹ޱ� ���� Class, headerfile ���� ����

public class Calculator {
	
	public static int calculate(int firstNumber, String symbol, int secondNumber) {
			int result = 0;
			if ("+".equals(symbol)){
				result = firstNumber + secondNumber;
				System.out.println("���ϱ� : " + result );
			} else if ("-".equals(symbol)){
				result = firstNumber - secondNumber;
				System.out.println("���� : " + result );
			} else if ("*".equals(symbol)){
				result = firstNumber * secondNumber;
				System.out.println("���ϱ� : " + result );
			} else if ("/".equals(symbol)){
				result = firstNumber / secondNumber;
				System.out.println("������ : " + result );
			} else {
				System.out.println("�ش����� �ʴ� ��ȣ�� �����ϼ̽��ϴ�.");
			}
			return result;
		}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int firstNumber = Input.getFirstValue(scan);
		
		int result = firstNumber;
		while(true) {
			String symbol = Input.getSymbol(scan);
			
			if (symbol.equals("quit")) {
				Output.print(result);
				break;
			}
			int second = Input.getSecondValue(scan);
			result = calculate(firstNumber, symbol, second);
		}
	}
}
