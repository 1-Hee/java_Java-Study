package js10_while_report;

public class Main {

	public static void main(String[] args) {
		
		// 정수 1부터 시작하여 2, 3, 5로 나누어 떨어지지 않는 수를 총 100개 출력하는 프로그램을 작성!
		
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
