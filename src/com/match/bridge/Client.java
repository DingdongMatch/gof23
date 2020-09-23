package com.match.bridge;

public class Client
{
	public static void main(String[] args)
	{
		//销售联想笔记本电脑
		Computer c1 = new Laptop(new Lenovo());
		c1.sale();
		//销售戴尔台式电脑
		Computer c2 = new Desktop(new Dell());
		c2.sale();
	}
}
