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
			int stuCnt = Integer.parseInt(br.readLine());
			
			
			// 과목 이름 배열
			String [] str = {"국어", "영어", "수학"};
			int [] tot = new int[stuCnt];
			int [] avg = new int[stuCnt];

			
			

			
//			int [] kor = new int[sutCnt];
//			int [] eng = new int[sutCnt];
//			int [] mat = new int[sutCnt];
//			int [] tot = new int[sutCnt];
//			int [] avg = new int[sutCnt];
			
			int [][] point = new int[stuCnt][str.length];
			
			
			for(int i=0 ; i < stuCnt; i++) {
				tot[i]=0;
				for(int j=0 ; j < str.length; j++) {
					System.out.printf("%d번째 학생의 %s점수 =", i+1, str[j]);
					point[i][j] = Integer.parseInt(br.readLine());
					tot[i] += point[i][j];
					avg[i] += tot[i]/3;
				}
				
			}
			
			for(int i = 0 ; i < stuCnt ; i ++) {
				System.out.printf("%d 번째 학생 :", i+1);
				for(int j=0 ; j < str.length ; j++) {
					System.out.printf("%s[%d] /", str[j], point[i][j]);
				}
				System.out.printf("총점 [%d] / 평균 [%d]\n", tot[i], avg[i]);
			}
			
			

			
			int alltot=0;
			int avgtemp = 0;
			int allavg = 0;
			
			for(int i = 0 ; i <stuCnt; i++) {
				alltot += tot[i];
				avgtemp += avg[i];
				allavg = avgtemp/stuCnt;
				
			}
			System.out.printf("전체 학생의 총 평균 : %d / 총 점 : %d", allavg, alltot);
			

			
			
			
			
			
			
			
			
			

			/*
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
			*/
			
			
//			for (int i = 0 ; i<sutCnt ; i ++) {
//				System.out.printf("%d번째 학생의 성적표 = 국어 [%d] / 영어 [%d] / 수학 [%d] / 총점 [%d] / 평균[%d]\n", i+1, kor[i], eng[i], mat[i], tot[i], avg[i]);
//			}
//			

//	
			
			
		}catch(Exception e) {}
		
		
		

	}

}
