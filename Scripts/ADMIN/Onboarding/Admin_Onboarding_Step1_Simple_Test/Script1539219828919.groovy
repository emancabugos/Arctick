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

WebUI.comment('Select Dropdown and Input')

WebUI.selectOptionByLabel(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step1/1stDropdown_Please select one...Im'), 
    'I’m managing them offline', false)

WebUI.selectOptionByLabel(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step1/2ndDropdown_Please select one...Don'), 
    'Something else!', false)

WebUI.setText(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step1/2nddropdown_textbox_OtherMarketplaceType'), 
    'Marketplace')

WebUI.selectOptionByLabel(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step1/3rdDropdown_Im an individualIm work'), 
    'Someone else!', false)

WebUI.setText(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step1/3rddropdown_textbox_OtherEntityType'), 
    'Business Man')

WebUI.comment('Continue to Step 2')

WebUI.setText(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step1/3rddropdown_textbox_OtherEntityType'), 
    'Business Man')

WebUI.click(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step1/Button_NEXT_Step1'))

WebUI.verifyElementText(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step2/Textlabel_We will like to know mor'), 
    '2. We will like to know more about you!')

