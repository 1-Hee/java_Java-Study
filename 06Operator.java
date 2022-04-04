package js06_Operator;

public class Main {

	public static void main(String[] args) {
		
		// 최우선 연산자
		
		int a1 = 1 + 2 * 3;
		System.out.println(a1);
		
		int a2 = (1+2) * 3;
		System.out.println(a2);
		
		// 단항 연산자
		
		boolean b1 = true;
		
		System.out.println(b1);
		System.out.println(!b1);
		
		int i1 = 100;
		System.out.printf("i1 : %32s\n", Integer.toBinaryString(i1));
		System.out.printf("i1 : %32s\n", Integer.toBinaryString(~i1));
		
		System.out.println(~i1);
		System.out.println(~i1+1);
		
		System.out.println(+i1);
		System.out.println(-i1);
		
		System.out.println(++i1);
		System.out.println(--i1);
		
		i1 = 214712458;
		short s1 = (short) i1;
		long l1 = i1; 
		
		System.out.println(l1);
		System.out.println(s1);
		
		
		
		// Operator2
		System.out.println("-----------------");
		
		//basic operator;

		System.out.println(100+200);
		System.out.println(100-200);
		System.out.println(100*200);
		System.out.println(100/200);
		System.out.println(100%200);

		System.out.println("100"+200+300);
		System.out.println(100+200+"300");
		
		// shift operator
		
		System.out.printf("%32s %d\n", Integer.toBinaryString(100), 100);
		System.out.printf("%32s %d\n", Integer.toBinaryString(100 >> 1), 100 >> 1);
		System.out.printf("%32s %d\n", Integer.toBinaryString(100 >> 2), 100 >> 2);

		System.out.printf("%32s %d\n", Integer.toBinaryString(200), 200);
		System.out.printf("%32s %d\n", Integer.toBinaryString(200 << 1), 200 << 1);
		System.out.printf("%32s %d\n", Integer.toBinaryString(200 << 2), 200 << 2);

		System.out.printf("%32s %d\n", Integer.toBinaryString(-100), -100);
		System.out.printf("%32s %d\n", Integer.toBinaryString(-100 >> 1), -100 >> 1); // 부호값 유지
		System.out.printf("%32s %d\n", Integer.toBinaryString(-100 >>> 1), -100 >>> 1); // 부호 값 유지 x (음수일대 값이 반전)
		
		// 관계 연산자
		System.out.println("-----------------------");
		System.out.println(100>10);
		System.out.println(100<10);
		System.out.println(100>=10);
		System.out.println(100<=10);
		System.out.println(100==10);
		System.out.println(100!=10);

		// bit operator
		System.out.println("-----------bit operator----------");
		
		System.out.printf("%32s %d\n", Integer.toBinaryString(100), 100);
		System.out.printf("%32s %d\n", Integer.toBinaryString(200), 200);
		System.out.printf("%32s %d\n", Integer.toBinaryString(100 & 200), 100 & 200);
		System.out.printf("%32s %d\n", Integer.toBinaryString(100 | 200), 100 | 200);
		System.out.printf("%32s %d\n", Integer.toBinaryString(100 ^ 200), 100 ^ 200);
		
		
		// Operator3
		// login Operator
		
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		
		System.out.println( 2 > 1 && 3 > 2);
		System.out.println( 2 > 1 && 3 < 1);
		System.out.println( 2 < 1 && 3 > 2);
		System.out.println( 2 < 1 && 3 < 1);
		
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		System.out.println();
				
		int k1 = 100;
		int k2 = 200;
		
		System.out.println(++k1>100 && ++k2 > 200);
		System.out.println(k1 +" "+ k2);
		
		k1 = 100;
		k2 = 200;
		
		System.out.println(++k1 < 100 && ++k2 > 200);
		System.out.println(k1 +" "+ k2);
		
		k1 = 100;
		k2 = 200;
		
		System.out.println(++k1 < 100 & ++k2 > 200);
		System.out.println(k1 +" "+ k2);
		
		k1 = 100;
		k2 = 200;
		
		System.out.println(++k1 > 100 || ++k2 > 200);
		System.out.println(k1 +" "+ k2);
		
		k1 = 100;
		k2 = 200;
		
		System.out.println(++k1 > 100 | ++k2 > 200);
		System.out.println(k1 +" "+ k2);
		
		
		// 3항 연산자
		System.out.println("---삼항연산자--");
		
		int k3 = 10 > 20 ? 100 : 200;
		System.out.println(k3);
		
		System.out.println((k1+=2)+" "+(k2=k2+2));
		
		k1 = 100;
		k2 = ++k1;
		System.out.println(k1+"  "+k2);
		
		k1 = 100;
		k2 = k1++;
		System.out.println(k1+"  "+k2);
		
		
	
		
		
		
		
		


		
		






		
		






		
		
	}

}
