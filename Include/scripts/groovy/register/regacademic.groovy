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



class regacademic {

	//regacademic 1//
	@Given("I open website prevent for register academic information with valid data https://main--melodious-genie-0706de.netlify.app/")
	def open_website_for_regacademic_with_valid_data() {
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://main--melodious-genie-0706de.netlify.app/')
		WebUI.maximizeWindow()
	}

	@When("I successfully register personal info and navigated to register academic information with valid data")
	def open_regacademic_with_valid_data() {
		WebUI.click(findTestObject('Object Repository/register-web/Page_Prevent/button_Dokter'))
		WebUI.takeScreenshot()
		WebUI.click(findTestObject('Object Repository/register-web/Page_Prevent/a_Apakah Kamu Dokter'))
		WebUI.takeScreenshot()
		WebUI.click(findTestObject('Object Repository/register-web/Page_Prevent/a_Daftar Sebagai Dokter'))
		WebUI.takeScreenshot()
		WebUI.setText(findTestObject('Object Repository/register-web/Page_Prevent/input_email'), 'dummy21@dummy.com')
		WebUI.takeScreenshot()
		WebUI.setText(findTestObject('Object Repository/register-web/Page_Prevent/input_full_name'), 'Dummy')
		WebUI.takeScreenshot()
		WebUI.setText(findTestObject('Object Repository/register-web/Page_Prevent/input_nik'), '3176890102030405')
		WebUI.takeScreenshot()
		WebUI.selectOptionByValue(findTestObject('Object Repository/register-web/Page_Prevent/select_Pilih Jenis KelaminLaki-LakiPerempuan'), 'Perempuan',false)
		WebUI.takeScreenshot()
		WebUI.setText(findTestObject('Object Repository/register-web/Page_Prevent/input_birth_place'), 'Jakarta')
		WebUI.takeScreenshot()
		WebUI.setText(findTestObject('Object Repository/register-web/Page_Prevent/input_Capture object_birth_date'), '01/06/1995')
		WebUI.takeScreenshot()
		WebUI.setText(findTestObject('Object Repository/register-web/Page_Prevent/input_religion'), 'Islam')
		WebUI.takeScreenshot()
		WebUI.click(findTestObject('Object Repository/register-web/Page_Prevent/button_Lanjut'))
		WebUI.takeScreenshot()
		WebUI.delay(2)
	}

	@And("I fill (.*),(.*),(.*),(.*),(.*) for register academic information with valid data")
	def fill_regacademic_with_valid_data(String university1, String major1, String graduated1, String office1, String str1) {
		WebUI.setText(findTestObject('Object Repository/register-web/Page_Prevent/input_Capture object_alumnus'), 'Universitas Indonesia')
		WebUI.takeScreenshot()
		WebUI.setText(findTestObject('Object Repository/register-web/Page_Prevent/input_Capture object_jurusan'), 'Kedokteran')
		WebUI.takeScreenshot()
		WebUI.setText(findTestObject('Object Repository/register-web/Page_Prevent/input_Capture object_grad_year'), '2017')
		WebUI.takeScreenshot()
		WebUI.setText(findTestObject('Object Repository/register-web/Page_Prevent/input_Capture object_alumnus2'), '')
		WebUI.takeScreenshot()
		WebUI.setText(findTestObject('Object Repository/register-web/Page_Prevent/input_Capture object_jurusan2'), '')
		WebUI.takeScreenshot()
		WebUI.setText(findTestObject('Object Repository/register-web/Page_Prevent/input_Capture object_grad_year2'), '')
		WebUI.takeScreenshot()
		WebUI.setText(findTestObject('Object Repository/register-web/Page_Prevent/input_Capture object_practice_address'), 'RSUD Kembangan')
		WebUI.takeScreenshot()
		WebUI.setText(findTestObject('Object Repository/register-web/Page_Prevent/input_Capture object_str_number'), '1234567')
		WebUI.takeScreenshot()
		WebUI.click(findTestObject('Object Repository/register-web/Page_Prevent/button_Lanjut'))
		WebUI.takeScreenshot()
		WebUI.delay(2)
	}
	@Then("Successfully register academic information with valid data and navigated to document information page")
	def navigated_to_document_information_page() {
		WebUI.click(findTestObject('register-web/Page_Prevent/button_Lanjut'))
		WebUI.takeScreenshot()
		WebUI.closeBrowser()
	}

