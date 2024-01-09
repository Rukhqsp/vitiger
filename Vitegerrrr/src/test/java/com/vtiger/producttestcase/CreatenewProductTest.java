package com.vtiger.producttestcase;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.vitger.productpages.Createnewproductpages;
import com.vitger.productpages.Productmodulepage;
import com.vtiger.driver.Driver;
import com.vtiger.genericlib.BaseClass;
import com.vtiger.genericlib.ExcelUtility;
import com.vtiger.genericlib.Iconstant;
import com.vtiger.genericlib.JavaUtility;
import com.vtiger.homepage.Homepage;

public class CreatenewProductTest extends BaseClass{
	@Test
	public void m1()
	{
		eu=new ExcelUtility();
		ju=new JavaUtility();
		pmp=new Productmodulepage(Driver.getdriver());
		cnp=new Createnewproductpages(Driver.getdriver());
		hp=new Homepage(Driver.getdriver());
		hp.getProductsbtn().click();
		pmp.getPlusbtn().click();
		String testdata=eu.FetchSingledatafromExcel(Iconstant.excelpath, "CreateProduct", 1, 4)+ju.generateRandom(1000);
		cnp.getCreateproname().sendKeys(testdata);
		cnp.getSavebtn().click();
	}

}
