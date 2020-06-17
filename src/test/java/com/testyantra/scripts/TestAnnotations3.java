package com.testyantra.scripts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class TestAnnotations3 {
	
	@BeforeClass 
	public void beforeClassOne() {
	
		 System.out.println("Before Class Executed in Demo1");
	}

	@AfterClass
	public void afterClassOne() {
		
		 System.out.println("After Class Executed in Demo1");
	}
	
	
	}
