package com.match.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象被观察者
 * @author Match
 *
 */
public class Subject
{
	protected List<Observer> list = new ArrayList<Observer>();
	
	public void registerObserver(Observer obs)
	{
		list.add(obs);
	}
	
	public void removeObserver(Observer obs)
	{
		list.remove(obs);
	}
	/**
	 * 通知所有观察者更新状态
	 */
	public void notifyAllObservers()
	{
		for(Observer obs:list)
		{
			obs.update(this);
		}
	}
}
