package com.match.strategy;

public class Client
{

	public static void main(String[] args)
	{
		Context ctx = new Context(new OldCustomerManyStrategy());
		ctx.printPrice(1000);
	}

}
