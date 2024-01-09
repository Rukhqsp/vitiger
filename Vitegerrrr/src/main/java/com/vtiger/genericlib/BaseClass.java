package com.vtiger.genericlib;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


import com.vitger.productpages.Createnewproductpages;
import com.vitger.productpages.DeletetheExistingProduct;
import com.vitger.productpages.EditdetailsOfProduct;
import com.vitger.productpages.Editproductpage;
import com.vitger.productpages.Productmodulepage;
import com.vtiger.driver.Driver;
import com.vtiger.homepage.Homepage;
import com.vtiger.loginpages.LoginandLogoutpages;

public class BaseClass {
	protected static WebDriverUtility wu;
	protected static PropertyUtility pu;
	protected static JavaUtility ju;
	protected static ExcelUtility eu;
	protected static Createnewproductpages cnp;
	protected static Homepage hp;
	protected static DeletetheExistingProduct de;
    protected static Productmodulepage pmp;
    protected static EditdetailsOfProduct eop;
    protected static Editproductpage eep;
	LoginandLogoutpages lp;
	@BeforeSuite
	public void ConnectJDBC()
	{
		Reporter.log("JDBC Connected",true);
		
	}
	
	@BeforeClass
	public void setup() throws Throwable
	{
		Driver.setdriver();
		wu = new WebDriverUtility();
		pu= new PropertyUtility();
		wu.maximizeWindow(Driver.getdriver());
		wu.addImplicitlyWait(Driver.getdriver());
		wu.openApp(pu.fetchPropertyfile(Iconstant.VtigerLogin, "url"), Driver.driver);
	}
	@BeforeMethod
	public void login() throws Throwable 
	{
		pu= new PropertyUtility();
		lp=new LoginandLogoutpages(Driver.getdriver());
		lp.createloginpage();
		
		
	}
	
	@AfterMethod
	public void logout()
	{
		wu = new WebDriverUtility();
		lp=new LoginandLogoutpages(Driver.getdriver());
		lp.logoutVtiger();
		
		
	}
	@AfterClass
	public void tearup()
	{
		Driver.getdriver().quit();
	}

}
