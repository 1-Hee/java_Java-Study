package js14_ClassMemberVariables;

public class Class1 {
	
	public int a1;
	
	public void method1() {
		int a1 = 20;
		System.out.println("클래스의 자역 변수 a1 = "+ a1);
		System.out.println("클래스의 멤버 변수 a1 = "+ this.a1);

		
	}
	
	public void method2() {
		int a1 = 30;
		System.out.println("메서드 2의 지역변수 a1 = " + a1);
		
	}

}
