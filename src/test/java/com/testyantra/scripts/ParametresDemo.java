package com.testyantra.scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametresDemo {
	
	static {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shruthi\\Work\\chrome_new\\chromedriver.exe");	
		
	}

 @Test
 @Parameters({"username","password"})
 public void test(String un,String pwd) {
	 
	 WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	    driver.get("https://online.actitime.com/testy/login.do");
	    driver.findElement(By.id("username")).sendKeys(un);
	    driver.findElement(By.name("pwd")).sendKeys(pwd);	    
 
 }

}
