package js32_Exception;

public class Main {

	public static void main(String[] args) {
		
		
		
		TestClass t = new TestClass();
		int result = t.method(10, 2);
		System.out.println(result);
		
		
		

	}

}

class TestClass {
	public int method(int a, int b) {
		int result = 0;
		try {
			result = a/b;
		} catch(ArithmeticException e) {
			System.out.printf("0�� �Է��߽��ϴ�\n");
		} finally {
			System.out.println("�� �κ��� ������ ����˴ϴ�");
		}
		return result;
	}
}
