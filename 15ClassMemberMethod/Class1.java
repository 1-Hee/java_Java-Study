package js13_ClassMemberMethod;

public class Class1 {

	public void method1() {
		System.out.println("1�� �Դϴ�");
		method2();
		
	}
	
	public void method2() {
		System.out.println("2�� �Դϴ�");		

		
	}
	
	public void add(int a, int b) {
		int result = a + b;
		System.out.printf("�������� : %d + %d = %d \n", a, b, result);
	}
	
	public void add(int a, int b, int c) {
		int result = a + b + c;		
		System.out.printf("�������� : %d + %d + %d = %d \n", a, b, c, result);
	}
	
	public int resultAdd(int a, int b) {
		int result = a + b;
		return result;
	}

	

}
