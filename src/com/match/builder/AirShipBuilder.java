package com.match.builder;
/**
 * Builder接口
 * @author Match
 *
 */
public interface AirShipBuilder
{
	//构建发动机
	Engine builderEngine();
	//构建轨道舱
	OrbitalModule builderOrbitalModule();
	//构建逃逸塔
	EscapeTower builderEscapeTower();
}
