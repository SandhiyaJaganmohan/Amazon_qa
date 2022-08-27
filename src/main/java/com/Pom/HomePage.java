package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	public static WebDriver driver;

	public static WebDriver getDriver() {
		return driver;
	}

	@FindBy(xpath = "//select[@name='location']//descendant::option[@value='London']")
	private WebElement loc;

	public WebElement getLoc() {
		return loc;
	}

	@FindBy(xpath = "//select[@name='room_nos']")
	private WebElement nor;

	public WebElement getNor() {
		return nor;
	}

	@FindBy(xpath = "//input[@name='datepick_in']")
	private WebElement indate;

	public WebElement getIndate() {
		return indate;
	}

	@FindBy(xpath = "//input[@name='datepick_out']")
	private WebElement outdate;

	public WebElement getOutdate() {
		return outdate;
	}

	@FindBy(xpath = "//select[@name='adult_room']")
	private WebElement adults;

	public WebElement getAdults() {
		return adults;
	}

	@FindBy(xpath = "//input[@type='submit']")
	private WebElement s_btn;

	public WebElement getS_btn() {
		return s_btn;
	}

	@FindBy(xpath = "//input[@type='reset']")
	private WebElement r_btn;

	public WebElement getR_btn() {
		return r_btn;
	}
	
	public HomePage(WebDriver abc) {
		this.driver=abc;
		
		PageFactory.initElements(driver, this);
	}

}
