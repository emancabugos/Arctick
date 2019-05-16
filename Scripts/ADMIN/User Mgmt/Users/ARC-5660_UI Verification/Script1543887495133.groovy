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

WebUI.navigateToUrl('')

if (GlobalVariable.credentialmerchant == 'custom') {
    WebUI.setText(findTestObject('Time/Consumer/Register  Sign In/Username_field'), GlobalVariable.custommerchant)

    WebUI.setText(findTestObject('Time/Consumer/Register  Sign In/Password_field'), GlobalVariable.custompassword)

    WebUI.acceptAlert()

    WebUI.click(findTestObject('Time/Consumer/Register  Sign In/Login_button'))
} else if (GlobalVariable.credentialmerchant == 'google') {
    WebUI.click(findTestObject('ADMIN/Admin Onboarding Page/Create_Account_Page/Button_Signup_Google'))

    WebUI.setText(findTestObject('ADMIN/Admin Onboarding Page/Create_Account_Page/Google_Username'), GlobalVariable.AdminGoogle)

    WebUI.click(findTestObject('ADMIN/Admin Onboarding Page/Create_Account_Page/Button_Google_Next'))

    WebUI.delay(1)

    WebUI.setText(findTestObject('ADMIN/Admin Onboarding Page/Create_Account_Page/Google_Password'), GlobalVariable.AdminGooglePass)

    WebUI.delay(1)

    WebUI.click(findTestObject('ADMIN/Admin Onboarding Page/Create_Account_Page/Button_Google_Next'))
} else if (GlobalVariable.credentialmerchant == 'facebook') {
    WebUI.click(findTestObject('ADMIN/Admin Onboarding Page/Create_Account_Page/Button_Signup_Facebook'))

    WebUI.setText(findTestObject('ADMIN/Admin Onboarding Page/Create_Account_Page/Facebook_Email'), GlobalVariable.AdminFacebook)

    WebUI.setText(findTestObject('ADMIN/Admin Onboarding Page/Create_Account_Page/Facebook_Password'), GlobalVariable.AdminFacebookPass)

    WebUI.click(findTestObject('ADMIN/Admin Onboarding Page/Create_Account_Page/Button_Login_Facebook'))
}

WebUI.waitForElementVisible(findTestObject('ADMIN/User Mgmt/Users/link_User Mgmt.'), 0)

WebUI.click(findTestObject('ADMIN/User Mgmt/Users/link_User Mgmt.'))

WebUI.waitForElementVisible(findTestObject('ADMIN/User Mgmt/Users/link_Users'), 0)

WebUI.click(findTestObject('ADMIN/User Mgmt/Users/link_Items'))

WebUI.waitForElementVisible(findTestObject('ADMIN/User Mgmt/Users/users_textfield_search'), 0)

WebUI.setText(findTestObject('ADMIN/User Mgmt/Users/users_textfield_search'), '')

WebUI.click(findTestObject('ADMIN/User Mgmt/Users/users_button_Search'))

WebUI.waitForPageLoad(2000)

WebUI.waitForElementVisible(findTestObject('ADMIN/User Mgmt/Users/link_User Details'), 0)

WebUI.verifyElementText(findTestObject('ADMIN/User Mgmt/Users/link_User Details'), '')

WebUI.click(findTestObject('ADMIN/User Mgmt/Users/link_User Details'))

WebUI.waitForElementVisible(findTestObject('ADMIN/User Mgmt/Users/button_Back'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('https://1126srth1.test.arcadier.io/user')

WebUI.click(findTestObject('Time/Consumer/Chat/a_REGISTER  SIGN IN'))

WebUI.setText(findTestObject('Time/Consumer/Chat/input_username'), 'buyer01')

WebUI.setText(findTestObject('Time/Consumer/Chat/input_password'), 'welcome8')

WebUI.click(findTestObject('Time/Consumer/Chat/input_login-submit'))

WebUI.setText(findTestObject('Time/Consumer/Chat/input_KeyWords'), 'Mexico')

WebUI.click(findTestObject('Time/Consumer/Chat/img'))

WebUI.click(findTestObject('Time/Consumer/Chat/input_home-search btn-find'))

WebUI.click(findTestObject('Time/Consumer/Chat/a_Custom 150Min 247'))

WebUI.click(findTestObject('Time/Consumer/Chat/a_130characters130characters13'))

WebUI.click(findTestObject('Time/Consumer/Chat/td_4'))

WebUI.setText(findTestObject('Time/Consumer/Chat/input_noHour'), '1')

WebUI.click(findTestObject('Time/Consumer/Chat/a_Request to book'))

WebUI.setText(findTestObject('Time/Consumer/Chat/textarea_chatMsg'), 'test')

WebUI.sendKeys(findTestObject('Time/Consumer/Chat/textarea_chatMsg'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Time/Consumer/Chat/img_1'))

WebUI.click(findTestObject('Time/Consumer/Chat/a_Logout'))

WebUI.click(findTestObject('Time/Consumer/Chat/a_BE A SELLER'))

WebUI.setText(findTestObject('Time/Consumer/Chat/input_username'), 'custommerchant')

WebUI.setText(findTestObject('Time/Consumer/Chat/input_password'), 'welcome8')

WebUI.click(findTestObject('Time/Consumer/Chat/input_login-submit'))

WebUI.click(findTestObject('Time/Consumer/Chat/i_icon inbox-icon'))

WebUI.setText(findTestObject('Time/Consumer/Chat/input_search-buyer'), 'test')

WebUI.click(findTestObject('Time/Consumer/Chat/input_btn-find'))

WebUI.click(findTestObject('Time/Consumer/Chat/i_icon inbox-icon'))

WebUI.click(findTestObject('Time/Consumer/Chat/div_130characters130characters'))

WebUI.rightClick(findTestObject('Time/Consumer/Chat/textarea_chatMsg_1'))

WebUI.setText(findTestObject('Time/Consumer/Chat/textarea_chatMsg'), 'test merchant')

WebUI.sendKeys(findTestObject('Time/Consumer/Chat/textarea_chatMsg'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Time/Consumer/Chat/div_test merchant04122018 1354'))

WebUI.click(findTestObject('Time/Consumer/Chat/img_2'))

WebUI.click(findTestObject('Time/Consumer/Chat/a_Logout'))

WebUI.closeBrowser()

WebUI.verifyElementPresent(findTestObject('ADMIN/User Mgmt/Users/users_logo'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/User Mgmt/Users/button_Back'), 0)

WebUI.verifyElementClickable(findTestObject('ADMIN/User Mgmt/Users/button_Back'))

WebUI.verifyElementPresent(findTestObject('ADMIN/User Mgmt/Users/label_DISPLAY IMAGE'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/User Mgmt/Users/label_Consumer'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/User Mgmt/Users/label_Display Name'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/User Mgmt/Users/label_First Name'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/User Mgmt/Users/label_Last Name'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/User Mgmt/Users/label_content_Contact No.'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/User Mgmt/Users/label_Address'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/User Mgmt/Users/label_Notification Email'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/User Mgmt/Users/label_Login'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/User Mgmt/Users/label_Date Joined'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/User Mgmt/Users/label_Last Logged In'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/User Mgmt/Users/button_Change Password'), 0)

WebUI.verifyElementClickable(findTestObject('ADMIN/User Mgmt/Users/button_Change Password'), FailureHandling.STOP_ON_FAILURE)

