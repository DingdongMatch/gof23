package com.match.observer;

/**
 * 具体被观察者
 * @author Match
 *
 */
public class ConcreteSubject extends Subject
{
	private int state;
	
	public int getState()
	{
		return state;
	}
	
	public void setState(int state)
	{
		this.state = state;
		//被观察对象（目标对象）值发生了变化，通知所有的观察者
		this.notifyAllObservers();
	}
}
