package com.match.adapter;
/**
 * 被适配的类
 * 相当于例子中的PS/2键盘
 * @author Match
 *
 */
public class Adaptee
{
	private String ps_2IO;
	
	public Adaptee()
	{
		this.ps_2IO = "PS/2键盘";
	}
	
	public void request()
	{
		System.out.println(ps_2IO);
	}
}
