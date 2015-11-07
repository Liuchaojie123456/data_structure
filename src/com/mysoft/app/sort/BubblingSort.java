package com.mysoft.app.sort;

/**
 * ==========================================
 * 描述：冒泡排序
 * ------------------------------------------
 * @author lnsoftware
 * ------------------------------------------
 * @date 2015年11月7日
 * ==========================================
 */
public class BubblingSort {

	public void sort(long []arr){
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if(arr[j] > arr[j + 1]){
					long tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;
				}
				print(arr);
			}
		}
	}
	
	/**
	 * 打印输出
	 */
	public void print(long []arr){
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		BubblingSort bs = new BubblingSort();
		long arr[] = {7, 5, 4, 3};
		bs.sort(arr);
	}
	
}
