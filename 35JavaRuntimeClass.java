package js34_JavaRuntimeClass;

import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		
		// Runtime 객체를 얻어온다
		Runtime run = Runtime.getRuntime();
		
		// 메모리 양
		long total = run.totalMemory();
		long free = run.freeMemory();
		long used = total - free;
		
		
		System.out.println("총 메모리 : "+total);
		System.out.println("여유 메모리 : "+free);
		System.out.println("사용중 메모리 : "+used);

		
		// 프로그램 실행
		try {
			run.exec("calc.exe");
			run.exec("notepad.exe");
			run.exec("explorer.exe http://www.naver.com");


		} catch (Exception e) {}
	
		
		Vector v = new Vector();
		v= null;
//		run.gc();
//		System.gc();
		
		// gc는 이미 운영체제에서 메모리가 부족할 때 자동으로 청소해줌
		// gc는 정말 꼭 필요할 때만 사용하는 것이 좋음, 잦은 사용은 컴퓨터에 오히려 부담을 줄 수 있기 때문

		

	}

}
