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
import org.openqa.selenium.Keys as Keys

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

WebUI.waitForElementVisible(findTestObject('ADMIN/Private Settings/link_Private Settings'), 0)

WebUI.click(findTestObject('ADMIN/Private Settings/link_Private Settings'))

WebUI.delay(3)

WebUI.click(findTestObject('ADMIN/Private Settings/toggle_PrivateSettings'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Private Settings/button_All Guest Users'), 0)

WebUI.click(findTestObject('ADMIN/Private Settings/button_All Guest Users'))

WebUI.setText(findTestObject('ADMIN/Private Settings/textfield_Motto'), 'Private Onboard')

WebUI.setText(findTestObject('ADMIN/Private Settings/textarea_About Us'), 'About Us')

WebUI.setText(findTestObject('ADMIN/Private Settings/textfield_WebsiteLink'), 'www.google.com')

WebUI.click(findTestObject('ADMIN/Private Settings/button_Browse'))

WebUI.delay(3)

WebUI.uploadFile(findTestObject('ADMIN/Private Settings/upload_Page'), 'C:\\Users\\Public\\Pictures\\Sample Pictures\\Tulips.jpg')

WebUI.waitForElementVisible(findTestObject('ADMIN/Private Settings/button_Ok'), 0)

WebUI.click(findTestObject('ADMIN/Private Settings/button_Ok'))

WebUI.delay(3)

WebUI.click(findTestObject('ADMIN/Private Settings/button_Add Photo'))

WebUI.delay(3)

WebUI.click(findTestObject('ADMIN/Private Settings/button_Save'))

WebUI.delay(3)

WebUI.click(findTestObject('ADMIN/User Mgmt/Users/link_User Mgmt.'))

WebUI.waitForElementVisible(findTestObject('ADMIN/User Mgmt/Users/link_Waiting List'), 0)

WebUI.click(findTestObject('ADMIN/User Mgmt/Users/link_Waiting List'))

WebUI.waitForElementVisible(findTestObject('ADMIN/User Mgmt/Waiting List/button_Merchant'), 0)

WebUI.click(findTestObject('ADMIN/User Mgmt/Waiting List/button_Merchant'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/User Mgmt/Waiting List/button_Invite Merchants'), 0)

WebUI.click(findTestObject('ADMIN/User Mgmt/Waiting List/button_Invite Merchants'))

WebUI.delay(3)

WebUI.setText(findTestObject('ADMIN/User Mgmt/Waiting List/textarea_invitemerchant'), GlobalVariable.username_invitedmerchant)

WebUI.click(findTestObject('ADMIN/User Mgmt/Waiting List/button_Send'))

WebUI.delay(3)

WebUI.waitForElementVisible(findTestObject('ADMIN/Advanced/Login Config/link_Advanced'), 0)

WebUI.click(findTestObject('ADMIN/Advanced/Login Config/link_Advanced'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Advanced/Login Config/link_Login Config'), 0)

WebUI.click(findTestObject('ADMIN/Advanced/Login Config/link_Login Config'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Advanced/Login Config/label_Login Conguration'), 0)

WebUI.waitForElementVisible(findTestObject('ADMIN/Advanced/Login Config/label_Login Conguration'), 0)

WebUI.click(findTestObject('ADMIN/Advanced/Login Config/toggle_goggle2'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Advanced/Login Config/toast_Success'), 0)

WebUI.delay(3)

WebUI.click(findTestObject('Time/Admin/Admin Menu/Logout_Link'))

WebUI.navigateToUrl('www.gmail.com')

WebUI.delay(3)

WebUI.setText(findTestObject('ADMIN/Gmail Page/textfield_username'), GlobalVariable.username_invitedmerchant)

WebUI.sendKeys(findTestObject('ADMIN/Gmail Page/textfield_username'), Keys.chord(Keys.ENTER))

WebUI.delay(3)

WebUI.setText(findTestObject('ADMIN/Gmail Page/textfield_password'), GlobalVariable.password_invitedmerchant)

WebUI.sendKeys(findTestObject('ADMIN/Gmail Page/textfield_password'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('ADMIN/Gmail Page/textfield_searchbar'), 'Invite Seller')

WebUI.sendKeys(findTestObject('ADMIN/Gmail Page/textfield_searchbar'), Keys.chord(Keys.ENTER))

WebUI.delay(3)

WebUI.click(findTestObject('ADMIN/Gmail Page/link_Seller Invite'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Gmail Page/button_Create Account'), 0)

WebUI.click(findTestObject('ADMIN/Gmail Page/button_Create Account'))

WebUI.delay(3)

WebUI.switchToWindowIndex(1)

WebUI.waitForElementVisible(findTestObject('Time/Consumer/Register  Sign In/onboard_Username'), 0)

WebUI.verifyElementPresent(findTestObject('Time/Consumer/Register  Sign In/method_Continue with Google'), 0)

WebUI.navigateToUrl(GlobalVariable.homepage)

WebUI.delay(3)

WebUI.waitForElementVisible(findTestObject('Time/Consumer/Private Login Page/SignInSeller_Button'), 0)

WebUI.click(findTestObject('Time/Consumer/Private Login Page/SignInSeller_Button'))

WebUI.verifyElementPresent(findTestObject('Time/Consumer/Register  Sign In/method_Continue with Google'), 0)

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

WebUI.click(findTestObject('ADMIN/Advanced/Login Config/toggle_goggle2'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Advanced/Login Config/toast_Success'), 0)

WebUI.delay(3)

WebUI.click(findTestObject('Time/Admin/Admin Menu/Logout_Link'))

WebUI.navigateToUrl('www.gmail.com')

WebUI.delay(3)

WebUI.setText(findTestObject('ADMIN/Gmail Page/textfield_username'), GlobalVariable.username_invitedmerchant)

WebUI.sendKeys(findTestObject('ADMIN/Gmail Page/textfield_username'), Keys.chord(Keys.ENTER))

WebUI.delay(3)

WebUI.setText(findTestObject('ADMIN/Gmail Page/textfield_password'), GlobalVariable.password_invitedmerchant)

WebUI.sendKeys(findTestObject('ADMIN/Gmail Page/textfield_password'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('ADMIN/Gmail Page/textfield_searchbar'), 'Invite Seller')

WebUI.sendKeys(findTestObject('ADMIN/Gmail Page/textfield_searchbar'), Keys.chord(Keys.ENTER))

WebUI.delay(3)

WebUI.click(findTestObject('ADMIN/Gmail Page/link_Seller Invite'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Gmail Page/button_Create Account'), 0)

WebUI.click(findTestObject('ADMIN/Gmail Page/button_Create Account'))

WebUI.delay(3)

WebUI.switchToWindowIndex(1)

WebUI.waitForElementVisible(findTestObject('Time/Consumer/Register  Sign In/onboard_Username'), 0)

WebUI.verifyElementNotVisible(findTestObject('Time/Consumer/Register  Sign In/method_Continue with Google'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementNotVisible(findTestObject('Time/Consumer/Register  Sign In/method_Continue with Google'), FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl(GlobalVariable.homepage)

WebUI.delay(3)

WebUI.waitForElementVisible(findTestObject('Time/Consumer/Homepage/RegisterSignIn_Link'), 0)

WebUI.click(findTestObject('Time/Consumer/Homepage/RegisterSignIn_Link'))

WebUI.verifyElementPresent(findTestObject('Time/Consumer/Register  Sign In/method_Continue with Google'), 0)

WebUI.verifyElementNotVisible(findTestObject('Time/Consumer/Register  Sign In/method_Continue with Google'), FailureHandling.STOP_ON_FAILURE)

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

WebUI.waitForElementVisible(findTestObject('ADMIN/Private Settings/link_Private Settings'), 0)

WebUI.click(findTestObject('ADMIN/Private Settings/link_Private Settings'))

WebUI.delay(3)

WebUI.click(findTestObject('ADMIN/Private Settings/toggle_PrivateSettings'))

WebUI.delay(3)

WebUI.click(findTestObject('Time/Admin/Admin Menu/Logout_Link'))

