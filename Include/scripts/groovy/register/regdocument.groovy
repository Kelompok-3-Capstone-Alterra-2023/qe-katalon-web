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



class regdocument {

	//regdocument 1//
	@Given("I open website prevent for register academic information with files format based on requirement https://main--melodious-genie-0706de.netlify.app/")
	def open_website_prefent_for_regdocument_with_files_valid_format() {
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://main--melodious-genie-0706de.netlify.app/')
		WebUI.maximizeWindow()
	}

	@When("I successfully register personal info, academic information and navigated to document information page with files format based on requirement")
	def navigated_regdocument_with_files_valid_format() {
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
	}

	@And("I fill all field upload files format based on requirement")
	def fill_all_field_files_with_valid_format() {
		WebUI.uploadFile(findTestObject('Object Repository/register-web/Page_Prevent/Page_Prevent/input_file'), 'D:/DUMMY/CV.pdf')
		WebUI.takeScreenshot()
		WebUI.uploadFile(findTestObject('Object Repository/register-web/Page_Prevent/Page_Prevent/input_file (1)'), 'D:/DUMMY/IJAZAH.pdf')
		WebUI.takeScreenshot()
		WebUI.uploadFile(findTestObject('Object Repository/register-web/Page_Prevent/Page_Prevent/input_file (2)'), 'D:/DUMMY/STR.pdf')
		WebUI.takeScreenshot()
		WebUI.uploadFile(findTestObject('Object Repository/register-web/Page_Prevent/Page_Prevent/input_file (3)'), 'D:/DUMMY/SIP.pdf')
		WebUI.takeScreenshot()
		WebUI.delay(2)
	}
	@Then("I verify successfully register with files format based on requirement")
	def verify_successfully_regdocument_with_files_valid_format() {
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/register-web/Page_Prevent/button_Daftar'))
		WebUI.delay(2)
		WebUI.takeScreenshot()
		WebUI.closeBrowser()
	}

	//regdocument 2//
	@Given("I open website prevent for register academic information with all files using format docs https://main--melodious-genie-0706de.netlify.app/")
	def open_website_prefent_for_regdocument_with_files_using_format_docs() {
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://main--melodious-genie-0706de.netlify.app/')
		WebUI.maximizeWindow()
	}

	@When("I successfully register personal info, academic information and navigated to document information page with all files using format docs")
	def navigated_regdocument_with_files_using_format_docs() {
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
	}

	@And("I fill all field upload with all files using format docs")
	def fill_all_field_files_with_files_using_format_docs() {
		WebUI.uploadFile(findTestObject('Object Repository/register-web/Page_Prevent/Page_Prevent/input_file'), 'D:/DUMMY/CV.docx')
		WebUI.takeScreenshot()
		WebUI.uploadFile(findTestObject('Object Repository/register-web/Page_Prevent/Page_Prevent/input_file (1)'), 'D:/DUMMY/IJAZAH.docx')
		WebUI.takeScreenshot()
		WebUI.uploadFile(findTestObject('Object Repository/register-web/Page_Prevent/Page_Prevent/input_file (2)'), 'D:/DUMMY/STR.docx')
		WebUI.takeScreenshot()
		WebUI.uploadFile(findTestObject('Object Repository/register-web/Page_Prevent/Page_Prevent/input_file (3)'), 'D:/DUMMY/SIP.docx')
		WebUI.takeScreenshot()
		WebUI.delay(2)
	}
	@Then("I verify successfully register with all files using format docs")
	def verify_successfully_regdocument_with_files_using_format_docs() {
		WebUI.click(findTestObject('Object Repository/register-web/Page_Prevent/button_Daftar'))
		WebUI.delay(5)
		WebUI.takeScreenshot()
		WebUI.closeBrowser()
	}

	//regdocument 3//
	@Given("I open website prevent for register academic information with all files using size file more than 2MB https://main--melodious-genie-0706de.netlify.app/")
	def open_website_prefent_for_regdocument_with_files_using_size_file_more_than_2MB() {
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://main--melodious-genie-0706de.netlify.app/')
		WebUI.maximizeWindow()
	}

	@When("I successfully register personal info, academic information and navigated to document information page all files using size file more than 2MB")
	def navigated_regdocument_with_files_using_size_file_more_than_2MB() {
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
	}

	@And("I fill all field upload with all files using size file more than 2MB")
	def fill_all_field_files_with_files_using_size_file_more_than_2MB() {
		WebUI.uploadFile(findTestObject('Object Repository/register-web/Page_Prevent/Page_Prevent/input_file'), 'D:/DUMMY/Free_Test_Data_10.5MB_PDF.pdf')
		WebUI.takeScreenshot()
		WebUI.uploadFile(findTestObject('Object Repository/register-web/Page_Prevent/Page_Prevent/input_file (1)'), 'D:/DUMMY/Free_Test_Data_10.5MB_PDF.pdf')
		WebUI.takeScreenshot()
		WebUI.uploadFile(findTestObject('Object Repository/register-web/Page_Prevent/Page_Prevent/input_file (2)'), 'D:/DUMMY/Free_Test_Data_10.5MB_PDF.pdf')
		WebUI.takeScreenshot()
		WebUI.uploadFile(findTestObject('Object Repository/register-web/Page_Prevent/Page_Prevent/input_file (3)'), 'D:/DUMMY/Free_Test_Data_10.5MB_PDF.pdf')
		WebUI.takeScreenshot()
		WebUI.delay(2)
	}
	@Then("I verify successfully register with all files using size file more than 2MB")
	def verify_successfully_regdocument_with_files_using_size_file_more_than_2MB() {
		WebUI.click(findTestObject('Object Repository/register-web/Page_Prevent/button_Daftar'))
		WebUI.delay(5)
		WebUI.takeScreenshot()
		WebUI.closeBrowser()
	}
}