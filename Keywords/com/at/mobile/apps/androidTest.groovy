package com.at.mobile.apps

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.core.util.internal.PathUtil as PathUtil
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.util.KeywordUtil
import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory


public class androidTest {

	/*
	 * Get and run .apk test
	 */
	@Keyword
	def runApplications() {
		'Get full directory\'s path of android application'
		def appPath = PathUtil.relativeToAbsolutePath(GlobalVariable.G_AndroidApp, RunConfiguration.getProjectDir())

		Mobile.startApplication(appPath, false)
	}
	
	@Keyword
	def WebDriver getCurrentSessionMobileDriver() {
		return MobileDriverFactory.getDriver();
	}
	
//	/*
//	 * Handling for element info show, after first installed apk
//	 */
	@Keyword
	def infoFirstLaunchApps() {
		def infoPresent = Mobile.getText(findTestObject('Mobile Apps/Android/DemoTest/contentPanel'), 3)

		if (infoPresent == true) {
			Mobile.verifyEqual(infoPresent, GlobalVariable.G_TextInfoFirstLaunch)	
			KeywordUtil.markPassed("Object " + GlobalVariable.G_TextInfoFirstLaunch + " is present")
		} else if (infoPresent == null){
			KeywordUtil.markPassed("Object tidak muncul - hanya muncul pertama ketika install apl")
			Mobile.tap(findTestObject('Mobile Apps/Android/DemoTest/btnInfo'), 3, FailureHandling.STOP_ON_FAILURE)
			
		} else {
			KeywordUtil.markError("Object " + GlobalVariable.G_TextInfoFirstLaunch + "is not present")
			Mobile.tap(findTestObject('Mobile Apps/Android/DemoTest/btnInfo'), 3, FailureHandling.STOP_ON_FAILURE)
		}
	}
	
	/*
	 * Verify element text in homepage
	 */
	@Keyword
	def verifyText() {
		//1. Accessibility
		def textView1 = Mobile.getText(findTestObject('Mobile Apps/Android/DemoTest/homepage/home.TextView1.Accessibility'), 1)
		Mobile.verifyEqual(textView1, 'Accessibility')
		KeywordUtil.markPassed(textView1)
		
		//2. Animation
		def textView2 = Mobile.getText(findTestObject('Mobile Apps/Android/DemoTest/homepage/home.TextView2.Animation'), 1)
		Mobile.verifyEqual(textView2, 'Animation')
		KeywordUtil.markPassed(textView2)
		
		//3. App
		def textView3 = Mobile.getText(findTestObject('Mobile Apps/Android/DemoTest/homepage/home.TextView3.App'), 1)
		Mobile.verifyEqual(textView3, 'App')
		KeywordUtil.markPassed(textView3)
		
		//4. Content
		def textView4 = Mobile.getText(findTestObject('Mobile Apps/Android/DemoTest/homepage/home.TextView4.Content'), 1)
		Mobile.verifyEqual(textView4, 'Content')
		KeywordUtil.markPassed(textView4)
		
		//.5 Graphics
		def textView5 = Mobile.getText(findTestObject('Mobile Apps/Android/DemoTest/homepage/home.TextView5.Graphics'), 1)
		Mobile.verifyEqual(textView5, 'Graphics')
		KeywordUtil.markPassed(textView5)
		
		//6. Media
		def textView6 = Mobile.getText(findTestObject('Mobile Apps/Android/DemoTest/homepage/home.TextView6.Media'), 1)
		Mobile.verifyEqual(textView6, 'Media')
		KeywordUtil.markPassed(textView6)
		
		//7. NFC
		def textView7 = Mobile.getText(findTestObject('Mobile Apps/Android/DemoTest/homepage/home.TextView7.NFC'), 1)
		Mobile.verifyEqual(textView7, 'NFC')
		KeywordUtil.markPassed(textView7)
		
		//8. OS
		def textView8 = Mobile.getText(findTestObject('Mobile Apps/Android/DemoTest/homepage/home.TextView8.OS'), 1)
		Mobile.verifyEqual(textView8, 'OS')
		KeywordUtil.markPassed(textView8)
		
		//9. Preference
		def textView9 = Mobile.getText(findTestObject('Mobile Apps/Android/DemoTest/homepage/home.TextView9.Preference'), 1)
		Mobile.verifyEqual(textView9, 'Preference')
		KeywordUtil.markPassed(textView9)
		
		//10. Text
		def textView10 = Mobile.getText(findTestObject('Mobile Apps/Android/DemoTest/homepage/home.TextView10.Text'), 1)
		Mobile.verifyEqual(textView10, 'Text')
		KeywordUtil.markPassed(textView10)
		
		//11. Views
		def textView11 = Mobile.getText(findTestObject('Mobile Apps/Android/DemoTest/homepage/home.TextView11.Views'), 1)
		Mobile.verifyEqual(textView11, 'Views')
		KeywordUtil.markPassed(textView11)
		KeywordUtil.logInfo("Verify Text - Successfully")
	}
	
