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
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger

WebUI.callTestCase(findTestCase('Utilities/MERCHANT/Merchant Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('MERCHANT/Page_0201bp1/epal'), 0)

WebUI.click(findTestObject('MERCHANT/Page_0201bp1/epal'))

WebUI.scrollToElement(findTestObject('MERCHANT/Pickup Location/Page_0201bp1/textfield_pickup'), 0)

WebUI.setText(findTestObject('MERCHANT/Pickup Location/Page_0201bp1/textfield_pickup'), '!@#$%^&*()_+[];\'\\./{}:"|<>?')

String picky = WebUI.getText(findTestObject('MERCHANT/Pickup Location/Page_0201bp1/textfield_pickup'))

WebUI.delay(2)

WebUI.click(findTestObject('MERCHANT/Delivery Settings/DeliveryOptions/button_Add Pick-up Option'))

KeywordLogger log = new KeywordLogger()

log.logInfo(picky)

WebUI.verifyTextPresent(picky, false)

WebUI.click(findTestObject('MERCHANT/Delivery Settings/DeliveryOptions/button_deletePO'))

