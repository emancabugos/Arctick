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

WebUI.callTestCase(findTestCase('Utilities/ADMIN/Admin Login'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Customize Policies/Terms/sidemenu_Content Mgmt.'), 0)

WebUI.click(findTestObject('ADMIN/Customize Policies/Terms/sidemenu_Content Mgmt.'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('ADMIN/Customize Policies/Terms/sidemenu_Customize Policies'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Customize Policies/Terms/img 1'), 0)

WebUI.comment('Blank Terms')

WebUI.setText(findTestObject('ADMIN/Customize Policies/Terms/textbox_'), '')

WebUI.click(findTestObject('ADMIN/Customize Policies/Terms/button_Save'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Customize Policies/Terms/Toaster/toaster_Oops Something went wrong.'), 
    0)

WebUI.waitForElementNotPresent(findTestObject('ADMIN/Customize Policies/Terms/Toaster/toaster_Oops Something went wrong.'), 
    0)

WebUI.comment('Edit Terms')

WebUI.setText(findTestObject('ADMIN/Customize Policies/Terms/textbox_'), 'The person signing up for the Service will be the contracting party ("Account Owner") for the purposes of our Terms of Service and will be the person who is authorized to use any corresponding account we may provide to the Account Owner in connection with the Arcadier\'s Marketplace Admin Service ("Service"). If you are signing up for the Service on behalf of your employer or company, your employer or company shall be the Account Owner. If you are signing up for the Service on behalf of your employer or company, then You represent and warrant that You have the authority to bind your employer or company to our Terms of Service.')

WebUI.click(findTestObject('ADMIN/Customize Policies/Terms/button_Save'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Customize Policies/Terms/Toaster/toaster_Successterms of service wa'), 
    0)

WebUI.waitForElementNotPresent(findTestObject('ADMIN/Customize Policies/Terms/Toaster/toaster_Successterms of service wa'), 
    0)

WebUI.comment('Preview')

WebUI.click(findTestObject('ADMIN/Customize Policies/Terms/button_Preview'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1)

WebUI.switchToWindowIndex(1)

WebUI.waitForElementVisible(findTestObject('ADMIN/Customize Policies/Terms/Content/div_The person signing up for'), 0)

WebUI.closeWindowIndex(1)

WebUI.delay(1)

WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('Utilities/Admin Logout/button_Logout'))

