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

WebUI.navigateToUrl('https://stage.mobipaid.com/en/register')

WebUI.click(findTestObject('Object Repository/Page_Register/i_fa fa-chevron-down'))

WebUI.click(findTestObject('Object Repository/Page_Register/a_'))

WebUI.click(findTestObject('Object Repository/Page_Register/span_Crear una cuenta de Mobipaid'))

WebUI.click(findTestObject('Object Repository/Page_Register/div_Crear una cuenta de Mobipaid'))

WebUI.doubleClick(findTestObject('Object Repository/Page_Register/span_Crear una cuenta de Mobipaid'))

WebUI.click(findTestObject('Object Repository/Page_Register/span_Crear una cuenta de Mobipaid'))

WebUI.click(findTestObject('Object Repository/Page_Register/span_Crear una cuenta de Mobipaid'))

WebUI.click(findTestObject('Object Repository/Page_Register/button_Prximo Paso   Por favor espere'))

WebUI.doubleClick(findTestObject('Object Repository/Page_Register/span_Crear una cuenta de Mobipaid'))

WebUI.click(findTestObject('Object Repository/Page_Register/span_Crear una cuenta de Mobipaid'))

WebUI.closeBrowser()
