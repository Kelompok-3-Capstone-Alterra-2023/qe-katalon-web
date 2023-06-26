package login
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



class login {
	//login 1//
	@Given("I open website prevent for login with valid data https://main--melodious-genie-0706de.netlify.app/")
	def open_website_for_login_with_valid_data() {
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://main--melodious-genie-0706de.netlify.app/')
		WebUI.maximizeWindow()
	}

	@When("I navigated to login page for login with valid data")
	def navigated_login_page_with_valid_data() {
		WebUI.click(findTestObject('Object Repository/login-web/Page_Prevent/a_Dokter Area'))
		WebUI.takeScreenshot()
		WebUI.delay(2)

	}
	@And("I fill email (.*) and password (.*) for login with valid data")
	def fill_email_password_with_valid_data(String email1, String password1) {
		WebUI.setText(findTestObject('Object Repository/login-web/Page_Prevent/input_Email_email'), 'rifkhihebat@gmail.com')
		WebUI.takeScreenshot()
		WebUI.click(findTestObject('Object Repository/login-web/Page_Prevent/label_Password'))
		WebUI.takeScreenshot()
		WebUI.setEncryptedText(findTestObject('Object Repository/login-web/Page_Prevent/input_Email_password (1)'), 'A1JsZXNIBAo=')
		WebUI.takeScreenshot()
		WebUI.delay(2)
	}
	@Then("I click button login and verify successfully login")
	def verify_successfully_login() {
		WebUI.click(findTestObject('Object Repository/login-web/Page_Prevent/button_Log In'))
		WebUI.takeScreenshot()
		WebUI.click(findTestObject('Object Repository/login-web/Page_Prevent - Dokter/p_Hallo, Selamat Datang, Dokter dummydummy'))
		WebUI.takeScreenshot()
		WebUI.delay(2)
		WebUI.closeBrowser()
	}

	//login 2//
	@Given("I open website prevent for login with invalid data https://main--melodious-genie-0706de.netlify.app/")
	def open_website_for_login_with_invalid_data() {
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://main--melodious-genie-0706de.netlify.app/')
		WebUI.maximizeWindow()
	}

	@When("I navigated to login page for login with invalid data")
	def navigated_login_page_with_invalid_data() {
		WebUI.click(findTestObject('Object Repository/login-web/Page_Prevent/a_Dokter Area'))
		WebUI.takeScreenshot()
		WebUI.delay(2)
	}
	@And("I fill email (.*) and password (.*) for login with invalid data")
	def fill_email_password_with_invalid_data(String email2, String password2) {
		WebUI.setText(findTestObject('Object Repository/login-web/Page_Prevent/input_Email_email'), 'rifkhihebat@gmail.com')
		WebUI.takeScreenshot()
		WebUI.setEncryptedText(findTestObject('Object Repository/login-web/Page_Prevent/input_Email_password (1)'), 'ok+jXKlg4Gs=')
		WebUI.takeScreenshot()
		WebUI.delay(2)
	}
	@Then("I click button login and verify unsuccessfully login with invalid data")
	def verify_unsuccessfully_login_with_invalid_data() {
		WebUI.click(findTestObject('Object Repository/login-web/Page_Prevent/p_Log In'))
		WebUI.takeScreenshot()
		WebUI.click(findTestObject('Object Repository/login-web/Page_Prevent/div_Email atau kata sandi salah. Silahkan c_383427'))
		WebUI.takeScreenshot()
		WebUI.delay(2)
		WebUI.closeBrowser()
	}

	//login 3//
	@Given("I open website prevent for login with blank data https://main--melodious-genie-0706de.netlify.app/")
	def open_website_for_login_with_blank_data() {
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://main--melodious-genie-0706de.netlify.app/')
		WebUI.maximizeWindow()
	}

	@When("I navigated to login page for login with blank data")
	def navigated_login_page_with_blank_data() {
		WebUI.click(findTestObject('Object Repository/login-web/Page_Prevent/a_Dokter Area'))
		WebUI.takeScreenshot()
		WebUI.delay(2)
	}
	@And("I fill email (.*) and password (.*) for login with blank data")
	def fill_email_password_with_blank_data(String email3, String password3) {
		WebUI.setText(findTestObject('Object Repository/login-web/Page_Prevent/input_Email_email'), ' ')
		WebUI.takeScreenshot()
		WebUI.setEncryptedText(findTestObject('Object Repository/login-web/Page_Prevent/input_Email_password'), ' ')
		WebUI.takeScreenshot()
		WebUI.delay(2)
	}
	@Then("I click button login and verify unsuccessfully login with blank data")
	def verify_unsuccessfully_login_with_blank_data() {
		WebUI.click(findTestObject('Object Repository/login-web/Page_Prevent/p_Log In'))
		WebUI.takeScreenshot()
		WebUI.click(findTestObject('Object Repository/login-web/Page_Prevent/form_EmailPasswordLog InLupa kata sandi'))
		WebUI.takeScreenshot()
		WebUI.delay(2)
		WebUI.closeBrowser()
	}
}