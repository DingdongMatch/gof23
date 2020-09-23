package com.match.factory.abstractfactory;

public class Client
{
	public static void main(String[] args)
	{
		test2();
	}
	/**
	 * 测试生产高级车
	 */
	public static void test1()
	{
		CarFactory factory = new LuxuryCarFactory();
		Engine e = factory.createEngine();
		Seat s = factory.createSeat();
		Tyre t = factory.createTyre();
		e.run();
		e.start();
		s.message();
		t.revolve();
	}
	/**
	 * 测试生产低级车
	 */
	public static void test2()
	{
		CarFactory factory = new LowCarFactory();
		Engine e = factory.createEngine();
		Seat s = factory.createSeat();
		Tyre t = factory.createTyre();
		e.run();
		e.start();
		s.message();
		t.revolve();
	}
}
