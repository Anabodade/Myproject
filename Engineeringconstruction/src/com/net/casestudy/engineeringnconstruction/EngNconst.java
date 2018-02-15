package com.net.casestudy.engineeringnconstruction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;


public class EngNconst {
	public static void main(String[] args) throws InterruptedException {
		
	//Invoking the browser
	System.setProperty("webdriver.chrome.driver",  System.getProperty("user.dir")+"\\src\\main\\resources\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.sword-activerisk.com/customers/case-studies/");
	System.out.println("Succesfully landed on the Case Studies Home page");
	
	//Accessing Engineering & Construction tab
	driver.findElement(By.xpath("//*[@id=\"ui-id-3\"]")).click();
	
	//Validating Engineering & Construction tab	
		if(driver.findElement(By.xpath("//*[@id=\"tabs-3\"]/div[2]/div[1]/h2")).isDisplayed())
		{
		System.out.println("Section header CrossRail is identified");	
		}
		else
		{
			System.out.println("Incorrect page displayed");	
		}
	
	//Verifying the "Learn More" button
	driver.findElement(By.xpath("//*[@id=\"tabs-3\"]/div[2]/div[1]/div/a[3]")).click();
	
	//Validating "Learn More" button
	
	   if(driver.findElement(By.xpath("//*[@id=\"internal-page-content\"]/div[1]/h2")).isDisplayed())
	   {
		   System.out.println("Learn More button is identified");	
	   }
	   else
	   {
		System.out.println("Incorrect page displayed");	
	   }
	   
	// Navigating back to Engineering & Construction tab
	   driver.get("http://www.sword-activerisk.com/customers/case-studies/");
	   driver.findElement(By.xpath("//*[@id=\"ui-id-3\"]")).click();
	   System.out.println("Back to Engineering & Construction tab");
	   
	//Verifying "Download Case Study" button
	   driver.findElement(By.xpath("//*[@id=\"tabs-3\"]/div[2]/div[1]/div/a[2]")).click();
	    System.out.println("Validated Download Case Study button");
	   
	//Closing the browser
	   driver.quit();
	   System.out.println("Browser is closed");
	
	}

}
