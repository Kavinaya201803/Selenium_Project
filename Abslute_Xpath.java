package com.SeleniumPgm;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Abslute_Xpath {
	public static void main(String[] args) throws Throwable {
			

	System.setProperty("webdriver.chrome.driver","C:\\Users\\Hi\\eclipse-workspace\\SelenProject\\Driver1\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.javatpoint.com/java-tutorial");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	WebElement text = driver.findElement(By.xpath("//html/body/div/div/div[6]/div[2]/div/table/tbody/tr/td/h1"));
	System.out.println(text.getText());
	
	
  List<WebElement> text2 = driver.findElements(By.xpath("//html/body/div/div/div[6]/div[2]/div/table/tbody/tr/td/h2"));

//iterate
	 Iterator<WebElement> ite= text2.iterator();
	while(ite.hasNext()) {
		WebElement alltext=ite.next();
		System.out.println(alltext.getText());
	}
	
	
	
	
	
	
	
	
}
}