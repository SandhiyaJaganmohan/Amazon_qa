package com.Project_Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonExamples {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sandh\\maven_project_workspace\\Project_Practise\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/pages/Button.html");


		
//1.get the xy position
		WebElement PositionButton = driver.findElement(By.id("position"));
		Point xypoint = PositionButton.getLocation();
		int xpoint = xypoint.getX();
		int ypoint = xypoint.getY();
		System.out.println("x value is :  "+xpoint +"  y value is : "+ypoint );

//2.find the color
		WebElement colorbutton = driver.findElement(By.id("color"));
		String color = colorbutton.getCssValue("background-color");
		System.out.println("button color is : "+color);
		
//3.find the size
		WebElement sizebutton= driver.findElement(By.id("size"));
		int height = sizebutton.getSize().getHeight();
		int width= sizebutton.getSize().getWidth();
		System.out.println("height of button is : "+height +"  width of button is : "+width);
		
//4.go to home screen
		WebElement goToHomeButton = driver.findElement(By.id("home"));
		goToHomeButton.click();
		
		
		
	}
}
