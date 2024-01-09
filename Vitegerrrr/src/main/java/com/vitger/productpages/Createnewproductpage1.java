	package com.vitger.productpages;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class Createnewproductpage1 {
		@FindBy(name = "productname")
		private WebElement createproname;
		
		
		
		
		@FindBy(css = "input.crmbutton.small.save")
		private WebElement savebtn;
		
		public Createnewproductpage1(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}

		public WebElement getCreateproname() {
			return createproname;
		}

		public WebElement getSavebtn() {
			return savebtn;
		}

		
		}


		

		




		
		

	



