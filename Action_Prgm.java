package com.SeleniumPgm;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_Prgm {
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Hi\\eclipse-workspace\\SelenProject\\Driver1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement singleclick = driver.findElement(By.xpath("//button[text()='Click Me']"));
		
		Actions act =new Actions(driver);
		
		act.click(singleclick).build().perform();
		
		WebElement rightclick = driver.findElement(By.xpath("//button[text()='Right Click Me']"));
				
		act.contextClick(rightclick).build().perform();
		
		WebElement dubleclick = driver.findElement(By.xpath("//button[text()='Double Click Me']"));
	
		act.doubleClick(dubleclick).build().perform();
		
		driver.navigate().to("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement move = driver.findElement(By.xpath("//div[@class='nav-logo-base nav-sprite']"));
		
		act.moveToElement(move).perform();
		Thread.sleep(2000);
		
		driver.navigate().to("https://jqueryui.com/droppable/");
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		
		WebElement from = driver.findElement(By.id("draggable"));
		
		WebElement to = driver.findElement(By.id("droppable"));
		
		act.dragAndDrop(from,to).perform();
	}

}
