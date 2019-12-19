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

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Merchant Onboarding/Profile Page/Profile/textbox_DisplayName'), 'Jonelll')

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Merchant Onboarding/Profile Page/Profile/textbox_description'), 'BATA ni LEILA')

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Merchant Onboarding/Profile Page/Profile/textbox_FirstName'), 'Jonel')

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Merchant Onboarding/Profile Page/Profile/textbox_LastName'), 'De Lima')

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Merchant Onboarding/Profile Page/Profile/textbox_PhoneNumber'), '+6369000000')

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Merchant Onboarding/Profile Page/Profile/textbox_SellerLocation'), 
    'Makati City')

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Merchant Onboarding/Profile Page/Profile/textbox_FirstName'), '')

WebUI.verifyElementAttributeValue(findTestObject('BESPOKE DEL 2/MERCHANT/Merchant Onboarding/Profile Page/Profile/textbox_FirstName'), 
    'value', '', 0)

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Merchant Onboarding/Profile Page/Profile/button_NEXT profile'), FailureHandling.CONTINUE_ON_FAILURE)

