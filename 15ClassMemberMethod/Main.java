package js13_ClassMemberMethod;

public class Main {

	public static void main(String[] args) {
		
		Class1 c1 = new Class1();
		
		c1.method1();
		c1.method2();
		
		c1.add(3, 4);
		
		int result = c1.resultAdd(500, 600);
		System.out.println("리턴값은 : " +result);
		
		c1.add(1, 2, 3);
		

		
		
	}

}
