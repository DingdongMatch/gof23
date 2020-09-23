package com.match.strategy;

/**
 * 老顾客小批量
 * @author Match
 *
 */
public class OldCustomerFewStrategy implements Strategy
{

	@Override
	public double getPrice(double standardPrice)
	{
		System.out.println("打八五折");
		return standardPrice*0.85;
	}

}
