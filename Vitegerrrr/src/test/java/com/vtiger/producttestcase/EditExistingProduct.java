package com.vtiger.producttestcase;


	

	import org.testng.annotations.Test;
	import org.testng.annotations.Test;

import com.vitger.productpages.Createnewproductpages;
import com.vitger.productpages.EditdetailsOfProduct;
import com.vitger.productpages.Productmodulepage;
import com.vtiger.driver.Driver;
	import com.vtiger.genericlib.BaseClass;
	import com.vtiger.genericlib.ExcelUtility;
import com.vtiger.genericlib.Iconstant;
import com.vtiger.genericlib.JavaUtility;
import com.vtiger.homepage.Homepage;

	public class EditExistingProduct extends BaseClass {
		@Test(groups = "RegressionSuite")
		public void m9()
		{
			    eu= new ExcelUtility();
			    ju= new JavaUtility();
			    eep = new com.vitger.productpages.Editproductpage(Driver.driver);
			    eop= new EditdetailsOfProduct(Driver.driver);
				cnp = new Createnewproductpages(Driver.driver);
				pmp= new Productmodulepage(Driver.driver);
				hp = new Homepage(Driver.driver);
				hp.getProductsbtn().click();
				eep.getEditbtn().click();
				eop.getProducttextbox().clear();
				eop.getProducttextbox().sendKeys(eu.FetchSingledatafromExcel(Iconstant.excelpath,"Sheet1", 1, 3));
				eop.getSavebtn().click();
				
		}

	}



