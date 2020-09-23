package com.match.factory.simplefactory;
/**
 * 简单工厂类
 * @author Match
 *
 */
public class CarFactory2
{
	public static Car createAudi()
	{
		return new Audi();
	}
	public static Car createByd()
	{
		return new Byd();
	}
	public static Car createBenz()
	{
		return new Benz();
	}
}
