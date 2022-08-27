package com.Project_Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathAxesPractise {
	static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/");

		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("iphone 13");

		driver.findElement(By.xpath("//button[@type='submit']")).click();

		driver.findElement(By.xpath("//div[contains(text(),'APPLE iPhone 13 (Pink, 128 GB)')]")).click();
	}
}
