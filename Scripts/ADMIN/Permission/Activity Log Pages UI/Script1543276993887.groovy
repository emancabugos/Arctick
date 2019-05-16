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

    WebUI.click(findTestObject('ADMIN/Admin Login/Admin Login/btn_signin'))
} else if (GlobalVariable.AdminAccount == 'google') {
    WebUI.click(findTestObject('ADMIN/Admin Login/Admin Login/a_Login with Google'))

    WebUI.setText(findTestObject('ADMIN/Admin Login/Admin Login/Google Login/input_identifier'), GlobalVariable.AdminGoogle)

    WebUI.click(findTestObject('ADMIN/Admin Login/Admin Login/Google Login/div_ZFr60d CeoRYc'))

    WebUI.delay(1)

    WebUI.setText(findTestObject('ADMIN/Admin Login/Admin Login/Google Login/input_password'), GlobalVariable.GooglePass)

    WebUI.delay(1)

    WebUI.click(findTestObject('ADMIN/Admin Login/Admin Login/Google Login/div_ZFr60d CeoRYc'))
} else if (GlobalVariable.AdminAccount == 'facebook') {
    WebUI.click(findTestObject('ADMIN/Admin Login/Admin Login/a_Login with Facebook'))

    WebUI.setText(findTestObject('ADMIN/Admin Login/Admin Login/Facebook Login/input_email'), GlobalVariable.AdminFacebook)

    WebUI.setText(findTestObject('ADMIN/Admin Login/Admin Login/Facebook Login/input_pass'), GlobalVariable.FacebookPass)

    WebUI.click(findTestObject('ADMIN/Admin Login/Admin Login/Facebook Login/button_Log In'))
}

WebUI.waitForElementVisible(findTestObject('ADMIN/Admin Permission/Admin Activity Log/a_Permission'), 0)

WebUI.click(findTestObject('ADMIN/Admin Permission/Admin Activity Log/a_Permission'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Admin Permission/Admin Activity Log/a_Activity Log'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Admin Permission/Admin Activity Log/img_beta1'), 0)

WebUI.click(findTestObject('ADMIN/Admin Permission/Admin Activity Log/a_Activity Log'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Admin Permission/Admin Activity Log/h1_Activity Log'), 0)

WebUI.click(findTestObject('ADMIN/Admin Permission/Admin Activity Log/a_Pages'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Admin Permission/Admin Activity Log Login/div_Start Date Time'), 0)

WebUI.verifyTextPresent('From:', false)

WebUI.verifyElementPresent(findTestObject('ADMIN/Admin Permission/Admin Activity Log/input_fromDate'), 0)

WebUI.verifyTextPresent('To:', false)

WebUI.verifyElementPresent(findTestObject('ADMIN/Admin Permission/Admin Activity Log/input_toDate'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Admin Permission/Admin Activity Log/button_Export Log'), 0)

WebUI.verifyTextPresent('Start Date Time', false)

WebUI.verifyTextPresent('End Date Time', false)

WebUI.verifyTextPresent('Page URL', false)

WebUI.verifyTextPresent('User ID', false)

WebUI.verifyTextPresent('Username', false)

WebUI.click(findTestObject('ADMIN/Admin Permission/Admin Activity Log/a_Logout'))

WebUI.closeBrowser(FailureHandling.CONTINUE_ON_FAILURE)

