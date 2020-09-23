package com.match.observer2;

import java.util.Observable;

/**
 * 被观察者（目标对象）
 * @author Match
 *
 */
public class ConcreteSubject extends Observable
{
	private int state;
	
	public void set(int s)
	{
		state = s;//目标对象的状态发生了改变
		setChanged();//表示目标对象已经做了更改
		notifyObservers(state);//通知所有观察者
	}

	public int getState()
	{
		return state;
	}

	public void setState(int state)
	{
		this.state = state;
	}	
}
