package js29_Thread;

public class Main {

	public static void main(String[] args) {
		
		Thread1 t1 = new Thread1();
		t1.start();
		
		// t2
		Thread2 t2 = new Thread2();
		Thread t = new Thread(t2);
		t.start();
		
		
		
		
		
		
		while(true) {
			try {
				Thread.sleep(1000);				
			}catch(Exception e) {}
			System.out.print("*");
		}
		
//		while(true) {
//			System.out.println("-");
//		}
//
//		while(true) {
//			System.out.println("_");
//		}
		
		


	}

}

class Thread1 extends Thread{
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);				
			}catch(Exception e) {}
			System.out.print("-");
		}
		

	}
}

class Thread2 implements Runnable{

	@Override
	public void run() {
		while(true){
		
			try {
				Thread.sleep(1000);				
			}catch(Exception e) {}
			System.out.print("_");


		}
	}


	
}