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

WebUI.click(findTestObject('Object Repository/postArtikel/Page_Prevent/a_Dokter Area'))

WebUI.setText(findTestObject('Object Repository/postArtikel/Page_Prevent/input_Email_email'), 'rifkhihebat@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/postArtikel/Page_Prevent/input_Email_password'), 'A1JsZXNIBAo=')

WebUI.click(findTestObject('Object Repository/postArtikel/Page_Prevent/button_Log In'))

WebUI.click(findTestObject('Object Repository/postArtikel/Page_Prevent - Dokter/svg'))

WebUI.click(findTestObject('Object Repository/postArtikel/Page_Prevent - Dokter/a_Artikel'))

WebUI.setText(findTestObject('Object Repository/postArtikel/Page_Prevent - Dokter/input_Dokter Area_w-640px h-50px mt-39px'), 
    'kesehatan')

WebUI.click(findTestObject('Object Repository/postArtikel/Page_Prevent - Dokter/button_Cari'))

WebUI.click(findTestObject('Object Repository/postArtikel/Page_Prevent - Dokter/button_Cari'))

WebUI.setText(findTestObject('Object Repository/postArtikel/Page_Prevent - Dokter/input_Dokter Area_w-640px h-50px mt-39px'), 
    'doremi')

WebUI.click(findTestObject('Object Repository/postArtikel/Page_Prevent - Dokter/button_Cari'))

WebUI.click(findTestObject('Object Repository/postArtikel/Page_Prevent - Dokter/div_Tambah ArtikelCari NoArtikelGambarKateg_cc0dfb'))

WebUI.setText(findTestObject('Object Repository/postArtikel/Page_Prevent - Dokter/input_Dokter Area_w-640px h-50px mt-39px'), 
    'kesehatan')

WebUI.sendKeys(findTestObject('Object Repository/postArtikel/Page_Prevent - Dokter/input_Dokter Area_w-640px h-50px mt-39px'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/postArtikel/Page_Prevent - Dokter/button_Cari'))

WebUI.click(findTestObject('Object Repository/postArtikel/Page_Prevent - Dokter/input_Dokter Area_w-640px h-50px mt-39px'))

WebUI.click(findTestObject('Object Repository/postArtikel/Page_Prevent - Dokter/button_Edit'))

WebUI.setText(findTestObject('Object Repository/postArtikel/Page_Prevent - Dokter/input_Maksimal 250 Karakter_w-full rounded-lg'), 
    'Mendukung Kesehatan Mental: Mengatasi Tantangan dalam Hidup Sehari-hari untuk generasi z')

WebUI.click(findTestObject('Object Repository/postArtikel/Page_Prevent - Dokter/button_Kirim Artikel'))

WebUI.click(findTestObject('Object Repository/postArtikel/Page_Prevent - Dokter/path'))

WebUI.setText(findTestObject('Object Repository/postArtikel/Page_Prevent - Dokter/input_Maksimal 250 Karakter_w-full rounded-lg_1'), 
    'Kesehatan mental kaum rebahan generasi Z tahun 2023')

WebUI.click(findTestObject('Object Repository/postArtikel/Page_Prevent - Dokter/p'))

WebUI.click(findTestObject('Object Repository/postArtikel/Page_Prevent - Dokter/p'))

WebUI.click(findTestObject('Object Repository/postArtikel/Page_Prevent - Dokter/div_Pilih Gambar'))

WebUI.click(findTestObject('Object Repository/postArtikel/Page_Prevent - Dokter/input_Untitled Diagram.png_kategori'))

WebUI.click(findTestObject('Object Repository/postArtikel/Page_Prevent - Dokter/p_Kirim Artikel'))

