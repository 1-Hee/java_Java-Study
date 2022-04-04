package js37_JavaStringTokenizer;

import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		
		String str = "���ع��� ��λ��� ������ �⵵��";
		StringTokenizer st = new StringTokenizer(str);
		
		while(st.hasMoreElements()) {
			System.out.println(st.nextToken());
		}
		System.out.println("------------");
		
		st = new StringTokenizer(str);
		while(st.hasMoreElements()) {
			System.out.println(st.nextToken("��"));
		}
		System.out.println("------------");

		str = "����^���� ���_���� ����_�� ��^����";
		st = new StringTokenizer(str, "_"); // �ι�° ���ڷ� ���� �־��ָ� �װ� �����ڷ� ���.
		while(st.hasMoreElements()) {
			System.out.println(st.nextToken());
		}
		System.out.println("------------");
		
		st = new StringTokenizer(str, "_");
		while(st.hasMoreElements()) {
			System.out.println(st.nextToken("^"));
		}
		
		System.out.println("------------");
		
		st = new StringTokenizer(str, "_", true); // ����° ���� ������ �����ڵ� "��ū"���� ����� ���� ������ ����!
		while(st.hasMoreElements()) {
			System.out.println(st.nextToken());
		}
		
		System.out.println("------------");
		
		

	}

}
