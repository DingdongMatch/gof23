package com.match.singleton;
/**
 * 单例模式：
 * 保证一个类只能产生一个对象
 * 测试饿汉式单例模式(线程安全，调用效率高，但是不可以延迟加载)
 * @author Match
 *
 */
public class SingletonDemo1
{
	//类初始化时，立即加载这个对象（没有延时加载的优势）。加载类时，天然的是线程安全的！
	private static SingletonDemo1 instance = new SingletonDemo1();
	private SingletonDemo1()
	{
	}
	//调用效率高！
	public static SingletonDemo1 getInstance()
	{
		return instance;
	}
}
