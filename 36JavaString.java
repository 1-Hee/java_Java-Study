package js35_JavaString;

public class Main {

	public static void main(String[] args) {
		
//		String s1 = "hello";
//		System.out.println(s1.getBytes());
		
		String str1 = "�ȳ��ϼ���";		
		String str2 = new String("�ȳ��ϼ���");
		String str3 = "�ȳ��ϼ���";

		
		// ���ڿ� ��
		if (str1 == "�ȳ��ϼ���") {
			System.out.println("���ڿ��� ����");
		} else {
			System.out.println("���ڿ��� �ٸ�");
		}
		
		System.out.println("-----------------------");
		
		
		if (str1 == str2) {
			System.out.println("���ڿ��� �ּҰ��� ����");
		} else {
			System.out.println("���ڿ��� �ֻ簪�� �ٸ�");
		}
		
		
		
		if (str1 == str3) {
			System.out.println("�� ���ڿ��� �ּҰ��� ����");
		} else {
			System.out.println("�� ���ڿ��� �ּҰ��� �ٸ�");
		}
		
		System.out.println("-----------------------");
		
		
		//���� ���� ���� ���ϴ� ������
		if(str1.equals(str2)) {
			System.out.println("�� ���ڿ��� ����");
		} else {
			System.out.println("�� ���ڿ��� �ٸ�");
		}
		
		
		System.out.println("-----------------------");
		
		String eng1 = "abcdef";
		String eng2 = "ABCDEF";
		
		if(eng1.equals(eng2)) {
			System.out.println("�� ���ڿ��� ����");
		} else {
			System.out.println("�� ���ڿ��� �ٸ�");
		}
		
		if(eng1.equalsIgnoreCase(eng2)) {
			System.out.println("�� ���ڿ��� ����");
		} else {
			System.out.println("�� ���ڿ��� �ٸ�");
		}
				
		
		String upperStr = eng1.toUpperCase();
		System.out.println(upperStr);
		
		String lowerStr = eng2.toLowerCase();
		System.out.println(lowerStr);

		System.out.println("-----------------------");
		
		
		String str4 = "abcdef";
		if(str4.startsWith("abc")) {
			System.out.println("abc�� ������");
		}else {
			System.out.println("abc�� �������� ����");
		}
		
		if(str4.endsWith("def")) {
			System.out.println("def�� ����");
		}else {
			System.out.println("def�� ������ ����");
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
		System.out.println("�ȳ��ϼ���".length());
		
		System.out.println("-----------------------");
		String str6 = "             Hello                ";
		String str7 = str6.trim();
		
		System.out.println(str6);
		System.out.println(str7);
		System.out.println("-----------------------");
		
		
		

	}

}
