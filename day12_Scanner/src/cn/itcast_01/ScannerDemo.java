package cn.itcast_01;

import java.util.Scanner;

/**
 * 12.01_Scanner�ĸ����͹��췽�� Scanner�����ڽ��ռ���¼������
 * 
 * ���裺 A:���� B:�������� C:���÷���
 * 
 * System������һ����̬���ֶΣ� public static final InputStream in; 
 * 		��׼������������Ӧ�ż���¼��
 * 		InputStream is = System.in
 * 
 * ���췽����Scanner(InputStream source) public class ScannerDemo { }
 */

public class ScannerDemo {
	public static void main(String[] args) {
		// ��������¼�����
		Scanner sc = new Scanner(System.in);
		// ��ȡ����¼����Ϣ
		int x = sc.nextInt();
		System.out.println("x:" + x);
	}
}
