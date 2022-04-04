package js11_dowhile_report;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int number;
		do {
			System.out.println("숫자 입력 : ");
			number = sc.nextInt();
		} while(number < 100);

		

	}

}
