package js43_FileStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		
		try {
			
			String fileName = "D:\\1. java_study_src\\StreamTest\\a.txt";
			FileOutputStream fos = new FileOutputStream(fileName);
			byte[] data = "�ȳ��ϼ���".getBytes();
			fos.write(data);
			fos.flush();
			fos.close();
			System.out.println("���Ͼ��� ����");
			
		}catch(IOException e) {
			
		}

	}

}
