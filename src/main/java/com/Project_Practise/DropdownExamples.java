package com.Project_Practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownExamples {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sandh\\maven_project_workspace\\Project_Practise\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/pages/Dropdown.html");

		WebElement dropdown1 = driver.findElement(By.id("dropdown1"));
		Select select = new Select(dropdown1);
		select.selectByIndex(4);
		select.selectByValue("2");
		select.selectByVisibleText("Selenium");
		
		List<WebElement> listOfOptions  =select.getOptions();
		int noOfElements = listOfOptions.size();
		System.out.println("num of options is  "+noOfElements);
		
		dropdown1.sendKeys("Loadrunner");
		
		WebElement MultiSelect = driver.findElement(By.
				xpath("//*[@id=\'contentblock\']/section/div[6]/select"));
		Select multiselectBox = new Select(MultiSelect);
		multiselectBox.selectByIndex(1);
		multiselectBox.selectByIndex(2);
		multiselectBox.selectByIndex(3);
		
	}

}
