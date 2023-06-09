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

'Failed, because ID Double or ID is not yet available'
response1 = WS.sendRequest(findTestObject('Get Single Users Double ID', [('url') : GlobalVariable.baseUrl, ('doubleID') : GlobalVariable.doubleID]))

WS.verifyResponseStatusCode(response1, 404)

'Failed, because ID Minus Double or only a value of 0, at least not minus'
response2 = WS.sendRequest(findTestObject('Get Single Users Minus Double ID', [('url') : GlobalVariable.baseUrl, ('doubleMinusID') : GlobalVariable.doubleMinusID]))

WS.verifyResponseStatusCode(response2, 404)

'Failed, because ID uses a special character or random char'
response2 = WS.sendRequest(findTestObject('Get Single Users Spesical Character ID', [('url') : GlobalVariable.baseUrl, ('specialCharID') : GlobalVariable.specialCharID]))

WS.verifyResponseStatusCode(response2, 404)

