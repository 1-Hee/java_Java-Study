package js21_polymorphism;

public class SuperClass {
	
	int superV1;
	
	public SuperClass() {
		System.out.println("�θ�Ŭ������ ������");
	}
	
	public SuperClass(int a) {
		System.out.println("�θ�Ŭ������ ������2 : a -"+a);
	}
	
	public void superMethod() {
		System.out.println("SuperClass�� �޼��� - superV1 : "+superV1);
	}
	
	public void superMethod2() {
		System.out.println("SuperClass�� �޼���2");
	}

}
