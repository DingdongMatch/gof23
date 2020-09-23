package com.match.adapter;
/**
 * 客户端类
 * 相当于例子中的笔记本，只有USB接口
 * @author Match
 *
 */
public class Client
{
	public void usbIO(Target usb)
	{
		usb.handleReq();
	}
	
	public static void main(String[] args)
	{
		Client c = new Client();
		System.out.println("测试适配器一:");
		Target usb1 = new Adapter1();
		c.usbIO(usb1);
		
		System.out.println("--------------------");
		
		System.out.println("测试适配器二:");
		Adaptee ps_2Key = new Adaptee();
		Target usb2 = new Adapter2(ps_2Key);
		c.usbIO(usb2);
	}	
}
