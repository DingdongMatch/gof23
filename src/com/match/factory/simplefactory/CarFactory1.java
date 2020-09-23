package com.match.factory.simplefactory;
/**
 * 简单工厂类
 * @author Match
 *
 */
public class CarFactory1
{
	public static Car createCar(String Type)
	{
		if("Audi".equals(Type))
		{
			return new Audi();
		}
		else if("Byd".equals(Type))
		{
			return new Byd();
		}
		else if("Benz".equals(Type))
		{
			return new Benz();
		}
		else
		{
			return null;
		}
	}
}
