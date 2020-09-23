package com.match.bridge;
/**
 * 电脑类型的维度
 * @author Match
 *
 */
public class Computer
{
	protected Brand brand;
	public Computer(Brand brand)
	{
		this.brand = brand;
	}
	
	public void sale()
	{
		brand.sale();
	}
}
