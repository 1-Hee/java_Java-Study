package js07_Ifreport;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 사용자에게 숫자를 입력받아 짝수인지 홀수인지 o인지를 구분하는 프로그램을 작성하시오.

public class Main {

	public static void main(String[] args) {
		
		
			try {
					InputStreamReader ir = new InputStreamReader(System.in);
					BufferedReader br = new BufferedReader(ir);
					System.out.print("숫자를 입력 : ");
					String str = br.readLine();
					int number = Integer.parseInt(str);
					int flag = number %2;
					
					if(number == 0) {
						System.out.println("0ㅇㄴㄷ");
					} else if (flag == 0) {
						System.out.println("jjaksuㅇㄴㄷ");
					} else if (flag == 1) {
						System.out.println("holsuㅇㄴㄷ");
					}

				
				
				
			} catch (Exception e) {}
			
			
			
	}
			
		
}
