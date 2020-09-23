package com.match.memento;

/** 
 * Caretaker负责人类(管理者)
 * 负责管理备忘录对象
 * @author Match
 *
 */
public class CareTaker
{
	private EmpMemento memento;
//	private List<EmpMemento> list = new ArrayList<EmpMemento>();
	
	public EmpMemento getMemento()
	{
		return memento;
	}

	public void setMemento(EmpMemento memento)
	{
		this.memento = memento;
	}
	
}
