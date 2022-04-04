package js13_ClassMemberMethod;

public class Class1 {

	public void method1() {
		System.out.println("1번 입니다");
		method2();
		
	}
	
	public void method2() {
		System.out.println("2번 입니다");		

		
	}
	
	public void add(int a, int b) {
		int result = a + b;
		System.out.printf("정수연산 : %d + %d = %d \n", a, b, result);
	}
	
	public void add(int a, int b, int c) {
		int result = a + b + c;		
		System.out.printf("정수연산 : %d + %d + %d = %d \n", a, b, c, result);
	}
	
	public int resultAdd(int a, int b) {
		int result = a + b;
		return result;
	}

	

}
