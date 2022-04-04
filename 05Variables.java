package js04_Variables;

public class Main {
	
	public static void main(String [] args) {
		
		// boolean type
		boolean bool1 = true;
		boolean bool2 = false;
		
		System.out.println(""+bool1+bool2);
		System.out.printf("%s %s\n", bool1, bool2);
		
		// C언어에서 boolean에 대한 서식문자는 없고 %d로 받는 것을 권장함.
		// 만약 true 값을 "문자"로 보고 싶으면, 삼항연산자를 사용해야함.
		// 삼항연산자 = x ? "true" : "false"
		
		// char type
		
		char ch1 = 65;
		char ch2 = 'A';

		System.out.println(ch1);
		System.out.println(ch2);
		
//		for (char i=0 ; i<256 ; i++) {
//			System.out.println(i);
//		}
		
		// byte type
		byte bt1 = -128;
		byte bt2 = 127;
		
		System.out.println(bt1);
		System.out.println(bt2);
		
		// short type
		short st1 = -32768;
		short st2 = 32767;
		
		System.out.println(st1);
		System.out.println(st2);
		
		
		int it1 = -2147483648;
		int it2 = 2147483647;
		
		System.out.println(it1);
		System.out.println(it2);
		
		long lg1 = -922337203684775808L;
		long lg2 = 922337203684775807L;
		
		System.out.println(lg1);
		System.out.println(lg2);
	
		// float type
		float ft1 = -12.34f;
		float ft2 = 12.34f;
		
		System.out.println(ft1);
		System.out.println(ft2);
		
		
		// double type
		double db1 = -12.34;
		double db2 = 12.34;
		
		System.out.println(db1);
		System.out.println(db2);
		
		
		// String Type
		String str = "hello monster";
		System.out.println(str);
		
		
		
	
	}

}
