package com.Project_Practise;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DyanamicTable_CoronaTable {

	static WebDriver driver;
	static String country = "India";
	static int population;
	static int countryIndex;
	static int noOfRows;
	static int noOfColumns;

	public static void getBrowser() {

		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://www.worldometers.info/coronavirus/");

	}

	public static void rowColCount() {

		// Number of columns - Count

		List<WebElement> columns = driver
				.findElements(By.xpath("//table[@id='main_table_countries_today']/tbody/tr[1]/td"));
		int noOfColumns = columns.size();
		System.out.println("No.of columns: " + noOfColumns);

		// Number of rows - Count

		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='main_table_countries_today']/tbody[1]/tr"));

		int noOfRows = rows.size();
		System.out.println("No.of rows: " + noOfRows);

	}

	public static void allData() {

		String allData = driver.findElement(By.xpath("//table[@id='main_table_countries_today']/tbody[1]"))
				.getText();

		System.out.println(allData);

	}

	public static void rowWiseData() {

		// table[@id='main_table_countries_today']/tbody[1]/tr[5]/td[1]
		// table[@id='main_table_countries_today']/tbody[1]/tr[5]/td[2]
		// table[@id='main_table_countries_today']/tbody[1]/tr[5]/td[3]

		String beforexpath = "//table[@id='main_table_countries_today']/tbody[1]/tr[5]/td[";
		String afterxpath = "]";

		for (int j = 1; j <= noOfColumns; j++) {

			String actualXpath = beforexpath + j + afterxpath;

			WebElement row = driver.findElement(By.xpath(actualXpath));

			System.out.println(row.getText());

		}
	}

	public static void main(String[] args) {
		getBrowser();
		rowColCount();
		allData();
		rowWiseData();

	}

}
