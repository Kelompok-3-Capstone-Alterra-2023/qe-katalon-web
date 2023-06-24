package detailArtikel
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



class detailarticle {

	@Given("User launch website prevent artikel")
	def launchWebArticle() {
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://main--starlit-lokum-26b84a.netlify.app/')
		WebUI.maximizeWindow()
		WebUI.scrollToPosition(0, 1000)
		WebUI.click(findTestObject('Object Repository/detailarticle-web/Page_Prevent/button_Baca Selengkapnya'))
		WebUI.verifyElementPresent(findTestObject('Object Repository/detailarticle-web/Page_Prevent/a_Post Selanjutnya'), 0)
		WebUI.delay(3)
		WebUI.takeScreenshot()
	}

	@When("User fill valid comment, first name and lastname")
	def fillComment() {
		WebUI.scrollToPosition(0, 1000)
		WebUI.click(findTestObject('Object Repository/detailarticle-web/Page_Prevent/textarea_Aulia   Halimah_message'))
		WebUI.setText(findTestObject('Object Repository/detailarticle-web/Page_Prevent/textarea_Aulia   Halimah_message'), 'Informasi sangat membantu')

		WebUI.click(findTestObject('Object Repository/detailarticle-web/Page_Prevent/input_awal'))
		WebUI.setText(findTestObject('Object Repository/detailarticle-web/Page_Prevent/input_awal'), 'ifah')

		WebUI.click(findTestObject('Object Repository/detailarticle-web/Page_Prevent/input_first_last'))
		WebUI.setText(findTestObject('Object Repository/detailarticle-web/Page_Prevent/input_first_last'), 'hani')
	}

	@When("User fill blank comment, fill first name and lastname")
	def fillCommentinvalid() {
		WebUI.scrollToPosition(0, 1000)
		WebUI.click(findTestObject('Object Repository/detailarticle-web/Page_Prevent/textarea_Aulia   Halimah_message'))
		WebUI.clearText(findTestObject('Object Repository/detailarticle-web/Page_Prevent/textarea_Aulia   Halimah_message'))

		WebUI.click(findTestObject('Object Repository/detailarticle-web/Page_Prevent/input_awal'))
		WebUI.setText(findTestObject('Object Repository/detailarticle-web/Page_Prevent/input_awal'), 'ifah')

		WebUI.click(findTestObject('Object Repository/detailarticle-web/Page_Prevent/input_first_last'))
		WebUI.setText(findTestObject('Object Repository/detailarticle-web/Page_Prevent/input_first_last'), 'hani')
	}

	@Then("User can click button komentar to send on page article and comment already on page article")
	def fillName() {
		WebUI.click(findTestObject('Object Repository/detailarticle-web/Page_Prevent/button_Kirim Komentar'))
		WebUI.verifyElementPresent(findTestObject('Object Repository/detailarticle-web/Page_Prevent/p_informasi sangat bermanfaat'), 30, FailureHandling.STOP_ON_FAILURE)
		WebUI.delay(3)
		WebUI.takeScreenshot()
		WebUI.closeBrowser()
	}
	@Then("User cannot send comment")
	def filloutComment() {
		WebUI.click(findTestObject('Object Repository/detailarticle-web/Page_Prevent/button_Kirim Komentar'))
		WebUI.delay(3)
		WebUI.takeScreenshot()
		WebUI.closeBrowser()
	}
}