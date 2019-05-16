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

WebUI.waitForElementVisible(findTestObject('ADMIN/Admin Users/a_User Mgmt.'), 0)

WebUI.click(findTestObject('ADMIN/Admin Users/a_User Mgmt.'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Admin Users/a_Users'), 0)

WebUI.click(findTestObject('ADMIN/Admin Users/a_Users'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Admin Users/h1_Users'), 0)

WebUI.comment('Merchant Search')

WebUI.setText(findTestObject('ADMIN/Admin Users/input_filter_email_name'), GlobalVariable.CustomMerchant)

WebUI.click(findTestObject('ADMIN/Admin Users/button_Search'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Admin Users/User Table/td_login'), 0)

WebUI.verifyElementText(findTestObject('ADMIN/Admin Users/User Table/td_login'), GlobalVariable.CustomMerchant)

WebUI.verifyElementText(findTestObject('ADMIN/Admin Users/User Table/td_Display Name'), 'Custom Merchant')

WebUI.verifyElementText(findTestObject('ADMIN/Admin Users/User Table/td_Email'), GlobalVariable.MerchantNotif)

WebUI.verifyElementPresent(findTestObject('ADMIN/Admin Users/User Table/td_Date Joined'), 0)

WebUI.verifyElementText(findTestObject('ADMIN/Admin Users/User Table/td_User Type'), 'Merchant')

WebUI.verifyElementPresent(findTestObject('ADMIN/Admin Users/User Table/td_Last Logged In'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Admin Users/User Table/span_onoffswitch-switch'), 0)

WebUI.verifyElementText(findTestObject('ADMIN/Admin Users/User Counter/div_User Found'), '1')

WebUI.verifyElementText(findTestObject('ADMIN/Admin Users/User Counter/div_Merchants'), '1')

WebUI.verifyElementText(findTestObject('ADMIN/Admin Users/User Counter/div_Consumers'), '0')

WebUI.comment('Consumer Search')

WebUI.setText(findTestObject('ADMIN/Admin Users/input_filter_email_name'), GlobalVariable.ConsumerAccountTypeNotif)

WebUI.click(findTestObject('ADMIN/Admin Users/button_Search'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Admin Users/User Table/td_login'), 0)

WebUI.verifyElementText(findTestObject('ADMIN/Admin Users/User Table/td_login'), GlobalVariable.CustomConsumer)

WebUI.verifyElementText(findTestObject('ADMIN/Admin Users/User Table/td_Display Name'), 'Single')

WebUI.verifyElementText(findTestObject('ADMIN/Admin Users/User Table/td_Email'), GlobalVariable.ConsumerAccountTypeNotif)

WebUI.verifyElementPresent(findTestObject('ADMIN/Admin Users/User Table/td_Date Joined'), 0)

WebUI.verifyElementText(findTestObject('ADMIN/Admin Users/User Table/td_User Type'), 'Consumer')

WebUI.verifyElementPresent(findTestObject('ADMIN/Admin Users/User Table/td_Last Logged In'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Admin Users/User Table/span_onoffswitch-switch'), 0)

WebUI.verifyElementText(findTestObject('ADMIN/Admin Users/User Counter/div_User Found'), '1')

WebUI.verifyElementText(findTestObject('ADMIN/Admin Users/User Counter/div_Merchants'), '0')

WebUI.verifyElementText(findTestObject('ADMIN/Admin Users/User Counter/div_Consumers'), '1')

WebUI.comment('Admin Search')

WebUI.setText(findTestObject('ADMIN/Admin Users/input_filter_email_name'), GlobalVariable.AdminCustom)

WebUI.click(findTestObject('ADMIN/Admin Users/button_Search'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Admin Users/User Table/td_login'), 0)

WebUI.verifyElementText(findTestObject('ADMIN/Admin Users/User Table/td_login'), GlobalVariable.AdminCustom)

WebUI.verifyElementText(findTestObject('ADMIN/Admin Users/User Table/td_Display Name'), GlobalVariable.AdminCustom)

WebUI.verifyElementText(findTestObject('ADMIN/Admin Users/User Table/td_Email'), GlobalVariable.AdminEmailNotif)

WebUI.verifyElementPresent(findTestObject('ADMIN/Admin Users/User Table/td_Date Joined'), 0)

WebUI.verifyElementText(findTestObject('ADMIN/Admin Users/User Table/td_User Type'), 'Merchant')

WebUI.verifyElementPresent(findTestObject('ADMIN/Admin Users/User Table/td_Last Logged In'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Admin Users/User Table/span_onoffswitch-switch'), 0)

WebUI.verifyElementText(findTestObject('ADMIN/Admin Users/User Counter/div_User Found'), '1')

WebUI.verifyElementText(findTestObject('ADMIN/Admin Users/User Counter/div_Merchants'), '1')

WebUI.verifyElementText(findTestObject('ADMIN/Admin Users/User Counter/div_Consumers'), '0')

WebUI.click(findTestObject('ADMIN/Admin Permission/Admin Activity Log/a_Logout'))

WebUI.navigateToUrl(GlobalVariable.AdminURL)

if (GlobalVariable.AdminAccount == 'custom') {
    WebUI.setText(findTestObject('ADMIN/Admin Login/Admin Login/txtbox_username'), GlobalVariable.AdminCustom)

    WebUI.setText(findTestObject('ADMIN/Admin Login/Admin Login/txtbox_password'), GlobalVariable.CustomPass)

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

WebUI.waitForElementVisible(findTestObject('ADMIN/Admin Users/a_User Mgmt.'), 0)

WebUI.click(findTestObject('ADMIN/Admin Users/a_User Mgmt.'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Admin Users/a_Users'), 0)

WebUI.click(findTestObject('ADMIN/Admin Users/a_Users'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Admin Users/h1_Users'), 0)

