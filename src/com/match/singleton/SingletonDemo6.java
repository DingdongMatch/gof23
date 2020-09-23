package com.match.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * 单例模式：
 * 保证一个类只能产生一个对象
 * 测试懒汉式单例模式（线程安全，调用效率不高，但是可以延迟加载），如何防止反射和反序列化漏洞。
 * @author Match
 *
 */
public class SingletonDemo6 implements Serializable
{
	private static final long serialVersionUID = 1L;
	//类初始化时，不初始化这个对象（延时加载，正真用的时候再创建）。
	private static SingletonDemo6 instance;
	private SingletonDemo6()//私有化构造器
	{
		//防止反射
		if(instance!=null)
		{
			throw new RuntimeException();
		}
	}
	//方法同步，调用效率低！
	public static synchronized SingletonDemo6 getInstance()
	{
		if(instance==null)
			instance = new SingletonDemo6(); 
		return instance;
	}
	//反序列化时，如果定义了readResolve()则直接返回此方法指定的对象。而不需要单独再创建新对象
	private Object readResolve() throws ObjectStreamException
	{
		return instance;
	}
}
