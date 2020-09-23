package com.match.factory.abstractfactory;

public interface CarFactory
{
	Engine createEngine();
	Seat createSeat();
	Tyre createTyre();
}
