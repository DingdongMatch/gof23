package com.match.prototype;

import java.util.Date;
/**
 * 深复制
 * @author Match
 *
 */
public class Sheep2 implements Cloneable
{
	private String sname;
	private Date brithday;
	
	public Sheep2()
	{
	}

	public Sheep2(String sname, Date brithday)
	{
		this.sname = sname;
		this.brithday = brithday;
	}

	@Override
	protected Sheep2 clone() throws CloneNotSupportedException
	{
		Sheep2 s = (Sheep2) super.clone();//直接调用object对象的clone()方法
		//添加如下代码实现深复制（deep clone）
		s.brithday = (Date) brithday.clone();
		return s;
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
