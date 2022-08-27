package com.Project_Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBoxExamples {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sandh\\maven_project_workspace\\Project_Practise\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Edit.html");

		WebElement enterTextBox = driver.findElement(By.id("email"));
		enterTextBox.sendKeys("sandy333@gmail.com");

		WebElement AppendBox = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/input"));
		AppendBox.sendKeys("text");

		WebElement textbox = driver.findElement(By.name("username"));
		String GivenText = textbox.getAttribute("value");
		System.out.println(GivenText);

		WebElement clearBox = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/input"));
        clearBox.clear();
        
		WebElement disabledbox= driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[5]/div/div/input"));
		boolean enabled = disabledbox.isEnabled();
		System.out.println(enabled);
	}

}
