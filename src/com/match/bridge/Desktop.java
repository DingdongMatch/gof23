package com.match.bridge;
/**
 * 台式机
 * @author Match
 *
 */
public class Desktop extends Computer
{

	public Desktop(Brand b)
	{
		super(b);
	}
	
	@Override
	public void sale()
	{
		super.sale();
		System.out.println("台式机");
	}
}
