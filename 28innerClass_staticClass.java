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
		System.out.println("Outer의 메서드입니다.");
	}
	
	static class Inner{
		int inner1 = 20;
		void innerMethod() {
			System.out.println("Inner의 메서드 입니다");
			System.out.println(outer2);
		}
	}
}
