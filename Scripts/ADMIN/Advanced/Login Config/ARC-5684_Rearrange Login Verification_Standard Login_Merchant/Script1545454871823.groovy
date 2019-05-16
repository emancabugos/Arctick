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

WebUI.click(findTestObject('ADMIN/Advanced/Login Config/toggle_text_facebook2'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('ADMIN/Advanced/Login Config/drop_facebook2'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('ADMIN/Advanced/Login Config/toggle_text_goggle2'), 0)

WebUI.click(findTestObject('ADMIN/Advanced/Login Config/toggle_text_goggle2'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.dragAndDropToObject(findTestObject('ADMIN/Advanced/Login Config/menu_facebook1'), findTestObject('ADMIN/Advanced/Login Config/menu_facebook2'))

WebUI.dragAndDropToObject(findTestObject('ADMIN/Advanced/Login Config/menu_facebook2'), findTestObject('ADMIN/Advanced/Login Config/menu_custom'))

WebUI.dragAndDropToObject(findTestObject('ADMIN/Advanced/Login Config/menu_custom'), findTestObject('ADMIN/Advanced/Login Config/menu_google2'))

WebUI.dragAndDropToObject(findTestObject('ADMIN/Advanced/Login Config/menu_google2'), findTestObject('ADMIN/Advanced/Login Config/menu_facebook1'))

WebUI.dragAndDropToObject(findTestObject('ADMIN/Advanced/Login Config/menu_google2'), findTestObject('ADMIN/Advanced/Login Config/menu_facebook2'))

WebUI.delay(3)

WebUI.click(findTestObject('Time/Admin/Admin Menu/Logout_Link'))

WebUI.delay(3)

WebUI.navigateToUrl(GlobalVariable.homepage)

WebUI.delay(3)

WebUI.waitForElementVisible(findTestObject('Time/Consumer/Homepage/BeASeller_Link'), 0)

WebUI.click(findTestObject('Time/Consumer/Homepage/BeASeller_Link'))

WebUI.waitForElementVisible(findTestObject('Time/Consumer/Register  Sign In/Create Account_button '), 0)

WebUI.verifyElementText(findTestObject('Time/Consumer/Register  Sign In/button_1'), 'Continue with Google')

WebUI.verifyElementText(findTestObject('Time/Consumer/Register  Sign In/button_2'), 'Continue with Google')

WebUI.verifyElementText(findTestObject('Time/Consumer/Register  Sign In/button_3'), 'Continue with Facebook')

WebUI.verifyElementText(findTestObject('Time/Consumer/Register  Sign In/button_4'), 'Continue with Facebook')

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

WebUI.dragAndDropToObject(findTestObject('ADMIN/Advanced/Login Config/menu_custom'), findTestObject('ADMIN/Advanced/Login Config/menu_facebook2'))

WebUI.dragAndDropToObject(findTestObject('ADMIN/Advanced/Login Config/menu_facebook1'), findTestObject('ADMIN/Advanced/Login Config/menu_google1'))

WebUI.dragAndDropToObject(findTestObject('ADMIN/Advanced/Login Config/menu_facebook1'), findTestObject('ADMIN/Advanced/Login Config/menu_google2'))

WebUI.dragAndDropToObject(findTestObject('ADMIN/Advanced/Login Config/menu_google2'), findTestObject('ADMIN/Advanced/Login Config/menu_facebook2'))

WebUI.dragAndDropToObject(findTestObject('ADMIN/Advanced/Login Config/menu_facebook1'), findTestObject('ADMIN/Advanced/Login Config/menu_google1'))

WebUI.delay(3)

WebUI.click(findTestObject('ADMIN/Advanced/Login Config/toggle_text_facebook2'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.click(findTestObject('ADMIN/Advanced/Login Config/toggle_text_goggle2'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Time/Admin/Admin Menu/Logout_Link'))

WebUI.delay(3)

