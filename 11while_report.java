package js10_while_report;

public class Main {

	public static void main(String[] args) {
		
		// ���� 1���� �����Ͽ� 2, 3, 5�� ������ �������� �ʴ� ���� �� 100�� ����ϴ� ���α׷��� �ۼ�!
		
		int cnt = 0;
		int number = 1;
		
		while(cnt < 100) {
			if (!(number %2 == 0 || number %3 == 0 || number % 5 == 0)) {
				System.out.printf("%d : %d\n", cnt + 1 , number);
				cnt++;
			}
			number++;
		}
		
		

	}

}
