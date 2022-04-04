package js16_Array;

public class Main {

	public static void main(String[] args) {
		
		int [] a1 = new int[10];
		int a2 []  = new int[10];
		
		System.out.println("a1 length = "+a1.length);
		System.out.println("a2 length = "+a2.length);
		
		int [] a3 = {1, 2, 3};
		System.out.println("a3 length = "+a3.length);
		
		
		for(int i = 0 ; i < a3.length ; i++) {
			System.out.printf("a3[%d] = %d\n",i , a3[i]);
		}
		
		int [] a4 [] = new int [3][6];
//		int a5 [][] = new int[3][5];
		// 		System.out.println("a5 length = "+a5.length);
		
		System.out.println("a4 length = "+a4.length);
		System.out.println("a4[0] length = "+a4[0].length);
		
		int [][] a6 = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		
		for(int i = 0 ; i < a6.length ; i ++) {
			for(int j  = 0 ; j <a6[i].length ; j++) {
				System.out.printf("a6[%d][%d] = %d\n", i, j, a6[i][j]);
				
			}
		}
		
		
		

		



		
		

		
		
		
	}

}
