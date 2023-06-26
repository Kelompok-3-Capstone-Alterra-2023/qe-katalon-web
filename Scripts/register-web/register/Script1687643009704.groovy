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

WebUI.click(findTestObject('Object Repository/register-web/Page_Prevent/button_Dokter'))

WebUI.click(findTestObject('Object Repository/register-web/Page_Prevent/a_Apakah Kamu Dokter'))

WebUI.click(findTestObject('Object Repository/register-web/Page_Prevent/a_Daftar Sebagai Dokter'))

WebUI.setText(findTestObject('Object Repository/register-web/Page_Prevent/input_email'), 'dummy21@dummy.com')

WebUI.setText(findTestObject('Object Repository/register-web/Page_Prevent/input_full_name'), 'Dummy')

WebUI.setText(findTestObject('Object Repository/register-web/Page_Prevent/input_nik'), '3176890102030405')

WebUI.selectOptionByValue(findTestObject('Object Repository/register-web/Page_Prevent/select_Pilih Jenis KelaminLaki-LakiPerempuan'), 'Perempuan',false)

WebUI.setText(findTestObject('Object Repository/register-web/Page_Prevent/input_birth_place'), 'Jakarta')

WebUI.setText(findTestObject('Object Repository/register-web/Page_Prevent/input_Capture object_birth_date'), '01/06/1995')

WebUI.setText(findTestObject('Object Repository/register-web/Page_Prevent/input_religion'), 'Islam')

WebUI.click(findTestObject('Object Repository/register-web/Page_Prevent/button_Lanjut'))

WebUI.setText(findTestObject('Object Repository/register-web/Page_Prevent/input_Capture object_alumnus'), 'Universitas Indonesia')
WebUI.setText(findTestObject('Object Repository/register-web/Page_Prevent/input_Capture object_jurusan'), 'Kedokteran')
WebUI.setText(findTestObject('Object Repository/register-web/Page_Prevent/input_Capture object_grad_year'), '2017')
WebUI.setText(findTestObject('Object Repository/register-web/Page_Prevent/input_Capture object_alumnus2'), ' ')
WebUI.setText(findTestObject('Object Repository/register-web/Page_Prevent/input_Capture object_jurusan2'), ' ')
WebUI.setText(findTestObject('Object Repository/register-web/Page_Prevent/input_Capture object_grad_year2'), ' ')
WebUI.setText(findTestObject('Object Repository/register-web/Page_Prevent/input_Capture object_practice_address'), 'RSUD Kembangan')
WebUI.setText(findTestObject('Object Repository/register-web/Page_Prevent/input_Capture object_str_number'), '1234567')
WebUI.click(findTestObject('Object Repository/register-web/Page_Prevent/button_Lanjut'))

WebUI.uploadFile(findTestObject('Object Repository/register-web/Page_Prevent/Page_Prevent/input_file'), 'D:/DUMMY/CV.pdf')

WebUI.uploadFile(findTestObject('Object Repository/register-web/Page_Prevent/Page_Prevent/input_file (1)'), 'D:/DUMMY/IJAZAH.pdf')

WebUI.uploadFile(findTestObject('Object Repository/register-web/Page_Prevent/Page_Prevent/input_file (2)'), 'D:/DUMMY/STR.pdf')

WebUI.uploadFile(findTestObject('Object Repository/register-web/Page_Prevent/Page_Prevent/input_file (3)'), 'D:/DUMMY/SIP.pdf')

WebUI.click(findTestObject('Object Repository/register-web/Page_Prevent/button_Daftar'))

WebUI.closeBrowser()