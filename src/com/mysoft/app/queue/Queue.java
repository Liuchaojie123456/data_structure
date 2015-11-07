package com.mysoft.app.queue;

/**
 * ==========================================
 * 描述：Java实现的队列的操作接口
 * ------------------------------------------
 * @author lnsoftware
 * ------------------------------------------
 * @date 2015年11月7日
 * ==========================================
 */
public interface Queue<T> {

	/**
	 * 删除队列
	 */
	T remove();
	
	/**
	 * 插入操作
	 */
	boolean insert(T data);
	
	/**
	 * 队列是否为空
	 */
	boolean isEmpty();
	
	/**
	 * 清空队列
	 */
	void clear();
	
	/**
	 * 队列元素个数
	 */
	int length();
	
	/**
	 * 返回对头元素
	 */
	T head();
}
