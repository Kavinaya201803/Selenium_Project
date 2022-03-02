package com.SeleniumPgm;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpgm {

	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Hi\\eclipse-workspace\\SelenProject\\Driver1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		//single alert------>accept
		WebElement simple = driver.findElement(By.xpath("(//button[@type='button'])[2]"));
		simple.click();
		Thread.sleep(3000);
		Alert alert=driver.switchTo().alert();
		alert.accept();
		Thread.sleep(2000);
		
		//confirmalert----->accept and dismiss
		WebElement conalert = driver.findElement(By.xpath("(//button[@type='button'])[4]"));
		conalert.click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		Thread.sleep(2000);
		
		
		//prompt alert----->input displayed and accept and dismiss
		WebElement prompat = driver.findElement(By.xpath("(//button[@type='button'])[5]"));
		prompat.click();
		
		Alert alert2 = driver.switchTo().alert();
		Thread.sleep(2000);
		alert2.sendKeys("sucessfully enter");
	      alert2.accept();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*Thread.sleep(2000);
		WebElement A1 = driver.findElement(By.xpath("//button[text()='Alert Box']"));
		A1.click();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		//Thread.sleep(2000);
		WebElement A2= driver.findElement(By.xpath("//button[text()='Confirm Box']"));
		A2.click();
		Alert alert2 = driver.switchTo().alert();
		alert2.dismiss();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[text()='Prompt Box']")).click();
		Thread.sleep(3000);
		Alert alert3 = driver.switchTo().alert();
		Thread.sleep(1000);
		alert3.sendKeys("Alert Handling");
		alert3.accept();
		
		String text = driver.switchTo().alert().getText();
		System.out.println("prompt box text:  " +text);
		Thread.sleep(2000);
		alert3.accept();
		
		*/
		
	}
}
