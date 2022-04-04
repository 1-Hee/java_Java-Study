package js21_polymorphism;

public class Main {

	public static void main(String[] args) {
		Class1 c1 = new Class1();
		
		c1.superV1 = 100;
		c1.superMethod();
		
		System.out.println();
	
		c1.class1V1 = 300;
		c1.class1Method();
		c1.superMethod2();
		
		System.out.println();

		
		SuperClass super1 = new Class1();
		super1.superV1 = 200;
		super1.superMethod();
		
		System.out.println();
		
		super1.superMethod2();
		
		// super1.class1V1=400;
		
		
		
		
	}

}
