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

WebUI.navigateToUrl('https://main--starlit-lokum-26b84a.netlify.app/dokter')

WebUI.setText(findTestObject('Object Repository/detaildoctor-web/Page_Prevent/input_Dokter akan segera menerima permintaa_9a7ed8'), 
    'A')

WebUI.click(findTestObject('Object Repository/detaildoctor-web/Page_Prevent/body_Beranda ArtikelDokterDokter AreaKonsul_f096ca'))

WebUI.setText(findTestObject('Object Repository/detaildoctor-web/Page_Prevent/input_Dokter akan segera menerima permintaa_9a7ed8'), 
    'Ad')

WebUI.click(findTestObject('Object Repository/detaildoctor-web/Page_Prevent/body_Beranda ArtikelDokterDokter AreaKonsul_596a8c'))

WebUI.setText(findTestObject('Object Repository/detaildoctor-web/Page_Prevent/input_Dokter akan segera menerima permintaa_9a7ed8'), 
    'Adolf')

WebUI.click(findTestObject('Object Repository/detaildoctor-web/Page_Prevent/div_Adolf Hitler'))

WebUI.verifyElementPresent(findTestObject('Object Repository/detaildoctor-web/Page_Prevent/div_Adolf Hitler'), 0)

WebUI.click(findTestObject('Object Repository/detaildoctor-web/Page_Prevent/input_Dokter akan segera menerima permintaa_9a7ed8'))

WebUI.click(findTestObject('Object Repository/detaildoctor-web/Page_Prevent/div_Konsultasi Dengan PreventLayanan Preven_80dfc1'))

WebUI.setText(findTestObject('Object Repository/detaildoctor-web/Page_Prevent/input_Dokter akan segera menerima permintaa_9a7ed8'), 
    'abc')

WebUI.click(findTestObject('Object Repository/detaildoctor-web/Page_Prevent/div_Dokter akan segera menerima permintaan _aab7cd'))

WebUI.verifyElementPresent(findTestObject('Object Repository/detaildoctor-web/Page_Prevent/div_Dokter akan segera menerima permintaan _aab7cd'), 
    0)

WebUI.setText(findTestObject('Object Repository/detaildoctor-web/Page_Prevent/input_Dokter akan segera menerima permintaa_9a7ed8'), 
    'A')

WebUI.click(findTestObject('Object Repository/detaildoctor-web/Page_Prevent/body_Beranda ArtikelDokterDokter AreaKonsul_f096ca'))

WebUI.setText(findTestObject('Object Repository/detaildoctor-web/Page_Prevent/input_Dokter akan segera menerima permintaa_9a7ed8'), 
    'Ad')

WebUI.click(findTestObject('Object Repository/detaildoctor-web/Page_Prevent/input_Dokter akan segera menerima permintaa_9a7ed8'))

WebUI.click(findTestObject('Object Repository/detaildoctor-web/Page_Prevent/a_Detail'))

WebUI.verifyElementClickable(findTestObject('Object Repository/detaildoctor-web/Page_Prevent/a_Detail'))

WebUI.rightClick(findTestObject('Object Repository/detaildoctor-web/Page_Prevent/a_Detail'))

WebUI.click(findTestObject('Object Repository/detaildoctor-web/Page_Prevent/div_Adolf Hitler0 TahunDetail'))

WebUI.click(findTestObject('Object Repository/detaildoctor-web/Page_Prevent/a_Detail'))

WebUI.click(findTestObject('Object Repository/detaildoctor-web/Page_Prevent/span_Adolf Hitler'))

WebUI.verifyElementPresent(findTestObject('Object Repository/detaildoctor-web/Page_Prevent/span_Adolf Hitler'), 0)

WebUI.click(findTestObject('Object Repository/detaildoctor-web/Page_Prevent/svg_Dokter_w-6 h-6 ml-2'))

WebUI.click(findTestObject('Object Repository/detaildoctor-web/Page_Prevent/a_Apakah Kamu Dokter'))

WebUI.click(findTestObject('Object Repository/detaildoctor-web/Page_Prevent/a_Daftar Sebagai Dokter'))

WebUI.verifyElementPresent(findTestObject('Object Repository/detaildoctor-web/Page_Prevent/input_email'), 0)

