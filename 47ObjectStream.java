package js46_ObjectStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Main {

	public static void main(String[] args) {
		try {
			/*
			TestClass t = new TestClass();
			t.a=100;
			t.b=200;
			
			FileOutputStream fos = new FileOutputStream("D:\\1. java_study_src\\StreamTest\\d.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(t);
			oos.flush();
			oos.close();
			fos.close();
			*/
			
			FileInputStream fis = new FileInputStream("D:\\1. java_study_src\\StreamTest\\d.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			TestClass t2 = (TestClass)ois.readObject();
			
			System.out.println(t2.a);
			System.out.println(t2.b);
			t2.sayHi();
			
			ois.close();
			fis.close();
			
			
			
		}catch(Exception e) {}
		

		
		
	}

}

class TestClass implements Serializable{
	int a ;
	int b;
	public void sayHi() {
		System.out.println("Çï·Î¿ì");
	}
}