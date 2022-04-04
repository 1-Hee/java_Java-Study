package js34_JavaRuntimeClass;

import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		
		// Runtime ��ü�� ���´�
		Runtime run = Runtime.getRuntime();
		
		// �޸� ��
		long total = run.totalMemory();
		long free = run.freeMemory();
		long used = total - free;
		
		
		System.out.println("�� �޸� : "+total);
		System.out.println("���� �޸� : "+free);
		System.out.println("����� �޸� : "+used);

		
		// ���α׷� ����
		try {
			run.exec("calc.exe");
			run.exec("notepad.exe");
			run.exec("explorer.exe http://www.naver.com");


		} catch (Exception e) {}
	
		
		Vector v = new Vector();
		v= null;
//		run.gc();
//		System.gc();
		
		// gc�� �̹� �ü������ �޸𸮰� ������ �� �ڵ����� û������
		// gc�� ���� �� �ʿ��� ���� ����ϴ� ���� ����, ���� ����� ��ǻ�Ϳ� ������ �δ��� �� �� �ֱ� ����

		

	}

}
