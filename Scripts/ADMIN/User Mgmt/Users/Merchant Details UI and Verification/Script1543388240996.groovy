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

WebUI.setText(findTestObject('ADMIN/Admin Users/input_filter_email_name'), GlobalVariable.CustomMerchant)

WebUI.click(findTestObject('ADMIN/Admin Users/button_Search'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Admin Users/User Table/td_login'), 0)

WebUI.verifyElementText(findTestObject('ADMIN/Admin Users/User Table/td_login'), GlobalVariable.CustomMerchant)

WebUI.click(findTestObject('ADMIN/Admin Users/User Table/td_login'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Admin Users/Merchant Detail/h1_Users'), 0)

WebUI.verifyElementText(findTestObject('ADMIN/Admin Users/Merchant Detail/lbl_DISPLAY IMAGE'), 'DISPLAY IMAGE')

WebUI.verifyElementPresent(findTestObject('ADMIN/Admin Users/Merchant Detail/m_photo'), 0)

WebUI.verifyElementText(findTestObject('ADMIN/Admin Users/Merchant Detail/user_type'), 'Merchant')

WebUI.verifyElementText(findTestObject('ADMIN/Admin Users/Merchant Detail/lbl_Display Name'), 'Display Name')

WebUI.verifyElementText(findTestObject('ADMIN/Admin Users/Merchant Detail/span_Merchant Name'), 'Custom Merchant')

WebUI.verifyElementText(findTestObject('ADMIN/Admin Users/Merchant Detail/label_First Name'), 'First Name')

WebUI.verifyElementText(findTestObject('ADMIN/Admin Users/Merchant Detail/m_first name'), 'Custom')

WebUI.verifyElementText(findTestObject('ADMIN/Admin Users/Merchant Detail/label_Notification Email'), 'Notification Email')

WebUI.verifyElementText(findTestObject('ADMIN/Admin Users/Merchant Detail/m_notif email'), GlobalVariable.MerchantNotif)

WebUI.verifyElementText(findTestObject('ADMIN/Admin Users/Merchant Detail/label_Last Name'), 'Last Name')

WebUI.verifyElementText(findTestObject('ADMIN/Admin Users/Merchant Detail/m_last name'), 'Merchant')

WebUI.verifyElementText(findTestObject('ADMIN/Admin Users/Merchant Detail/label_Login'), 'Login')

WebUI.verifyElementText(findTestObject('ADMIN/Admin Users/Merchant Detail/m_login'), GlobalVariable.CustomMerchant)

WebUI.verifyElementText(findTestObject('ADMIN/Admin Users/Merchant Detail/label_Contact No.'), 'Contact No.')

WebUI.verifyElementText(findTestObject('ADMIN/Admin Users/Merchant Detail/m_contact number'), '+631234567890')

WebUI.verifyElementText(findTestObject('ADMIN/Admin Users/Merchant Detail/label_Date Joined'), 'Date Joined')

WebUI.verifyElementPresent(findTestObject('ADMIN/Admin Users/Merchant Detail/m_date joined'), 0)

WebUI.verifyElementText(findTestObject('ADMIN/Admin Users/Merchant Detail/label_Last Logged In'), 'Last Logged In')

WebUI.verifyElementPresent(findTestObject('ADMIN/Admin Users/Merchant Detail/m_last logged in'), 0)

WebUI.verifyElementText(findTestObject('ADMIN/Admin Users/Merchant Detail/label_Seller Location'), 'Seller Location')

WebUI.verifyElementText(findTestObject('ADMIN/Admin Users/Merchant Detail/label_Payment'), 'Payment')

WebUI.verifyElementText(findTestObject('ADMIN/Admin Users/Merchant Detail/td_Stripe'), 'Stripe')

WebUI.verifyElementText(findTestObject('ADMIN/Admin Users/Merchant Detail/stripe_email'), GlobalVariable.MerchantNotif)

WebUI.verifyElementText(findTestObject('ADMIN/Admin Users/Merchant Detail/td_PayPal'), 'PayPal')

WebUI.verifyElementText(findTestObject('ADMIN/Admin Users/Merchant Detail/paypal_email'), 'hiveboxstaging01@yopmail.com')

WebUI.verifyElementText(findTestObject('ADMIN/Admin Users/Merchant Detail/td_Omise'), 'Omise')

WebUI.verifyElementText(findTestObject('ADMIN/Admin Users/Merchant Detail/omise_email'), GlobalVariable.MerchantNotif)

WebUI.verifyElementText(findTestObject('ADMIN/Admin Users/Merchant Detail/td_Handshake'), 'Handshake')

WebUI.verifyElementText(findTestObject('ADMIN/Admin Users/Merchant Detail/handshake_email'), GlobalVariable.MerchantNotif)

WebUI.verifyElementPresent(findTestObject('ADMIN/Admin Users/Merchant Detail/a_Change Password'), 0)

WebUI.verifyElementText(findTestObject('ADMIN/Admin Users/Merchant Detail/a_Change Password'), 'Change Password')

WebUI.click(findTestObject('ADMIN/Admin Users/Merchant Detail/a_Back'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Admin Users/input_filter_email_name'), 0)

WebUI.click(findTestObject('ADMIN/Admin Permission/Admin Activity Log/a_Logout'))

WebUI.closeBrowser()

