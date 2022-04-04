package js07_If;

public class Main {

	public static void main(String[] args) {
		
		// single if sentence
		int a = 10;
		
		if(a<20) {
			System.out.println("a는 20보다 작슴다");
		}
		
		if (a<10) {
			System.out.println("a는 10보다 작슴다");
		}
		
		if(a<1) {
			System.out.println("a는 1보다 작슴다");
		} else {
			System.out.println("a는 1보다 큼다");
		}
		
		if(a<1) {
			System.out.println("a는 1보다 작슴다");
		} else if (a<10) {
			System.out.println("a는 1보다 크거나 같지만 10보단 작슴다");
		} else if (a<20) {
		System.out.println("a는 10보다 크거나 같지만 20보단 작슴다");
		}
	
		else {
			System.out.println("a는 1보다 큼다");
		}

		

	}

}
