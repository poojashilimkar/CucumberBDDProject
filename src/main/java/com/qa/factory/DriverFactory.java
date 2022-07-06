package com.qa.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	public WebDriver driver;
	public static ThreadLocal<WebDriver> tlDriver=new ThreadLocal<WebDriver>();
	public WebDriver init_driver(String browser) {
		System.out.println("browser name is ="+browser);
		
		if (browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","/Users/pooja.shilimkar/eclipse-workspace/CucumberPractice/Drivers/chromedriver");
			driver=new ChromeDriver();
			
		//	WebDriverManager.chromedriver().setup();
			tlDriver.set(driver);
		}
		else if (browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			tlDriver.set(new FirefoxDriver());
		}
		else if (browser.equals("safari")) {
			
			tlDriver.set(new SafariDriver());
		}
		else {
			System.out.println("please pass correct browser value="+ browser);
		}
			
		getDriver().manage().deleteAllCookies();
		getDriver().manage().window().maximize();
		return getDriver();
	}
	
	public static synchronized  WebDriver getDriver()
	{
		return tlDriver.get();
	}
	

}
