package com.match.facade;

/**
 * 中国工商银行
 * @author Match
 *
 */
public class ICBCBank implements Bank 
{

	@Override
	public void openAccount()
	{
		System.out.println("在中国工商银行开户。");
	}
}
