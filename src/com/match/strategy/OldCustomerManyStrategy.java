package com.match.strategy;

/**
 * 老顾客大批量
 * @author Match
 *
 */
public class OldCustomerManyStrategy implements Strategy
{

	@Override
	public double getPrice(double standardPrice)
	{
		System.out.println("打八折");
		return standardPrice*0.8;
	}

}
