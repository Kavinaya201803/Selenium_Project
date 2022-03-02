package com.SeleniumPgm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook extends BaseClass_Program {
public static void main(String[] args) throws Throwable {
	
	System.setProperty("Webdriver.chrome.driver",
			"C:\\Users\\Hi\\eclipse-workspace\\SelenProject\\Driver1\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	
	WebElement gettext = driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps')]"));
    getValues(gettext);

    
	
	WebElement email = driver.findElement(By.id("email"));
	//input
	inputValues(email,"username");
	Thread.sleep(3000);
	
	WebElement password = driver.findElement(By.name("pass"));
	//input
	inputValues(password,"123456789");
	Thread.sleep(3000);
	
	//WebElement login = driver.findElement(By.xpath("//button[@type='submit'] "));
	//click
	//clickOnElement(login);
	//Thread.sleep(3000);
	
    //select option
	WebElement create = driver.findElement(By.xpath("//a[contains(text(),'Create New')]"));
	
	clickOnElement(create);
	Thread.sleep(4000);
	
	WebElement day = driver.findElement(By.id("day"));
	selectValues(day,"12",0,"value");
	Thread.sleep(3000);
	//month
	WebElement month = driver.findElement(By.id("month"));
	selectValues(month,"Aug",0,"visible");
	Thread.sleep(3000);
	
	WebElement year = driver.findElement(By.xpath("//select[@title='Year']"));
	selectValues(year,null,12,"index");
	Thread.sleep(3000);
	
	
}

}