	//regacademic 2//
	@Given("I open website prevent for register academic information with empty data https://main--melodious-genie-0706de.netlify.app/")
	def open_website_for_regacademic_with_empty_data() {
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://main--melodious-genie-0706de.netlify.app/')
		WebUI.maximizeWindow()
	}

	@When("I successfully register personal info and navigated to register academic information with empty data")
	def open_regacademic_with_empty_data() {
		WebUI.click(findTestObject('Object Repository/register-web/Page_Prevent/button_Dokter'))
		WebUI.takeScreenshot()
		WebUI.click(findTestObject('Object Repository/register-web/Page_Prevent/a_Apakah Kamu Dokter'))
		WebUI.takeScreenshot()
		WebUI.click(findTestObject('Object Repository/register-web/Page_Prevent/a_Daftar Sebagai Dokter'))
		WebUI.takeScreenshot()
		WebUI.setText(findTestObject('Object Repository/register-web/Page_Prevent/input_email'), 'dummy21@dummy.com')
		WebUI.takeScreenshot()
		WebUI.setText(findTestObject('Object Repository/register-web/Page_Prevent/input_full_name'), 'Dummy')
		WebUI.takeScreenshot()
		WebUI.setText(findTestObject('Object Repository/register-web/Page_Prevent/input_nik'), '3176890102030405')
		WebUI.takeScreenshot()
		WebUI.selectOptionByValue(findTestObject('Object Repository/register-web/Page_Prevent/select_Pilih Jenis KelaminLaki-LakiPerempuan'), 'Perempuan',false)
		WebUI.takeScreenshot()
		WebUI.setText(findTestObject('Object Repository/register-web/Page_Prevent/input_birth_place'), 'Jakarta')
		WebUI.takeScreenshot()
		WebUI.setText(findTestObject('Object Repository/register-web/Page_Prevent/input_Capture object_birth_date'), '01/06/1995')
		WebUI.takeScreenshot()
		WebUI.setText(findTestObject('Object Repository/register-web/Page_Prevent/input_religion'), 'Islam')
		WebUI.takeScreenshot()
		WebUI.click(findTestObject('Object Repository/register-web/Page_Prevent/button_Lanjut'))
		WebUI.takeScreenshot()
		WebUI.delay(2)
	}

	@And("I fill (.*),(.*),(.*),(.*),(.*) for register academic information with empty data")
	def fill_regacademic_with_empty_data(String university2, String major2, String graduated2, String office2, String str2) {
		WebUI.setText(findTestObject('Object Repository/register-web/Page_Prevent/input_Capture object_alumnus'), '')
		WebUI.takeScreenshot()
		WebUI.setText(findTestObject('Object Repository/register-web/Page_Prevent/input_Capture object_jurusan'), '')
		WebUI.takeScreenshot()
		WebUI.setText(findTestObject('Object Repository/register-web/Page_Prevent/input_Capture object_grad_year'), '')
		WebUI.takeScreenshot()
		WebUI.setText(findTestObject('Object Repository/register-web/Page_Prevent/input_Capture object_alumnus2'), '')
		WebUI.takeScreenshot()
		WebUI.setText(findTestObject('Object Repository/register-web/Page_Prevent/input_Capture object_jurusan2'), '')
		WebUI.takeScreenshot()
		WebUI.setText(findTestObject('Object Repository/register-web/Page_Prevent/input_Capture object_grad_year2'), '')
		WebUI.takeScreenshot()
		WebUI.setText(findTestObject('Object Repository/register-web/Page_Prevent/input_Capture object_practice_address'), '')
		WebUI.takeScreenshot()
		WebUI.setText(findTestObject('Object Repository/register-web/Page_Prevent/input_Capture object_str_number'), '')
		WebUI.takeScreenshot()
		WebUI.click(findTestObject('Object Repository/register-web/Page_Prevent/button_Lanjut'))
		WebUI.takeScreenshot()
		WebUI.delay(2)
	}
	@Then("Unsuccessfully register academic information with empty data")
	def unsuccessfully_to_document_information_page() {
		WebUI.click(findTestObject('register-web/Page_Prevent/button_Lanjut'))
		WebUI.takeScreenshot()
		WebUI.closeBrowser()
	}

