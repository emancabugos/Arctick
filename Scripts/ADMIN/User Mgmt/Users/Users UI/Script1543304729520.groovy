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

WebUI.verifyElementPresent(findTestObject('ADMIN/Admin Users/i_icon icon-users'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Admin Users/div_Invite Merchant'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Admin Users/input_filter_email_name'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Admin Users/select_User Type'), 0)

WebUI.verifyElementText(findTestObject('ADMIN/Admin Users/span_Date Joined'), 'Date Joined')

WebUI.verifyElementPresent(findTestObject('ADMIN/Admin Users/input_filter_join_start_date'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Admin Users/input_filter_join_end_date'), 0)

WebUI.verifyElementText(findTestObject('ADMIN/Admin Users/span_Last Logged in'), 'Last Logged in')

WebUI.verifyElementPresent(findTestObject('ADMIN/Admin Users/input_filter_loggedin_start_da'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Admin Users/input_filter_loggedin_end_date'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Admin Users/button_Search'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Admin Users/a_Clear'), 0)

WebUI.verifyElementText(findTestObject('ADMIN/Admin Users/div_Users found'), 'Users found')

WebUI.verifyElementText(findTestObject('ADMIN/Admin Users/div_Merchants'), 'Merchants')

WebUI.verifyElementText(findTestObject('ADMIN/Admin Users/div_Consumers'), 'Consumers')

WebUI.verifyElementPresent(findTestObject('ADMIN/Admin Users/button_Download CSV'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Admin Users/select_Sort By'), 0)

WebUI.verifyElementText(findTestObject('ADMIN/Admin Users/div_Login'), 'Login')

WebUI.verifyElementText(findTestObject('ADMIN/Admin Users/div_Display Name'), 'Display Name')

WebUI.verifyElementText(findTestObject('ADMIN/Admin Users/div_Notification Email'), 'Notification Email')

WebUI.verifyElementText(findTestObject('ADMIN/Admin Users/div_Date Joined'), 'Date Joined')

WebUI.verifyElementText(findTestObject('ADMIN/Admin Users/div_User Type'), 'User Type')

WebUI.verifyElementText(findTestObject('ADMIN/Admin Users/div_Last Logged In'), 'Last Logged In')

WebUI.verifyElementText(findTestObject('ADMIN/Admin Users/div_User Access'), 'User Access')

WebUI.comment('Empty Search')

WebUI.click(findTestObject('ADMIN/Admin Users/button_Search'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Admin Users/User Table/td_Display Name'), 0)

WebUI.delay(1)

WebUI.comment('clear fields')

WebUI.setText(findTestObject('ADMIN/Admin Users/input_filter_email_name'), 'Clear Fields')

WebUI.selectOptionByLabel(findTestObject('ADMIN/Admin Users/select_User Type'), 'All', false)

WebUI.setText(findTestObject('ADMIN/Admin Users/input_filter_join_start_date'), '11/12/2018')

WebUI.setText(findTestObject('ADMIN/Admin Users/input_filter_join_end_date'), '11/12/2018')

WebUI.setText(findTestObject('ADMIN/Admin Users/input_filter_loggedin_start_da'), '11/12/2018')

WebUI.setText(findTestObject('ADMIN/Admin Users/input_filter_loggedin_end_date'), '11/12/2018')

WebUI.click(findTestObject('ADMIN/Admin Users/a_Clear'))

WebUI.verifyTextNotPresent('Clear Fields', false)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Admin Users/input_filter_email_name'), 'placeholder', 'Search Display name and Notification Email', 
    0)

WebUI.verifyOptionPresentByLabel(findTestObject('ADMIN/Admin Users/select_User Type'), 'User Type', false, 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Admin Users/input_filter_join_start_date'), 'placeholder', 'Start Date', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Admin Users/input_filter_join_end_date'), 'placeholder', 'End Date', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Admin Users/input_filter_loggedin_start_da'), 'placeholder', 'Start Date', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Admin Users/input_filter_loggedin_end_date'), 'placeholder', 'End Date', 
    0)

WebUI.click(findTestObject('ADMIN/Admin Permission/Admin Activity Log/a_Logout'))

