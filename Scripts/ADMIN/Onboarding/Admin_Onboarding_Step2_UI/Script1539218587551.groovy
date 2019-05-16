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

WebUI.verifyElementPresent(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step2/Image_HeaderStep2'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step2/Arcadier_LogoStep2'), 0)

WebUI.verifyElementText(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step2/Textlabel_What is your First Name'), 
    'What is your First Name')

WebUI.verifyElementPresent(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step2/Textbox_FirstName'), 0)

WebUI.verifyElementText(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step2/Textlabel_Last Name'), 'Last Name')

WebUI.verifyElementText(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step2/Textlabel_Your Notification Email'), 
    'Your Notification Email')

WebUI.verifyElementText(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step2/Textlabel_Please enter an email ad'), 
    'Please enter an email address that ends with a valid domain,')

WebUI.verifyElementText(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step2/Textlabel_e.g. yournameexample.com'), 
    'e.g. yourname@example.com or myname@domain.co.uk')

WebUI.verifyElementPresent(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step2/Textbox_Email'), 0)

WebUI.verifyElementText(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step2/Textlabel_The country of implement'), 
    'The country of implementation')

WebUI.verifyElementPresent(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step2/Country_Dropdown'), 0)

WebUI.verifyElementText(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step2/Textlabel_Your Address'), 'Your Address')

WebUI.verifyElementPresent(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step2/Address_Line1'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step2/Address_Line2'), 0)

WebUI.verifyElementText(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step2/Textlabel_Your Contact Number'), 
    'Your Contact Number')

WebUI.verifyElementText(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step2/Textlabel_Please enter an email ad'), 
    'Please enter an email address that ends with a valid domain,')

WebUI.verifyElementPresent(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step2/Button_PREVIOUS_Step2'), 0)

WebUI.verifyElementText(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step2/Button_PREVIOUS_Step2'), 'PREVIOUS')

WebUI.verifyElementPresent(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step2/Button_Next_Step2'), 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step2/Button_Next_Step2'), 
    'value', 'NEXT', 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step2/Support_Iframe_Step2'), 0)

