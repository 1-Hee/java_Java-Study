package js07_If;

public class Main {

	public static void main(String[] args) {
		
		// single if sentence
		int a = 10;
		
		if(a<20) {
			System.out.println("a�� 20���� �۽���");
		}
		
		if (a<10) {
			System.out.println("a�� 10���� �۽���");
		}
		
		if(a<1) {
			System.out.println("a�� 1���� �۽���");
		} else {
			System.out.println("a�� 1���� ŭ��");
		}
		
		if(a<1) {
			System.out.println("a�� 1���� �۽���");
		} else if (a<10) {
			System.out.println("a�� 1���� ũ�ų� ������ 10���� �۽���");
		} else if (a<20) {
		System.out.println("a�� 10���� ũ�ų� ������ 20���� �۽���");
		}
	
		else {
			System.out.println("a�� 1���� ŭ��");
		}

		

	}

}
