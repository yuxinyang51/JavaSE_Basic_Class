package cn.itcast_01;

import java.util.Scanner;

/**
 * 12.01_Scanner的概述和构造方法 Scanner：用于接收键盘录入数据
 * 
 * 步骤： A:导包 B:创建对象 C:调用方法
 * 
 * System类下有一个静态的字段： public static final InputStream in; 
 * 		标准的输入流，对应着键盘录入
 * 		InputStream is = System.in
 * 
 * 构造方法：Scanner(InputStream source) public class ScannerDemo { }
 */

public class ScannerDemo {
	public static void main(String[] args) {
		// 创建键盘录入对象
		Scanner sc = new Scanner(System.in);
		// 获取键盘录入信息
		int x = sc.nextInt();
		System.out.println("x:" + x);
	}
}
