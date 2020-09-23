package com.match.state;

/**
 * 已预订状态
 * @author Match
 *
 */
public class BookedState implements State
{

	@Override
	public void handle()
	{
		System.out.println("房间已预订!!!此房间不能预订！");
	}

}
