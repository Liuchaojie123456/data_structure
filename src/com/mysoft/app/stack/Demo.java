package com.mysoft.app.stack;

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
		
		MyArrayStack mas = new MyArrayStack(3);
		
		mas.push("AAA");
		mas.push("BBB");
		mas.push("CCC");
		mas.push("DDD");
		mas.push("EEE");
		
		System.out.println("元素的个数" + mas.length());
		System.out.println("栈顶元素是" + mas.top());
		
		// 出栈
		while(!mas.isEmpty()){
			System.out.println(mas.pop());
		}
		
		System.out.println("出栈后栈是否为空"+mas.isEmpty());
	}
	
}
