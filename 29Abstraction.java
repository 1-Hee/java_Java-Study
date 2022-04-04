package js27_Abstraction;

public class Main {

	public static void main(String[] args) {
		
//		Animal An = new Animal();
		Human h =new Human();
		h.SayHi();
		
		Animal a2 = new Animal() {

			@Override
			public void SayHi() {
				System.out.println("Overriding SayHi");
			}
			
		};
		a2.SayHi();
		
		
	}

}

abstract class Animal{
	public abstract void SayHi();
}


class Human extends Animal{

	@Override
	public void SayHi() {
		System.out.println("æ»≥Á«œºº¿Ø");
		
	}
	
	
}