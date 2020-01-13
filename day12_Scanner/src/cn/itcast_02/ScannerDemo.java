package cn.itcast_02;

import java.util.Scanner;

/**
 * 12.02 Scanner类的hasNextXxx()和nextXxx()方法的讲解
 * 
 * Scanner类的成员方法：
 * 		hsaNextxx() 判断是否还有下一个数据项，其中Xxx可以Int，Double等。如果需要判断是否包含下一个字符串，则可以省略Xxx。
 * 		NextXxx() 获取下一个输入项，Xxx的含义和上个方法中的Xxx相同。
 * 		默认情况下，Scanner使用空格，回车等作为分隔符
 * 
 * 		基本格式：	public boolean hasNextXxx():判断是否是某种类型的元素
 * 				public Xxx nextXxx():获取该元素。
 * 		常用方法(以int类型的方法举例)：
 * 				public int nextInt()
 * 				public String nextLine()
 * 		注意:InputMismatchException:输入的和你想要的不一致
 */

public class ScannerDemo {
	public static void main(String[] args) {
		// 创建键盘录入对象
		Scanner sc = new Scanner(System.in);
		// 获取键盘录入数据
		if(sc.hasNextLine()) {
			String s = sc.nextLine();
			System.out.println("s:" + s);
		}else {
			System.out.println("你输入的数据有误，这里需要的是String类型的数据");
		}
	}
}
