import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://main--melodious-genie-0706de.netlify.app/')

WebUI.click(findTestObject('Object Repository/register-web/TC_WEB_RegInfo_03/svg_Dokter_w-6 h-6 ml-2'))

WebUI.click(findTestObject('Object Repository/register-web/TC_WEB_RegInfo_03/a_Apakah Kamu Dokter'))

WebUI.click(findTestObject('Object Repository/register-web/TC_WEB_RegInfo_03/a_Daftar Sebagai Dokter'))

WebUI.setText(findTestObject('Object Repository/register-web/TC_WEB_RegInfo_03/input_email'), 'dummy21')

WebUI.setText(findTestObject('Object Repository/register-web/TC_WEB_RegInfo_03/input_namaLengkap'), 'Dummy')

WebUI.setText(findTestObject('Object Repository/register-web/TC_WEB_RegInfo_03/input_nik'), '3176890102030405')

WebUI.setText(findTestObject('Object Repository/register-web/TC_WEB_RegInfo_03/input_jenisKelamin'), 'Perempuan')

WebUI.setText(findTestObject('Object Repository/register-web/TC_WEB_RegInfo_03/input_tempatLahir'), 'Jakarta')

WebUI.setText(findTestObject('Object Repository/register-web/TC_WEB_RegInfo_03/input_agama'), 'Islam')

WebUI.click(findTestObject('Object Repository/register-web/TC_WEB_RegInfo_03/button_Lanjut'))

WebUI.click(findTestObject('Object Repository/register-web/TC_WEB_RegInfo_03/form_Email tidak validLanjut'))

WebUI.click(findTestObject('Object Repository/register-web/TC_WEB_RegInfo_03/p_Email tidak valid'))

WebUI.closeBrowser()

