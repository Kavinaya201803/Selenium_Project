package com.SeleniumPgm;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.logging.FileHandler;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MiniProject {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Hi\\eclipse-workspace\\SelenProject\\Driver1\\chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
					driver.get("http://automationpractice.com/");
				driver.manage().window().maximize();
				Actions act=new Actions(driver);
				WebDriverWait wait=new WebDriverWait(driver,20);
				driver.findElement(By.xpath("(//a[text()='Women'])")).click();
				WebElement women = driver.findElement(By.xpath("(//img[@class='replace-2x img-responsive'])[2]"));
				act.moveToElement(women).perform();
				WebElement women1 = driver.findElement(By.xpath("(//img[@class='replace-2x img-responsive'])[2]"));
				act.click(women1).perform();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				int size = driver.findElements(By.tagName("iframe")).size();
				System.out.println(size);
				driver.switchTo().frame(0);
				WebElement addcart1 = driver.findElement(By.xpath("//button[@name='Submit']"));
				act.moveToElement(addcart1).perform();
				WebElement addcart = driver.findElement(By.xpath("//button[@name='Submit']"));
				act.click(addcart).perform();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

			
	         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Proceed')]"))).click();
	         driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
				WebElement screen = driver.findElement(By.xpath("(//span[text()='$35.02'])[2]"));
				act.moveToElement(screen).perform();
				TakesScreenshot shot=(TakesScreenshot) driver;
				File from = shot.getScreenshotAs(OutputType.FILE);
				File to=new File("C:\\Users\\Hi\\eclipse-workspace\\SelenProject\\Driver1\\dress.png");
				 org.openqa.selenium.io.FileHandler.copy(from, to);
	
	
				
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
}
