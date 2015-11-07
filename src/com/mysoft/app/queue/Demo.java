package com.mysoft.app.queue;

import java.util.Scanner;

/**
 * ==========================================
 * 描述：队列的操作演示
 * ------------------------------------------
 * @author lnsoftware
 * ------------------------------------------
 * @date 2015年11月7日
 * ==========================================
 */
public class Demo {

	public static void main(String[] args) {
		
		MyArrayQueue maq = new MyArrayQueue(5);
		System.out.println("请输入String字符串");
		
		Scanner s = new Scanner(System.in);
		String str = "";
		while(!(str = s.nextLine()).equals("exit")){
			maq.insert(str);
		}
		
		System.out.println("队列长度=" + maq.length());
		System.out.println("对头元素=" + maq.head());
		
		System.out.println("是否清空队列？");
		s = new Scanner(System.in);
		if(s.nextLine().equals("yes")){
			maq.clear();
		}
			
		System.out.println("是否出队操作？");
		s = new Scanner(System.in);
		if(s.nextLine().equals("yes")){
			while(!maq.isEmpty()){
				System.out.println(maq.remove());
			}
		}
	}
}
