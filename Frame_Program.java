package com.SeleniumPgm;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_Program {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Hi\\eclipse-workspace\\SelenProject\\Driver1\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		
	driver.get("http://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		//size ()---->return the size or length 
        int size = driver.findElements(By.tagName("iframe")).size();
        System.out.println(size);
		
		
		// single frame

		// switch by id
		
		driver.switchTo().frame(0);

		WebElement input = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		input.sendKeys("single frame");
	
		driver.switchTo().defaultContent();	// frame to driver switch the normal page
		WebElement iframeto = driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']"));
		iframeto.click();
		
		WebElement outer = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(outer);
		driver.switchTo().frame(0);


		WebElement input2 = driver.findElement(By.xpath("(//iframe[@src='SingleFrame.html'])[2]"));
	
		input2.sendKeys("multiple frames");
	}

}
