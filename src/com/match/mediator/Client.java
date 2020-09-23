package com.match.mediator;

public class Client
{

	public static void main(String[] args) 
	{
		Mediator m = new President();
		
		new Market(m);
		new Development(m);
		new Finacial(m);
		
		m.receive("market");
		m.command("finacial");
		m.receive("development");
		m.command("finacial");
	}
}