	/*
	 * Menu Accessbility
	 */
	@Keyword
	def menuAccessbility( ) {
		Mobile.tap(findTestObject('Mobile Apps/Android/DemoTest/List Menu/Accessbility/clickAccessibility'), 1, FailureHandling.STOP_ON_FAILURE)
		KeywordUtil.markPassed("Berhasil klik menu accessbility")
		
		Mobile.delay(1)
		def checkText = Mobile.getText(findTestObject('Mobile Apps/Android/DemoTest/List Menu/Accessbility/ListMenuAcc.AccNodeQue'), 1)
		Mobile.verifyEqual(checkText, 'Accessibility Node Querying')
		KeywordUtil.markPassed(checkText)
		
		Mobile.delay(1)
		Mobile.tap(findTestObject('Mobile Apps/Android/DemoTest/List Menu/Accessbility/ListMenuAcc.AccNodeQue'), 1, FailureHandling.STOP_ON_FAILURE)
		KeywordUtil.markPassed("Berhasil klik menu Acc Node Que")
		
		/*
		 * Test for default CheckBox is checked
		 */
		Mobile.delay(1)
		//Take Out Trash
		def elIsChecked1 = Mobile.verifyElementChecked(findTestObject('Mobile Apps/Android/DemoTest/List Menu/Accessbility/default.CheckBox1'), 3)
		if (elIsChecked1 == true) {
			for (def i=0; i < 2; i++) {
				Mobile.tap(findTestObject('Mobile Apps/Android/DemoTest/List Menu/Accessbility/default.CheckBox1'), 1, FailureHandling.STOP_ON_FAILURE)
				KeywordUtil.markPassed("Take Out Trash unchecked/checked - Successfully")
				} 
			} else {
				KeywordUtil.markError("not successfully")
			}
		
		Mobile.delay(1)
		//Do Laundry
		def elIsChecked2 = Mobile.verifyElementChecked(findTestObject('Mobile Apps/Android/DemoTest/List Menu/Accessbility/default.CheckBox2'), 3)
		if (elIsChecked2 == true) {
				for (def i=0; i < 2; i++) {
					Mobile.tap(findTestObject('Mobile Apps/Android/DemoTest/List Menu/Accessbility/default.CheckBox2'), 1, FailureHandling.STOP_ON_FAILURE)
					KeywordUtil.markPassed("Do Laundry unchecked/checked - Successfully")
				}
			} else {
				KeywordUtil.markError("not successfully")
			}
		
		Mobile.delay(1)
		//Nap
		def elIsChecked3 = Mobile.verifyElementChecked(findTestObject('Mobile Apps/Android/DemoTest/List Menu/Accessbility/default.CheckBox3'), 3)
		if (elIsChecked3 == true) {
				for (def i=0; i < 2; i++) {
					Mobile.tap(findTestObject('Mobile Apps/Android/DemoTest/List Menu/Accessbility/default.CheckBox2'), 1, FailureHandling.STOP_ON_FAILURE)
					KeywordUtil.markPassed("Nap unchecked/checked - Successfully")
				}
			} else {
				KeywordUtil.markError("not successfully")
			}
			
	}
}
