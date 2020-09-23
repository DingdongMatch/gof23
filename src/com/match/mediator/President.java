package com.match.mediator;

import java.util.HashMap;
import java.util.Map;

/**
 * 具体中介者对象
 * @author Match
 *
 */
public class President implements Mediator
{
private Map<String,Department> map = new HashMap<String , Department>();
	
	@Override
	public void register(String dname, Department d) 
	{
		map.put(dname, d);
	}
	
	/**
	 * 接受各个部门的信息--各个部门汇报工作
	 */
	@Override
	public void receive(String dname)
	{
		map.get(dname).outAction();	
	}
	
	/**
	 *下达命令给相关的部门 
	 */
	@Override
	public void command(String dname)
	{
		map.get(dname).selfAction();	
	}
}
