package js28_Interface;

public class Main {

	public static void main(String[] args) {
		
		TestClass t = new TestClass();
		t.methodA();
		t.MethodB();
		System.out.println(t.a);
		System.out.println(t.b);

		
//		t.a=100;
//		t.b=200;
		
		InterA ia = new TestClass();
		InterB ib = new TestClass();
		
		ia.methodA();
		ib.MethodB();
		
		System.out.println(InterA.a);
		System.out.println(InterB.b);


	}

}

class TestClass implements InterA, InterB{

	@Override
	public void methodA() {
		System.out.println("InterA의 메서드");
		
	}

	@Override
	public void MethodB() {
		System.out.println("InterB의 메서드");
		
	}
	
}

class TestClass2 implements InterC{

	@Override
	public void methodA() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void methodC() {
		// TODO Auto-generated method stub
		
	}
	
}
