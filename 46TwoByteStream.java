package js45_2ByteStream;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.BufferedWriter;

public class Main {

	public static void main(String[] args) {
		
		try {
			OutputStreamWriter osw = new OutputStreamWriter(System.out);
			BufferedWriter bw = new BufferedWriter(osw);
			PrintWriter pw = new PrintWriter(bw);
			
			pw.println("�ȳ��ϼ���");
			pw.println("�ݰ����ϴ�");
			pw.flush();
			pw.close();
			bw.close();
			osw.close();
			

			
			
		}catch(Exception e) {	}
		
		

	}

}
