package detaildoctor
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class detaildoctor {

	@Given("User launch website prevent on doctor page")
	def launch_web_doctor() {
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://main--starlit-lokum-26b84a.netlify.app/dokter')
		WebUI.maximizeWindow()
	}
	
	@Given("User launch website prevent on are you doctor page")
	def launchAreuDoc() {
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://main--starlit-lokum-26b84a.netlify.app/are-you-doctor')
		WebUI.maximizeWindow()
	}
	
	@When("User can click button detail")
	def detDoc() {
		WebUI.click(findTestObject('Object Repository/detaildoctor-web/Page_Prevent/a_Detail'))
		WebUI.takeScreenshot()
	}
	
	@When("User can click button daftar")
	def regDoc() {
		WebUI.scrollToPosition(0, 1000)
		WebUI.click(findTestObject('Object Repository/detaildoctor-web/Page_Prevent/a_Daftar Sebagai Dokter'))
		WebUI.takeScreenshot()
	}

	@Then("User can check for the valid name doctor")
	def validDoc() {
		WebUI.click(findTestObject('Object Repository/detaildoctor-web/Page_Prevent/input_Dokter akan segera menerima permintaa_9a7ed8'))
		WebUI.setText(findTestObject('Object Repository/detaildoctor-web/Page_Prevent/input_Dokter akan segera menerima permintaa_9a7ed8'),'a')
		WebUI.click(findTestObject('Object Repository/detaildoctor-web/Page_Prevent/input_Dokter akan segera menerima permintaa_9a7ed8'))
		WebUI.setText(findTestObject('Object Repository/detaildoctor-web/Page_Prevent/input_Dokter akan segera menerima permintaa_9a7ed8'),'ad')
		WebUI.verifyElementPresent(findTestObject('Object Repository/detaildoctor-web/Page_Prevent/div_Adolf Hitler'), 30)
		WebUI.takeScreenshot()
		WebUI.closeBrowser()
	}
	@Then("User can check for the invalid name doctor")
	def invalidDoc() {
		WebUI.click(findTestObject('Object Repository/detaildoctor-web/Page_Prevent/input_Dokter akan segera menerima permintaa_9a7ed8'))
		WebUI.setText(findTestObject('Object Repository/detaildoctor-web/Page_Prevent/input_Dokter akan segera menerima permintaa_9a7ed8'),'x')
		WebUI.delay(3)
		WebUI.takeScreenshot()
		WebUI.closeBrowser()
	}

	@Then("On page detail doctor")
	def onDetDoc() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/detaildoctor-web/Page_Prevent/img'), 30)
		WebUI.takeScreenshot()
		WebUI.delay(3)
		WebUI.closeBrowser()
	}
	
	@Then("On page register doctor")
	def onRegDoc() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/detaildoctor-web/Page_Prevent/input_email'), 30)
		WebUI.takeScreenshot()
		WebUI.delay(3)
		WebUI.closeBrowser()
	}
	
}