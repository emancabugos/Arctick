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

WebUI.comment('Step 2 (editable variables)')

WebUI.waitForElementVisible(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step2/Textlabel_We will like to know mor'), 
    0)

WebUI.comment('Previous button Test')

WebUI.click(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step2/Button_PREVIOUS_Step2'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step1/TextLabel_Tell us a little about y'), 
    0)

WebUI.click(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step1/Button_NEXT_Step1'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step2/Textlabel_We will like to know mor'), 
    0)

WebUI.comment('Input')

WebUI.setText(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step2/Textbox_FirstName'), varFName)

WebUI.setText(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step2/Textbox_LastName'), varLName)

WebUI.setText(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step2/Textbox_Email'), varEmail)

WebUI.delay(1)

WebUI.selectOptionByLabel(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step2/Country_Dropdown'), varCountry, 
    false)

WebUI.setText(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step2/Address_Line1'), varAddress1)

WebUI.setText(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step2/Address_Line2'), varAddress2)

WebUI.setText(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step2/Textbox_PhoneNumber'), varContactNumber)

WebUI.click(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step2/Button_Next_Step2'), FailureHandling.CONTINUE_ON_FAILURE)

