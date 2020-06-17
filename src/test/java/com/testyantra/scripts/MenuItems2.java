package com.testyantra.scripts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MenuItems2 {
	
		
		static {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shruthi\\Work\\chrome_new\\chromedriver.exe");
			
		}
		
	@Test
	public void tc_verifyMenuItems2() throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	    driver.get("https://www.urbanladder.com/");
		driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();
		
		List<WebElement> menuItems=driver.findElements(By.xpath("//ul[@class='topnav bodytext']//li/span"));
		
		List<String> menuItemsExpected=Arrays.asList("Sale","Living","Bedroom","Dining","Storage","Study","Mattresses","Decor","New","Collections");
		List<String> menuItemsActual = new ArrayList<String>();
		
		for(WebElement menuItem:menuItems) {
			
		     menuItemsActual.add(menuItem.getText());
		
		}
		System.out.println(menuItemsActual);
		
		Assert.assertEquals(menuItemsActual, menuItemsExpected);
		Reporter.log("Verifying the menu Items");
		Thread.sleep(3000);
		Reporter.log("Closing the browser");
		
		
		
		System.out.println("ok");	
		
	}

}
