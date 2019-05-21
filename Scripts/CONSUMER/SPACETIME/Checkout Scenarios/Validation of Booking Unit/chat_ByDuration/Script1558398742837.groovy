import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('Utilities/CONSUMER/Consumer Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.comment('Validation on Homepage')

WebUI.waitForElementVisible(findTestObject('CONSUMER/Search Function/button_Search'), 0)

WebUI.delay(1)

WebUI.click(findTestObject('CONSUMER/Search Function/button_Search'))

WebUI.comment('Verify in Search Result Page')

WebUI.waitForPageLoad(0)

WebUI.waitForElementVisible(findTestObject('CONSUMER/Search Result Page/image_Item'), 0)

WebUI.click(findTestObject('CONSUMER/Search Result Page/image_Item'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForPageLoad(0)

WebUI.comment('Verify in Item Details Page')

WebUI.waitForElementVisible(findTestObject('CONSUMER/Item Details Page/button_ContactSeller'), 0)

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('CONSUMER/Item Details Page/button_ContactSeller'))

WebUI.waitForPageLoad(0)

WebUI.waitForElementVisible(findTestObject('CONSUMER/Chat Details Page/button_Send'), 0)

WebUI.waitForElementClickable(findTestObject('CONSUMER/Chat Details Page/textarea_chatMsg'), 0)

WebUI.setText(findTestObject('CONSUMER/Chat Details Page/textarea_chatMsg'), 'Hello')

WebUI.delay(1)

WebUI.click(findTestObject('CONSUMER/Chat Details Page/button_Send'))

WebUI.waitForElementVisible(findTestObject('CONSUMER/Chat Details Page/first_Chat'), 0)

WebUI.verifyElementVisible(findTestObject('CONSUMER/Chat Details Page/first_Chat'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1)

WebUI.callTestCase(findTestCase('Utilities/MERCHANT/Logout'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Utilities/MERCHANT/Merchant Login'), [:], FailureHandling.STOP_ON_FAILURE)

