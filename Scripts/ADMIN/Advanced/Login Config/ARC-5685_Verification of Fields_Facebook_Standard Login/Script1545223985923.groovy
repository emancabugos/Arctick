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

WebUI.navigateToUrl(GlobalVariable.url)

if (GlobalVariable.admincredential == 'custom') {
    WebUI.setText(findTestObject('ADMIN/Login Page/textfield_username'), GlobalVariable.customusername_admin)

    WebUI.setText(findTestObject('ADMIN/Login Page/textfield_password'), GlobalVariable.custompassword_admin)

    WebUI.click(findTestObject('ADMIN/Login Page/button_login-submit'))
} else if (GlobalVariable.admincredential == 'google') {
    WebUI.click(findTestObject('ADMIN/Admin Onboarding Page/Create_Account_Page/Button_Signup_Google'))

    WebUI.setText(findTestObject('ADMIN/Admin Onboarding Page/Create_Account_Page/Google_Username'), GlobalVariable.googleusername_admin)

    WebUI.click(findTestObject('ADMIN/Admin Onboarding Page/Create_Account_Page/Button_Google_Next'))

    WebUI.delay(1)

    WebUI.setText(findTestObject('ADMIN/Admin Onboarding Page/Create_Account_Page/Google_Password'), GlobalVariable.googlepassword_admin)

    WebUI.delay(1)

    WebUI.click(findTestObject('ADMIN/Admin Onboarding Page/Create_Account_Page/Button_Google_Next'))
} else if (GlobalVariable.admincredential == 'facebook') {
    WebUI.click(findTestObject('ADMIN/Admin Onboarding Page/Create_Account_Page/Button_Signup_Facebook'))

    WebUI.setText(findTestObject('ADMIN/Admin Onboarding Page/Create_Account_Page/Facebook_Email'), GlobalVariable.fbusername_admin)

    WebUI.setText(findTestObject('ADMIN/Admin Onboarding Page/Create_Account_Page/Facebook_Password'), GlobalVariable.fbpassword_admin)

    WebUI.click(findTestObject('ADMIN/Admin Onboarding Page/Create_Account_Page/Button_Login_Facebook'))
}

WebUI.waitForElementVisible(findTestObject('ADMIN/Advanced/Login Config/link_Advanced'), 0)

