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
import org.openqa.selenium.Keys as Keys

WebUI.comment('Blank First Name')

WebUI.setText(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step2/Textbox_FirstName'), '')

WebUI.setText(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step2/Textbox_LastName'), GlobalVariable.Theme)

WebUI.setText(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step2/Textbox_Email'), GlobalVariable.AdminEmailNotif)

WebUI.selectOptionByLabel(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step2/Country_Dropdown'), 'Malaysia', 
    false)

WebUI.setText(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step2/Address_Line1'), 'Cybersouth, Dengkil, Sepang District')

WebUI.setText(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step2/Address_Line2'), 'Selangor, Malaysia 43800')

WebUI.setText(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step2/Textbox_PhoneNumber'), '+63123456789')

WebUI.click(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step2/Button_Next_Step2'))

WebUI.verifyElementText(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step2/Textlabel_We will like to know mor'), 
    '2. We will like to know more about you!')

WebUI.comment('Blank Last Name')

WebUI.setText(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step2/Textbox_FirstName'), GlobalVariable.AdminCustom)

WebUI.setText(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step2/Textbox_LastName'), '')

WebUI.setText(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step2/Textbox_Email'), GlobalVariable.AdminEmailNotif)

WebUI.selectOptionByLabel(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step2/Country_Dropdown'), 'Malaysia', 
    false)

WebUI.setText(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step2/Address_Line1'), 'Cybersouth, Dengkil, Sepang District')

WebUI.setText(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step2/Address_Line2'), 'Selangor, Malaysia 43800')

WebUI.setText(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step2/Textbox_PhoneNumber'), '+63123456789')

WebUI.click(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step2/Button_Next_Step2'))

WebUI.verifyElementText(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step2/Textlabel_We will like to know mor'), 
    '2. We will like to know more about you!')

WebUI.comment('Blank Notif Email')

WebUI.setText(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step2/Textbox_FirstName'), GlobalVariable.AdminCustom)

WebUI.setText(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step2/Textbox_LastName'), GlobalVariable.Theme)

WebUI.setText(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step2/Textbox_Email'), '')

WebUI.selectOptionByLabel(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step2/Country_Dropdown'), 'Malaysia', 
    false)

WebUI.setText(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step2/Address_Line1'), 'Cybersouth, Dengkil, Sepang District')

WebUI.setText(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step2/Address_Line2'), 'Selangor, Malaysia 43800')

WebUI.setText(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step2/Textbox_PhoneNumber'), '+63123456789')

WebUI.click(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step2/Button_Next_Step2'))

WebUI.verifyElementText(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step2/Textlabel_We will like to know mor'), 
    '2. We will like to know more about you!')

WebUI.verifyElementText(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step2/Texterror_Required_Notif_Email'), 
    'The Your Notification Email field is required.')

