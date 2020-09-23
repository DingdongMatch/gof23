package com.match.facade;

/**
 * 办理注册公司流程的外观类
 * @author Match
 *
 */
public class RegisterFacade
{
	public void register()
	{
		ICB a = new ShangHaiICB();
		QIB b = new ShangHaiQIB();
		TaxBureau c  = new ShangHaiTaxBureau();
		Bank d = new ICBCBank();
		
		a.checkName();
		b.orgCodeCertificate();
		c.taxCertificate();
		d.openAccount();
	}
}
