package js21_polymorphism;

public class Class1 extends SuperClass{
	
	int class1V1;
	
	public Class1() {
		super(100);
		System.out.println("�ڽ�Ŭ������ ������");
	}
	
	public void class1Method() {
		System.out.println("Class1�� �޼��� - class1v1 : "+class1V1);
	}
	
	public void superMethod2() {
		System.out.println("�ڽ�Ŭ�������� ������(Overriding)�� �޼���");
		super.superMethod2();
	}

}
