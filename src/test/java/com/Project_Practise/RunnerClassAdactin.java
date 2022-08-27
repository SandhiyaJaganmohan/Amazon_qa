package com.Project_Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Managers.PageObjectManager;
import com.Maven.BaseClassAdactin;

public class RunnerClassAdactin extends BaseClassAdactin {

	public static PageObjectManager pom = new PageObjectManager(driver);

	public static void main(String[] args) throws InterruptedException {

		getBrowser();

		getUrl("https://adactinhotelapp.com/");

		maxBrowser();

		// LoginPage lp = new LoginPage(driver);

		inputValueElement(pom.getinstancelp().getUser(), "SandhiyaJagan");

		inputValueElement(pom.getinstancelp().getPass(), "2IR090");

		clickOnElement(pom.getinstancelp().getLoginbtn());

		// home page

		// HomePage hp=new HomePage(driver);

		dropdownValue(pom.getinstancehp().getLoc(), "London");
		dropdownVisibleValue(pom.getinstancehp().getNor(), "2 - Two");
		dropdownVisibleValue(pom.getinstancehp().getAdults(), "2 - Four");
		dropdownValue(pom.getinstancehp().getIndate(), "29/07/2022");
		dropdownValue(pom.getinstancehp().getOutdate(), "31/07/2022");

		Thread.sleep(4000);
		
		clickOnElement(pom.getinstancehp().getS_btn());
		
		Thread.sleep(4000);

		clickOnElement(pom.getinstancehp().getR_btn());

	}

}
