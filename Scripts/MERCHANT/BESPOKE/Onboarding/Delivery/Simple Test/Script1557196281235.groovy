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

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Merchant Onboarding/Delivery/Delivery Methods/textbox_delivery_name'), 'Local Delivery')

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Merchant Onboarding/Delivery/Delivery Methods/textbox_delivery_price numberDec'), 
    '10.50')

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Merchant Onboarding/Delivery/Delivery Methods/textbox_delivery-per-addition nu'), 
    '5')

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Merchant Onboarding/Delivery/Delivery Methods/button_ADD delivery'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/MERCHANT/Merchant Onboarding/Delivery/Delivery Methods/icon_select delivery'), 
    0)

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Merchant Onboarding/Delivery/Delivery Methods/icon_select delivery'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Merchant Onboarding/Delivery/Delivery Methods/textbox_location_name'), 'Rufino Pacific Tower Makati City')

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Merchant Onboarding/Delivery/Delivery Methods/button_ADD pickup'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.scrollToElement(findTestObject('BESPOKE DEL 2/MERCHANT/Merchant Onboarding/Delivery/Delivery Methods/button_ADD pickup'), 
    0)

WebUI.scrollToElement(findTestObject('BESPOKE DEL 2/MERCHANT/Merchant Onboarding/Delivery/Delivery Methods/button_SAVE'), 0)

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Merchant Onboarding/Delivery/Delivery Methods/button_SAVE'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/MERCHANT/Your Items/textlabel_YOUR ITEMS'), 0)

WebUI.callTestCase(findTestCase('Utilities/MERCHANT/Logout'), [:], FailureHandling.CONTINUE_ON_FAILURE)

