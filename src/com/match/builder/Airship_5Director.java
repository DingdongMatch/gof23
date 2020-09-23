package com.match.builder;
/**
 * Director类负责装配生产成品
 * @author Match
 *
 */
public class Airship_5Director implements AirShipDirector
{
	private AirShipBuilder builder;

	public Airship_5Director(AirShipBuilder builder)
	{
		this.builder = builder;
	}
	@Override
	public AirShip directAirShip()
	{
		Engine e = builder.builderEngine();
		OrbitalModule o = builder.builderOrbitalModule();
		EscapeTower et = builder.builderEscapeTower();
		//装配成飞船对象
		AirShip ship = new AirShip();
		System.out.println("装配"+e.getName());
		ship.setEngine(e);
		System.out.println("装配"+et.getName());
		ship.setEscapeTower(et);
		System.out.println("装配"+o.getName());
		ship.setOrbitalModule(o);
		return ship;
	}
}
