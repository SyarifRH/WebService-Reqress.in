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

'The response failed because the json code doesn\'t have the correct value'
response1 = WS.sendRequest(findTestObject('Post Register Without Body', [('url') : GlobalVariable.baseUrl]))

WS.verifyResponseStatusCode(response1, 400)

WS.verifyElementPropertyValue(response1, 'error', 'Missing email or username')

'The response failed because the json code doesn\'t have an email value'
response2 = WS.sendRequest(findTestObject('Post Register Without Email', [('url') : GlobalVariable.baseUrl, ('withOutEmail') : GlobalVariable.withOutEmail]))

WS.verifyResponseStatusCode(response2, 400)

WS.verifyElementPropertyValue(response2, 'error', 'Missing email or username')

'The response failed because the json code doesn\'t have an password value'
response3 = WS.sendRequest(findTestObject('Post Register Without Password', [('url') : GlobalVariable.baseUrl, ('withOutPassword') : GlobalVariable.withOutPassword]))

WS.verifyResponseStatusCode(response3, 400)

WS.verifyElementPropertyValue(response3, 'error', 'Missing password')

