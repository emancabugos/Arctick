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

WebUI.click(findTestObject('ADMIN/Admin Users/div_Invite Merchant'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Admin Users/User Invite Popup/div_Invite your sellers to onb'), 0)

WebUI.verifyElementText(findTestObject('ADMIN/Admin Users/User Invite Popup/div_Invite your sellers to onb'), 'Invite your sellers to onboard on your marketplace')

WebUI.verifyElementPresent(findTestObject('ADMIN/Admin Users/User Invite Popup/div_popoup-seller-img'), 0)

WebUI.verifyElementText(findTestObject('ADMIN/Admin Users/User Invite Popup/p_Enter your recipient emails'), 'Enter your recipient emails below')

WebUI.verifyElementText(findTestObject('ADMIN/Admin Users/User Invite Popup/p_(Use commas separate multipl'), '(Use commas separate multiple recipients).')

WebUI.verifyElementPresent(findTestObject('ADMIN/Admin Users/User Invite Popup/textarea_invite-sellers-email-'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Admin Users/User Invite Popup/button_close'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Admin Users/User Invite Popup/input_btn-send-direct-invite'), 0)

WebUI.comment('Close popup')

WebUI.click(findTestObject('ADMIN/Admin Users/User Invite Popup/button_close'))

WebUI.verifyElementNotVisible(findTestObject('ADMIN/Admin Users/User Invite Popup/div_Invite your sellers to onb'))

WebUI.comment('invalid email')

WebUI.click(findTestObject('ADMIN/Admin Users/div_Invite Merchant'))

WebUI.setText(findTestObject('ADMIN/Admin Users/User Invite Popup/textarea_invite-sellers-email-'), '.abcdefgh@gmail.com')

WebUI.click(findTestObject('ADMIN/Admin Users/User Invite Popup/input_btn-send-direct-invite'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Admin Users/Invite Error Toaster Message/div_Oops Something went wrong.'), 
    0)

WebUI.verifyElementText(findTestObject('ADMIN/Admin Users/Invite Error Toaster Message/div_One of the emails you ente'), 
    'One of the emails you entered is invalid, please try again.')

WebUI.waitForElementNotPresent(findTestObject('ADMIN/Admin Users/Invite Error Toaster Message/div_One of the emails you ente'), 
    0)

WebUI.setText(findTestObject('ADMIN/Admin Users/User Invite Popup/textarea_invite-sellers-email-'), 'abcd..efgh@gmail.com')

WebUI.click(findTestObject('ADMIN/Admin Users/User Invite Popup/input_btn-send-direct-invite'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Admin Users/Invite Error Toaster Message/div_Oops Something went wrong.'), 
    0)

WebUI.verifyElementText(findTestObject('ADMIN/Admin Users/Invite Error Toaster Message/div_One of the emails you ente'), 
    'One of the emails you entered is invalid, please try again.')

WebUI.waitForElementNotPresent(findTestObject('ADMIN/Admin Users/Invite Error Toaster Message/div_One of the emails you ente'), 
    0)

WebUI.setText(findTestObject('ADMIN/Admin Users/User Invite Popup/textarea_invite-sellers-email-'), 'jsmith@192.168.2.1')

WebUI.click(findTestObject('ADMIN/Admin Users/User Invite Popup/input_btn-send-direct-invite'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Admin Users/Invite Error Toaster Message/div_Oops Something went wrong.'), 
    0)

WebUI.verifyElementText(findTestObject('ADMIN/Admin Users/Invite Error Toaster Message/div_One of the emails you ente'), 
    'One of the emails you entered is invalid, please try again.')

WebUI.waitForElementNotPresent(findTestObject('ADMIN/Admin Users/Invite Error Toaster Message/div_One of the emails you ente'), 
    0)

WebUI.setText(findTestObject('ADMIN/Admin Users/User Invite Popup/textarea_invite-sellers-email-'), 'jsmith@IPv6:2001:db8::1')

WebUI.click(findTestObject('ADMIN/Admin Users/User Invite Popup/input_btn-send-direct-invite'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Admin Users/Invite Error Toaster Message/div_Oops Something went wrong.'), 
    0)

WebUI.verifyElementText(findTestObject('ADMIN/Admin Users/Invite Error Toaster Message/div_One of the emails you ente'), 
    'One of the emails you entered is invalid, please try again.')

WebUI.waitForElementNotPresent(findTestObject('ADMIN/Admin Users/Invite Error Toaster Message/div_One of the emails you ente'), 
    0)

WebUI.setText(findTestObject('ADMIN/Admin Users/User Invite Popup/textarea_invite-sellers-email-'), 'abcd312efgh@-gmail.com')

WebUI.click(findTestObject('ADMIN/Admin Users/User Invite Popup/input_btn-send-direct-invite'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Admin Users/Invite Error Toaster Message/div_Oops Something went wrong.'), 
    0)

WebUI.verifyElementText(findTestObject('ADMIN/Admin Users/Invite Error Toaster Message/div_One of the emails you ente'), 
    'One of the emails you entered is invalid, please try again.')

WebUI.waitForElementNotPresent(findTestObject('ADMIN/Admin Users/Invite Error Toaster Message/div_One of the emails you ente'), 
    0)

WebUI.setText(findTestObject('ADMIN/Admin Users/User Invite Popup/textarea_invite-sellers-email-'), '一个@阿育王. 巴拉特')

WebUI.click(findTestObject('ADMIN/Admin Users/User Invite Popup/input_btn-send-direct-invite'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Admin Users/Invite Error Toaster Message/div_Oops Something went wrong.'), 
    0)

WebUI.verifyElementText(findTestObject('ADMIN/Admin Users/Invite Error Toaster Message/div_One of the emails you ente'), 
    'One of the emails you entered is invalid, please try again.')

WebUI.waitForElementNotPresent(findTestObject('ADMIN/Admin Users/Invite Error Toaster Message/div_One of the emails you ente'), 
    0)

