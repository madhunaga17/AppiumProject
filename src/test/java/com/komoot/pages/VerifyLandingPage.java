package com.komoot.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.komoot.base.HomePage;

public class VerifyLandingPage extends HomePage {
	
	public VerifyLandingPage(AppiumDriver<WebElement> driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}


    @AndroidFindBy(xpath="//android.widget.TextView[@text='Find your perfect Tour']")
    public WebElement textHomePage;
    

    
    public void verifyHomePageText(String eTTText){
		String aTTText=textHomePage.getText();
		System.out.println(aTTText);
		Assert.assertEquals(aTTText, eTTText);
	}




}