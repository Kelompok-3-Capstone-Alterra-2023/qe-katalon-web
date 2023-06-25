package dashboard
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



class dashboard {
	//login-on-dashboard//
	@Given("I open website prevent for login")
	def logDash() {
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://main--starlit-lokum-26b84a.netlify.app/')
		WebUI.maximizeWindow()
	}

	@When("User login page for login with valid data")
	def fillLog() {
		WebUI.click(findTestObject('Object Repository/login-web/Page_Prevent/a_Dokter Area'))
	}
	@And("User fill email (.*) and password (.*) for login with valid data")
	def fillOK(String email1, String password1) {
		WebUI.setText(findTestObject('Object Repository/login-web/Page_Prevent/input_Email_email'), 'rifkhihebat@upi.edu')

		WebUI.click(findTestObject('Object Repository/login-web/Page_Prevent/label_Password'))

		WebUI.setEncryptedText(findTestObject('Object Repository/login-web/Page_Prevent/input_Email_password'), 'IAFXosDtfqfih8n2pouL5A==')
	}
	@Then("On dashboard after login and can click all menu")
	def verifySuccLog() {
		WebUI.click(findTestObject('Object Repository/login-web/Page_Prevent/button_Log In'))
		WebUI.click(findTestObject('Object Repository/login-web/Page_Prevent - Dokter/p_Hallo, Selamat Datang, Dokter dummydummy'))
		WebUI.delay(3)
		WebUI.click(findTestObject('Object Repository/dashboard-web/Page_Prevent - Dokter/svg'))
		WebUI.click(findTestObject('Object Repository/dashboard-web/Page_Prevent - Dokter/div_Dashboard'))
		WebUI.verifyElementPresent(findTestObject('Object Repository/dashboard-web/Page_Prevent - Dokter/li_Dokter Area'), 30, FailureHandling.STOP_ON_FAILURE)
		WebUI.delay(3)
		WebUI.takeScreenshot()
		
		WebUI.click(findTestObject('Object Repository/dashboard-web/Page_Prevent - Dokter/svg'))
		WebUI.click(findTestObject('Object Repository/dashboard-web/Page_Prevent - Dokter/div_Pesanan'))
		WebUI.verifyElementPresent(findTestObject('Object Repository/dashboard-web/Page_Prevent - Dokter/button_Selanjutnya'), 30, FailureHandling.STOP_ON_FAILURE)
		WebUI.delay(3)
		WebUI.takeScreenshot()
		
		WebUI.click(findTestObject('Object Repository/dashboard-web/Page_Prevent - Dokter/svg'))
		WebUI.click(findTestObject('Object Repository/dashboard-web/Page_Prevent - Dokter/div_Artikel'))
		WebUI.verifyElementPresent(findTestObject('Object Repository/dashboard-web/Page_Prevent - Dokter/button_Tambah Artikel'), 30, FailureHandling.STOP_ON_FAILURE)
		WebUI.delay(3)
		WebUI.takeScreenshot()
		
		WebUI.click(findTestObject('Object Repository/dashboard-web/Page_Prevent - Dokter/svg'))
		WebUI.click(findTestObject('Object Repository/dashboard-web/Page_Prevent - Dokter/div_Pesan'))
		WebUI.verifyElementPresent(findTestObject('Object Repository/dashboard-web/Page_Prevent - Dokter/div_Action'), 30, FailureHandling.STOP_ON_FAILURE)
		WebUI.delay(3)
		WebUI.takeScreenshot()
		
		WebUI.click(findTestObject('Object Repository/dashboard-web/Page_Prevent - Dokter/svg'))
		WebUI.click(findTestObject('Object Repository/dashboard-web/Page_Prevent - Dokter/div_Notifikasi'))
		WebUI.delay(3)
		WebUI.takeScreenshot()
		
		WebUI.click(findTestObject('Object Repository/dashboard-web/Page_Prevent - Dokter/svg'))
		WebUI.click(findTestObject('Object Repository/dashboard-web/Page_Prevent - Dokter/div_Komisi'))
		WebUI.delay(3)
		WebUI.takeScreenshot()
		
		WebUI.click(findTestObject('Object Repository/dashboard-web/Page_Prevent - Dokter/svg'))
		WebUI.click(findTestObject('Object Repository/dashboard-web/Page_Prevent - Dokter/div_Profil'))
		WebUI.verifyElementPresent(findTestObject('Object Repository/dashboard-web/Page_Prevent - Dokter/p_Gambar Profil'), 30, FailureHandling.STOP_ON_FAILURE)
		WebUI.delay(3)
		WebUI.takeScreenshot()
		
		WebUI.click(findTestObject('Object Repository/dashboard-web/Page_Prevent - Dokter/svg'))
		WebUI.scrollToPosition(0, 1000)
		WebUI.click(findTestObject('Object Repository/dashboard-web/Page_Prevent - Dokter/div_Keluar'))
		WebUI.verifyElementPresent(findTestObject('Object Repository/homepage-web/Page_Prevent/button_Log In'), 30, FailureHandling.STOP_ON_FAILURE)
		WebUI.delay(3)
		WebUI.takeScreenshot()
	
		WebUI.closeBrowser()
	}
	
	//pesanan//
	@Given("On dashboard after login and click menu pesanan")
	def launchDash() {
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://main--starlit-lokum-26b84a.netlify.app/')
		WebUI.maximizeWindow()
		WebUI.click(findTestObject('Object Repository/login-web/Page_Prevent/a_Dokter Area'))
		WebUI.setText(findTestObject('Object Repository/login-web/Page_Prevent/input_Email_email'), 'rifkhihebat@upi.edu')
		WebUI.click(findTestObject('Object Repository/login-web/Page_Prevent/label_Password'))
		WebUI.setEncryptedText(findTestObject('Object Repository/login-web/Page_Prevent/input_Email_password'), 'IAFXosDtfqfih8n2pouL5A==')
		WebUI.click(findTestObject('Object Repository/login-web/Page_Prevent/button_Log In'))
		WebUI.click(findTestObject('Object Repository/login-web/Page_Prevent - Dokter/p_Hallo, Selamat Datang, Dokter dummydummy'))
		WebUI.delay(3)
		
	}
	
	@When("User click to view 5 row data")
	def rowPesan() {
		WebUI.click(findTestObject('Object Repository/dashboard-web/Page_Prevent - Dokter/svg'))
		WebUI.click(findTestObject('Object Repository/dashboard-web/Page_Prevent - Dokter/div_Pesanan'))
		WebUI.selectOptionByValue(findTestObject('Object Repository/dashboard-web/Page_Prevent - Dokter/select_12510'), '5', true)
	}
	
	@Then("Already view 5 row data")
	def readyRowPesan() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/dashboard-web/Page_Prevent - Dokter/button_Selanjutnya'), 30, FailureHandling.STOP_ON_FAILURE)
		WebUI.delay(3)
		WebUI.takeScreenshot()
		WebUI.closeBrowser()
	}
	
}
