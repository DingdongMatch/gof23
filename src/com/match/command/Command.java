package com.match.command;

/**
 * Command抽象命令类
 * @author Match
 *
 */
public interface Command
{
	/**
	 * 这个方法返回结果为空的方法。
	 * 实际项目中，可以根据需求设计多个不同的方法
	 */
	void execute();
}
