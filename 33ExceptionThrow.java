package js32_Exception_throws;

import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		
		
		TestClass t = new TestClass();
		int result = 0;
		
		try {
				result = t.method(10, 2);
				
		}catch(ArithmeticException e) {
			System.out.println("예외 발생");
			
		}catch(IOException e2) {
			System.out.println("예외 발생 IO");
		} catch (MyException e3) {
			System.out.println("사용자 정의 예외 발생");
			System.out.println(e3.toString());
			e3.printStackTrace();
		}
		System.out.println(result);
		
		
		

	}

}

class TestClass {
	public int method(int a, int b) throws ArithmeticException, IOException, MyException{
		int result = 0;
			result = a/b;
		// System.in.read();
//		if (b> 0) {
//			throw new ArithmeticException();
//		}
		if ( b <= 10 ) {
			throw new MyException();
		}
		return result;
	}
}

class MyException extends Exception{
	public String getMessage() {
		return "10보다 큰 값을 넣어주세요";
	}
}

