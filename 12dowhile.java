package js11_dowhile;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = 1;
		do {
			
			a = a + a;
			System.out.printf("%d ", a);
			
		} while(a < 100);

	}

}
