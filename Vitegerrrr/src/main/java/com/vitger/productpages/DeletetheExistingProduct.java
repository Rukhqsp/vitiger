
	package com.vitger.productpages;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class DeletetheExistingProduct {
		@FindBy(id="alpha_12")
		private WebElement selectalpha;
		
		//@FindBy(id = "alpha_5")
		//private WebElement selectalpha;
		
		@FindBy(linkText = "Laptops")
		private WebElement productname;
		
		//@FindBy(xpath = "//span[text()='Electronics']")
		//private WebElement productname;
		
		@FindBy(css = "input.crmbutton.small.delete")
		private WebElement deletebtn;
		
		public DeletetheExistingProduct(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}


		public WebElement getSelectalpha() {
			return selectalpha;
		}


		public WebElement getProductname() {
			return productname;
		}


		public WebElement getDeletebtn() {
			return deletebtn;
		}


		public WebElement getAplhaletter() {
			// TODO Auto-generated method stub
			return null;
		}


		public WebElement getDuplipro() {
			// TODO Auto-generated method stub
			return null;
		}


			 public WebElement getSavedupli() {
			// TODO Auto-generated method stub
			return null;
		}
		
		
		

	}


