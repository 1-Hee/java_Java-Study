package js07_Ifreport;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// ����ڿ��� ���ڸ� �Է¹޾� ¦������ Ȧ������ o������ �����ϴ� ���α׷��� �ۼ��Ͻÿ�.

public class Main {

	public static void main(String[] args) {
		
		
			try {
					InputStreamReader ir = new InputStreamReader(System.in);
					BufferedReader br = new BufferedReader(ir);
					System.out.print("���ڸ� �Է� : ");
					String str = br.readLine();
					int number = Integer.parseInt(str);
					int flag = number %2;
					
					if(number == 0) {
						System.out.println("0������");
					} else if (flag == 0) {
						System.out.println("jjaksu������");
					} else if (flag == 1) {
						System.out.println("holsu������");
					}

				
				
				
			} catch (Exception e) {}
			
			
			
	}
			
		
}
