package com.match.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;
/**
 * 原型模式（使用序列化和反序列化实现深复制）
 * @author Match
 *
 */
public class Client3
{

	public static void main(String[] args) throws Exception
	{
Date date = new Date(12312321331L);
		
		Sheep s1 = new Sheep("少利",date);
		//使用序列化和反序列化实现深复制
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		oos.writeObject(s1);
		byte[] bytes = bos.toByteArray();
		ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
		ObjectInputStream ois = new ObjectInputStream(bis);
		Sheep s2 = (Sheep) ois.readObject();//克隆好的对象。
		
		System.out.println(s1);
		System.out.println(s1.getSname());
		System.out.println(s1.getBrithday());
		
		date.setTime(2343242423L);
		System.out.println(s1.getBrithday());
		
		System.out.println("-----------------------------");
		
		s2.setSname("多利");
		System.out.println(s2);
		System.out.println(s2.getSname());
		System.out.println(s2.getBrithday());
		
	}

}
