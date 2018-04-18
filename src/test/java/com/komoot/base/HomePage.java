package com.komoot.base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {
	
	public HomePage(AppiumDriver<WebElement> driver){
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}	
	
	@AndroidFindBy(xpath="//*[@text='Continue with Facebook']")
	private WebElement Facebook;
	
		public void click_Facebook(){
		Facebook.click();
	}
}
