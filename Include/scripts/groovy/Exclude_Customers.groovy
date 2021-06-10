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



class Exclude_Customers {

	@Given('User navigates to login page')
	def navigateToLoginPage() {

		WebUI.openBrowser('')
		WebUI.navigateToUrl('http://bor4dev/CreditBureau_Setup/')
		WebUI.maximizeWindow()
	}

	@When('User enters the (.*) and (.*)')
	def EnterCredintials(String username, String password) {

		WebUI.setText(findTestObject('Object Repository/Page_Login Page - Credit Bureau/input_User_UserName'), username)

		WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Page - Credit Bureau/input_Password_Password'), password)
	}

	@And('Click on login page')
	def clickLogin() {

		WebUI.click(findTestObject('Object Repository/Page_Login Page - Credit Bureau/input_Password_btn btn-lg btn-default btn-block'))
	}
	@Then('User will navigate to HomePage')
	def navigateToHomePage() {
	}

	@Given('Click on Exclude Customers tap')
	def clickOnExclude() {
		WebUI.click(findTestObject('Object Repository/HomePage/Page_Generate Page - Credit Bureau/Excluded Customers Tap'))
	}



	@And("Click on 'Add Customer'")
	def newCus() {
		WebUI.click(findTestObject('Object Repository/HomePage/Page_Excluded Customers - Credit Bureau/Add Customer'))
	}

	@And('Fill new value')
	def newValue() {
		WebUI.sendKeys(findTestObject('Object Repository/HomePage/Page_Excluded Customers - Credit Bureau/input_Customers_search'), '002405577')
		WebUI.click(findTestObject('Object Repository/HomePage/Page_Excluded Customers - Credit Bureau/a_ROMANUS ANDOR BEATRICE (002405577)'))
		WebUI.click(findTestObject('Object Repository/HomePage/Page_Excluded Customers - Credit Bureau/button_Save'))
	}

	@Then('Navigate to Generate tap')
	def generateTap() {
		WebUI.click(findTestObject('Object Repository/GeneratePage/Page_Generate Page - Credit Bureau/Generate Tap'))
	}

	@And('Fill the blanks')
	def fillBlanks() {

		WebUI.sendKeys(findTestObject('Object Repository/GeneratePage/Page_Generate Page - Credit Bureau/input_Provider Code'), 'QA_Test')

		WebUI.setText(findTestObject('Object Repository/Page_Generate Page - Credit Bureau/input_Day Date_DayDate'), '11/04/2016')

		WebUI.click(findTestObject('Object Repository/GeneratePage/Page_Generate Page - Credit Bureau/input_Provider Code'))

		WebUI.scrollToElement(findTestObject('GeneratePage/Page_Generate Page - Credit Bureau/input_Iteration_IsTest'), 1)

		WebUI.sendKeys(findTestObject('Object Repository/GeneratePage/Page_Generate Page - Credit Bureau/input_Iteration_IterationNumber'), '1')
	}

	@And('Check The Test check')
	def checkBoxes() {
		WebUI.click(findTestObject('Object Repository/Page_Generate Page - Credit Bureau/IsTest'))
	}

	@Then("Click On Generate 'Button'")
	def genButton() {

		WebUI.click(findTestObject('Object Repository/GeneratePage/Page_Generate Page - Credit Bureau/input_Provider comments_actionIndex'))
		WebUI.waitForPageLoad(5, FailureHandling.STOP_ON_FAILURE)
	}
	@And('Go back to generate page')
	def goBack() {
		WebUI.back()
	}

	@And('Pick contract')
	def pickContract() {
		WebUI.click(findTestObject('Object Repository/Page_Generate Page - Credit Bureau/input_Contract_GenerateType'))
		WebUI.waitForPageLoad(5, FailureHandling.STOP_ON_FAILURE)
	}

	@And('Pick cheques')
	def pickCheaques() {
		WebUI.click(findTestObject('Object Repository/Page_Generate Page - Credit Bureau/input_Cheques_GenerateType'))
		WebUI.waitForPageLoad(5, FailureHandling.STOP_ON_FAILURE)
	}

	@And('Click on view data')
	def clickViewData() {
		WebUI.click(findTestObject('Object Repository/Page_Generate Page - Credit Bureau/ViewData'))
	}

	@Then('Close the browser')
	def closeBrowser(){
		WebUI.closeBrowser()
	}

	@Given('Click on Arabic version button')
	def arabicButton() {

		WebUI.click(findTestObject('Object Repository/Arabic Version/Page_Generate Page - Credit Bureau/a_Arabic'))
	}

	@And('Uncheck the Check Rules check')
	def uncheck() {
		WebUI.click(findTestObject('Object Repository/Arabic Version/Page_Generate Page - Credit Bureau/CheckRules'))
	}

	@Then('Click on Download Report')
	def downloadReport() {

		WebUI.click(findTestObject('Object Repository/Page_Generate Page - Credit Bureau/a_Download Report'))
	}

	@Given('Click on History Tap')
	def historyTap() {
		WebUI.click(findTestObject('Object Repository/Page_Generate Page - Credit Bureau/a_History (current)'))
		WebUI.scrollToPosition(75, 90)
	}
	@Then('Delete the added record')
	def deleteRecord() {
		WebUI.click(findTestObject('Object Repository/Page_Excluded Customers - Credit Bureau/a_Delete'))
		WebUI.click(findTestObject('Object Repository/Page_Excluded Customers - Credit Bureau/button_Yes'))
		WebUI.click(findTestObject('Object Repository/Page_Excluded Customers - Credit Bureau/button_Okay'))
	}
}









