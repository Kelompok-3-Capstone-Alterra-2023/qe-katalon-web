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

WebUI.navigateToUrl('https://main--starlit-lokum-26b84a.netlify.app/')

WebUI.click(findTestObject('Object Repository/login-web/Page_Prevent/a_Dokter Area'))

WebUI.setText(findTestObject('Object Repository/login-web/Page_Prevent/input_Email_email'), 'rifkhihebat@upi.edu')

WebUI.click(findTestObject('Object Repository/login-web/Page_Prevent/label_Password'))

WebUI.setEncryptedText(findTestObject('Object Repository/login-web/Page_Prevent/input_Email_password'), 'IAFXosDtfqfih8n2pouL5A==')

WebUI.click(findTestObject('Object Repository/login-web/Page_Prevent/button_Log In'))

WebUI.click(findTestObject('Object Repository/login-web/Page_Prevent - Dokter/p_Hallo, Selamat Datang, Dokter dummydummy'))

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://main--starlit-lokum-26b84a.netlify.app/')

WebUI.click(findTestObject('Object Repository/login-web/Page_Prevent/a_Dokter Area'))

WebUI.setText(findTestObject('Object Repository/login-web/Page_Prevent/input_Email_email'), 'rifkhihebat@upi.edu')

WebUI.setEncryptedText(findTestObject('Object Repository/login-web/Page_Prevent/input_Email_password'), 'IAFXosDtfqfSaKDEEhsuig==')

WebUI.click(findTestObject('Object Repository/login-web/Page_Prevent/p_Log In'))

WebUI.click(findTestObject('Object Repository/login-web/Page_Prevent/div_Email atau kata sandi salah. Silahkan c_383427'))

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://main--starlit-lokum-26b84a.netlify.app/')

WebUI.click(findTestObject('Object Repository/login-web/Page_Prevent/a_Dokter Area'))

WebUI.click(findTestObject('Object Repository/login-web/Page_Prevent/button_Log In'))

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://main--starlit-lokum-26b84a.netlify.app/')

WebUI.click(findTestObject('Object Repository/login-web/Page_Prevent/a_Dokter Area'))

WebUI.setText(findTestObject('Object Repository/login-web/Page_Prevent/input_Email_email'), 'rifkhihebat@upi.edu')

WebUI.click(findTestObject('Object Repository/login-web/Page_Prevent/label_Password'))

WebUI.setEncryptedText(findTestObject('Object Repository/login-web/Page_Prevent/input_Email_password'), 'IAFXosDtfqfih8n2pouL5A==')

WebUI.click(findTestObject('Object Repository/login-web/Page_Prevent/button_Log In'))

WebUI.click(findTestObject('Object Repository/login-web/Page_Prevent - Dokter/p_Hallo, Selamat Datang, Dokter dummydummy'))

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://main--starlit-lokum-26b84a.netlify.app/')

WebUI.click(findTestObject('Object Repository/login-web/Page_Prevent/a_Dokter Area'))

WebUI.setText(findTestObject('Object Repository/login-web/Page_Prevent/input_Email_email'), 'rifkhihebat@upi.edu')

WebUI.setEncryptedText(findTestObject('Object Repository/login-web/Page_Prevent/input_Email_password'), 'IAFXosDtfqfSaKDEEhsuig==')

WebUI.click(findTestObject('Object Repository/login-web/Page_Prevent/p_Log In'))

WebUI.click(findTestObject('Object Repository/login-web/Page_Prevent/div_Email atau kata sandi salah. Silahkan c_383427'))

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://main--starlit-lokum-26b84a.netlify.app/')

WebUI.click(findTestObject('Object Repository/login-web/Page_Prevent/a_Dokter Area'))

WebUI.click(findTestObject('Object Repository/login-web/Page_Prevent/button_Log In'))

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://main--starlit-lokum-26b84a.netlify.app/')

WebUI.click(findTestObject('Object Repository/login-web/Page_Prevent/a_Dokter Area'))

WebUI.click(findTestObject('Object Repository/login-web/Page_Prevent/button_Log In'))

WebUI.click(findTestObject('Object Repository/login-web/Page_Prevent/form_EmailPasswordLog InLupa kata sandi'))

WebUI.closeBrowser()

