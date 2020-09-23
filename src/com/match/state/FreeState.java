package com.match.state;

/**
 * 空闲状态
 * @author Match
 *
 */
public class FreeState implements State
{

	@Override
	public void handle()
	{
		System.out.println("房间空闲!!!没人住！");
	}

}
