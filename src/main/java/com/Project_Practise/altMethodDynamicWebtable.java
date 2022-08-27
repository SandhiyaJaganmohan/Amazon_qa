package com.Project_Practise;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class altMethodDynamicWebtable {
	
	
		static int countryIndex;
		static WebDriver driver;

		public static void Brower_Launch() {

			System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");

			driver = new ChromeDriver();

			driver.get("https://www.worldometers.info/coronavirus/");

		}

		public static void Row_Data() {

			List<WebElement> headers = driver
					.findElements(By.xpath("//table[@id='main_table_countries_today']/thead/tr/th"));

			Map<Integer, String> allheaderMap = new LinkedHashMap<>();

			System.out.println("===India row data ==== ");
			// traverse into header
			// to eliminate the "#" have taken from 1 not 0
			for (int i = 1; i < headers.size() - 1; i++) {

				allheaderMap.put(i, headers.get(i).getText().replaceAll("\n", " "));
				if (headers.get(i).getText().replaceAll("\n", " ").contains("Country")) {
					countryIndex = i;
				}

				// traverse into tbody
				List<WebElement> allrowsList = driver.findElements(
						By.xpath("//table[@id='main_table_countries_today']/tbody[not(@class)]/tr[not(@data-continent)]"));

				// to eliminate the "#" have taken from 1 not 0
				for (int j = 1; j < allrowsList.size(); j++) {

					List<WebElement> rowcellsList = allrowsList.get(j).findElements(By.tagName("td"));

					String country = rowcellsList.get(countryIndex).getText();

					if (country.equals("India")) {

						System.out.print(allheaderMap.get(i) + "=" + rowcellsList.get(i).getText() + " ");
					}
				}

			}
		}

		public static void main(String[] args) {

			Brower_Launch();
			Row_Data();

		}
	}

