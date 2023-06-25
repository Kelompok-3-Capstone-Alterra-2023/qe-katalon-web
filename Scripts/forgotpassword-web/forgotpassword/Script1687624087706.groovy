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

WebUI.click(findTestObject('Object Repository/forgotpassword/Page_Prevent/a_Dokter Area'))

WebUI.click(findTestObject('Object Repository/forgotpassword/Page_Prevent/button_Lupa kata sandi'))

WebUI.setText(findTestObject('Object Repository/forgotpassword/Page_Prevent/input_Lupa Kata Sandi_email'), 'rifkhihebat')

WebUI.click(findTestObject('Object Repository/forgotpassword/Page_Prevent/button_Log In'))

WebUI.click(findTestObject('Object Repository/forgotpassword/Page_Prevent/div_Lupa Kata SandiLupa Kata Sandi Ikuti la_7725c4'))

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://main--starlit-lokum-26b84a.netlify.app/')

WebUI.click(findTestObject('Object Repository/forgotpassword/Page_Prevent/a_Dokter Area'))

WebUI.click(findTestObject('Object Repository/forgotpassword/Page_Prevent/button_Lupa kata sandi'))

WebUI.click(findTestObject('Object Repository/forgotpassword/Page_Prevent/button_Log In'))

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://main--starlit-lokum-26b84a.netlify.app/')

WebUI.click(findTestObject('Object Repository/forgotpassword/Page_Prevent/a_Dokter Area'))

WebUI.click(findTestObject('Object Repository/forgotpassword/Page_Prevent/button_Lupa kata sandi'))

WebUI.setText(findTestObject('Object Repository/forgotpassword/Page_Prevent/input_Lupa Kata Sandi_email'), 'rifkhihebat@upi.edu')

WebUI.click(findTestObject('Object Repository/forgotpassword/Page_Prevent/button_Log In'))

WebUI.closeBrowser()

