package js26_InnerClass_anonimous;

public class Main {

	public static void main(String[] args) {
		Class200 c1 = new Class200();
		c1.disp();
		
		Class200 c2 = new Class200() {
			public void disp() {
				System.out.println("�͸� ��ø Ŭ������ �޼���");
			}
		};
		c2.disp();
		// c2 ���������� ����ؼ��� ��� ������, 1ȸ��!

	}
	

}

class Class200{
	public void disp() {
		System.out.println("���� Ŭ������ disp �޼���");
	}
}
