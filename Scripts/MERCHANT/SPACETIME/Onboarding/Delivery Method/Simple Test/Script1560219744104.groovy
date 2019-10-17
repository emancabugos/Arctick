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

WebUI.waitForElementVisible(findTestObject('SPACETIME/MERCHANT/Onboarding/Delivery Method/button_SKIP THIS STEP'), 0)

WebUI.setText(findTestObject('SPACETIME/MERCHANT/Onboarding/Delivery Method/textbox_delivery_name'), 'Delivery 1')

WebUI.setText(findTestObject('SPACETIME/MERCHANT/Onboarding/Delivery Method/textbox_delivery_price'), '1.20')

WebUI.click(findTestObject('SPACETIME/MERCHANT/Onboarding/Delivery Method/button_Add delivery'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1)

WebUI.setText(findTestObject('SPACETIME/MERCHANT/Onboarding/Delivery Method/textbox_location_name'), 'Pickup 1')

WebUI.click(findTestObject('SPACETIME/MERCHANT/Onboarding/Delivery Method/buttton_Add pickup'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1)

WebUI.comment('2nd Delivery and Pickup')

WebUI.setText(findTestObject('SPACETIME/MERCHANT/Onboarding/Delivery Method/textbox_delivery_name'), 'Delivery 2')

WebUI.setText(findTestObject('SPACETIME/MERCHANT/Onboarding/Delivery Method/textbox_delivery_price'), '4.50')

WebUI.click(findTestObject('SPACETIME/MERCHANT/Onboarding/Delivery Method/button_Add delivery'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1)

WebUI.setText(findTestObject('SPACETIME/MERCHANT/Onboarding/Delivery Method/textbox_location_name'), 'Pickup 2')

WebUI.click(findTestObject('SPACETIME/MERCHANT/Onboarding/Delivery Method/buttton_Add pickup'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1)

WebUI.click(findTestObject('SPACETIME/MERCHANT/Onboarding/Delivery Method/a_Save'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('SPACETIME/MERCHANT/Listing Page/button_Add listings'), 0)

