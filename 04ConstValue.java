package js03_ConstValue;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("%d\n%s", 100, "hello");
		System.out.printf("%d %d %d\n", 100, 200, 300);
		
		System.out.printf("%d ~ %d\n", -2147483648, 2147483647);
		System.out.printf("%d ~ %d\n", -2147483649l, 2147483648L);
		
		System.out.printf("%d~%d\n", -922337203684775808l, 9223372036854775807l);
		
		System.out.printf("%c\n", 'a');
//		System.out.printf("%d", 'a'); // ���Ĺ��ڰ� ���� �ʾ� error �߻�
		
		System.out.printf("%f\n", 123.456);
		System.out.printf("%2.2f\n", 123.456);
		System.out.printf("%.2f\n", 123.456);
		
		// ���ڸ��� ä���
		System.out.printf("%d10\n", 10);
		// ���ڸ��� ä���
		System.out.printf("%010d\n", 10);
		
			
		System.out.printf("%s\n", "�ȳ��ϼ���");
		System.out.printf("%s %d\n", "�ݰ����ϴ�", 200);
		
		
		

	}

}
