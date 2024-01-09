
	package com.vtiger.driver;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class Driver {
		private Driver()
		{
			
		}
		
		
	public static WebDriver driver;
	static ThreadLocal<WebDriver> tr=new ThreadLocal<WebDriver>();
	public static WebDriver getdriver()
	{
		return tr.get();
	}
	public static void setdriver1(WebDriver driver)
	{
		tr.set(driver);
	}
	public static void setdriver()
	{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		setdriver1(driver);
	}
	}


