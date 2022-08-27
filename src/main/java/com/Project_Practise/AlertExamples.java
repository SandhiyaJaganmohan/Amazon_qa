package com.Project_Practise;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExamples {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sandh\\maven_project_workspace\\Project_Practise\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/pages/Alert.html");
		
		WebElement Alertbox= driver.findElement(By.
				xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/button"));
		Alertbox.click();
		
		Alert alert = driver.switchTo().alert();
		Thread.sleep(3000); 
		alert.accept();
		
		
		WebElement ConfirmBox = driver.findElement(By.
				xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button"));
		ConfirmBox.click();
		
		Alert confirmalert= driver.switchTo().alert();
		Thread.sleep(3000); 

		confirmalert.dismiss();
		
		WebElement PromptBox = driver.findElement(By.
				xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/button"));
		PromptBox.click();
		
		Alert promptalert= driver.switchTo().alert();
		Thread.sleep(3000); 

	promptalert.sendKeys("is this Sandhiyab jagan");
		Thread.sleep(3000); 

		promptalert.accept();
		
	}
}
