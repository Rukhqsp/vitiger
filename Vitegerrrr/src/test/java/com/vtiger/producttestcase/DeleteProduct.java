
	package com.vtiger.producttestcase;

	import org.testng.annotations.Test;
	import org.testng.annotations.Test;
	import com.vitger.productpages.DeletetheExistingProduct;
import com.vtiger.driver.Driver;
import com.vtiger.genericlib.BaseClass;
import com.vtiger.genericlib.WebDriverUtility;
import com.vtiger.homepage.Homepage;
public class DeleteProduct extends BaseClass{
	@Test
	public void m3() throws Throwable
	{
		wu=new WebDriverUtility();
		de=new DeletetheExistingProduct(Driver.getdriver());
		hp=new Homepage(Driver.getdriver());
		hp.getProductsbtn().click();
		de.getSelectalpha().click();
		Thread.sleep(1000);
		de.getProductname().click();
		Thread.sleep(3000);
		de.getDeletebtn().click();
		wu.acceptalert(Driver.getdriver());
	}
}