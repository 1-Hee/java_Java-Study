package js26_InnerClass_anonimous;

public class Main {

	public static void main(String[] args) {
		Class200 c1 = new Class200();
		c1.disp();
		
		Class200 c2 = new Class200() {
			public void disp() {
				System.out.println("익명 중첩 클래스의 메서드");
			}
		};
		c2.disp();
		// c2 참조변수를 사용해서만 사용 가능함, 1회성!

	}
	

}

class Class200{
	public void disp() {
		System.out.println("원본 클래스의 disp 메서드");
	}
}
