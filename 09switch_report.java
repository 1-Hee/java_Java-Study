package js08_switch_report;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		
	
		try {
			System.out.println("���� �ΰ��� �����ڸ� �Է��Ͻø� �׿��´� ������ ������ �� ����� ��ȯ���ݴϴ�.\n ù��° ���ڸ� �Է��ϼ���. :");
			InputStreamReader ir = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(ir);
			String str1 = br.readLine();
			
			System.out.println("�ι�° ���ڸ� �Է��ϼ���. :");
			String str2 = br.readLine();

			System.out.println("���ϴ� �����ڸ� �Է��ϼ���[+(����), -(����), *(����), /(������(��))] :");
			String symbol = br.readLine();
			char charsymbol = symbol.charAt(0);
			int intsymbol = (int) charsymbol;
			
			
			int number1 = Integer.parseInt(str1);
			int number2 = Integer.parseInt(str2);
			
			switch (intsymbol) {
				case 43:
					System.out.println("�Է��Ͻ� �� ���� �� �ϸ� :"+(number1+number2));
					break;
				case 45:
					System.out.println("�Է��Ͻ� �� ���� ���� :"+(number1-number2));
					break;
				case 42:
					System.out.println("�Է��Ͻ� �� ���� ���ϸ� :"+(number1*number2));
					break;
				case 47:
					System.out.println("�Է��Ͻ� �� ���� ������ :"+(number1/number2));
					break;
				default :
					System.out.println("��ȣ�� �߸� �Է��ϼ̽��ϴ�");
					break;						
					
			}

			
		}catch(Exception e) {}

	}

}
