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

WebUI.navigateToUrl('http://bor4dev/CreditBureau_Setup/')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Page_Login Page - Credit Bureau/input_User_UserName'), 'administrator')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Page - Credit Bureau/input_Password_Password'), '/5S6MFFLcE4mlsixtc6/Tg==')

WebUI.click(findTestObject('Object Repository/Page_Login Page - Credit Bureau/input_Password_btn btn-lg btn-default btn-block'))

WebUI.click(findTestObject('Object Repository/HomePage/Page_Generate Page - Credit Bureau/Excluded Customers Tap'))

WebUI.click(findTestObject('Object Repository/HomePage/Page_Excluded Customers - Credit Bureau/Add Customer'))

WebUI.sendKeys(findTestObject('Object Repository/HomePage/Page_Excluded Customers - Credit Bureau/input_Customers_search'), 
    '002405577')

WebUI.click(findTestObject('Object Repository/HomePage/Page_Excluded Customers - Credit Bureau/a_ROMANUS ANDOR BEATRICE (002405577)'))

WebUI.click(findTestObject('Object Repository/HomePage/Page_Excluded Customers - Credit Bureau/button_Save'))

WebUI.click(findTestObject('Object Repository/GeneratePage/Page_Generate Page - Credit Bureau/Generate Tap'))

WebUI.sendKeys(findTestObject('Object Repository/GeneratePage/Page_Generate Page - Credit Bureau/input_Provider Code'), 
    'QA_Test')



WebUI.setText(findTestObject('Object Repository/Page_Generate Page - Credit Bureau/input_Day Date_DayDate'), '11/04/2016')

WebUI.sendKeys(findTestObject('Object Repository/Page_Generate Page - Credit Bureau/input_Day Date_DayDate'), Keys.chord(
        Keys.ENTER))

WebUI.sendKeys(findTestObject('Object Repository/GeneratePage/Page_Generate Page - Credit Bureau/input_Iteration_IterationNumber'), 
    '1')

WebUI.click(findTestObject('Object Repository/GeneratePage/Page_Generate Page - Credit Bureau/input_Iteration_IsTest'))

WebUI.click(findTestObject('Object Repository/GeneratePage/Page_Generate Page - Credit Bureau/input_Provider comments_actionIndex'))

WebUI.click(findTestObject('Object Repository/Page_Generate Page - Credit Bureau/ViewData'))

