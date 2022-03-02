package com.SeleniumPgm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Mulitple_Dropdownpgm {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Hi\\eclipse-workspace\\SelenProject\\Driver1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement multidropdown = driver.findElement(By.xpath("//select[@name='selenium_commands']"));
		Select s= new Select(multidropdown);
	
		s.selectByIndex(1);
		Thread.sleep(1000);
		s.selectByValue("Browser Command");
		s.selectByVisibleText("Wait Commands");
		Thread.sleep(2000);
		
		
	
		
		
		
		
	}

}
