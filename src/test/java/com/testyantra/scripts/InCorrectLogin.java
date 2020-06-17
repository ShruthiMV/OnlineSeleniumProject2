package com.testyantra.scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class InCorrectLogin {

	static {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shruthi\\Work\\chrome_new\\chromedriver.exe");	
			
		}

	 @Test
	 
	 public void test() {
		 
		 WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
		    driver.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F%3Ftab%3Dwm%26ogbl&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=AddSession");
		    driver.findElement(By.id("identifierId")).sendKeys("abcde");
		    driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		    WebElement we=driver.findElement(By.xpath("//div[@class='o6cuMc']"));
		    String a=we.getText();
	        System.out.println(a);
	
}
}