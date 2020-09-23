package com.match.proxy.staticproxy;

public class Client
{
	public static void main(String[] args)
	{
		Star star = new RealStar();
		Star proxy = new Proxy(star);
		proxy.confer();
		proxy.signContract();
		proxy.bookTicket();
		proxy.sing();
		proxy.collectMoney();
	}
}
