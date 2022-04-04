package js25_Final;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Class1 c1 = new Class1();
//		c1.a=100;
		System.out.println(c1.a);
		 

	}

}

class Class1 extends Class2{
	final int a = 100;
	
	public void method1() {
//		a = 200;
	}
	
/*	public void method2() {
		
}*/	
	
}


class Class2 {
	public final void method2() {
		System.out.println("¾Æ¾Æ¾Æ");
	}
}

final class Class3 {
	
}

/*
class Class4 extends Class3{
	
}
*/
