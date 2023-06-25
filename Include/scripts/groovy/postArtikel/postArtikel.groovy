package postArtikel
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



class postArtikel {

	//Search-article//
	@Given("User open website prevent for login  and go to article")
	def launchLogPostArticle() {
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://main--melodious-genie-0706de.netlify.app/')
		WebUI.maximizeWindow()
		WebUI.click(findTestObject('Object Repository/login-web/Page_Prevent/a_Dokter Area'))
		WebUI.setText(findTestObject('Object Repository/postArtikel/Page_Prevent/input_Email_email'), 'rifkhihebat@gmail.com')
		WebUI.click(findTestObject('Object Repository/login-web/Page_Prevent/label_Password'))
		WebUI.setEncryptedText(findTestObject('Object Repository/postArtikel/Page_Prevent/input_Email_password'), 'A1JsZXNIBAo=')
		WebUI.click(findTestObject('Object Repository/login-web/Page_Prevent/button_Log In'))
		WebUI.click(findTestObject('Object Repository/login-web/Page_Prevent - Dokter/p_Hallo, Selamat Datang, Dokter dummydummy'))
		WebUI.click(findTestObject('Object Repository/dashboard-web/Page_Prevent - Dokter/svg'))
		WebUI.click(findTestObject('Object Repository/postArtikel/Page_Prevent - Dokter/a_Artikel'))
		WebUI.delay(3)
		WebUI.takeScreenshot()
	}
	
	@When("User check article with invalid data and verify data")
	def invalidDataArt() {
		WebUI.setText(findTestObject('Object Repository/postArtikel/Page_Prevent - Dokter/input_Dokter Area_w-640px h-50px mt-39px'),'doremi')
		WebUI.click(findTestObject('Object Repository/postArtikel/Page_Prevent - Dokter/button_Cari'))
		WebUI.delay(3)
		WebUI.takeScreenshot()
		
		WebUI.verifyElementPresent(findTestObject('Object Repository/postArtikel/Page_Prevent - Dokter/td_0 artikel'), 30, FailureHandling.STOP_ON_FAILURE)
		WebUI.delay(3)
		WebUI.takeScreenshot()
		WebUI.closeBrowser()
	}

	@Then("User check article with valid data and verify data")
	def validDataArt() {
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://main--melodious-genie-0706de.netlify.app/')
		WebUI.maximizeWindow()
		WebUI.click(findTestObject('Object Repository/login-web/Page_Prevent/a_Dokter Area'))
		WebUI.setText(findTestObject('Object Repository/postArtikel/Page_Prevent/input_Email_email'), 'rifkhihebat@gmail.com')
		WebUI.click(findTestObject('Object Repository/login-web/Page_Prevent/label_Password'))
		WebUI.setEncryptedText(findTestObject('Object Repository/postArtikel/Page_Prevent/input_Email_password'), 'A1JsZXNIBAo=')
		WebUI.click(findTestObject('Object Repository/login-web/Page_Prevent/button_Log In'))
		WebUI.click(findTestObject('Object Repository/login-web/Page_Prevent - Dokter/p_Hallo, Selamat Datang, Dokter dummydummy'))
		WebUI.click(findTestObject('Object Repository/dashboard-web/Page_Prevent - Dokter/svg'))
		WebUI.click(findTestObject('Object Repository/postArtikel/Page_Prevent - Dokter/a_Artikel'))
		WebUI.delay(3)
		WebUI.takeScreenshot()
	
		WebUI.setText(findTestObject('Object Repository/postArtikel/Page_Prevent - Dokter/input_Dokter Area_w-640px h-50px mt-39px'),'kesehatan')
		WebUI.click(findTestObject('Object Repository/postArtikel/Page_Prevent - Dokter/button_Cari'))
		WebUI.delay(3)
		WebUI.takeScreenshot()
		WebUI.closeBrowser()
	}
	
	
	//edit-article//
	

	@When("User editing article")
	def editDataArt() {
		WebUI.click(findTestObject('Object Repository/postArtikel/Page_Prevent - Dokter/button_Edit'))
		WebUI.click(findTestObject('Object Repository/postArtikel/Page_Prevent - Dokter/button_Kirim Artikel'))
		WebUI.delay(3)
		WebUI.takeScreenshot()
		
	}

	@Then("success edited article")
	def successEditArt() {
		WebUI.delay(3)
		WebUI.takeScreenshot()
		WebUI.closeBrowser()
	}
	
	//Delete-article//
	
	@When("User deleting article")
	def hapusDataArt() {
		WebUI.click(findTestObject('Object Repository/postArtikel/Page_Prevent - Dokter/button_Hapus'))
		WebUI.delay(3)
		WebUI.takeScreenshot()
	}
	

