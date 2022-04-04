package js35_JavaString;

public class Main {

	public static void main(String[] args) {
		
//		String s1 = "hello";
//		System.out.println(s1.getBytes());
		
		String str1 = "안녕하세요";		
		String str2 = new String("안녕하세요");
		String str3 = "안녕하세요";

		
		// 문자열 비교
		if (str1 == "안녕하세요") {
			System.out.println("문자열이 같음");
		} else {
			System.out.println("문자열이 다름");
		}
		
		System.out.println("-----------------------");
		
		
		if (str1 == str2) {
			System.out.println("문자열의 주소값이 같음");
		} else {
			System.out.println("문자열의 주사값이 다름");
		}
		
		
		
		if (str1 == str3) {
			System.out.println("두 문자열의 주소값이 같음");
		} else {
			System.out.println("두 문자열의 주소값이 다름");
		}
		
		System.out.println("-----------------------");
		
		
		//실제 내용 값을 비교하는 연산자
		if(str1.equals(str2)) {
			System.out.println("두 문자열이 같음");
		} else {
			System.out.println("두 문자열이 다름");
		}
		
		
		System.out.println("-----------------------");
		
		String eng1 = "abcdef";
		String eng2 = "ABCDEF";
		
		if(eng1.equals(eng2)) {
			System.out.println("두 문자열이 같음");
		} else {
			System.out.println("두 문자열이 다름");
		}
		
		if(eng1.equalsIgnoreCase(eng2)) {
			System.out.println("두 문자열이 같음");
		} else {
			System.out.println("두 문자열이 다름");
		}
				
		
		String upperStr = eng1.toUpperCase();
		System.out.println(upperStr);
		
		String lowerStr = eng2.toLowerCase();
		System.out.println(lowerStr);

		System.out.println("-----------------------");
		
		
		String str4 = "abcdef";
		if(str4.startsWith("abc")) {
			System.out.println("abc로 시작함");
		}else {
			System.out.println("abc로 시작하지 않음");
		}
		
		if(str4.endsWith("def")) {
			System.out.println("def로 끝남");
		}else {
			System.out.println("def로 끝나지 않음");
		}
		
		System.out.println(str4.indexOf("c"));
		System.out.println(str4.indexOf("cd"));
		System.out.println(str4.indexOf("ccc"));
		
		System.out.println("-----------------------");
		
		byte [] br = str4.getBytes();
		for(int i = 0 ; i < br.length ; i ++) {
			System.out.println(br[i]+ " ");
		}
		System.out.println();
		
		String str100 = new String(br);
		System.out.println(str100);
		
		System.out.println("-----------------------");
		
		String str5 = str4.substring(2, 3);
		System.out.println(str5);
		
		System.out.println(str4.length());
		System.out.println("안녕하세유".length());
		
		System.out.println("-----------------------");
		String str6 = "             Hello                ";
		String str7 = str6.trim();
		
		System.out.println(str6);
		System.out.println(str7);
		System.out.println("-----------------------");
		
		
		

	}

}
