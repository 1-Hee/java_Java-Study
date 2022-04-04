import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		try {
			/*
			int a1 = System.in.read();
			System.in.read();
			System.in.read();
			System.out.println(a1);
			int a2 = System.in.read();
			System.in.read();
			System.in.read();
			System.out.println(a2);
			*/
			
			InputStreamReader ir = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(ir);
			
			String str = br.readLine();
			System.out.println(str);
			
			char a1= (char) System.in.read();
			System.out.println(a1);
			
			
		}catch(Exception e) { }
		
		
		
		
		
		
		

	}

}
