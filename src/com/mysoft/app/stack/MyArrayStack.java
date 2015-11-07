package com.mysoft.app.stack;

/**
 * ==========================================
 * 描述：底层采用数组的方式实现栈
 * ------------------------------------------
 * @author lnsoftware
 * ------------------------------------------
 * @date 2015年11月7日
 * ==========================================
 */
public class MyArrayStack implements MyStack<String> {

	// 数据数组
	private String[] arr;
	
	// 元素的大小
	private int size;
	
	public MyArrayStack(){
		arr = new String[50];
		size = 0;
	}
	
	public MyArrayStack(int size){
		if(size < 0){
			throw new RuntimeException("元素个数不能小于0");
		}
		arr = new String[size];
		size = 0;
	}
	
	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public int length() {
		return size;
	}

	@Override
	public String top() {
		if(isEmpty()){
			throw new RuntimeException("栈为空");
		}
		return arr[size-1];
	}

	@Override
	public boolean push(String data) {
		if(size >= arr.length){
			resize();
		}
		arr[size] = data;
		size++;
		return true;
	}

	@Override
	public String pop() {
		if(isEmpty()){
			throw new RuntimeException("栈为空");
		}
		String data = arr[size-1];
		size--;
		return data;
	}
	
	@Override
	public void clear() {
		// 元素置空,方便GC回收
		for(int i=0; i<size; i++){
			arr[i] = null;
		}
		// 长度置空
		size = 0;
	}
	
	/**
	 * 数组扩容
	 */
	private void resize(){
		String[] tmp = new String[arr.length * 2];
		for(int i=0; i<arr.length; i++){
			tmp[i] = arr[i];
		}
		arr =  tmp;
	}

}
