package js11_dowhile_answer;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		
		try {
			InputStreamReader ir = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(ir);
			
		int number = 0;
		
		do {
			System.out.println("���� �Է� :");
			String str = br.readLine();
			number = Integer.parseInt(str);
			System.out.printf("�Է¹��� ���� : %d \n", number);
			
		} while(number<100);
		System.out.println("end");

			
		}catch (Exception e) {}

	}

}
