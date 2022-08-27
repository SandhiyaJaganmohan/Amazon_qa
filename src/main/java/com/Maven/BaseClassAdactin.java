package com.Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClassAdactin {

	public static WebDriver driver;

	public static void getBrowser() {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//drivers//chromedriver.exe");

		driver = new ChromeDriver();
	}

	public static void getUrl(String Url) {

		driver.get(Url);
	}

	public static void maxBrowser() {
		driver.manage().window().maximize();
	}
//login page webelements methods
	
	public static void inputValueElement(WebElement element, String value) {

		element.sendKeys(value);//webElement method (string value)
	}

	public static void clickOnElement(WebElement element) {

		element.click();

	}
//home page webelements methods
	
	public static void dropdownValue(WebElement element, String value) {
		Select s = new Select(element);
		s.selectByValue(value);
	}

	public static void dropdownVisibleValue(WebElement element, String value) {
		Select s = new Select(element);
		s.selectByVisibleText(value);
	}
}
