package com.match.facade;

/**
 * 上海工商局
 * @author Match
 *
 */
public class ShangHaiICB implements ICB
{
	@Override
	public void checkName()
	{
		System.out.println("在上海工商局检查名字是否有冲突。");
	}
}
