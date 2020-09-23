package com.match.chainOfResp;

/**
 * 具体处理者(ConcreteHandler)角色--总经理
 * @author Match
 *
 */
public class GeneralManager extends Leader
{

	public GeneralManager(String name)
	{
		super(name);
	}

	@Override
	public void handleReauest(LeaveRequest request)
	{
		if(request.getLeaveDays()<30)
		{
			System.out.println("员工："+request.getEmpName()+"请假，天数："
		+request.getLeaveDays()+"理由："+request.getReason());
			System.out.println("总经理："+this.name+"审核通过！");
		}
		else
		{
			System.out.println("莫非员工："+request.getEmpName()+"想辞职，居然请假"
					+request.getLeaveDays()+"天！");
		}
	}

}
