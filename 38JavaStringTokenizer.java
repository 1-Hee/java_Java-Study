package js37_JavaStringTokenizer;

import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		
		String str = "동해물과 백두산이 마르고 닳도록";
		StringTokenizer st = new StringTokenizer(str);
		
		while(st.hasMoreElements()) {
			System.out.println(st.nextToken());
		}
		System.out.println("------------");
		
		st = new StringTokenizer(str);
		while(st.hasMoreElements()) {
			System.out.println(st.nextToken("산"));
		}
		System.out.println("------------");

		str = "동해^물과 백두_산이 마르_고 닳^도록";
		st = new StringTokenizer(str, "_"); // 두번째 인자로 값을 넣어주면 그걸 구분자로 사용.
		while(st.hasMoreElements()) {
			System.out.println(st.nextToken());
		}
		System.out.println("------------");
		
		st = new StringTokenizer(str, "_");
		while(st.hasMoreElements()) {
			System.out.println(st.nextToken("^"));
		}
		
		System.out.println("------------");
		
		st = new StringTokenizer(str, "_", true); // 세번째 인자 값으로 구분자도 "토큰"으로 사용할 건지 말건지 결정!
		while(st.hasMoreElements()) {
			System.out.println(st.nextToken());
		}
		
		System.out.println("------------");
		
		

	}

}
