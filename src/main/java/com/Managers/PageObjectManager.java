package com.Managers;

import org.openqa.selenium.WebDriver;

import com.Pom.HomePage;
import com.Pom. LoginPage;

public class PageObjectManager {

	public WebDriver driver;
	private LoginPage lp;
	private HomePage hp;

	public PageObjectManager(WebDriver driver2) {
		this.driver = driver2;
	}

	public LoginPage getinstancelp() {
		lp = new com.Pom.LoginPage(driver);
		return lp;

	}

	public HomePage getinstancehp() {
		hp = new HomePage(driver);
		return hp;
	}
	
	
}
