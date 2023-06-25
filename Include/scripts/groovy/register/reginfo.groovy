package register
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



class reginfo {
	
	//reg info 1//
	@Given("I open website prevent for register personal info with valid data https://main--starlit-lokum-26b84a.netlify.app/")
	def open_website_for_register_with_valid_data() {
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://main--starlit-lokum-26b84a.netlify.app/')
		WebUI.maximizeWindow()
	}

	@When("I navigated to register page for register account with valid data")
	def navigated_register_page_with_valid_data() {
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/register-web/Page_Prevent/button_Dokter'))
		WebUI.delay(2)
		WebUI.takeScreenshot()
		WebUI.click(findTestObject('Object Repository/register-web/Page_Prevent/a_Apakah Kamu Dokter'))
		WebUI.delay(2)
		WebUI.takeScreenshot()
		WebUI.click(findTestObject('Object Repository/register-web/Page_Prevent/a_Daftar Sebagai Dokter'))
		WebUI.delay(2)
		WebUI.takeScreenshot()
	}

	@And("I fill (.*),(.*),(.*),(.*),(.*),(.*),(.*) for regist with valid data")
	def fill_valid_data_for_register(String email7,String name1,String NIK1,String gender1,String place1,String dob1,String religion1) {
		WebUI.setText(findTestObject('Object Repository/register-web/Page_Prevent/input_email'), 'dummy21@dummy.com')
		WebUI.delay(2)
		WebUI.takeScreenshot()
		WebUI.setText(findTestObject('Object Repository/register-web/Page_Prevent/input_full_name'), 'Dummy')
		WebUI.delay(2)
		WebUI.takeScreenshot()
		WebUI.setText(findTestObject('Object Repository/register-web/Page_Prevent/input_nik'), '3176890102030405')
		WebUI.delay(2)
		WebUI.takeScreenshot()
		WebUI.setText(findTestObject('Object Repository/register-web/Page_Prevent/input_gender'), 'Perempuan')
		WebUI.delay(2)
		WebUI.takeScreenshot()
		WebUI.setText(findTestObject('Object Repository/register-web/Page_Prevent/input_birth_place'), 'Jakarta')
		WebUI.delay(2)
		WebUI.takeScreenshot()
		WebUI.setText(findTestObject('Object Repository/register-web/Page_Prevent/input_Capture object_birth_date'), '01/06/1995')
		WebUI.delay(2)
		WebUI.takeScreenshot()
		WebUI.setText(findTestObject('Object Repository/register-web/Page_Prevent/input_religion'), 'Islam')
		WebUI.delay(2)
		WebUI.takeScreenshot()
	}
	@Then("Successfully register with valid data and navigated to academic information page")
	def verify_success_register_navigated_academic_page(){
		WebUI.click(findTestObject('Object Repository/register-web/Page_Prevent/button_Lanjut'))
		WebUI.acceptAlert()
		WebUI.delay(2)
		WebUI.takeScreenshot()
		WebUI.closeBrowser()
	}
	
	//reg info 2//
	@Given("I open website prevent for register personal info with empty data https://main--starlit-lokum-26b84a.netlify.app/")
	def open_website_for_register_with_empty_data() {
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://main--starlit-lokum-26b84a.netlify.app/')
		WebUI.maximizeWindow()
	}

	@When("I navigated to register page for register account with empty data")
	def navigated_register_page_with_empty_data() {
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/register-web/Page_Prevent/button_Dokter'))
		WebUI.delay(2)
		WebUI.takeScreenshot()
		WebUI.click(findTestObject('Object Repository/register-web/Page_Prevent/a_Apakah Kamu Dokter'))
		WebUI.delay(2)
		WebUI.takeScreenshot()
		WebUI.click(findTestObject('Object Repository/register-web/Page_Prevent/a_Daftar Sebagai Dokter'))
		WebUI.delay(2)
		WebUI.takeScreenshot()
	}

	@And("I fill (.*),(.*),(.*),(.*),(.*),(.*),(.*) for regist with empty data")
	def fill_empty_data_for_register(String email8,String name2,String NIK2,String gender2,String place2,String dob2,String religion2) {
		WebUI.setText(findTestObject('Object Repository/register-web/Page_Prevent/input_email'), '')
		WebUI.delay(2)
		WebUI.takeScreenshot()
		WebUI.setText(findTestObject('Object Repository/register-web/Page_Prevent/input_full_name'), '')
		WebUI.delay(2)
		WebUI.takeScreenshot()
		WebUI.setText(findTestObject('Object Repository/register-web/Page_Prevent/input_nik'), '')
		WebUI.delay(2)
		WebUI.takeScreenshot()
		WebUI.setText(findTestObject('Object Repository/register-web/Page_Prevent/input_gender'), '')
		WebUI.delay(2)
		WebUI.takeScreenshot()
		WebUI.setText(findTestObject('Object Repository/register-web/Page_Prevent/input_birth_place'), '')
		WebUI.delay(2)
		WebUI.takeScreenshot()
		WebUI.setText(findTestObject('Object Repository/register-web/Page_Prevent/input_Capture object_birth_date'), '')
		WebUI.delay(2)
		WebUI.takeScreenshot()
		WebUI.setText(findTestObject('Object Repository/register-web/Page_Prevent/input_religion'), '')
		WebUI.delay(2)
		WebUI.takeScreenshot()
	}
	@Then("Unsuccessfully register with empty data and navigated to academic information page")
	def verify_unsuccessfully_register_with_empty_data(){
		WebUI.click(findTestObject('Object Repository/register-web/Page_Prevent/button_Lanjut'))
		WebUI.delay(2)
		WebUI.takeScreenshot()
		WebUI.closeBrowser()
	}
	
