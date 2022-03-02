package com.SeleniumPgm;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BaseClass_Program {
	// click()---->
	// webelement

	public static void clickOnElement(WebElement element) {

		element.click();

	}

	public static void inputValues(WebElement element, String value) {

		element.sendKeys(value);

	}

	public static void getValues(WebElement element) {

		System.out.println(element.getText());

	}
//select by value
//select by index
// select by visible text

	public static void selectValues(WebElement element, String value, int index, String select) {

		if (select.equalsIgnoreCase("selectbyvalue")) {
			Select s = new Select(element);
			s.selectByValue(value);

		} else if (select.equalsIgnoreCase("index")) {
			Select s = new Select(element);
			s.selectByIndex(index);

		} else if (select.equalsIgnoreCase("visiable")) {
			Select s = new Select(element);
			s.selectByVisibleText(value);
		}
	}

}
