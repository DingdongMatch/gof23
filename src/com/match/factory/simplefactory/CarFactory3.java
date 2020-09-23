package com.match.factory.simplefactory;
/**
 * 简单工厂类（反射）
 * @author Match
 *
 */
public class CarFactory3
{
	public static Car createCar(Class<? extends Car> cls)
	{
		Car car = null;
		try
		{
			car = (Car) Class.forName(cls.getName()).newInstance();
		} catch (InstantiationException e)
		{
			e.printStackTrace();
		} catch (IllegalAccessException e)
		{
			e.printStackTrace();
		} catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		return car;
	}
}
