package forgotpassword
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



class forgotpassword {
//forgot password 1//
	@Given("I open website prevent for forgot password account with invalid data https://main--starlit-lokum-26b84a.netlify.app/")
	def open_website_for_forgot_password_with_invalid_data() {
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://main--starlit-lokum-26b84a.netlify.app/')
		WebUI.maximizeWindow()
	}

	@When("I navigated to forgot password page for created new password with invalid data")
	def open_forgot_pasword_page_with_invalid_data() {
		WebUI.delay(3)
		WebUI.click(findTestObject('Object Repository/forgotpassword/Page_Prevent/a_Dokter Area'))
		WebUI.delay(2)
		WebUI.takeScreenshot()
		WebUI.click(findTestObject('Object Repository/forgotpassword/Page_Prevent/button_Lupa kata sandi'))
		WebUI.delay(2)
		WebUI.takeScreenshot()
	}
	@And("I fill invalid email (.*) for created new password")
	def fill_invalid_email_for_forgot_password(String email4) {
		WebUI.setText(findTestObject('Object Repository/forgotpassword/Page_Prevent/input_Lupa Kata Sandi_email'), 'rifkhihebat')
		WebUI.delay(2)
		WebUI.takeScreenshot()
	}

	@Then("I click button login and verify unsuccessfully created new password with invalid data")
	def I_verify_unsuccessfully_with_invalid_data() {
		WebUI.click(findTestObject('Object Repository/forgotpassword/Page_Prevent/button_Log In'))
		WebUI.delay(2)
		WebUI.takeScreenshot()
		WebUI.click(findTestObject('Object Repository/forgotpassword/Page_Prevent/div_Lupa Kata SandiLupa Kata Sandi Ikuti la_7725c4'))
		WebUI.delay(2)
		WebUI.takeScreenshot()
		WebUI.closeBrowser()
	}

	//forgot password 2//
	@Given("I open website prevent for forgot password account with blank data https://main--starlit-lokum-26b84a.netlify.app/")
	def open_website_for_forgot_password_with_blank_data() {
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://main--starlit-lokum-26b84a.netlify.app/')
		WebUI.maximizeWindow()
	}

	@When("I navigated to forgot password page for created new password with blank data")
	def open_forgot_pasword_page_with_blank_data() {
		WebUI.delay(3)
		WebUI.click(findTestObject('Object Repository/forgotpassword/Page_Prevent/a_Dokter Area'))
		WebUI.delay(2)
		WebUI.takeScreenshot()
		WebUI.click(findTestObject('Object Repository/forgotpassword/Page_Prevent/button_Lupa kata sandi'))
		WebUI.delay(2)
		WebUI.takeScreenshot()
	}
	@And("I fill email with blank data (.*) for created new password")
	def fill_blank_email_for_forgot_password(String email5) {
		WebUI.setText(findTestObject('Object Repository/forgotpassword/Page_Prevent/input_Lupa Kata Sandi_email'), ' ')
		WebUI.delay(2)
		WebUI.takeScreenshot()
	}

	@Then("I I click button login and verify unsuccessfully created new password with blank data")
	def I_verify_unsuccessfully_with_blank_data() {
		WebUI.click(findTestObject('Object Repository/forgotpassword/Page_Prevent/button_Log In'))
		WebUI.delay(2)
		WebUI.takeScreenshot()
		WebUI.closeBrowser()
	}

	//forgot password 3//
	@Given("I open website prevent for forgot password account with valid data https://main--starlit-lokum-26b84a.netlify.app/")
	def open_website_for_forgot_password_with_valid_data() {
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://main--starlit-lokum-26b84a.netlify.app/')
		WebUI.maximizeWindow()
	}

	@When("I navigated to forgot password page for created new password with valid data")
	def open_forgot_pasword_page_with_valid_data() {
		WebUI.delay(3)
		WebUI.click(findTestObject('Object Repository/forgotpassword/Page_Prevent/a_Dokter Area'))
		WebUI.delay(2)
		WebUI.takeScreenshot()
		WebUI.click(findTestObject('Object Repository/forgotpassword/Page_Prevent/button_Lupa kata sandi'))
		WebUI.delay(2)
		WebUI.takeScreenshot()
	}
	@And("I fill valid email (.*) for created new password")
	def fill_valid_email_for_forgot_password(String email6) {
		WebUI.setText(findTestObject('Object Repository/forgotpassword/Page_Prevent/input_Lupa Kata Sandi_email'), 'rifkhihebat@upi.edu')
		WebUI.delay(2)
		WebUI.takeScreenshot()
	}

	@Then("I I click button login and verify successfully created new password with valid data")
	def I_verify_unsuccessfully_with_valid_data() {
		WebUI.click(findTestObject('Object Repository/forgotpassword/Page_Prevent/button_Log In'))
		WebUI.delay(2)
		WebUI.takeScreenshot()
		WebUI.closeBrowser()
	}
}