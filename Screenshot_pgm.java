package com.SeleniumPgm;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot_pgm {
	
	public static void main(String[] args) throws IOException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Hi\\eclipse-workspace\\SelenProject\\Driver1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.navigate().to("https://www.youtube.com/");
		driver.manage().window().maximize();
		//Take Screen shot
		
		TakesScreenshot shot= (TakesScreenshot) driver;
		File source = shot.getScreenshotAs(OutputType.FILE);
	    File dest =new File("C:\\Users\\Hi\\eclipse-workspace\\SelenProject\\Screenshot\\snap1.png");
	    org.openqa.selenium.io.FileHandler.copy(source,dest);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
