package cn.itcast_02;

import java.util.Scanner;

/**
 * 12.02 Scanner���hasNextXxx()��nextXxx()�����Ľ���
 * 
 * Scanner��ĳ�Ա������
 * 		hsaNextxx() �ж��Ƿ�����һ�����������Xxx����Int��Double�ȡ������Ҫ�ж��Ƿ������һ���ַ����������ʡ��Xxx��
 * 		NextXxx() ��ȡ��һ�������Xxx�ĺ�����ϸ������е�Xxx��ͬ��
 * 		Ĭ������£�Scannerʹ�ÿո񣬻س�����Ϊ�ָ���
 * 
 * 		������ʽ��	public boolean hasNextXxx():�ж��Ƿ���ĳ�����͵�Ԫ��
 * 				public Xxx nextXxx():��ȡ��Ԫ�ء�
 * 		���÷���(��int���͵ķ�������)��
 * 				public int nextInt()
 * 				public String nextLine()
 * 		ע��:InputMismatchException:����ĺ�����Ҫ�Ĳ�һ��
 */

public class ScannerDemo {
	public static void main(String[] args) {
		// ��������¼�����
		Scanner sc = new Scanner(System.in);
		// ��ȡ����¼������
		if(sc.hasNextLine()) {
			String s = sc.nextLine();
			System.out.println("s:" + s);
		}else {
			System.out.println("���������������������Ҫ����String���͵�����");
		}
	}
}
