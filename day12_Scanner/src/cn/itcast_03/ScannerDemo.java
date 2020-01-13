package cn.itcast_03;

import java.util.Scanner;

/*
 *	12.03_Scanner的概述和构造方法 Scanner：用于接收键盘录入数据
 *	常用的两个方法：
 *		public int nextInt():获取一个int类型的值
 *		public String nextLinr():获取一个String类型的值 
 *	出现了问题:
 *		先获取一个数值，再获取一个字符串，会出现字符串是空值
 *		通常用的Enter是两个操作加起来的：'\r'是回车，'\n'是换行，前者使光标到行首，后者使光标下移一格。
 *	如何解决：
 *		A:先获取一个书之后，再创建一个新的键盘录入对象获取字符串
 *		B:把所有的数据都先按照字符串获取，然后要什么，你就对应的转换成什么。
 */

public class ScannerDemo {
	public static void main(String[] args) {
		// 获取键盘录入对象
		Scanner sc = new Scanner(System.in);
		// 获取两个int类型的值
		// int a = sc.nextInt();
		// int b = sc.nextInt();
		// System.out.println("a:" + a + "b:" + b);
		// System.out.println("-------------------");

		// 获取两个String类型的值
		// String s1 = sc.nextLine();
		// String s2 = sc.nextLine();
		// System.out.println("s1:" + s1 +"\n"+ "s2:" + s2);
		// System.out.println("-------------------");

		// 先获取一个字符串，再获取一个int值
		// String s = sc.nextLine();
		// int a = sc.nextInt();
		// System.out.println("String:" + s + "\n" + "int:" + a);
		// System.out.println("-------------------");

		// 先获取一个int值，再获取一个字符串
		int a = sc.nextInt();
		String s = sc.nextLine();
		System.out.println("int:" + a + "\n" + "String:" + s);
	}
}
