package js26_innerClass;

public class Main {

	public static void main(String[] args) {
		
		Outer out = new Outer();
		Outer.Inner inner = out.new Inner();
		
		out.outerMethod();
		inner.innerMethod();
		

	}

}

class Outer{
	int outer1 = 10;
	
	void outerMethod() {
		System.out.println("Outer의 메서드입니다.");
		// 중첩 클래스에서 외부 클래스는 내부클래스로의 접근 x
		// System.out.println(inner1);

	}
	
	//중첩클래스
	class Inner{
		int inner1 = 20;
		void innerMethod() {
			System.out.println("Inner의 메서드 입니다");
			System.out.println(outer1);
		}
	}
}