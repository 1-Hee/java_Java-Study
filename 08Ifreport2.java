package js07_Ifreport2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		
		try {
			System.out.print("숫자를 입력하세요(3의 배수 판정):");
			InputStreamReader ir = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(ir);
			String value = br.readLine();
			int number = Integer.parseInt(value);
			int judgeindex = number % 3;
			
			if (number==0) {
				System.out.println("0 입니다.");
			} else if(judgeindex==0) {
				System.out.println("3의 배수입니다.");				
			} else {
				System.out.println("3의 배수가 아닙니다.");
			}

			
		} catch(Exception e) {}
	}

}
