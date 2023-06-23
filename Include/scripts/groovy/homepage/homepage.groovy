package homepage
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
import com.kms.katalon.core.exception.StepFailedException

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import org.openqa.selenium.Keys




class homepage {

	@Given("User launch website prevent")
	def launch_web() {
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://main--melodious-genie-0706de.netlify.app/')
		WebUI.maximizeWindow()
	}

	@Given("User launch website prevent for scenario verify navigation")
	def launch_web_navigate() {
		launch_web()
	}

	@When("User check for the (.*) in step")
	def checkData(String value) {
		WebUI.setText(findTestObject('Object Repository/homepage-web/Page_Prevent/Page_Prevent/input_Dokter Area_simple-search'), value)
		WebUI.delay(3)
		WebUI.sendKeys(findTestObject('Object Repository/homepage-web/Page_Prevent/Page_Prevent/input_Dokter Area_simple-search'), Keys.chord(Keys.ENTER))
	}

	@Then("User Can click and scroll all navigation and hyperlink")
	def clickScroll() {

		WebUI.click(findTestObject('Object Repository/homepage-web/Page_Prevent/a_Beranda'))
		WebUI.navigateToUrl('https://main--melodious-genie-0706de.netlify.app/dokter')
		WebUI.delay(3)


		WebUI.navigateToUrl('https://main--melodious-genie-0706de.netlify.app/are-you-doctor')
		WebUI.verifyElementPresent(findTestObject('Object Repository/homepage-web/Page_Prevent/Page_Prevent/a_Daftar Sebagai Dokter'), 30)
		WebUI.delay(3)
		WebUI.takeScreenshot()
		WebUI.scrollToPosition(0, 1000)

		WebUI.click(findTestObject('Object Repository/homepage-web/Page_Prevent/a_Tentang Kami'))
		WebUI.verifyElementPresent(findTestObject('Object Repository/homepage-web/Page_Prevent/Page_Prevent/div_Brosur (Desktop)'), 30)
		WebUI.takeScreenshot()
		WebUI.delay(3)


		WebUI.click(findTestObject('Object Repository/homepage-web/Page_Prevent/a_Hubungi Kami'))
		WebUI.takeScreenshot()
		WebUI.delay(3)

		WebUI.click(findTestObject('Object Repository/homepage-web/Page_Prevent/a_Dokter Area'))
		WebUI.delay(3)
		WebUI.takeScreenshot()
		WebUI.verifyElementPresent(findTestObject('Object Repository/homepage-web/Page_Prevent/button_Log In'), 30)
		WebUI.closeBrowser()
	}

	@Then("User verify the (.*) in step")
	def verifyData(String status) {
		if (status == 'passed') {
			WebUI.verifyElementPresent(findTestObject('Object Repository/homepage-web/Page_Prevent/Page_Prevent/verifyBoxContentArticle'), 30, FailureHandling.STOP_ON_FAILURE)
			WebUI.delay(3)
		} else if (status == 'failed') {
			WebUI.verifyElementPresent(findTestObject('Object Repository/homepage-web/Page_Prevent/Page_Prevent/input_Dokter Area_notFoundArticle'), 30, FailureHandling.STOP_ON_FAILURE)
			WebUI.delay(3)
		}
		WebUI.closeBrowser()
		
		
	}
}

