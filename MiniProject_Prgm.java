package com.SeleniumPgm;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MiniProject_Prgm {
	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Hi\\eclipse-workspace\\SelenProject\\Driver1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		WebDriverWait wait = new WebDriverWait(driver, 20);
		driver.get("http://automationpractice.com/index.php");
		
		driver.manage().window().maximize();

		Actions act = new Actions(driver);
		driver.findElement(By.xpath("//a[normalize-space()='Sign in']")).click();

		driver.findElement(By.xpath("//input[@id='email']")).click();

		driver.findElement(By.id("email")).sendKeys("sivaaruna@gmail.com"); // login id

		driver.findElement(By.id("passwd")).sendKeys("aruna@1234"); // password

		driver.findElement(By.xpath("//span[normalize-space()='Sign in']")).click(); // sign in

		driver.findElement(By.xpath("(//a[text()='T-shirts'])[2]")).click();// click the T-shirt Icon

		driver.findElement(By.xpath("//div[@class='product-image-container']")).click();

		// frame size

		int size = driver.findElements(By.tagName("iframe")).size();
		System.out.println(size);
		driver.switchTo().frame(0);

		// add to cart

		WebElement addcart = driver.findElement(By.xpath("//span[normalize-space()='Add to cart']"));
		act.click(addcart).perform();
		driver.navigate().refresh();
       
		// view add cart
		
		driver.findElement(By.xpath("//a[@title='View my shopping cart']")).click();
		
		driver.findElement(By.xpath("//a[@class='button btn btn-default standard-checkout button-medium']")).click();

		driver.findElement(By.xpath("//button[@name='processAddress']//span[contains(text(),'Proceed to checkout')]")).click();
		
		driver.findElement(By.id("cgv")).click();
		
		driver.findElement(By.xpath("//button[@name='processCarrier']//span[contains(text(),'Proceed to checkout')]")).click();

		driver.findElement(By.xpath("//a[@title='Pay by check.']")).click();
		
		driver.findElement(By.xpath("//span[normalize-space()='I confirm my order']")).click();
		
		//scroll down the window by using JavaScript
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350);");

		// Screen shot
		
		TakesScreenshot shot = (TakesScreenshot) driver;
		File source = shot.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\Hi\\eclipse-workspace\\SelenProject\\Screenshot\\finalpage4.png");
		org.openqa.selenium.io.FileHandler.copy(source, dest);

	}

}
