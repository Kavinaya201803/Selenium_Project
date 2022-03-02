package com.SeleniumPgm;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable_prgm {
	

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Hi\\eclipse-workspace\\SelenProject\\Driver1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://sqengineer.com/practice-sites/practice-tables-selenium/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		System.out.println("Web Table");
		System.out.println("-----------------------------------------------------");
		
		
		 List<WebElement> totalTable = driver.findElements(By.xpath("//table/tbody/tr/td"));
		
		for (WebElement webElement : totalTable) {
			String text = webElement.getText();
			System.out.println(text);
		}
		
		System.out.println("-----------------------------------------------------");
		System.out.println("Particular Row Data");
		
		List<WebElement> row = driver.findElements(By.xpath("//table/tbody/tr[2]/td"));
		
		
		for (WebElement webElement : row) {
			String text1 = webElement.getText();
			System.out.println(text1);
		}
		
		
		List<WebElement> col = driver.findElements(By.xpath("//table/tbody/tr/td[3]"));
		
		for (WebElement webElement : col) {
			
			String text3 = webElement.getText();
			System.out.println(text3);
			
		}
		
		System.out.println("---------------------------------------------------------------");
		System.out.println("particular Data");
		WebElement particular = driver.findElement(By.xpath("//table/tbody/tr[3]/td[1]"));
		System.out.println(particular.getText());
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
