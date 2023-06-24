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
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("User launch open website prevent")
	def launch_web_prevent() {
		WebUI.openBrowser('')
		
		WebUI.navigateToUrl('https://main--melodious-genie-0706de.netlify.app/')
	}

	@When("User open register page")
	def open_register_page() {
		WebUI.click(findTestObject('Object Repository/register-web/TC_WEB_RegInfo_03/svg_Dokter_w-6 h-6 ml-2'))
		
		WebUI.click(findTestObject('Object Repository/register-web/TC_WEB_RegInfo_03/a_Apakah Kamu Dokter'))
		
		WebUI.click(findTestObject('Object Repository/register-web/TC_WEB_RegInfo_03/a_Daftar Sebagai Dokter'))
		
		WebUI.delay(5)
	}

	@And("User fill (.*),(.*),(.*),(.*),(.*),(.*),(.*)")
	def user_fill(String email,String name,String NIK,String gender,String place,String dob,String religion)
	{
	 WebUI.setText(findTestObject('Object Repository/register-web/TC_WEB_RegInfo_03/input_email'), 'dummy21@dummy.com')
	 WebUI.setText(findTestObject('Object Repository/register-web/TC_WEB_RegInfo_03/input_namaLengkap'), 'Dummy')
	 WebUI.setText(findTestObject('Object Repository/register-web/TC_WEB_RegInfo_03/input_nik'), '3176890102030405')
	 WebUI.setText(findTestObject('Object Repository/register-web/TC_WEB_RegInfo_03/input_jenisKelamin'), 'Perempuan')
	 WebUI.setText(findTestObject('Object Repository/register-web/TC_WEB_RegInfo_03/input_tempatLahir'), 'Jakarta')
	 WebUI.setText(findTestObject('Object Repository/register-web/TC_WEB_RegInfo_03/input_agama'), 'Islam')
	 
	 
	 WebUI.setText(findTestObject('Object Repository/register-web/TC_WEB_RegInfo_03/input_email'), ' ')
	 WebUI.setText(findTestObject('Object Repository/register-web/TC_WEB_RegInfo_03/input_namaLengkap'), ' ')
	 WebUI.setText(findTestObject('Object Repository/register-web/TC_WEB_RegInfo_03/input_nik'), ' ')
	 WebUI.setText(findTestObject('Object Repository/register-web/TC_WEB_RegInfo_03/input_tempatLahir'), ' ')
	 WebUI.setText(findTestObject('Object Repository/register-web/TC_WEB_RegInfo_03/input_agama'), ' ')
	 
	 WebUI.setText(findTestObject('Object Repository/register-web/TC_WEB_RegInfo_03/input_email'), 'dummy21')
	 WebUI.setText(findTestObject('Object Repository/register-web/TC_WEB_RegInfo_03/input_namaLengkap'), 'Dummy')
	 WebUI.setText(findTestObject('Object Repository/register-web/TC_WEB_RegInfo_03/input_nik'), '3176890102030405')
	 
	 
	 WebUI.setText(findTestObject('Object Repository/register-web/TC_WEB_RegInfo_03/input_email'), 'dummy21@dummy.com')
	 WebUI.setText(findTestObject('Object Repository/register-web/TC_WEB_RegInfo_03/input_email'), 'dummy21@dummy.com')
	 WebUI.setText(findTestObject('Object Repository/register-web/TC_WEB_RegInfo_03/input_jenisKelamin'), 'Perempuan')
	 WebUI.setText(findTestObject('Object Repository/register-web/TC_WEB_RegInfo_03/input_tempatLahir'), 'Jakarta')
	 WebUI.setText(findTestObject('Object Repository/register-web/TC_WEB_RegInfo_03/input_agama'), 'Islam')
	 
	 WebUI.setText(findTestObject('Object Repository/register-web/TC_WEB_RegInfo_03/input_namaLengkap'), 'D')
	 WebUI.setText(findTestObject('Object Repository/register-web/TC_WEB_RegInfo_03/input_nik'), '3176890102030405')
	 WebUI.setText(findTestObject('Object Repository/register-web/TC_WEB_RegInfo_03/input_jenisKelamin'), 'Perempuan')
	 WebUI.setText(findTestObject('Object Repository/register-web/TC_WEB_RegInfo_03/input_tempatLahir'), 'Jakarta')
	 WebUI.setText(findTestObject('Object Repository/register-web/TC_WEB_RegInfo_03/input_agama'), 'Islam')
	 
	 WebUI.setText(findTestObject('Object Repository/register-web/TC_WEB_RegInfo_03/input_namaLengkap'), 'Dummy')
	 WebUI.setText(findTestObject('Object Repository/register-web/TC_WEB_RegInfo_03/input_nik'), '3176890102030405')
	 WebUI.setText(findTestObject('Object Repository/register-web/TC_WEB_RegInfo_03/input_jenisKelamin'), 'Perempuan')
	 WebUI.setText(findTestObject('Object Repository/register-web/TC_WEB_RegInfo_03/input_tempatLahir'), 'Jakarta')
	 WebUI.setText(findTestObject('Object Repository/register-web/TC_WEB_RegInfo_03/input_agama'), 'Islam')
	 
	}
	@Then("User verify navigated to next page")
	def verify_next_page(){
	WebUI.click(findTestObject('Object Repository/register-web/TC_WEB_RegInfo_03/button_Lanjut'))
	WebUI.click(findTestObject('Object Repository/register-web/TC_WEB_RegInfo_03/form_Email tidak validLanjut'))
	
	WebUI.click(findTestObject('Object Repository/register-web/TC_WEB_RegInfo_03/p_Email tidak valid'))
	
	WebUI.closeBrowser()
	}
}