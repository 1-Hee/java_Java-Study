package js26_innerClass_staticClass;

public class Main {

	public static void main(String[] args) {
		
//		Outer out = new Outer();
		Outer.Inner inner = new Outer.Inner();
		inner.innerMethod();
		
//		Outer.Inner.innerMethod()
		
		
	}

}

class Outer{
	int outer1 = 10;
	static int outer2 = 20;
	
	void outerMethod() {
		System.out.println("Outer�� �޼����Դϴ�.");
	}
	
	static class Inner{
		int inner1 = 20;
		void innerMethod() {
			System.out.println("Inner�� �޼��� �Դϴ�");
			System.out.println(outer2);
		}
	}
}
