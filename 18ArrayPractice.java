package js17_ArrayPractice;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		
		// �л��� ����, ����, ���� ������ ���� ������ ���, ��ü ����, ��ü ����� ���� ����Ѵ�.
		// ���� ������ �迭�� �̿��Ѵ�.
		// ���� �������� �л��� ���� �Է� �޾� ó���Ѵ�.
		// ���� ������ 2���� �迭�� ����� ����.
		
		try {
			InputStreamReader ir = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(ir);
			
			
			System.out.printf("�л����� �Է����ּ��� : \n");
			int sutCnt = Integer.parseInt(br.readLine());
			
//			int sutCnt = 3;
////			int arrayCnt = sutCnt;
			
			/*
			// �л� ����ŭ ���� ����
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
				System.out.printf("%d��° �л� ���� ���� :", i+1);
				kor[i] = Integer.parseInt(br.readLine());
				System.out.printf("%d��° �л� ���� ���� :", i+1);
				eng[i] = Integer.parseInt(br.readLine());
				System.out.printf("%d��° �л� ���� ���� :", i+1);
				mat[i] = Integer.parseInt(br.readLine());
				
				tot[i] = (kor[i]+eng[i]+mat[i]);
				avg[i] = tot[i]/3;
								
			}
			
			
			for (int i = 0 ; i<sutCnt ; i ++) {
				System.out.printf("%d��° �л��� ����ǥ = ���� [%d] / ���� [%d] / ���� [%d] / ���� [%d] / ���[%d]\n", i+1, kor[i], eng[i], mat[i], tot[i], avg[i]);
			}
			
			int alltot=0;
			int avgtemp = 0;
			int allavg = 0;
			
			for(int i = 0 ; i <sutCnt; i++) {
				alltot += tot[i];
				avgtemp += avg[i];
				allavg = avgtemp/sutCnt;
				
			}
			System.out.printf("��ü �л��� �� ��� : %d / �� �� : %d", allavg, alltot);
			

			
//			for (int i = 0; i<arrayCnt ; i++) {
//				tot[i] = (kor[i]+eng[i]+mat[i]);
//				avg[i] = tot[i]/3;
//			}
			

			
			/*
			// �� ������ �Է¹޴´�.
			System.out.printf("1�� �л� ���� ����\n");
			kor1 = Integer.parseInt(br.readLine());
			System.out.printf("1�� �л� ���� ����\n");
			eng1 = Integer.parseInt(br.readLine());
			System.out.printf("1�� �л� ���� ����\n");
			mat1 = Integer.parseInt(br.readLine());
			
			System.out.printf("2�� �л� ���� ����\n");
			kor2 = Integer.parseInt(br.readLine());
			System.out.printf("2�� �л� ���� ����\n");
			eng2 = Integer.parseInt(br.readLine());
			System.out.printf("2�� �л� ���� ����\n");
			mat2 = Integer.parseInt(br.readLine());

			
			System.out.printf("3�� �л� ���� ����\n");
			kor3 = Integer.parseInt(br.readLine());
			System.out.printf("3�� �л� ���� ����\n");
			eng3 = Integer.parseInt(br.readLine());
			System.out.printf("3�� �л� ���� ����\n");
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
