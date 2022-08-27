package com.Project_Practise;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Handling_2Windows {
	static WebDriver driver;

	public static void brower_Launch() {

		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/");
	}

	public static void searchMobile() {
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("iphone 13");
	}
	
	public static void window_Handling_for_two_windows() {
		
		String parentWindowId = driver.getWindowHandle();
		
		driver.findElement(By.xpath("//xpath")).click();
		
		Set<String> allWindowId = driver.getWindowHandles(); // 2
		
		for (String id : allWindowId) {
			
			if (!(id.equals(parentWindowId))) {
				driver.switchTo().window(id);
				break;
			}
		}
	}
	
	public static void window_Handling_for_more_than_two_windows() {
		
		String req_Title="Wud Kraft Plastic Free Standing Chest of Drawers";
		
		Set<String> allWindowId = driver.getWindowHandles(); // 4
		
		for (String id : allWindowId) {
			String title = driver.switchTo().window(id).getTitle();
			System.out.println(title);
			if (title.contains(req_Title)) {
				driver.switchTo().window(id);
				//click on product;
			}
		}
		
	
	}

	public static void main(String[] args) {

		brower_Launch();

	}

}
