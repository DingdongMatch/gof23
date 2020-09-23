package com.match.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class StarHandler implements InvocationHandler
{
	Star realStar;
	
	public StarHandler(Star realStar) {
		super();
		this.realStar = realStar;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		Object object = null;
	
		System.out.println("经纪人和某公司面谈");
		System.out.println("经纪人和某公司签合同");
		System.out.println("经纪人订机票");
		if(method.getName().equals("sing")){
			object = method.invoke(realStar, args);
		}
		System.out.println("经纪人收取演出费用");
		return object;
	}
}
