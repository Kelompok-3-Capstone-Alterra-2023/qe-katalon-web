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

WebUI.click(findTestObject('Object Repository/login-web/Page_Prevent/a_Dokter Area (1)'))

WebUI.setText(findTestObject('Object Repository/login-web/Page_Prevent/input_Email_email (1)'), 'rifkhihebat@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/login-web/Page_Prevent/input_Email_password (1)'), 'A1JsZXNIBAo=')

WebUI.click(findTestObject('Object Repository/login-web/Page_Prevent/button_Log In (1)'))

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://main--melodious-genie-0706de.netlify.app/')

WebUI.click(findTestObject('Object Repository/login-web/Page_Prevent/a_Dokter Area (1)'))

WebUI.setText(findTestObject('Object Repository/login-web/Page_Prevent/input_Email_email (1)'), 'rifkhihebat@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/login-web/Page_Prevent/input_Email_password (1)'), 'ok+jXKlg4Gs=')

WebUI.click(findTestObject('Object Repository/login-web/Page_Prevent/button_Log In (1)'))

WebUI.closeBrowser()

