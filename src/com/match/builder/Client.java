package com.match.builder;

public class Client
{
	public static void main(String[] args)
	{
		AirShipDirector director = new Airship_5Director(new AirShip_5Builder());
		AirShip ship = director.directAirShip();
		ship.launch();	
	}
}
