	package com.vitger.productpages;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class Createnewproductpages {
		@FindBy(name = "productname")
		private WebElement createproname;
		
		@FindBy(id="productcode")
		private WebElement partNumber;
		
		
		
		@FindBy(css = "input.crmbutton.small.save")
		private WebElement savebtn;
		
		public Createnewproductpages(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}

		public WebElement getCreateproname() {
			return createproname;
		}

		public WebElement getSavebtn() {
			return savebtn;
		}

		public WebElement getPartNumber() {
			return partNumber;
		}


		

		




		
		

	}



