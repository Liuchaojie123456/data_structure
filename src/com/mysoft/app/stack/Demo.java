package com.mysoft.app.stack;

import java.util.Scanner;

/**
 * ==========================================
 * 描述：栈的操作演示
 * ------------------------------------------
 * @author lnsoftware
 * ------------------------------------------
 * @date 2015年11月7日
 * ==========================================
 */
public class Demo {

	public static void main(String[] args) {
		
		MyArrayStack mas = new MyArrayStack(5);

		System.out.println("请输入String类型的字符串");
		Scanner s = new Scanner(System.in);
		while(true){
			String str = s.nextLine();
			if(!str.equals("exit")){
				mas.push(str);
			} else {
				break;
			}
		}
		
		System.out.println("元素的个数" + mas.length());
		System.out.println("栈顶元素是" + mas.top());

		// 清空栈
		System.out.println("是否开始清空栈？");
		s = new Scanner(System.in);
		if(s.nextLine().equals("yes")){
			mas.clear();
			System.out.println("元素的个数" + mas.length());
		}
		
		// 出栈操作
		System.out.println("是否开始出栈？");
		s = new Scanner(System.in);
		if(s.nextLine().equals("yes")){
			while(!mas.isEmpty()){
				System.out.println(mas.pop());
			}
			System.out.println("出栈后栈是否为空"+mas.isEmpty());
		}
		
		/********************** 数组扩容 *******************
		// 原数组
		String []arr = new String[3];
		arr[0] = "a";
		arr[1] = "b";
		arr[2] = "c";
		
		// 扩展后的数组(原来长度的2倍)
		String []extendedArr = new String[arr.length * 2];
		for(int i=0; i<arr.length; i++){
			extendedArr[i] = arr[i];
			// 置空原来的元素
			arr[i] = null;
		}
		// 把扩容后的数组付给原来的数组
		arr = extendedArr;
		arr[3] = "d";
		
		// 打印数组
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		********************** 数组扩容 *******************/
	}
	
}
