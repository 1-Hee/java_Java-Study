package js22_public;

import com.test.BClass;

public class Main {

	public static void main(String[] agrs) {
		new Class1();
		new Class2();
		new Class3();
		new Class4();
	}


}

// ���� ��Ű���� Ŭ������ ��ü �����ؼ� ������ ���
class Class1{
	public Class1() {
		// public
		AClass a = new AClass();
		a.publicValue = 10;
		a.publicMethod();
		
		// protected
//		a.protectedValue = 100;
//		a.protectedMethod();
		
		//default
		a.defaultValue = 120;
		a.defaultMethod();
		
		//private
		/*
		a.privateValue
		a.privateMethod();
		*/


	}

}

// ���� ��Ű���� Ŭ������ ��� �޾Ƽ� ����� ���
class Class2 extends AClass{
	public Class2() {
		
		// public
		publicValue = 10;		
		publicMethod();
		
		// protected
//		protectedValue = 100;
//		protectedMethod();
		
		//default
		defaultValue = 120;
		defaultMethod();
		
		//private
		/*
		privateValue
		privateMethod();
		*/



	}
	
}

// �ٸ� ��Ű���� Ŭ������ ��ü �����ؼ� ������ ���
class Class3{
	public Class3() {
		// public
		BClass b = new BClass();
		b.publicValue2 = 10;
		b.publicMethod2();
		
		// protected (����� �޾ƾ� ��� �����ؼ� ��� �Ұ�!
		/*
		b.ptint2 = 10;
		b.ptMethod2();
		*/
		
		//default
		/*
		b.defaultValue2=100;
		b.defaultMethod2();
		*/
		
		// private
		/*
		b.privateValue2
		b.privateMethod2();
		*/

		
	}
	
}

// �ٸ� ��Ű���� Ŭ������ ��ӹ޾Ƽ� ����� ���
class Class4 extends BClass{
	public Class4() {
		// public
		publicValue2 = 10;
		publicMethod2();
		
		// protected
		protectedValue2 = 100;
		protectedMethod2();
		
		//default
		/*
		defaultValue2=100;
		defaultMethod2();
		*/

		//private
		/*
		privateValue2
		privateMethod2();
		*/


		
	}
	
}
