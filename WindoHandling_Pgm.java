package com.SeleniumPgm;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindoHandling_Pgm {
	public static void main(String[] args) throws AWTException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Hi\\eclipse-workspace\\SelenProject\\Driver1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

		WebElement tab = driver.findElement(By.xpath("//a[text()='Mobiles']"));

		Actions act = new Actions(driver);

		act.moveToElement(tab).build().perform();

		act.contextClick(tab).perform();
		Robot rob = new Robot();
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyRelease(KeyEvent.VK_DOWN);

		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);

		WebElement mobile = driver.findElement(By.xpath("//a[contains(text(),' Electronics ')]"));

		act.contextClick(mobile).perform();
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyRelease(KeyEvent.VK_DOWN);

		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);

		// getWindowHandle()----return current window id() only

		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);

		// getWindowHandles()--->return current windowsID()

		Set<String> windowHandles = driver.getWindowHandles();
		for (String str : windowHandles) {

			// get title based on window id
			String title = driver.switchTo().window(str).getTitle();
			System.out.println(title);

		}

		String s = "Mobile Phones: Buy New Mobiles Online at Best Prices in India | Buy Cell Phones Online - Amazon.in";
		for (String str : windowHandles) {

			if (driver.switchTo().window(str).getTitle().equalsIgnoreCase(s)) {
				System.out.println("done,.....");
				continue;

			} else {
				driver.close();
			}

		}

	}
}
