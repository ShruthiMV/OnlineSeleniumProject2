package com.testyantra.scripts;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MenuItems {
	
		
		static {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shruthi\\Work\\chrome_new\\chromedriver.exe");
			
		}
		
	@Test
	public void tc_verifyMenuItems() throws InterruptedException, IOException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	    driver.get("https://www.urbanladder.com/");
		driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();
	   
		WebElement w=driver.findElement(By.xpath("//span[@class='topnav_itemname'][contains(text(),'Living')]"));
		Actions act=new Actions(driver);
		act.moveToElement(w).perform();
		
		List<WebElement> menuItems=driver.findElements(By.xpath("//li[@class='topnav_item livingunit']//div//div//ul[@class='inline-list left']//li[@class='sublist_item']//div//a"));
		
		/* File scrFile=((org.openqa.selenium.TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  FileUtils.copyFile(scrFile, new File("C:\\Users\\Shruthi\\Work\\a2.png"));
		  System.out.println("screenshot taken"); */
		
		
		List<String> menuItemsExpected=Arrays.asList("Sofa Set","Sofa cum Bed","Chairs","Tables","Storage","Balcony & Outdoor");
		List<String> menuItemsActual = new ArrayList<String>();
		
		for(WebElement menuItem:menuItems) {
			
		     menuItemsActual.add(menuItem.getText());
		
		}
	
		
		Assert.assertEquals(menuItemsActual, menuItemsExpected);
		Reporter.log("Verifying the menu Items");
		Thread.sleep(3000);
		Reporter.log("Closing the browser"); 
		
		
		
			
		
	}
}
