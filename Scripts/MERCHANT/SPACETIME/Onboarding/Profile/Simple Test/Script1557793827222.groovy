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

WebUI.comment('Profile')

WebUI.click(findTestObject('SPACETIME/MERCHANT/Onboarding/Profile/browse_img'))

WebUI.callTestCase(findTestCase('Utilities/Upload Image(with cropper)'), [('varImagePath') : 'C:\\\\Katalon\\\\Image\\\\victor.jpg'], 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('SPACETIME/MERCHANT/Onboarding/Profile/textbox_DisplayName'), 'ThorJack')

WebUI.setText(findTestObject('SPACETIME/MERCHANT/Onboarding/Profile/textarea_Description'), 'Thor Wannabe')

WebUI.setText(findTestObject('SPACETIME/MERCHANT/Onboarding/Profile/textbox_FirstName'), 'Victor')

WebUI.setText(findTestObject('SPACETIME/MERCHANT/Onboarding/Profile/textbox_LastName'), 'Magtambol')

WebUI.setText(findTestObject('SPACETIME/MERCHANT/Onboarding/Profile/textbox_PhoneNumber'), '+63123456789')

WebUI.selectOptionByLabel(findTestObject('SPACETIME/MERCHANT/Onboarding/Profile/dropdown_timezone'), '(GMT+08:00) Kuala Lumpur, Singapore', 
    false)

WebUI.setText(findTestObject('SPACETIME/MERCHANT/Onboarding/Profile/textbox_SellerLocation'), 'Makati City')

WebUI.click(findTestObject('SPACETIME/MERCHANT/Onboarding/Profile/button_Next profile'))

