package com.match.mediator;

public class Market implements Department
{
private Mediator m;  //持有中介者(总经理)的引用
	
	public Market(Mediator m)
	{
		super();
		this.m = m;
		m.register("market", this);
	}

	@Override
	public void outAction()
	{
		System.out.println("我是市场部：汇报工作，近来项目较多，需要资金支持！");
	}

	@Override
	public void selfAction()
	{
		System.out.println("我是市场部：专注接项目！");
	}
}
