package js03_ConstValue;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("%d\n%s", 100, "hello");
		System.out.printf("%d %d %d\n", 100, 200, 300);
		
		System.out.printf("%d ~ %d\n", -2147483648, 2147483647);
		System.out.printf("%d ~ %d\n", -2147483649l, 2147483648L);
		
		System.out.printf("%d~%d\n", -922337203684775808l, 9223372036854775807l);
		
		System.out.printf("%c\n", 'a');
//		System.out.printf("%d", 'a'); // 서식문자가 맞지 않아 error 발생
		
		System.out.printf("%f\n", 123.456);
		System.out.printf("%2.2f\n", 123.456);
		System.out.printf("%.2f\n", 123.456);
		
		// 뒷자리를 채우기
		System.out.printf("%d10\n", 10);
		// 앞자리를 채우기
		System.out.printf("%010d\n", 10);
		
			
		System.out.printf("%s\n", "안녕하세유");
		System.out.printf("%s %d\n", "반갑습니다", 200);
		
		
		

	}

}
