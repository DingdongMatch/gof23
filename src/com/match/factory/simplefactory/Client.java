package com.match.factory.simplefactory;

public class Client
{
	public static void main(String[] args)
	{
		test1();
	}
	/**
	 * 测试CarFactory1
	 */
	public static void test1()
	{
		Car c1 = CarFactory1.createCar("Audi");
		Car c2 = CarFactory1.createCar("Byd");
		Car c3 = CarFactory1.createCar("Benz");
		c1.run();
		c2.run();
		c3.run();
	}
	/**
	 * 测试CarFactory2
	 */
	public static void test2()
	{
		Car c1 = CarFactory2.createAudi();
		Car c2 = CarFactory2.createByd();
		Car c3 = CarFactory2.createBenz();
		c1.run();
		c2.run();
		c3.run();
	}
	/**
	 * 测试CarFactory3
	 */
	public static void test3()
	{
		Car c1 = CarFactory3.createCar(Audi.class);
		Car c2 = CarFactory3.createCar(Byd.class);
		Car c3 = CarFactory3.createCar(Benz.class);
		c1.run();
		c2.run();
		c3.run();
	}	
}
