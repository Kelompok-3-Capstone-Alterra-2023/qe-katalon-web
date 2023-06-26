package chat
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



class chat {
	
	//chat 1//
	@Given("I open website prevent for sending message with text https://main--starlit-lokum-26b84a.netlify.app/")
	def open_website_for_sending_message_with_text() {
		WebUI.openBrowser('')
		
		WebUI.navigateToUrl('https://main--starlit-lokum-26b84a.netlify.app/')
		
		WebUI.click(findTestObject('Object Repository/chat-web/Page_Prevent/a_Dokter Area'))
	}

	@When("I successfully login account with email (.*) and password (.*) and i choose feature chat in dashboard menu for sending message with text")
	def successfully_login_and_choose_feature_chat(String email1, String password1) {
		WebUI.setText(findTestObject('Object Repository/chat-web/Page_Prevent/input_Email_email'), 'rifkhihebat@upi.edu')
		
		WebUI.setEncryptedText(findTestObject('Object Repository/chat-web/Page_Prevent/input_Email_password'), 'IAFXosDtfqfih8n2pouL5A==')
		
		WebUI.click(findTestObject('Object Repository/chat-web/Page_Prevent/button_Log In'))
		
		WebUI.click(findTestObject('Object Repository/chat-web/Page_Prevent - Dokter/svg'))
		
		WebUI.click(findTestObject('Object Repository/chat-web/Page_Prevent - Dokter/div_Pesan'))
	}
	
	@And("I fill message with text")
	def fill_message_with_text() {
		WebUI.setText(findTestObject('Object Repository/chat-web/Page_Prevent - Dokter/input_tes2_bg-web-green-75 text-16px px-4 w_554a05'),
			'test')
		
	}
	@Then("I click button send and verify successfully sending message with text")
	def click_button_send() {
		WebUI.click(findTestObject('Object Repository/chat-web/Page_Prevent - Dokter/rect'))
		
		WebUI.click(findTestObject('Object Repository/chat-web/Page_Prevent - Dokter/div_test'))
		
		WebUI.closeBrowser()
	}
}