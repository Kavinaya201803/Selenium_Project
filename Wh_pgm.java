package com.SeleniumPgm;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Wh_pgm {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Hi\\eclipse-workspace\\SelenProject\\Driver1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/nlogin/login");
		driver.manage().window().maximize();
		String parent=driver.getWindowHandle();
		System.out.println("parent");
		driver.findElement(By.xpath("(//div[@class='mTxt'])[1]"));
		driver.findElement(By.xpath("(//div[@class='mTxt'])[1]"));
		
		
		Set<String> allid = driver.getWindowHandles();
		for (String string : allid) {
			String title = driver.switchTo().window(string).getTitle();
			System.out.println(title);
		}
		String acttitle ="RECRUITES";
		for (String string : allid) {
			if(driver.switchTo().window(string).getTitle().equals(acttitle)) {
				continue;
				
				
			}else
			{
				driver.close();
			}
		}
		
	}
	

}
