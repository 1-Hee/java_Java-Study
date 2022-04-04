package js26_innerClass_FinalClass;

public class Main {

	int InnA = 10;
	final int FInnA = 100;

	
	public static void main(String[] args) {
		
		int InnB = 20;		
		final int FInnB = 200;
		
		
		class Inner{
			void innerMethod() {
				System.out.println(FInnB);
//				System.out.println(FInnA);

			}
		}
		
		Inner inner = new Inner();
		inner.innerMethod();
		
		
	}

}
