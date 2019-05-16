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

WebUI.comment('Payment')

WebUI.waitForElementPresent(findTestObject('MERCHANT/SpaceTime/Onboarding/Payment Acceptance/logo_stripe'), 0)

WebUI.verifyElementText(findTestObject('MERCHANT/SpaceTime/Onboarding/Payment Acceptance/textalbel_No account linked yet'), 
    'No account linked yet')

WebUI.click(findTestObject('MERCHANT/SpaceTime/Onboarding/Payment Acceptance/button_Link Account'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('MERCHANT/SpaceTime/Onboarding/Payment Acceptance/textlink_Skip'), 0)

WebUI.click(findTestObject('MERCHANT/SpaceTime/Onboarding/Payment Acceptance/textlink_Skip'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('MERCHANT/SpaceTime/Onboarding/Payment Acceptance/icon_verified'), 0)

WebUI.verifyElementPresent(findTestObject('MERCHANT/SpaceTime/Onboarding/Payment Acceptance/textalbel_Verified'), 0)

WebUI.click(findTestObject('MERCHANT/SpaceTime/Onboarding/Payment Acceptance/button_Next payment'), FailureHandling.CONTINUE_ON_FAILURE)

