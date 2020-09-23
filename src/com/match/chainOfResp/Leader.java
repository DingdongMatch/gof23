package com.match.chainOfResp;

/**
 * 抽象处理者(Handler)角色--领导
 * @author Match
 *
 */
public abstract class Leader
{
	protected String name;//领导姓名
	protected Leader nextLeader;//责任链的后继对象
	
	public Leader(String name)
	{
		super();
		this.name = name;
	}

	/**
	 * 设定责任链上的后继对象
	 * @param nextLeader
	 */
	public void setNextLeader(Leader nextLeader)
	{
		this.nextLeader = nextLeader;
	}

	/**
	 * 处理请求核心的业务方法
	 * @param request
	 */
	public abstract void handleReauest(LeaveRequest request);
}
