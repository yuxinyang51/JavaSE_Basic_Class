package cn.itcast_03;

import java.util.Scanner;

/*
 *	12.03_Scanner�ĸ����͹��췽�� Scanner�����ڽ��ռ���¼������
 *	���õ�����������
 *		public int nextInt():��ȡһ��int���͵�ֵ
 *		public String nextLinr():��ȡһ��String���͵�ֵ 
 *	����������:
 *		�Ȼ�ȡһ����ֵ���ٻ�ȡһ���ַ�����������ַ����ǿ�ֵ
 *		ͨ���õ�Enter�����������������ģ�'\r'�ǻس���'\n'�ǻ��У�ǰ��ʹ��굽���ף�����ʹ�������һ��
 *	��ν����
 *		A:�Ȼ�ȡһ����֮���ٴ���һ���µļ���¼������ȡ�ַ���
 *		B:�����е����ݶ��Ȱ����ַ�����ȡ��Ȼ��Ҫʲô����Ͷ�Ӧ��ת����ʲô��
 */

public class ScannerDemo {
	public static void main(String[] args) {
		// ��ȡ����¼�����
		Scanner sc = new Scanner(System.in);
		// ��ȡ����int���͵�ֵ
		// int a = sc.nextInt();
		// int b = sc.nextInt();
		// System.out.println("a:" + a + "b:" + b);
		// System.out.println("-------------------");

		// ��ȡ����String���͵�ֵ
		// String s1 = sc.nextLine();
		// String s2 = sc.nextLine();
		// System.out.println("s1:" + s1 +"\n"+ "s2:" + s2);
		// System.out.println("-------------------");

		// �Ȼ�ȡһ���ַ������ٻ�ȡһ��intֵ
		// String s = sc.nextLine();
		// int a = sc.nextInt();
		// System.out.println("String:" + s + "\n" + "int:" + a);
		// System.out.println("-------------------");

		// �Ȼ�ȡһ��intֵ���ٻ�ȡһ���ַ���
		int a = sc.nextInt();
		String s = sc.nextLine();
		System.out.println("int:" + a + "\n" + "String:" + s);
	}
}
