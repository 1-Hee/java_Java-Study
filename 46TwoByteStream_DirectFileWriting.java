package js45_2ByteStream_v2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Main {

	public static void main(String[] args) {
		
		try {
			
			File file = new File("D:\\1. java_study_src\\StreamTest\\c.txt");
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);
			
			
			pw.println("�ȳ��ϼ���");
			pw.println("�ݰ����ϴ�");
			System.out.println("���� �ۼ� �Ϸ�");
			

			
			
		}catch(Exception e) {	}
		
		

	}

}