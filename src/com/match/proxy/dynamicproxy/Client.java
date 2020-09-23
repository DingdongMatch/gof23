package com.match.proxy.dynamicproxy;

import java.lang.reflect.Proxy;

public class Client
{
	public static void main(String[] args)
	{
		RealStar star = new RealStar();
		StarHandler handler = new StarHandler(star);
		Star proxy = (Star)Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[] {Star.class}, handler);
		proxy.sing();
	}
}
