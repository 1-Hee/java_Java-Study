package js24_Static;

public class Main {
	
	int a ;
	static int b;

	public static void main(String[] args) {
		
		// a = 100;
		b = 150;
		
		Class1.a = 300;
		Class1.method1();
		
		Class1 c1 = new Class1();
		Class1 c2 = new Class1();
		
		c1.a = 1000;
		System.out.println(c2.a);
		
		

	}

}
