package com.match.builder;
/**
 * Builder类负责构造组件
 * @author Match
 *
 */
public class AirShip_5Builder implements AirShipBuilder 
{
	//StringBuilder, 以后学习XML解析中，JDOM库中的类：DomBuilder,SaxBuilder
	@Override
	public Engine builderEngine()
	{
		System.out.println("建造发动机");
		return new Engine("神舟5号发动机");
	}
	@Override
	public EscapeTower builderEscapeTower()
	{
		
		System.out.println("建造逃逸塔");
		return new EscapeTower("神舟5号逃逸塔");
	}
	@Override
	public OrbitalModule builderOrbitalModule()
	{
		System.out.println("建造轨道舱");
		return new OrbitalModule("神舟5号轨道舱");
	}		
}
