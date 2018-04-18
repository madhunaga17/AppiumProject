package com.komoot.scripts;

import org.testng.annotations.Test;

import com.komoot.base.BasePage;
import com.komoot.base.HomePage;
import com.komoot.pages.VerifyLandingPage;



public class TestVerifyLandingPage extends BasePage{
	
	@Test
	    public void verifyChangeSportsType1() throws InterruptedException{
		HomePage hp= new HomePage(driver);
		hp.click_Facebook();
		Thread.sleep(4000);
		VerifyLandingPage lp=new VerifyLandingPage(driver);
		lp.verifyHomePageText("Find your perfect Tour");	
	    }
	}