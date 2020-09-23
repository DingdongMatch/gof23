package com.match.bridge;
/**
 * 笔记本
 * @author Match
 *
 */
public class Laptop extends Computer
{
	
	public Laptop(Brand b)
	{
		super(b);
	}
	
	@Override
	public void sale() 
	{
		super.sale();
		System.out.println("笔记本");
	}
}
