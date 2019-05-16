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

WebUI.comment('Verify default selected value')

WebUI.verifyOptionSelectedByLabel(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step1/1stDropdown_Please select one...Im'), 
    'Please select one...', false, 0)

WebUI.verifyOptionSelectedByLabel(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step1/2ndDropdown_Please select one...Don'), 
    'Please select one...', false, 0)

WebUI.verifyOptionSelectedByLabel(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step1/3rdDropdown_Im an individualIm work'), 
    'I’m an individual', false, 0)

WebUI.comment('Verify Nothing on first drowpdown')

WebUI.verifyOptionSelectedByLabel(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step1/1stDropdown_Please select one...Im'), 
    'Please select one...', false, 0)

WebUI.selectOptionByLabel(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step1/2ndDropdown_Please select one...Don'), 
    'Don’t know yet!', false)

WebUI.click(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step1/Button_NEXT_Step1'))

WebUI.verifyElementText(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step1/TextLabel_Tell us a little about y'), 
    '1. Tell us a little about yourself')

WebUI.comment('Verify Nothing on 2nd drowpdown')

WebUI.selectOptionByLabel(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step1/1stDropdown_Please select one...Im'), 
    'I’m just playing around', false)

WebUI.selectOptionByLabel(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step1/2ndDropdown_Please select one...Don'), 
    'Please select one...', false)

WebUI.click(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step1/Button_NEXT_Step1'))

WebUI.verifyElementText(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step1/TextLabel_Tell us a little about y'), 
    '1. Tell us a little about yourself')

WebUI.comment('Verify 2nd Dropdown Something Else Textbox')

WebUI.selectOptionByLabel(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step1/2ndDropdown_Please select one...Don'), 
    'Something else!', false)

WebUI.verifyElementVisible(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step1/2nddropdown_textbox_OtherMarketplaceType'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step1/2nddropdown_textbox_OtherMarketplaceType'), 
    'placeholder', 'Please briefly describe what you are building', 0)

WebUI.comment('Verify 3nd Dropdown Something Else Textbox')

WebUI.selectOptionByLabel(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step1/3rdDropdown_Im an individualIm work'), 
    'Someone else!', false)

WebUI.verifyElementVisible(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step1/3rddropdown_textbox_OtherEntityType'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step1/3rddropdown_textbox_OtherEntityType'), 
    'placeholder', 'Please briefly describe who you are', 0)

WebUI.comment('Blank 2nd Dropdown textbox validation')

WebUI.setText(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step1/3rddropdown_textbox_OtherEntityType'), 
    'Business Man')

WebUI.click(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step1/Button_NEXT_Step1'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step1/2nddropdown_textbox_OtherMarketplaceType'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Blank 3rd Dropdown textbox validation')

WebUI.setText(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step1/2nddropdown_textbox_OtherMarketplaceType'), 
    'Marketplace')

WebUI.setText(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step1/3rddropdown_textbox_OtherEntityType'), 
    '')

WebUI.click(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step1/Button_NEXT_Step1'))

