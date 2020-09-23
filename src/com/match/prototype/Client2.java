package com.match.prototype;

import java.util.Date;
/**
 * 测试原型模式（浅克隆）
 * @author Match
 *
 */
public class Client2
{
	public static void main(String[] args) throws Exception
	{
		Date date = new Date(12312321331L);
		
		Sheep2 s1 = new Sheep2("少利",date);
		Sheep2 s2 = s1.clone();
		
		System.out.println("原型羊对象："+s1);
		System.out.println("原型羊的名字："+s1.getSname());
		System.out.println("原型羊的生日："+s1.getBrithday());
		System.out.println("-----------------------------—-------------------");
		System.out.println("修改原型羊的生日：");
		date.setTime(2343242423L);
		System.out.println("修改后原型羊的生日："+s1.getBrithday());		
		System.out.println("-----------------------------—-------------------");		
		s2.setSname("多利");
		System.out.println("克隆羊对象："+s2);
		System.out.println("克隆羊的名字："+s2.getSname());
		System.out.println("克隆羊的生日："+s2.getBrithday());	
	}
}
