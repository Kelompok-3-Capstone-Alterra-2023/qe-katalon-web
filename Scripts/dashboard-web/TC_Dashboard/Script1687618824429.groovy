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

WebUI.click(findTestObject('Object Repository/dashboard-web/Page_Prevent - Dokter/svg'))

WebUI.rightClick(findTestObject('Object Repository/dashboard-web/Page_Prevent - Dokter/a_Dashboard'))

WebUI.click(findTestObject('Object Repository/dashboard-web/Page_Prevent - Dokter/div_Dashboard'))

WebUI.click(findTestObject('Object Repository/dashboard-web/Page_Prevent - Dokter/li_Dokter Area'))

WebUI.click(findTestObject('Object Repository/dashboard-web/Page_Prevent - Dokter/rect'))

WebUI.click(findTestObject('Object Repository/dashboard-web/Page_Prevent - Dokter/div_Pesanan'))

WebUI.selectOptionByValue(findTestObject('Object Repository/dashboard-web/Page_Prevent - Dokter/select_12510'), '5', true)

WebUI.click(findTestObject('Object Repository/dashboard-web/Page_Prevent - Dokter/td_5'))

WebUI.click(findTestObject('Object Repository/dashboard-web/Page_Prevent - Dokter/button_Selanjutnya'))

WebUI.click(findTestObject('Object Repository/dashboard-web/Page_Prevent - Dokter/button_Sebelumnya'))

WebUI.click(findTestObject('Object Repository/dashboard-web/Page_Prevent - Dokter/svg'))

WebUI.click(findTestObject('Object Repository/dashboard-web/Page_Prevent - Dokter/div_Artikel'))

WebUI.click(findTestObject('Object Repository/dashboard-web/Page_Prevent - Dokter/button_Tambah Artikel'))

WebUI.click(findTestObject('Object Repository/dashboard-web/Page_Prevent - Dokter/path'))

WebUI.click(findTestObject('Object Repository/dashboard-web/Page_Prevent - Dokter/div_Dokter Area Hai, Dokter'))

WebUI.click(findTestObject('Object Repository/dashboard-web/Page_Prevent - Dokter/svg'))

WebUI.click(findTestObject('Object Repository/dashboard-web/Page_Prevent - Dokter/div_Pesan'))

WebUI.click(findTestObject('Object Repository/dashboard-web/Page_Prevent - Dokter/div_Action'))

WebUI.click(findTestObject('Object Repository/dashboard-web/Page_Prevent - Dokter/rect'))

WebUI.click(findTestObject('Object Repository/dashboard-web/Page_Prevent - Dokter/a_Notifikasi'))

WebUI.click(findTestObject('Object Repository/dashboard-web/Page_Prevent - Dokter/rect'))

WebUI.click(findTestObject('Object Repository/dashboard-web/Page_Prevent - Dokter/div_Notifikasi'))

WebUI.click(findTestObject('Object Repository/dashboard-web/Page_Prevent - Dokter/p_Sudah Dibaca'))

WebUI.click(findTestObject('Object Repository/dashboard-web/Page_Prevent - Dokter/svg'))

WebUI.click(findTestObject('Object Repository/dashboard-web/Page_Prevent - Dokter/div_Komisi'))

WebUI.click(findTestObject('Object Repository/dashboard-web/Page_Prevent - Dokter/svg'))

WebUI.click(findTestObject('Object Repository/dashboard-web/Page_Prevent - Dokter/a_Komisi'))

WebUI.click(findTestObject('Object Repository/dashboard-web/Page_Prevent - Dokter/rect'))

WebUI.click(findTestObject('Object Repository/dashboard-web/Page_Prevent - Dokter/div_Dashboard MenuDashboardPesananArtikelPe_2f657d'))

WebUI.click(findTestObject('Object Repository/dashboard-web/Page_Prevent - Dokter/div_Profil'))

WebUI.click(findTestObject('Object Repository/dashboard-web/Page_Prevent - Dokter/p_Gambar Profil'))

WebUI.click(findTestObject('Object Repository/dashboard-web/Page_Prevent - Dokter/div_Dokter Area Hai, Dokter'))

WebUI.click(findTestObject('Object Repository/dashboard-web/Page_Prevent - Dokter/rect_1'))

WebUI.click(findTestObject('Object Repository/dashboard-web/Page_Prevent - Dokter/div_Dashboard MenuDashboardPesananArtikelPe_2f657d'))

WebUI.click(findTestObject('Object Repository/dashboard-web/Page_Prevent - Dokter/div_Keluar'))

WebUI.closeBrowser()

