package com.match.facade;

/**
 * 上海税务局
 * @author Match
 *
 */
public class ShangHaiTaxBureau implements TaxBureau
{
	@Override
	public void taxCertificate()
	{
		System.out.println("在上海税务局办理税务登记证。");
	}
}
