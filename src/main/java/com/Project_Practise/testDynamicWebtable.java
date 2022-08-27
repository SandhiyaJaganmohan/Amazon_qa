package com.Project_Practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testDynamicWebtable {
	
	static String givenCountry = "India";
	static WebDriver driver;

	
	public static void main(String[] args) {
		
		

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sandh\\maven_project_workspace\\Project_Practise\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.worldometers.info/coronavirus/");
		
		List<WebElement> tableHeader = driver.findElements(By.xpath("//table[@id='main_table_countries_today']/thead/tr"));
		
		for (int i = 0; i <= tableHeader.size(); i++) {
			
		List<WebElement> headers = tableHeader.get(i).findElements(By.tagName("th"));
			
		for (int j = 0; j <= headers.size(); j++) {
			
			String head = headers.get(j).getText();
			System.out.println();
		}
		}
	}
}
