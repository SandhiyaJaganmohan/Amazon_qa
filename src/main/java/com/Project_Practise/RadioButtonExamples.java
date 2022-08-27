package com.Project_Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonExamples {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sandh\\maven_project_workspace\\Project_Practise\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/pages/radio.html");

		WebElement unchecked = driver.findElement(By.
				xpath("/html/body/div/div/div[3]/section/div[3]/div/div/input[1]"));
		WebElement checked = driver.findElement(By.
				xpath("/html/body/div/div/div[3]/section/div[2]/div/div/input[2]"));
		
		boolean firstRadioButton= unchecked.isSelected();
		boolean secondRadioButton= checked.isSelected();
		
		System.out.println(firstRadioButton);
		System.out.println(secondRadioButton);
		
		WebElement thirdradiobutton = driver.findElement(By.
				xpath("/html/body/div/div/div[3]/section/div[3]/div/div/input[1]"));
		thirdradiobutton.click();
		
	}

}
