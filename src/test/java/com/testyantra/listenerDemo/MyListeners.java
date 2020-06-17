package com.testyantra.listenerDemo;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class MyListeners implements ITestListener{

    public void onTestStart(ITestResult result) {
	
    	System.out.println("Test "+result.getName()+" Started");
	
   }
  
    public void onTestuccess(ITestResult result) {
    	
    	System.out.println("Test "+result.getName()+" Completed");
	
   }
    
    public void onTestFailure(ITestResult result) {
    	
    	System.out.println("Test "+result.getName()+" Failed");
	
   }
    
    public void onStart(ITestContext context) {
    	
    	System.out.println("Test suite Started");
	
   }
 public void onFinish(ITestContext context) {
    	
    	System.out.println("Test suite completed");
	
   } 
    
    

}
