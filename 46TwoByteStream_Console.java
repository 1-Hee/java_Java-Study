package js45_2ByteStream_Console;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		
		
		try {
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			System.out.print("Ű����� ���� �Է� : ");
			String str = br.readLine();
			System.out.println(str);

			br.close();
			isr.close();

			
			
		}catch(Exception e) {	}

	}

}
