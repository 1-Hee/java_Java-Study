package js17_ArrayPractice;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		
		// 학생의 국어, 영어, 수학 점수에 대한 총점과 평균, 전체 총점, 전체 평균을 구해 출력한다.
		// 위의 예제를 배열을 이용한다.
		// 위의 예제에서 학생의 수를 입력 받아 처리한다.
		// 위의 예제를 2차원 배열로 만들어 본다.
		
		try {
			InputStreamReader ir = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(ir);
			
			
			System.out.printf("학생수를 입력해주세요 : \n");
			int sutCnt = Integer.parseInt(br.readLine());
			
//			int sutCnt = 3;
////			int arrayCnt = sutCnt;
			
			/*
			// 학생 수만큼 변수 선언
			int kor1, kor2, kor3;
			int eng1, eng2, eng3;
			int mat1, mat2, mat3;
			*/
			
			int [] kor = new int[sutCnt];
			int [] eng = new int[sutCnt];
			int [] mat = new int[sutCnt];
			int [] tot = new int[sutCnt];
			int [] avg = new int[sutCnt];

			
			for(int i = 0 ; i <sutCnt; i++) {
				System.out.printf("%d번째 학생 국어 점수 :", i+1);
				kor[i] = Integer.parseInt(br.readLine());
				System.out.printf("%d번째 학생 영어 점수 :", i+1);
				eng[i] = Integer.parseInt(br.readLine());
				System.out.printf("%d번째 학생 수학 점수 :", i+1);
				mat[i] = Integer.parseInt(br.readLine());
				
				tot[i] = (kor[i]+eng[i]+mat[i]);
				avg[i] = tot[i]/3;
								
			}
			
			
			for (int i = 0 ; i<sutCnt ; i ++) {
				System.out.printf("%d번째 학생의 성적표 = 국어 [%d] / 영어 [%d] / 수학 [%d] / 총점 [%d] / 평균[%d]\n", i+1, kor[i], eng[i], mat[i], tot[i], avg[i]);
			}
			
			int alltot=0;
			int avgtemp = 0;
			int allavg = 0;
			
			for(int i = 0 ; i <sutCnt; i++) {
				alltot += tot[i];
				avgtemp += avg[i];
				allavg = avgtemp/sutCnt;
				
			}
			System.out.printf("전체 학생의 총 평균 : %d / 총 점 : %d", allavg, alltot);
			

			
//			for (int i = 0; i<arrayCnt ; i++) {
//				tot[i] = (kor[i]+eng[i]+mat[i]);
//				avg[i] = tot[i]/3;
//			}
			

			
			/*
			// 각 점수를 입력받는다.
			System.out.printf("1번 학생 국어 점수\n");
			kor1 = Integer.parseInt(br.readLine());
			System.out.printf("1번 학생 영어 점수\n");
			eng1 = Integer.parseInt(br.readLine());
			System.out.printf("1번 학생 수학 점수\n");
			mat1 = Integer.parseInt(br.readLine());
			
			System.out.printf("2번 학생 국어 점수\n");
			kor2 = Integer.parseInt(br.readLine());
			System.out.printf("2번 학생 영어 점수\n");
			eng2 = Integer.parseInt(br.readLine());
			System.out.printf("2번 학생 수학 점수\n");
			mat2 = Integer.parseInt(br.readLine());

			
			System.out.printf("3번 학생 국어 점수\n");
			kor3 = Integer.parseInt(br.readLine());
			System.out.printf("3번 학생 영어 점수\n");
			eng3 = Integer.parseInt(br.readLine());
			System.out.printf("3번 학생 수학 점수\n");
			mat3 = Integer.parseInt(br.readLine());
			
			int tot1 = kor1 + eng1 + mat1;
			int tot2 = kor2 + eng2 + mat2;
			int tot3 = kor3 + eng3 + mat3;
			
			int avg1 = tot1/3;
			int avg2 = tot2/3;
			int avg3 = tot3/3;
			
			int alltot = tot1 + tot2 + tot3;
			int allavg = (avg1+avg2+avg3)/3;
			*/
			



				

			
			
			
		}catch(Exception e) {}
		
		
		

	}

}
