package com.match.mediator;

/**
 * 抽象中介者
 * @author Match
 *
 */
public interface Mediator
{
	void register(String dname,Department d);
	void receive(String dname);
	void command(String dname);
}
