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

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.AdminURL)

WebUI.maximizeWindow()

WebUI.waitForElementVisible(findTestObject('ADMIN/Admin Login/Admin Login/txtbox_username'), 0)

if (GlobalVariable.AdminAccount == 'custom') {
    WebUI.setText(findTestObject('ADMIN/Admin Login/Admin Login/txtbox_username'), GlobalVariable.AdminCustom)

    WebUI.setText(findTestObject('ADMIN/Admin Login/Admin Login/txtbox_password'), GlobalVariable.CustomPass)

    WebUI.waitForElementVisible(findTestObject('ADMIN/Admin Login/Admin Login/txtbox_username'), 0)

    WebUI.click(findTestObject('ADMIN/Admin Login/Admin Login/btn_signin'))
} else if (GlobalVariable.AdminAccount == 'google') {
    WebUI.click(findTestObject('ADMIN/Admin Login/Admin Login/a_Login with Google'))

    WebUI.setText(findTestObject('ADMIN/Admin Login/Admin Login/Google Login/input_identifier'), GlobalVariable.AdminGoogle)

    WebUI.click(findTestObject('ADMIN/Admin Login/Admin Login/Google Login/span_Susunod'))

    WebUI.delay(1)

    WebUI.setText(findTestObject('ADMIN/Admin Login/Admin Login/Google Login/input_password'), GlobalVariable.GooglePass)

    WebUI.delay(1)

    WebUI.click(findTestObject('ADMIN/Admin Login/Admin Login/Google Login/span_Susunod'))
} else if (GlobalVariable.AdminAccount == 'facebook') {
    WebUI.click(findTestObject('ADMIN/Admin Login/Admin Login/a_Login with Facebook'))

    WebUI.setText(findTestObject('ADMIN/Admin Login/Admin Login/Facebook Login/input_email'), GlobalVariable.AdminFacebook)

    WebUI.setText(findTestObject('ADMIN/Admin Login/Admin Login/Facebook Login/input_pass'), GlobalVariable.FacebookPass)

    WebUI.click(findTestObject('ADMIN/Admin Login/Admin Login/Facebook Login/button_Log In'))
}

WebUI.waitForElementVisible(findTestObject('ADMIN/External Links/a_Content Mgmt.'), 0)

WebUI.click(findTestObject('ADMIN/External Links/a_Content Mgmt.'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/External Links/a_External Links'), 0)

WebUI.click(findTestObject('ADMIN/External Links/a_External Links'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/External Links/i_icon icon-hyperlink'), 0)

WebUI.verifyElementText(findTestObject('ADMIN/External Links/h1_External Links'), 'External Links')

WebUI.comment('Google')

WebUI.setText(findTestObject('ADMIN/External Links/input_username'), 'Google')

WebUI.setText(findTestObject('ADMIN/External Links/input_link1'), 'google.com')

WebUI.click(findTestObject('ADMIN/External Links/button_Add'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Facebook')

WebUI.setText(findTestObject('ADMIN/External Links/input_username2'), 'Facebook')

WebUI.setText(findTestObject('ADMIN/External Links/input_link2'), 'www.fb.com')

WebUI.click(findTestObject('ADMIN/External Links/button_Add'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Youtube')

WebUI.setText(findTestObject('ADMIN/External Links/input_username3'), 'Youtube')

WebUI.setText(findTestObject('ADMIN/External Links/input_link3'), 'www.youtube.com')

WebUI.click(findTestObject('ADMIN/External Links/button_Add'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Twitter')

WebUI.setText(findTestObject('ADMIN/External Links/input_username4'), 'Twitter')

WebUI.setText(findTestObject('ADMIN/External Links/input_link4'), 'www.twitter.com')

WebUI.click(findTestObject('ADMIN/External Links/button_Add'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1)

WebUI.click(findTestObject('ADMIN/External Links/button_Save'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/External Links/Success Toaster Message/div_SuccessLinks were succesfu'), 
    0)

WebUI.verifyElementText(findTestObject('ADMIN/External Links/Success Toaster Message/div_Links were succesfully sav'), 'Links were succesfully saved.')

WebUI.click(findTestObject('ADMIN/Admin Permission/Admin Activity Log/a_Logout'))

WebUI.closeBrowser()

