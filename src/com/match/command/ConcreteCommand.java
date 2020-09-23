package com.match.command;

/**
 * ConcreteCommand具体命令类
 * @author Match
 *
 */
public class ConcreteCommand implements Command
{
	private Receiver receiver;//命令的正真执行者
	
	public ConcreteCommand(Receiver receiver)
	{
		super();
		this.receiver = receiver;
	}

	@Override
	public void execute()
	{
		//命令真正执行前或后，执行相关的处理！
		receiver.action();
	}
}