	//regacademic 3//
	@Given("I open website prevent for register academic information with number str more than 20 https://main--melodious-genie-0706de.netlify.app/")
	def open_website_for_regacademic_with_number_str_more_than_20() {
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://main--melodious-genie-0706de.netlify.app/')
		WebUI.maximizeWindow()
	}

	@When("I successfully register personal info and navigated to register academic information with number str more than 20")
	def open_regacademic_with_number_str_more_than_20() {
		WebUI.click(findTestObject('Object Repository/register-web/Page_Prevent/button_Dokter'))
		WebUI.takeScreenshot()
		WebUI.click(findTestObject('Object Repository/register-web/Page_Prevent/a_Apakah Kamu Dokter'))
		WebUI.takeScreenshot()
		WebUI.click(findTestObject('Object Repository/register-web/Page_Prevent/a_Daftar Sebagai Dokter'))
		WebUI.takeScreenshot()
		WebUI.setText(findTestObject('Object Repository/register-web/Page_Prevent/input_email'), 'dummy21@dummy.com')
		WebUI.takeScreenshot()
		WebUI.setText(findTestObject('Object Repository/register-web/Page_Prevent/input_full_name'), 'Dummy')
		WebUI.takeScreenshot()
		WebUI.setText(findTestObject('Object Repository/register-web/Page_Prevent/input_nik'), '3176890102030405')
		WebUI.takeScreenshot()
		WebUI.selectOptionByValue(findTestObject('Object Repository/register-web/Page_Prevent/select_Pilih Jenis KelaminLaki-LakiPerempuan'), 'Perempuan',false)
		WebUI.takeScreenshot()
		WebUI.setText(findTestObject('Object Repository/register-web/Page_Prevent/input_birth_place'), 'Jakarta')
		WebUI.takeScreenshot()
		WebUI.setText(findTestObject('Object Repository/register-web/Page_Prevent/input_Capture object_birth_date'), '01/06/1995')
		WebUI.takeScreenshot()
		WebUI.setText(findTestObject('Object Repository/register-web/Page_Prevent/input_religion'), 'Islam')
		WebUI.takeScreenshot()
		WebUI.click(findTestObject('Object Repository/register-web/Page_Prevent/button_Lanjut'))
		WebUI.takeScreenshot()
		WebUI.delay(2)
	}

	@And("I fill (.*),(.*),(.*),(.*),(.*) for register academic information with number str more than 20")
	def fill_regacademic_with_number_str_more_than_20(String university3, String major3, String graduated3, String office3, String str3) {
		WebUI.setText(findTestObject('Object Repository/register-web/Page_Prevent/input_Capture object_alumnus'), 'Universitas Indonesia')
		WebUI.takeScreenshot()
		WebUI.setText(findTestObject('Object Repository/register-web/Page_Prevent/input_Capture object_jurusan'), 'Kedokteran')
		WebUI.takeScreenshot()
		WebUI.setText(findTestObject('Object Repository/register-web/Page_Prevent/input_Capture object_grad_year'), '2017')
		WebUI.takeScreenshot()
		WebUI.setText(findTestObject('Object Repository/register-web/Page_Prevent/input_Capture object_alumnus2'), '')
		WebUI.takeScreenshot()
		WebUI.setText(findTestObject('Object Repository/register-web/Page_Prevent/input_Capture object_jurusan2'), '')
		WebUI.takeScreenshot()
		WebUI.setText(findTestObject('Object Repository/register-web/Page_Prevent/input_Capture object_grad_year2'), '')
		WebUI.takeScreenshot()
		WebUI.setText(findTestObject('Object Repository/register-web/Page_Prevent/input_Capture object_practice_address'), 'RSUD Kembangan')
		WebUI.takeScreenshot()
		WebUI.setText(findTestObject('Object Repository/register-web/Page_Prevent/input_Capture object_str_number'), '123456789012345678901')
		WebUI.takeScreenshot()
		WebUI.click(findTestObject('Object Repository/register-web/Page_Prevent/button_Lanjut'))
		WebUI.takeScreenshot()
		WebUI.delay(2)
	}
	@Then("Unsuccessfully register academic information with number str more than 20")
	def unsuccessfully_to_document_information_page_with_number_str_more_than_20() {
		WebUI.click(findTestObject('register-web/Page_Prevent/button_Lanjut'))
		WebUI.takeScreenshot()
		WebUI.closeBrowser()
	}

