package com.match.observer;

/**
 * 具体观察者
 * @author Match
 *
 */
public class ObserverA implements Observer
{
	private int myState;//myState需要跟被观察对象（目标对象）的state值保持一致！
	
	@Override
	public void update(Subject subject)
	{
		myState = ((ConcreteSubject)subject).getState();
	}

	public int getMyState()
	{
		return myState;
	}

	public void setMyState(int myState)
	{
		this.myState = myState;
	}
}
