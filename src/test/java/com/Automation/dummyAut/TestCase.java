package com.Automation.dummyAut;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//this is a sample code file
public class TestCase {

	public static WebDriver webdriver;
	
	@BeforeMethod
	public void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "F:\\System Eclipse Projects\\SeleniumTest\\chromedriver.exe");
		webdriver = new ChromeDriver();
		webdriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@Test
	public static void Test1()
	{
		webdriver.get("https://www.google.co.in/");
		System.out.println("1 method");
	}
	
	@Test
	public static void Test2()
	{
		webdriver.get("https://www.google.co.in/");
		System.out.println("2 method");
	}
	
	//@Test
	public static void Test3()
	{
		webdriver.get("www.google.co.in");
		System.out.println("3 method");
	}
	
	@AfterMethod
	public static void Close()
	{
		webdriver.close();
	}
}
