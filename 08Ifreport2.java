package js07_Ifreport2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		
		try {
			System.out.print("���ڸ� �Է��ϼ���(3�� ��� ����):");
			InputStreamReader ir = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(ir);
			String value = br.readLine();
			int number = Integer.parseInt(value);
			int judgeindex = number % 3;
			
			if (number==0) {
				System.out.println("0 �Դϴ�.");
			} else if(judgeindex==0) {
				System.out.println("3�� ����Դϴ�.");				
			} else {
				System.out.println("3�� ����� �ƴմϴ�.");
			}

			
		} catch(Exception e) {}
	}

}
