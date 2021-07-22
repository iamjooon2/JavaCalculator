import java.util.Scanner; //값을 입력받기 위한 Class, headerfile 같은 개념

public class Calculator {
	
	public static int calculate(int firstNumber, String symbol, int secondNumber) {
			int result = 0;
			if ("+".equals(symbol)){
				result = firstNumber + secondNumber;
				System.out.println("더하기 : " + result );
			} else if ("-".equals(symbol)){
				result = firstNumber - secondNumber;
				System.out.println("빼기 : " + result );
			} else if ("*".equals(symbol)){
				result = firstNumber * secondNumber;
				System.out.println("곱하기 : " + result );
			} else if ("/".equals(symbol)){
				result = firstNumber / secondNumber;
				System.out.println("나누기 : " + result );
			} else {
				System.out.println("해당하지 않는 기호를 선택하셨습니다.");
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
