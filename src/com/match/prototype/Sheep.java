package com.match.prototype;

import java.io.Serializable;
import java.util.Date;
/**
 * 浅复制
 * @author Match
 *
 */
public class Sheep implements Cloneable,Serializable
{
	private static final long serialVersionUID = 1L;
	private String sname;
	private Date brithday;
	
	public Sheep()
	{
	}

	public Sheep(String sname, Date brithday)
	{
		this.sname = sname;
		this.brithday = brithday;
	}

	@Override
	protected Sheep clone() throws CloneNotSupportedException
	{
		Sheep sheep = (Sheep) super.clone();//直接调用object对象的clone()方法
		return sheep;
	}
	
	public String getSname()
	{
		return sname;
	}

	public void setSname(String sname)
	{
		this.sname = sname;
	}

	public Date getBrithday()
	{
		return brithday;
	}

	public void setBrithday(Date brithday)
	{
		this.brithday = brithday;
	}	
}
