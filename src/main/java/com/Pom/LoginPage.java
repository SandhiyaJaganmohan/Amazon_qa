package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public static WebDriver driver; // ----- returns Null

	@FindBy(xpath = "//input[@name='username']")
	private WebElement user;

	@FindBy(xpath = "//input[@name='password']")
	private WebElement pass;

	@FindBy(xpath = "//input[@name='login']")
	private WebElement loginbtn;

	public WebElement getUser() {
		return user;
	}

	public WebElement getPass() {
		return pass;

	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}

	public LoginPage(WebDriver abc) {

		this.driver = abc; // from runner class driver

		PageFactory.initElements(driver, this); // is to initialize the webelement
	}
}
