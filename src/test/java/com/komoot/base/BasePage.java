package com.komoot.base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

import java.net.URL;
import java.net.MalformedURLException;
import java.util.logging.Level;

public class BasePage{

	protected AppiumDriver<WebElement> driver;

    DesiredCapabilities dc = new DesiredCapabilities();
    
   
    @BeforeClass
    public void setUp() throws MalformedURLException {
        dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	    dc.setCapability(MobileCapabilityType.DEVICE_NAME, "dc14aaa1");
	    dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "5.0.1");
        dc.setCapability(MobileCapabilityType.UDID, "dc14aaa1");
        dc.setCapability(MobileCapabilityType.APP, "E:/Appium/Appium/testKomoot/driver/de.komoot.android-9.6.7-varies-sdk21-vc5032-APK4Fun.com.apk");
        dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "de.komoot.android");
        dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, ".app.InspirationActivity");
        driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), dc);
        driver.setLogLevel(Level.INFO);
    }
 
   @AfterClass
    public void tearDown() {
       driver.quit();
  }
}