	@Then("success deleted article")
	def successhapusArt() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/dashboard-web/Page_Prevent - Dokter/button_Tambah Artikel'), 30, FailureHandling.STOP_ON_FAILURE)
		WebUI.delay(3)
		WebUI.takeScreenshot()
		WebUI.closeBrowser()
	}
	
	//Create-a-new--article-with-valid-data//
	
	@When("User fill the field after click create a new article")
	def fillValidDataArt() {
		WebUI.click(findTestObject('Object Repository/postArtikel/Page_Prevent - Dokter/button_Tambah Artikel'))
		WebUI.takeScreenshot()
		WebUI.setText(findTestObject('Object Repository/postArtikel/Page_Prevent - Dokter/input_Maksimal 250 Karakter_w-full rounded-lg'), 'Kesehatan mental kaum rebahan generasi Z tahun 2023')
		WebUI.setText(findTestObject('Object Repository/postArtikel/Page_Prevent - Dokter/p'), 'Kesehatan mental adalah aspek penting dari kesejahteraan kita yang tidak boleh diabaikan. Di tengah kehidupan yang serba cepat dan tekanan yang tinggi, penting bagi kita untuk menjaga kesehatan mental kita agar tetap seimbang dan bahagia. Berikut ini adalah beberapa tips untuk mengatasi tantangan dalam hidup sehari-hari dan mendukung kesehatan mental kita:Mengelola Stres: Stres dapat memiliki dampak negatif pada kesehatan mental kita. Penting bagi kita untuk mengenali tanda-tanda stres dan mengambil langkah-langkah untuk mengelolanya. Carilah cara-cara untuk meredakan stres seperti olahraga, meditasi, atau melakukan hobi yang kita sukai. Menjaga Keseimbangan Hidup: Penting bagi kita untuk menciptakan keseimbangan antara pekerjaan, kehidupan pribadi, dan waktu istirahat. Berikan waktu untuk diri sendiri, keluarga, dan teman-teman, serta lakukan aktivitas yang menyenangkan untuk mengisi energi positif. Mengembangkan Dukungan Sosial: Membangun hubungan yang sehat dan saling mendukung dengan orang lain dapat membantu mengatasi tantangan dan meningkatkan kesehatan mental. Carilah dukungan dari keluarga, teman, atau bahkan bergabung dengan komunitas yang memiliki minat yang sama. Berlatih Self-Care: Jangan lupa merawat diri sendiri secara fisik dan emosional. Lakukan kegiatan yang membuat kita merasa baik, seperti tidur yang cukup, mengonsumsi makanan bergizi, dan melibatkan diri dalam kegiatan yang memberikan kepuasan. Mencari Bantuan Profesional: Jika kita merasa kesulitan mengatasi masalah kesehatan mental kita sendiri, jangan ragu untuk mencari bantuan profesional. Konselor, psikolog, atau psikiater dapat memberikan bantuan dan dukungan yang diperlukan. Mendukung kesehatan mental adalah investasi jangka panjang dalam kesejahteraan dan kebahagiaan kita. Dengan menghadapi tantangan dalam hidup sehari-hari dengan sikap yang positif dan mengambil langkah-langkah untuk menjaga kesehatan mental kita, kita dapat mencapai kualitas hidup yang lebih baik dan lebih seimbang secara keseluruhan.')
		WebUI.click(findTestObject('Object Repository/postArtikel/Page_Prevent - Dokter/input_Untitled Diagram.png_kategori'))
		WebUI.click(findTestObject('Object Repository/postArtikel/Page_Prevent - Dokter/button_Kirim Artikel'))
		WebUI.takeScreenshot()
	}
	
	@Then("Successfully to create a new article")
	def successnewArt() {	
		WebUI.delay(3)
		WebUI.takeScreenshot()
		WebUI.closeBrowser()
	}
	
	//Create-a-new--article-with-invalid-data//
	
	@When("User fill the field after click create a new article with invalid data")
	def fillinvalidDataArt() {
		WebUI.click(findTestObject('Object Repository/postArtikel/Page_Prevent - Dokter/button_Tambah Artikel'))
		WebUI.delay(3)
		WebUI.takeScreenshot()
		WebUI.click(findTestObject('Object Repository/postArtikel/Page_Prevent - Dokter/input_Untitled Diagram.png_kategori'))
		WebUI.click(findTestObject('Object Repository/postArtikel/Page_Prevent - Dokter/button_Kirim Artikel'))
		WebUI.delay(3)
		WebUI.takeScreenshot()
		
	}

	@Then("Unsuccessfully to create a new article")
	def unsuccessnewArt() {
		WebUI.delay(3)
		WebUI.takeScreenshot()
		WebUI.closeBrowser()
	}
}