package js08_switch_report;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		
	
		try {
			System.out.println("숫자 두개와 연산자를 입력하시면 그에맞는 연산을 수행한 후 결과를 반환해줍니다.\n 첫번째 숫자를 입력하세요. :");
			InputStreamReader ir = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(ir);
			String str1 = br.readLine();
			
			System.out.println("두번째 숫자를 입력하세요. :");
			String str2 = br.readLine();

			System.out.println("원하는 연산자를 입력하세요[+(덧셈), -(뺄셈), *(곱셈), /(나눗셈(몫만))] :");
			String symbol = br.readLine();
			char charsymbol = symbol.charAt(0);
			int intsymbol = (int) charsymbol;
			
			
			int number1 = Integer.parseInt(str1);
			int number2 = Integer.parseInt(str2);
			
			switch (intsymbol) {
				case 43:
					System.out.println("입력하신 두 수를 더 하면 :"+(number1+number2));
					break;
				case 45:
					System.out.println("입력하신 두 수를 빼면 :"+(number1-number2));
					break;
				case 42:
					System.out.println("입력하신 두 수를 곱하면 :"+(number1*number2));
					break;
				case 47:
					System.out.println("입력하신 두 수를 나누면 :"+(number1/number2));
					break;
				default :
					System.out.println("기호를 잘못 입력하셨습니다");
					break;						
					
			}

			
		}catch(Exception e) {}

	}

}
