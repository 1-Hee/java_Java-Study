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
		System.out.println("Outer�� �޼����Դϴ�.");
		// ��ø Ŭ�������� �ܺ� Ŭ������ ����Ŭ�������� ���� x
		// System.out.println(inner1);

	}
	
	//��øŬ����
	class Inner{
		int inner1 = 20;
		void innerMethod() {
			System.out.println("Inner�� �޼��� �Դϴ�");
			System.out.println(outer1);
		}
	}
}