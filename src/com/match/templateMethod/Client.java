package com.match.templateMethod;

public class Client
{

	public static void main(String[] args)
	{
		System.out.println("---采用子类继承父类方式---");
		BankTemplateMethod btm = new DrawMoney();
		btm.process();
		//采用匿名内部类
		System.out.println("---采用匿名内部类方式---");
		BankTemplateMethod btm2 = new BankTemplateMethod() 
		{

			@Override
			public void transact()
			{
				System.out.println("我要存钱！");
			}
			
		};
		btm2.process();
	}
}

class DrawMoney extends BankTemplateMethod
{

	@Override
	public void transact()
	{
		System.out.println("我要取款！");
	}
}