	//reginfo 3//
	@Given("I open website prevent for register personal info with not format email https://main--starlit-lokum-26b84a.netlify.app/")
	def open_website_for_register_with_not_format_email() {
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://main--starlit-lokum-26b84a.netlify.app/')
		WebUI.maximizeWindow()
	}

	@When("I navigated to register page for register account with not format email")
	def navigated_register_page_with_not_format_email() {
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/register-web/Page_Prevent/button_Dokter'))
		WebUI.delay(2)
		WebUI.takeScreenshot()
		WebUI.click(findTestObject('Object Repository/register-web/Page_Prevent/a_Apakah Kamu Dokter'))
		WebUI.delay(2)
		WebUI.takeScreenshot()
		WebUI.click(findTestObject('Object Repository/register-web/Page_Prevent/a_Daftar Sebagai Dokter'))
		WebUI.delay(2)
		WebUI.takeScreenshot()
	}

	@And("I fill (.*),(.*),(.*),(.*),(.*),(.*),(.*) for regist with not format email")
	def fill_not_format_email_for_register(String email9,String name3,String NIK3,String gender3,String place3,String dob3,String religion3) {
		WebUI.setText(findTestObject('Object Repository/register-web/Page_Prevent/input_email'), 'dummy21')
		WebUI.delay(2)
		WebUI.takeScreenshot()
		WebUI.setText(findTestObject('Object Repository/register-web/Page_Prevent/input_full_name'), 'Dummy')
		WebUI.delay(2)
		WebUI.takeScreenshot()
		WebUI.setText(findTestObject('Object Repository/register-web/Page_Prevent/input_nik'), '3176890102030405')
		WebUI.delay(2)
		WebUI.takeScreenshot()
		WebUI.setText(findTestObject('Object Repository/register-web/Page_Prevent/input_gender'), 'Perempuan')
		WebUI.delay(2)
		WebUI.takeScreenshot()
		WebUI.setText(findTestObject('Object Repository/register-web/Page_Prevent/input_birth_place'), 'Jakarta')
		WebUI.delay(2)
		WebUI.takeScreenshot()
		WebUI.setText(findTestObject('Object Repository/register-web/Page_Prevent/input_Capture object_birth_date'), '01/06/1995')
		WebUI.delay(2)
		WebUI.takeScreenshot()
		WebUI.setText(findTestObject('Object Repository/register-web/Page_Prevent/input_religion'), 'Islam')
		WebUI.delay(2)
		WebUI.takeScreenshot()
	}
	@Then("Unsuccessfully register with not format email and navigated to academic information page")
	def verify_unsuccessfully_register_with_not_format_email(){
		WebUI.click(findTestObject('Object Repository/register-web/Page_Prevent/button_Lanjut'))
		WebUI.delay(2)
		WebUI.takeScreenshot()
		WebUI.closeBrowser()
	}
	
	//reginfo 4//
	@Given("I open website prevent for register personal info with name one character https://main--starlit-lokum-26b84a.netlify.app/")
	def open_website_for_register_with_name_one_character() {
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://main--starlit-lokum-26b84a.netlify.app/')
		WebUI.maximizeWindow()
	}

	@When("I navigated to register page for register account with name one character")
	def navigated_register_page_with_name_one_character() {
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/register-web/Page_Prevent/button_Dokter'))
		WebUI.delay(2)
		WebUI.takeScreenshot()
		WebUI.click(findTestObject('Object Repository/register-web/Page_Prevent/a_Apakah Kamu Dokter'))
		WebUI.delay(2)
		WebUI.takeScreenshot()
		WebUI.click(findTestObject('Object Repository/register-web/Page_Prevent/a_Daftar Sebagai Dokter'))
		WebUI.delay(2)
		WebUI.takeScreenshot()
	}

