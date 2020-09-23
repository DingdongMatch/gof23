package com.match.chainOfResp;

/**
 * 具体处理者(ConcreteHandler)角色--主任
 * @author Match
 *
 */
public class Director extends Leader
{

	public Director(String name)
	{
		super(name);
	}

	@Override
	public void handleReauest(LeaveRequest request)
	{
		if(request.getLeaveDays()<3)
		{
			System.out.println("员工："+request.getEmpName()+"请假，天数："
		+request.getLeaveDays()+"理由："+request.getReason());
			System.out.println("主任："+this.name+"审核通过！");
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
