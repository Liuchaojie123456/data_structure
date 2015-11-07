package com.mysoft.app.queue;

/**
 * ==========================================
 * 描述：Java队列的数组实现
 * ------------------------------------------
 * @author lnsoftware
 * ------------------------------------------
 * @date 2015年11月7日
 * ==========================================
 */
public class MyArrayQueue implements Queue<String> {

	// 数组元素
	private String[] arr;
	
	// 长度
	private int size;
	
	// 队头
	private int head;
	
	// 队尾
	private int tail;
	
	public MyArrayQueue() {
		arr = new String[50];
		size = 0;
		head = 0;
		tail = 0;
	}

	public MyArrayQueue(int size) {
		arr = new String[size];
		size = 0;
		head = 0;
		tail = 0;
	}
	
	/**
	 * 入队操作
	 */
	@Override
	public boolean insert(String data) {
		if(size >= arr.length){
			resize();
		}
		arr[tail] = data;
		tail++;
		size++;
		return true;
	}

	/**
	 * 扩容操作
	 */
	private void resize() {
		String []tmp = new String[arr.length * 2];
		for (int i = 0; i < arr.length; i++) {
			tmp[i] = arr[i];
			arr[i] = null;
		}
		arr = tmp;
	}

	/**
	 * 出队操作
	 */
	@Override
	public String remove() {
		if(isEmpty()){
			throw new RuntimeException("队列为空");
		}
		String data = arr[head];
		head++;
		size--;
		return data;
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public void clear() {
		for(int i=0; i<arr.length; i++){
			arr[i] = null;
		}
		size = 0;
		head = 0;
		tail = 0;
	}

	@Override
	public int length() {
		return size;
	}

	@Override
	public String head() {
		if(isEmpty()){
			throw new RuntimeException("队列为空");
		}
		String data = arr[head];
		return data;
	}
}
