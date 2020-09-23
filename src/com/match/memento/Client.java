package com.match.memento;

public class Client
{

	public static void main(String[] args)
	{
		CareTaker taker = new CareTaker();
		Emp emp = new Emp("Match",18,1000000);
		System.out.println("原雇员信息："+emp.getEname()+"---"+emp.getAge()+"---"+emp.getSalary());
		System.out.println("***************备忘原雇员信息***************");
		taker.setMemento(emp.memento());//备忘一次
		System.out.println("***************修改原雇员信息***************");
		emp.setEname("Bob");
		emp.setAge(20);
		emp.setSalary(100000);
		System.out.println("修改后的雇员信息："+emp.getEname()+"---"+emp.getAge()+"---"+emp.getSalary());
		System.out.println("***************恢复为原有雇员信息************");
		emp.recovery(taker.getMemento());
		System.out.println("恢复后的雇员信息："+emp.getEname()+"---"+emp.getAge()+"---"+emp.getSalary());
	}

}
