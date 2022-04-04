package js33_JavaWrapper;

public class Main {

	public static void main(String[] args) {
		
	
//	String V1 = "ABCD";
//	System.out.printf("d", parseInt("hhhh")); // �Ľ���, ���ڿ��� �� ���ڿ��� �ƴϱ� ������ �Ұ�����.
		
		//�ִ� �ּҰ� ���
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Float.MAX_VALUE);
		System.out.println(Float.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		
		System.out.println("--------------------");

		
		//boxing
		Integer intClass = new Integer(100);
		Float floatClass = new Float(12.24F);
		
		//UnBoxing
		int intValue = intClass.intValue();
		float floatValue = floatClass.floatValue();
		System.out.println(intValue);
		System.out.println(floatValue);

		System.out.println("--------------------");

		
		// java 5 ���� ����, AutoBoxing ���
		Integer intClass2 = 200;
		int intValue2 = intClass2;
		
		System.out.println(intClass2);
		System.out.println(intValue2);
		
		System.out.println("--------------------");

		
		// Parsing
		int parsingValue = Integer.parseInt("12345");
		float parsingValue2 = Float.parseFloat("12.34");
		
		System.out.println(parsingValue);
		System.out.println(parsingValue2);
		
		System.out.println(parsingValue + parsingValue2);

		
		System.out.println("--------------------");

	
	
	}



}
