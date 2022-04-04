package js21_polymorphism;

public class Class1 extends SuperClass{
	
	int class1V1;
	
	public Class1() {
		super(100);
		System.out.println("자식클래스의 생성자");
	}
	
	public void class1Method() {
		System.out.println("Class1의 메서드 - class1v1 : "+class1V1);
	}
	
	public void superMethod2() {
		System.out.println("자식클래스에서 재정의(Overriding)한 메서드");
		super.superMethod2();
	}

}
