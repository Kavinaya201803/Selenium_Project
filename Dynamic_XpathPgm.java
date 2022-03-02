package com.SeleniumPgm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_XpathPgm {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Hi\\eclipse-workspace\\SelenProject\\Driver1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/men-casual-shirts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		List<WebElement> discount = driver.findElements(By.xpath("//span[@class='product-strike']//preceding-sibling::span[@class='product-discountedPrice']"));
		//ITERATE
		List<Integer>priceList= new ArrayList<>();
		for(int i=0;i<discount.size();i++) {
			String prices = discount.get(i).getText().replace("Rs. ","");
			//System.out.println(prices);
			
			int pricess = Integer.parseInt(prices); 
			
			priceList.add(pricess);
			
			
		}
		
	System.out.println(priceList);
		int productCount=priceList.size();
		System.out.println("product Count: "+productCount);
		System.out.println("Minimum Vlaue : "+Collections.min(priceList));
		System.out.println("Maxium values : "+Collections.max(priceList));
		
		
		
		
	}

}
