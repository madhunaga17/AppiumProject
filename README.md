# AppiumProject
Appium Frame work and testing on Komoot app

### Environment Setup

1. Global Dependencies
    * Install Java, ADT/SDK, Appium, Eclipse(I have used Luna)
    
2. Hardware and Software
    * Used Samsung S4, Android Version-5.0.1
	* Selenium Version 3.11.0
	* Java version 1.8.0_161
	* Appium version 1.7.2
		To install appium
		* Open command prompt
		* Type: npm install -g appium
		* Click enter
		* To check version, in command promt type: appium -v
	* Eclipse IDE (I have used: Luna Service Release 2 (4.4.2))
	* To identify elements used uiautomatorviewer.bat

3. Project Dependencies
    * Download completed project and import in eclipse IDE
	* Specify the .APK path in BasePage class in capabilities.setCapability(MobileCapabilityType.APP,"Specify .apk path")
	* Run Appium before executing the scripts
		To run appium
		* Open command prompt or appium
		* Type: -appium -a 127.0.0.1 -p 4723
	* Connect mobile device(android)
		* Install Komoot app
		* change the below mentioned fields as per your device and virtual device
			capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "dc14aaa1");
			capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "5.0.1");
	* Connect device to PC
	* run scripts
	* Check the result test-output folder by opening index.html in browser
4. Find the Testcases in testKomoot/Testcases.xlsx
5. How to install ADT/SDK using eclipse
	* Open the mentioned link in browser, Link: https://stuff.mit.edu/afs/sipb/project/android/docs/sdk/installing/installing-adt.html
	* Copy the link https://dl-ssl.google.com/android/eclipse/
	* In Eclipse, Navigate to Help menu
	* Click on Install Software
	* Install Pop-up will appear
	* Click on Add button
	* Enter Name: ADT
	* Enter the location(which you have copied link): https://dl-ssl.google.com/android/eclipse/
	* Select Developer Tools check box and click on Next button
	* Select "Note:  kxml2-2.3.0.jar is under the BSD license rather than the EPL.  You can find a copy of the BSD License at http://www.opensource.org/licenses/bsd-license.php"
	* Select I accept Radio Button and click on Finish
	* Security Warning message will appear and click on "OK" button
	* Restart the Eclipse
	* Select "Install new SDK", Select both the Check boxes, browse the target location where you would like to save the SDK files
	* If you like to send usage statistics to Google then select Yes or Select no and click on Finish
	* Select "Accept License" radio button and click on Install
	* Click on Open SDK manager to configure the packages
	* Select the required packages and click on Install
	* Accept license and click on Install
	* After installation restart the eclipse
	* You can configure the SDK in Windows menu tab

### Resources

##### [Sauce Labs Documentation](https://wiki.saucelabs.com/)

##### [TestNG Documentation](http://testng.org/doc/documentation-main.html)

##### [Java Documentation](https://docs.oracle.com/javase/7/docs/api/)

##### [Stack Overflow](http://stackoverflow.com/)
* A great resource to search for issues not explicitly covered by documentation.







