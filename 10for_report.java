package js09_for_report;

public class Main {

	public static void main(String[] args) {
//		int number = 0;
//		for (int i = 0 ; i < 3 ; i++) {
//			System.out.println();
//			for(int k = 0; k < 3; k++) {
//				number = number + 1;
//				System.out.print(number+" ");
//			}
//		}
				

// answer
//		for(int r = 0 ; r<3 ; r++) {
//			for(int j = 0 ; j<3 ; j++) {
//				System.out.print((1+j+(r*3))+" ");
//			}
//			System.out.println();
//		}
		
		// 123
		// 456
		// 789
		
//		for(int i = 0 ; i < 3; i++) {
//			for(int j = 0 ; j<3 ; j++) {
//				System.out.print((3-j+(i*3))+" ");
//			}
//			System.out.println();
//		}
		
		// 321
		// 654
		// 987
		
//		for(int i = 0 ; i < 3 ; i++) {
//			for(int j = 0; j < 3 ; j++) {
//				System.out.print(1 + (j * 3) + i + " ");
//			}
//			System.out.println();
//		}
		
		// 1 4 7
		// 2 5 8
		// 3 6 9
		
		
/*		for(int i = 0 ; i < 3 ; i ++) {
			for(int j = 0 ; j < 3 ; j++) {
				if(j<1+i) {
					System.out.print("0 ");
				}
				
			}
			System.out.println();
		}
		
		// 0
		// 0 0
		// 0 0 0 
		
		
*/

/*		for(int i = 0 ; i < 3 ; i ++) {
			for (int j = 0 ; j < 3 ; j ++) {
				if (j < 2-i ) {
					System.out.print("  ");
				} else {
					System.out.print(" 0");
				}
				
			}
			System.out.println();
		}
		
		//  	0
		//    0 0
		//  0 0 0
*/
		
		for(int i = 0 ; i < 3 ; i ++) {
			for (int j = 0 ; j < 3 ; j ++) {
				if(j%2 == i%2) {
					System.out.print("0 ");
				} else {
					System.out.print("  ");					
				}	
			}
			
			System.out.println();
			
		}
		
		// 0     0
		//    0
		// 0     0
		


	}

}
