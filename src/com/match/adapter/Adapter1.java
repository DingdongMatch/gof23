package com.match.adapter;
/**
 * 适配器类(类适配器方式)
 * 相当于USB和PS/2的转接器
 * @author Match
 *
 */
public class Adapter1 extends Adaptee implements Target
{
	@Override
	public void handleReq()
	{
		super.request();
	}
}