	@And("I fill (.*),(.*),(.*),(.*),(.*),(.*),(.*) for regist with name one character")
	def fill_name_one_character_for_register(String email10,String name4,String NIK4,String gender4,String place4,String dob4,String religion4) {
		WebUI.setText(findTestObject('Object Repository/register-web/Page_Prevent/input_email'), 'dummy21@dummy.com')
		WebUI.delay(2)
		WebUI.takeScreenshot()
		WebUI.setText(findTestObject('Object Repository/register-web/Page_Prevent/input_full_name'), 'D')
		WebUI.delay(2)
		WebUI.takeScreenshot()
		WebUI.setText(findTestObject('Object Repository/register-web/Page_Prevent/input_nik'), '3176890102030405')
		WebUI.delay(2)
		WebUI.takeScreenshot()
		WebUI.setText(findTestObject('Object Repository/register-web/Page_Prevent/input_gender'), 'Perempuan')
		WebUI.delay(2)
		WebUI.takeScreenshot()
		WebUI.setText(findTestObject('Object Repository/register-web/Page_Prevent/input_birth_place'), 'Jakarta')
		WebUI.delay(2)
		WebUI.takeScreenshot()
		WebUI.setText(findTestObject('Object Repository/register-web/Page_Prevent/input_Capture object_birth_date'), '01/06/1995')
		WebUI.delay(2)
		WebUI.takeScreenshot()
		WebUI.setText(findTestObject('Object Repository/register-web/Page_Prevent/input_religion'), 'Islam')
		WebUI.delay(2)
		WebUI.takeScreenshot()
	}
	@Then("Unsuccessfully register with name one character and navigated to academic information page")
	def verify_unsuccessfully_register_with_name_one_character(){
		WebUI.click(findTestObject('Object Repository/register-web/Page_Prevent/button_Lanjut'))
		WebUI.acceptAlert()
		WebUI.delay(2)
		WebUI.takeScreenshot()
		WebUI.closeBrowser()
	}
	//reginfo 5//
	@Given("I open website prevent for register personal info with date of birth is date now https://main--starlit-lokum-26b84a.netlify.app/")
	def open_website_for_register_with_date_birth_is_date_now() {
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://main--starlit-lokum-26b84a.netlify.app/')
		WebUI.maximizeWindow()
	}

	@When("I navigated to register page for register account with date of birth is date now")
	def navigated_register_page_with_date_birth_is_date_now() {
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/register-web/Page_Prevent/button_Dokter'))
		WebUI.delay(2)
		WebUI.takeScreenshot()
		WebUI.click(findTestObject('Object Repository/register-web/Page_Prevent/a_Apakah Kamu Dokter'))
		WebUI.delay(2)
		WebUI.takeScreenshot()
		WebUI.click(findTestObject('Object Repository/register-web/Page_Prevent/a_Daftar Sebagai Dokter'))
		WebUI.delay(2)
		WebUI.takeScreenshot()
	}

	@And("I fill (.*),(.*),(.*),(.*),(.*),(.*),(.*) for regist with name date of birth is date now")
	def fill_date_birth_is_date_now_for_register(String email11,String name5,String NIK5,String gender5,String place5,String dob5,String religion5) {
		WebUI.setText(findTestObject('Object Repository/register-web/Page_Prevent/input_email'), 'dummy21@dummy.com')
		WebUI.delay(2)
		WebUI.takeScreenshot()
		WebUI.setText(findTestObject('Object Repository/register-web/Page_Prevent/input_full_name'), 'Dummy')
		WebUI.delay(2)
		WebUI.takeScreenshot()
		WebUI.setText(findTestObject('Object Repository/register-web/Page_Prevent/input_nik'), '3176890102030405')
		WebUI.delay(2)
		WebUI.takeScreenshot()
		WebUI.setText(findTestObject('Object Repository/register-web/Page_Prevent/input_gender'), 'Perempuan')
		WebUI.delay(2)
		WebUI.takeScreenshot()
		WebUI.setText(findTestObject('Object Repository/register-web/Page_Prevent/input_birth_place'), 'Jakarta')
		WebUI.delay(2)
		WebUI.takeScreenshot()
		WebUI.setText(findTestObject('Object Repository/register-web/Page_Prevent/input_Capture object_birth_date'), '25/06/1995')
		WebUI.delay(2)
		WebUI.takeScreenshot()
		WebUI.setText(findTestObject('Object Repository/register-web/Page_Prevent/input_religion'), 'Islam')
		WebUI.delay(2)
		WebUI.takeScreenshot()
	}
	@Then("Unsuccessfully register with date of birth is date now and navigated to academic information page")
	def verify_unsuccessfully_register_with_date_birth_is_date_now(){
		WebUI.click(findTestObject('Object Repository/register-web/Page_Prevent/button_Lanjut'))
		WebUI.acceptAlert()
		WebUI.delay(2)
		WebUI.takeScreenshot()
		WebUI.closeBrowser()
	}
}