package js31_ThreadSync;

public class Main {

	public static void main(String[] args) {
		
		DataClass d = new DataClass();
		
		Thread1 t1 = new Thread1(d);
		Thread1 t2 = new Thread1(d);
		
		t1.setName("T1");
		t2.setName("T2");
		
		t1.start();
		t2.start();

	}

}

class Thread1 extends Thread{
	DataClass dc;
	public Thread1(DataClass dc) {
		this.dc = dc;
	}
	
	public void run() {
		dc.method(Thread.currentThread().getName());
	}
	
}

class DataClass{
	public synchronized void method(String name) {
		for (int i = 0 ; i < 10 ; i++) {
			try {
				Thread.sleep(1000);
			}catch(Exception e) {}
			System.out.println(name+" : "+i);
		}
	}
	
}