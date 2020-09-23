package com.match.chainOfResp;

/**
 * 具体处理者(ConcreteHandler)角色--经理
 * @author Match
 *
 */
public class Manager extends Leader
{

	public Manager(String name)
	{
		super(name);
	}

	@Override
	public void handleReauest(LeaveRequest request)
	{
		if(request.getLeaveDays()<10)
		{
			System.out.println("员工："+request.getEmpName()+"请假，天数："
		+request.getLeaveDays()+"理由："+request.getReason());
			System.out.println("经理："+this.name+"审核通过！");
		}
		else
		{
			if(this.nextLeader!=null)
			{
				this.nextLeader.handleReauest(request);
			}
		}
	}

}
