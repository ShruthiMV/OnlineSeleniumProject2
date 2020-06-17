package com.testyantra.scripts;


import java.io.*;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.reporters.Files;


public class TakesScreenshot {
static {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shruthi\\Work\\chrome_new\\chromedriver.exe");
		}
	
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://commons.apache.org/proper/commons-io/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 File scrFile=((org.openqa.selenium.TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(scrFile, new File("C:\\Users\\Shruthi\\Work\\ssccvvc.png"));
      

	}
}