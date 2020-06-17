package com.testyantra.scripts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestAnnotations2  extends TestAnnotations3{
	
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class Executed in Demo2");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("After Class Executed in Demo2");
	}
	
	@Test
	public void tc_02() {
		
		System.out.println("Executed tc_02");
		
	}
	
}
