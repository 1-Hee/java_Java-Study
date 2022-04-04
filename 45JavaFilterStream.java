package js44_FilterStream;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class Main {

	public static void main(String[] args) {
		
		try {
			String fileName = "D:\\1. java_study_src\\StreamTest\\b.txt";
			FileOutputStream fos = new FileOutputStream(fileName);
			DataOutputStream dos = new DataOutputStream(fos);
			
			dos.writeUTF("안녕하세유");
			dos.writeInt(10);
			dos.writeInt(20);
			dos.flush();
			dos.close();
			fos.close();
			System.out.println("출력 완료");
			
		}catch(Exception e) {
			
		}

	}

}
