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
			int stuCnt = Integer.parseInt(br.readLine());
			
			
			// ���� �̸� �迭
			String [] str = {"����", "����", "����"};
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
					System.out.printf("%d��° �л��� %s���� =", i+1, str[j]);
					point[i][j] = Integer.parseInt(br.readLine());
					tot[i] += point[i][j];
					avg[i] += tot[i]/3;
				}
				
			}
			
			for(int i = 0 ; i < stuCnt ; i ++) {
				System.out.printf("%d ��° �л� :", i+1);
				for(int j=0 ; j < str.length ; j++) {
					System.out.printf("%s[%d] /", str[j], point[i][j]);
				}
				System.out.printf("���� [%d] / ��� [%d]\n", tot[i], avg[i]);
			}
			
			

			
			int alltot=0;
			int avgtemp = 0;
			int allavg = 0;
			
			for(int i = 0 ; i <stuCnt; i++) {
				alltot += tot[i];
				avgtemp += avg[i];
				allavg = avgtemp/stuCnt;
				
			}
			System.out.printf("��ü �л��� �� ��� : %d / �� �� : %d", allavg, alltot);
			

			
			
			
			
			
			
			
			
			

			/*
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
			*/
			
			
//			for (int i = 0 ; i<sutCnt ; i ++) {
//				System.out.printf("%d��° �л��� ����ǥ = ���� [%d] / ���� [%d] / ���� [%d] / ���� [%d] / ���[%d]\n", i+1, kor[i], eng[i], mat[i], tot[i], avg[i]);
//			}
//			

//	
			
			
		}catch(Exception e) {}
		
		
		

	}

}
