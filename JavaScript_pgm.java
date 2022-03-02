package com.SeleniumPgm;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript_pgm {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Hi\\eclipse-workspace\\SelenProject\\Driver1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement mobile = driver.findElement(By.xpath("//a[contains(text(),'Mobiles')]"));
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		
		js.executeScript("arguments[0].click();",mobile);// click using java script
		
		
		js.executeScript("window.scrollBy(0, 7000);"); // scroll down
		
		
		js.executeScript("window.scrollBy(0, -7000);");//scroll up
		
		WebElement save = driver.findElement(By.xpath("//h2[normalize-space()='Explore more accessories']"));
		
		js.executeScript("arguments[0].scrollIntoView();", save);
		
		String str = js.executeScript("return arguments[0].innerHTML", save).toString();  
		
		System.out.println(str);
		
		js.executeScript("alert('Hello wolrd');");
		
		
		
		
		
	}

}