	//regacademic 4//
	@Given("I open website prevent for register academic information with years graduated more than now https://main--melodious-genie-0706de.netlify.app/")
	def open_website_for_regacademic_with_years_graduated_more_than_now() {
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://main--melodious-genie-0706de.netlify.app/')
		WebUI.maximizeWindow()
	}

	@When("I successfully register personal info and navigated to register academic information with years graduated more than now")
	def open_regacademic_with_years_graduated_more_than_now() {
		WebUI.click(findTestObject('Object Repository/register-web/Page_Prevent/button_Dokter'))
		WebUI.takeScreenshot()
		WebUI.click(findTestObject('Object Repository/register-web/Page_Prevent/a_Apakah Kamu Dokter'))
		WebUI.takeScreenshot()
		WebUI.click(findTestObject('Object Repository/register-web/Page_Prevent/a_Daftar Sebagai Dokter'))
		WebUI.takeScreenshot()
		WebUI.setText(findTestObject('Object Repository/register-web/Page_Prevent/input_email'), 'dummy21@dummy.com')
		WebUI.takeScreenshot()
		WebUI.setText(findTestObject('Object Repository/register-web/Page_Prevent/input_full_name'), 'Dummy')
		WebUI.takeScreenshot()
		WebUI.setText(findTestObject('Object Repository/register-web/Page_Prevent/input_nik'), '3176890102030405')
		WebUI.takeScreenshot()
		WebUI.selectOptionByValue(findTestObject('Object Repository/register-web/Page_Prevent/select_Pilih Jenis KelaminLaki-LakiPerempuan'), 'Perempuan',false)
		WebUI.takeScreenshot()
		WebUI.setText(findTestObject('Object Repository/register-web/Page_Prevent/input_birth_place'), 'Jakarta')
		WebUI.takeScreenshot()
		WebUI.setText(findTestObject('Object Repository/register-web/Page_Prevent/input_Capture object_birth_date'), '01/06/1995')
		WebUI.takeScreenshot()
		WebUI.setText(findTestObject('Object Repository/register-web/Page_Prevent/input_religion'), 'Islam')
		WebUI.takeScreenshot()
		WebUI.click(findTestObject('Object Repository/register-web/Page_Prevent/button_Lanjut'))
		WebUI.takeScreenshot()
		WebUI.delay(2)
	}

	@And("I fill (.*),(.*),(.*),(.*),(.*) for register academic information with years graduated more than now")
	def fill_regacademic_with_years_graduated_more_than_now(String university4, String major4, String graduated4, String office4, String str4) {
		WebUI.setText(findTestObject('Object Repository/register-web/Page_Prevent/input_Capture object_alumnus'), 'Universitas Indonesia')
		WebUI.takeScreenshot()
		WebUI.setText(findTestObject('Object Repository/register-web/Page_Prevent/input_Capture object_jurusan'), 'Kedokteran')
		WebUI.takeScreenshot()
		WebUI.setText(findTestObject('Object Repository/register-web/Page_Prevent/input_Capture object_grad_year'), '2027')
		WebUI.takeScreenshot()
		WebUI.setText(findTestObject('Object Repository/register-web/Page_Prevent/input_Capture object_alumnus2'), '')
		WebUI.takeScreenshot()
		WebUI.setText(findTestObject('Object Repository/register-web/Page_Prevent/input_Capture object_jurusan2'), '')
		WebUI.takeScreenshot()
		WebUI.setText(findTestObject('Object Repository/register-web/Page_Prevent/input_Capture object_grad_year2'), '')
		WebUI.takeScreenshot()
		WebUI.setText(findTestObject('Object Repository/register-web/Page_Prevent/input_Capture object_practice_address'), 'RSUD Kembangan')
		WebUI.takeScreenshot()
		WebUI.setText(findTestObject('Object Repository/register-web/Page_Prevent/input_Capture object_str_number'), '1234567')
		WebUI.takeScreenshot()
		WebUI.click(findTestObject('Object Repository/register-web/Page_Prevent/button_Lanjut'))
		WebUI.takeScreenshot()
		WebUI.delay(2)
	}
	@Then("Unsuccessfully register academic information with years graduated more than now")
	def unsuccessfully_to_document_information_page_with_years_graduated_more_than_now() {
		WebUI.click(findTestObject('register-web/Page_Prevent/button_Lanjut'))
		WebUI.takeScreenshot()
		WebUI.closeBrowser()
	}
}