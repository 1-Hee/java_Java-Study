package js41_Javahashtable;

import java.util.Hashtable;

public class Main {

	public static void main(String[] args) {
		
		
		Hashtable ht = new Hashtable();
		// 데이터 넣기
		ht.put("str", "hello");
		ht.put("int", 100);
		
		//데이터 가져오기
		String str = (String)ht.get("str");
		int value = (Integer)ht.get("int");
		
		System.out.println(str);
		System.out.println(value);
		
		
		

	}

}
