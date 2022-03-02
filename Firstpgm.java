package com.SeleniumPgm;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Firstpgm {
	public static void main(String[] args) throws Throwable {

		System.setProperty("Webdriver.chrome.driver",
				"C:\\Users\\Hi\\eclipse-workspace\\SelenProject\\Driver1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("firstname")).sendKeys("Aruna");
		Thread.sleep(2000);

		driver.findElement(By.name("lastname")).sendKeys("sivaprakash");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("1234567892");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("@@@12345aruna");
		WebElement date = driver.findElement(By.id("day"));
		Select s = new Select(date);
		s.selectByValue("2");
		Thread.sleep(1000);
		WebElement month = driver.findElement(By.id("month"));
		Select s1 = new Select(month);
		s1.selectByIndex(5);
		Thread.sleep(2000);
		WebElement year = driver.findElement(By.id("year"));
		Select s2 = new Select(year);
		s2.selectByVisibleText("2010");
		boolean multiple = s.isMultiple();
		System.out.println("multiple or no:" + multiple);

		List<WebElement> opt = s2.getOptions();
		for (WebElement webElement : opt) {
			String text = webElement.getText();
			System.out.println(text);
		}
		System.out.println("First selected option");
		WebElement FSO = s2.getFirstSelectedOption();

		System.out.println(FSO.getText());
		

	}

}
