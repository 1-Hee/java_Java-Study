package js41_Javahashtable;

import java.util.Hashtable;

public class Main {

	public static void main(String[] args) {
		
		
		Hashtable ht = new Hashtable();
		// ������ �ֱ�
		ht.put("str", "hello");
		ht.put("int", 100);
		
		//������ ��������
		String str = (String)ht.get("str");
		int value = (Integer)ht.get("int");
		
		System.out.println(str);
		System.out.println(value);
		
		
		

	}

}
