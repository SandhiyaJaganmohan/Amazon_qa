package com.Project_Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxesExamples {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sandh\\maven_project_workspace\\Project_Practise\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/pages/checkbox.html");
		
		WebElement java = driver.findElement(By.
				xpath("//*[@id=\"contentblock\"]/section/div[1]/input[1]"));
		
		java.click();
		
		WebElement selenium=driver.findElement(By.
				xpath("//*[@id=\'contentblock\']/section/div[2]/input"));
		
		boolean selectedselenium= selenium.isSelected();
		System.out.println(selectedselenium);
		
		WebElement firstElement = driver.findElement(By.
				xpath("//*[@id=\'contentblock\']/section/div[3]/input[1]"));
		
		if (firstElement.isSelected()) {
			firstElement.click();
		}
		
				WebElement secondElement = driver.findElement(By.
						xpath("//*[@id=\'contentblock\']/section/div[3]/input[2]"));

						if (secondElement.isSelected()) {
							secondElement.click();
						
	}

}
}
