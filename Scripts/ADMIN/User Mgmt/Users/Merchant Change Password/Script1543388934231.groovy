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

WebUI.verifyElementPresent(findTestObject('ADMIN/Admin Users/Merchant Detail/a_Change Password'), 0)

WebUI.click(findTestObject('ADMIN/Admin Users/Merchant Detail/a_Change Password'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Admin Users/Change Password/h5_Change Users Password'), 0)

WebUI.comment('Mandatory "Enter new password"')

WebUI.setText(findTestObject('ADMIN/Admin Users/Change Password/input_confirm_password'), 'Welcome08!')

WebUI.click(findTestObject('ADMIN/Admin Users/Change Password/button_Save'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Admin Users/Change Password/label_Password is required'), 0)

WebUI.verifyElementText(findTestObject('ADMIN/Admin Users/Change Password/label_Password is required'), 'Password is required')

WebUI.comment('Mandatory "Confirm new password"')

WebUI.setText(findTestObject('ADMIN/Admin Users/Change Password/input_confirm_password'), '')

WebUI.setText(findTestObject('ADMIN/Admin Users/Change Password/input_NewPassword'), 'Welcome08!')

WebUI.click(findTestObject('ADMIN/Admin Users/Change Password/button_Save'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Admin Users/Change Password/label_Confirm password is requ'), 0)

WebUI.verifyElementText(findTestObject('ADMIN/Admin Users/Change Password/label_Confirm password is requ'), 'Confirm password is required')

WebUI.comment('Mandatory both fields')

WebUI.setText(findTestObject('ADMIN/Admin Users/Change Password/input_NewPassword'), '')

WebUI.click(findTestObject('ADMIN/Admin Users/Change Password/button_Save'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Admin Users/Change Password/label_Password is required'), 0)

WebUI.verifyElementText(findTestObject('ADMIN/Admin Users/Change Password/label_Password is required'), 'Password is required')

WebUI.verifyElementText(findTestObject('ADMIN/Admin Users/Change Password/label_Confirm password is requ'), 'Confirm password is required')

WebUI.comment('Password doesn\'t match')

WebUI.setText(findTestObject('ADMIN/Admin Users/Change Password/input_confirm_password'), 'welcome8')

WebUI.setText(findTestObject('ADMIN/Admin Users/Change Password/input_NewPassword'), 'Welcome08!')

WebUI.click(findTestObject('ADMIN/Admin Users/Change Password/button_Save'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Admin Users/Change Password/label_Password doesnt match co'), 0)

WebUI.verifyElementText(findTestObject('ADMIN/Admin Users/Change Password/label_Password doesnt match co'), 'Password doesn’t match confirmation')

WebUI.comment('Password must be at least 6 char')

WebUI.setText(findTestObject('ADMIN/Admin Users/Change Password/input_confirm_password'), '123')

WebUI.setText(findTestObject('ADMIN/Admin Users/Change Password/input_NewPassword'), '123')

WebUI.click(findTestObject('ADMIN/Admin Users/Change Password/button_Save'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Admin Users/Change Password/label_Password must be at leas'), 0)

WebUI.verifyElementText(findTestObject('ADMIN/Admin Users/Change Password/label_Password must be at leas'), 'Password must be at least 6 characters')

WebUI.comment('Password Successfully Save')

WebUI.setText(findTestObject('ADMIN/Admin Users/Change Password/input_confirm_password'), 'welcome8')

WebUI.setText(findTestObject('ADMIN/Admin Users/Change Password/input_NewPassword'), 'welcome8')

WebUI.click(findTestObject('ADMIN/Admin Users/Change Password/button_Save'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Admin Users/Change Password/span_Password changed successf'), 0)

WebUI.verifyElementText(findTestObject('ADMIN/Admin Users/Change Password/span_Password changed successf'), 'Password changed successfully')

WebUI.click(findTestObject('ADMIN/Admin Permission/Admin Activity Log/a_Logout'))

WebUI.closeBrowser()

