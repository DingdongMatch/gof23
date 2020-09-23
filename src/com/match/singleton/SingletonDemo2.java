package com.match.singleton;
/**
 * 单例模式：
 * 保证一个类只能产生一个对象
 * 测试懒汉式单例模式（线程安全，调用效率不高，但是可以延迟加载）
 * @author Match
 *
 */
public class SingletonDemo2
{
	//类初始化时，不初始化这个对象（延时加载，正真用的时候再创建）。
	private static SingletonDemo2 instance;
	private SingletonDemo2()
	{
	}
	//方法同步，调用效率低！
	public static synchronized SingletonDemo2 getInstance()
	{
		if(instance==null)
			instance = new SingletonDemo2(); 
		return instance;
	}
}
