package js44_FilterStream_DataStream2;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class Main {

	public static void main(String[] args) {
		
		try {
			String fileName = "D:\\1. java_study_src\\StreamTest\\b.txt";
			FileInputStream fis = new FileInputStream(fileName);
			DataInputStream dis = new DataInputStream(fis);
			
			String str = dis.readUTF();
			int a = dis.readInt();
			int b = dis.readInt();
			dis.close();
			fis.close();
			
			System.out.println(str);
			System.out.println(a);
			System.out.println(b);
			

			
			
		}catch(Exception e) {
			
		}

	}

}