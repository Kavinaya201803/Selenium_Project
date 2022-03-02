package com.SeleniumPgm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Pgm {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Hi\\eclipse-workspace\\SelenProject\\Driver1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
		//driver.findElement(By.name("email")).sendKeys("9790542483");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("createAccountSubmit")).click();
		
		driver.findElement(By.name("customerName")).sendKeys("ArunaSiva");
		driver.findElement(By.id("ap_phone_number")).sendKeys("9790542483");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("kavinaya0306@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("aruna@1234");
		
		driver.findElement(By.id("continue")).click();
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
