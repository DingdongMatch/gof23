package com.match.proxy.staticproxy;

public class Proxy implements Star
{
	private Star star;
	
	public Proxy(Star star)
	{
		super();
		this.star = star;
	}
	
	@Override
	public void confer()
	{
		System.out.println("经纪人和某公司面谈");
	}
	
	@Override
	public void signContract() 
	{
		System.out.println("经纪人和某公司签合同");
	}
	
	@Override
	public void bookTicket()
	{
		System.out.println("经纪人订机票");
	}
	
	@Override
	public void sing()
	{
		star.sing();
	}
	
	@Override
	public void collectMoney() 
	{
		System.out.println("经纪人收取演出费用");
	}
}