WebUI.click(findTestObject('ADMIN/Advanced/Login Config/link_Advanced'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Advanced/Login Config/link_Login Config'), 0)

WebUI.click(findTestObject('ADMIN/Advanced/Login Config/link_Login Config'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Advanced/Login Config/label_Login Conguration'), 0)

WebUI.waitForElementVisible(findTestObject('ADMIN/Advanced/Login Config/label_Login Conguration'), 0)

WebUI.click(findTestObject('ADMIN/Advanced/Login Config/drop_facebook2'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.waitForElementVisible(findTestObject('ADMIN/Advanced/Login Config/label_YourAppID_facebook2'), 0)

WebUI.verifyElementVisible(findTestObject('ADMIN/Advanced/Login Config/label_YourAppID_facebook2'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('ADMIN/Advanced/Login Config/textfield_appID_facebook2'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('ADMIN/Advanced/Login Config/label_YourSecretKey_facebook2'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('ADMIN/Advanced/Login Config/textfield_YourSecretKey_facebook2'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('ADMIN/Advanced/Login Config/button_LoginDeveloper_facebook2'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('ADMIN/Advanced/Login Config/button_Save_facebook2'), FailureHandling.STOP_ON_FAILURE)

WebUI.clearText(findTestObject('ADMIN/Advanced/Login Config/textfield_appID_facebook2'), FailureHandling.STOP_ON_FAILURE)

WebUI.clearText(findTestObject('ADMIN/Advanced/Login Config/textfield_YourSecretKey_facebook2'), FailureHandling.STOP_ON_FAILURE)

WebUI.clearText(findTestObject('ADMIN/Advanced/Login Config/buttoninput_facebook2'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('ADMIN/Advanced/Login Config/textfield_appID_facebook2'), 'test')

WebUI.click(findTestObject('ADMIN/Advanced/Login Config/button_Save_facebook2'))

WebUI.delay(2)

WebUI.verifyElementVisible(findTestObject('ADMIN/Advanced/Login Config/textfield_appID_facebook2'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('ADMIN/Advanced/Login Config/textfield_YourSecretKey_facebook2'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('ADMIN/Advanced/Login Config/textfield_YourSecretKey_facebook2'), 'test')

WebUI.verifyElementVisible(findTestObject('ADMIN/Advanced/Login Config/textfield_appID_facebook2'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('ADMIN/Advanced/Login Config/textfield_YourSecretKey_facebook2'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('ADMIN/Advanced/Login Config/buttoninput_facebook2'), 'Login with Facebook')

String facebook2 = WebUI.getText(findTestObject('ADMIN/Advanced/Login Config/buttoninput_facebook2'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('ADMIN/Advanced/Login Config/button_Save_facebook2'))

WebUI.delay(2)

boolean notEditable = WebUI.setText(findTestObject('ADMIN/Advanced/Login Config/textfield_appID_facebook2'), 'test', FailureHandling.OPTIONAL)

println('DEBUG boolean value ' + notEditable)

WebUI.click(findTestObject('ADMIN/Advanced/Login Config/toggle_facebook2'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Advanced/Login Config/toast_Success'), 0)

WebUI.delay(3)

WebUI.click(findTestObject('Time/Admin/Admin Menu/Logout_Link'))

not_run: WebUI.delay(3)

WebUI.navigateToUrl(GlobalVariable.homepage)

WebUI.delay(3)

WebUI.waitForElementVisible(findTestObject('Time/Consumer/Homepage/RegisterSignIn_Link'), 0)

WebUI.click(findTestObject('Time/Consumer/Homepage/RegisterSignIn_Link'))

WebUI.waitForElementVisible(findTestObject('Time/Consumer/Register  Sign In/Create Account_button '), 0)

WebUI.verifyElementPresent(findTestObject('Time/Consumer/Register  Sign In/method_Login with Facebook'), 0)

WebUI.verifyElementText(findTestObject('Time/Consumer/Register  Sign In/method_Login with Facebook'), 'Login with Facebook')

WebUI.navigateToUrl(GlobalVariable.url)

if (GlobalVariable.admincredential == 'custom') {
    WebUI.setText(findTestObject('ADMIN/Login Page/textfield_username'), GlobalVariable.customusername_admin)

    WebUI.setText(findTestObject('ADMIN/Login Page/textfield_password'), GlobalVariable.custompassword_admin)

    WebUI.click(findTestObject('ADMIN/Login Page/button_login-submit'))
} else if (GlobalVariable.admincredential == 'google') {
    WebUI.click(findTestObject('ADMIN/Admin Onboarding Page/Create_Account_Page/Button_Signup_Google'))

    WebUI.setText(findTestObject('ADMIN/Admin Onboarding Page/Create_Account_Page/Google_Username'), GlobalVariable.googleusername_admin)

    WebUI.click(findTestObject('ADMIN/Admin Onboarding Page/Create_Account_Page/Button_Google_Next'))

    WebUI.delay(1)

    WebUI.setText(findTestObject('ADMIN/Admin Onboarding Page/Create_Account_Page/Google_Password'), GlobalVariable.googlepassword_admin)

    WebUI.delay(1)

    WebUI.click(findTestObject('ADMIN/Admin Onboarding Page/Create_Account_Page/Button_Google_Next'))
} else if (GlobalVariable.admincredential == 'facebook') {
    WebUI.click(findTestObject('ADMIN/Admin Onboarding Page/Create_Account_Page/Button_Signup_Facebook'))

    WebUI.setText(findTestObject('ADMIN/Admin Onboarding Page/Create_Account_Page/Facebook_Email'), GlobalVariable.fbusername_admin)

    WebUI.setText(findTestObject('ADMIN/Admin Onboarding Page/Create_Account_Page/Facebook_Password'), GlobalVariable.fbpassword_admin)

    WebUI.click(findTestObject('ADMIN/Admin Onboarding Page/Create_Account_Page/Button_Login_Facebook'))
}

WebUI.waitForElementVisible(findTestObject('ADMIN/Advanced/Login Config/link_Advanced'), 0)

WebUI.click(findTestObject('ADMIN/Advanced/Login Config/link_Advanced'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Advanced/Login Config/link_Login Config'), 0)

WebUI.click(findTestObject('ADMIN/Advanced/Login Config/link_Login Config'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Advanced/Login Config/label_Login Conguration'), 0)

WebUI.waitForElementVisible(findTestObject('ADMIN/Advanced/Login Config/label_Login Conguration'), 0)

WebUI.click(findTestObject('ADMIN/Advanced/Login Config/toggle_facebook2'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.waitForElementVisible(findTestObject('ADMIN/Advanced/Login Config/toast_Success'), 0)

WebUI.delay(3)

WebUI.click(findTestObject('Time/Admin/Admin Menu/Logout_Link'))

WebUI.delay(3)

WebUI.navigateToUrl(GlobalVariable.homepage)

WebUI.delay(3)

WebUI.waitForElementVisible(findTestObject('Time/Consumer/Homepage/RegisterSignIn_Link'), 0)

WebUI.click(findTestObject('Time/Consumer/Homepage/RegisterSignIn_Link'))

WebUI.waitForElementVisible(findTestObject('Time/Consumer/Register  Sign In/Create Account_button '), 0)

WebUI.verifyElementNotVisible(findTestObject('Time/Consumer/Register  Sign In/method_Login with Facebook'), FailureHandling.STOP_ON_FAILURE)

