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

WebUI.navigateToUrl(GlobalVariable.homepage)

WebUI.waitForElementVisible(findTestObject('Time/Consumer/Homepage/RegisterSignIn_Link'), 0)

WebUI.click(findTestObject('Time/Consumer/Homepage/RegisterSignIn_Link'))

if (GlobalVariable.buyercredential == 'custom') {
    WebUI.setText(findTestObject('Time/Consumer/Register  Sign In/Username_field'), GlobalVariable.customusername_buyer)

    WebUI.setText(findTestObject('Time/Consumer/Register  Sign In/Password_field'), GlobalVariable.custompassword_buyer)

    WebUI.click(findTestObject('Time/Consumer/Register  Sign In/Login_button'))
} else if (GlobalVariable.buyercredential == 'google') {
    WebUI.click(findTestObject('ADMIN/Admin Onboarding Page/Create_Account_Page/Button_Signup_Google'))

    WebUI.setText(findTestObject('ADMIN/Admin Onboarding Page/Create_Account_Page/Google_Username'), GlobalVariable.googleusername_buyer)

    WebUI.click(findTestObject('ADMIN/Admin Onboarding Page/Create_Account_Page/Button_Google_Next'))

    WebUI.delay(1)

    WebUI.setText(findTestObject('ADMIN/Admin Onboarding Page/Create_Account_Page/Google_Password'), GlobalVariable.googlepassword_buyer)

    WebUI.delay(1)

    WebUI.click(findTestObject('ADMIN/Admin Onboarding Page/Create_Account_Page/Button_Google_Next'))
} else if (GlobalVariable.buyercredential == 'facebook') {
    WebUI.click(findTestObject('ADMIN/Admin Onboarding Page/Create_Account_Page/Button_Signup_Facebook'))

    WebUI.setText(findTestObject('ADMIN/Admin Onboarding Page/Create_Account_Page/Facebook_Email'), GlobalVariable.fbusername_buyer)

    WebUI.setText(findTestObject('ADMIN/Admin Onboarding Page/Create_Account_Page/Facebook_Password'), GlobalVariable.fbpassword_buyer)

    WebUI.click(findTestObject('ADMIN/Admin Onboarding Page/Create_Account_Page/Button_Login_Facebook'))
}

WebUI.setText(findTestObject('Time/Consumer/Page_1126srth1/input_KeyWords'), 'Mexico')

WebUI.click(findTestObject('Time/Consumer/Page_1126srth1/input_home-search btn-find'))

WebUI.click(findTestObject('Time/Consumer/Page_1126srth1/a_130characters130characters13'))

WebUI.click(findTestObject('Time/Consumer/Page_1126srth1/td_4'))

WebUI.setText(findTestObject('Time/Consumer/Page_1126srth1/input_noHour'), '1')

WebUI.click(findTestObject('Time/Consumer/Page_1126srth1/a_Request to book'))

WebUI.waitForElementClickable(findTestObject('Time/Consumer/Page_1126srth1/textarea_chatMsg'), 0)

WebUI.setText(findTestObject('Time/Consumer/Page_1126srth1/textarea_chatMsg'), 'test consumer')

WebUI.sendKeys(findTestObject('Time/Consumer/Page_1126srth1/textarea_chatMsg'), Keys.chord(Keys.ENTER))

WebUI.mouseOver(findTestObject('Time/Merchant/User Settings/image_Seller'))

WebUI.waitForElementVisible(findTestObject('Time/Merchant/User Settings/link_Logout'), 0)

WebUI.click(findTestObject('Time/Merchant/User Settings/link_Logout'))

WebUI.waitForElementVisible(findTestObject('Time/Consumer/Homepage/BeASeller_Link'), 0)

WebUI.click(findTestObject('Time/Consumer/Homepage/BeASeller_Link'))

if (GlobalVariable.merchantcredential == 'custom') {
    WebUI.setText(findTestObject('Time/Consumer/Register  Sign In/Username_field'), GlobalVariable.customusername_merchant)

    WebUI.setText(findTestObject('Time/Consumer/Register  Sign In/Password_field'), GlobalVariable.custompassword_merchant)

    WebUI.click(findTestObject('Time/Consumer/Register  Sign In/Login_button'))
} else if (GlobalVariable.merchantcredential == 'google') {
    WebUI.click(findTestObject('ADMIN/Admin Onboarding Page/Create_Account_Page/Button_Signup_Google'))

    WebUI.setText(findTestObject('ADMIN/Admin Onboarding Page/Create_Account_Page/Google_Username'), GlobalVariable.googleusername_merchant)

    WebUI.click(findTestObject('ADMIN/Admin Onboarding Page/Create_Account_Page/Button_Google_Next'))

    WebUI.delay(1)

    WebUI.setText(findTestObject('ADMIN/Admin Onboarding Page/Create_Account_Page/Google_Password'), GlobalVariable.googlepassword_merchant)

    WebUI.delay(1)

    WebUI.click(findTestObject('ADMIN/Admin Onboarding Page/Create_Account_Page/Button_Google_Next'))
} else if (GlobalVariable.merchantcredential == 'facebook') {
    WebUI.click(findTestObject('ADMIN/Admin Onboarding Page/Create_Account_Page/Button_Signup_Facebook'))

    WebUI.setText(findTestObject('ADMIN/Admin Onboarding Page/Create_Account_Page/Facebook_Email'), GlobalVariable.fbusername_merchant)

    WebUI.setText(findTestObject('ADMIN/Admin Onboarding Page/Create_Account_Page/Facebook_Password'), GlobalVariable.fbpassword_merchant)

    WebUI.click(findTestObject('ADMIN/Admin Onboarding Page/Create_Account_Page/Button_Login_Facebook'))
}

WebUI.waitForElementVisible(findTestObject('Time/Consumer/Page_1126srth1/i_icon inbox-icon'), 0)

WebUI.click(findTestObject('Time/Consumer/Page_1126srth1/i_icon inbox-icon'))

WebUI.setText(findTestObject('Time/Consumer/Page_1126srth1/input_search-buyer'), '130')

WebUI.click(findTestObject('Time/Consumer/Page_1126srth1/input_btn-find'))

WebUI.click(findTestObject('Time/Consumer/Page_1126srth1/h5_130characters130characters1'))

WebUI.waitForElementVisible(findTestObject('Time/Consumer/Page_1126srth1/textarea_chatMsg'), 0)

WebUI.waitForElementClickable(findTestObject('Time/Consumer/Page_1126srth1/textarea_chatMsg'), 0)

WebUI.setText(findTestObject('Time/Consumer/Page_1126srth1/textarea_chatMsg'), 'test merchant')

WebUI.sendKeys(findTestObject('Time/Consumer/Page_1126srth1/textarea_chatMsg'), Keys.chord(Keys.ENTER))

WebUI.mouseOver(findTestObject('Time/Merchant/User Settings/image_Seller'))

WebUI.waitForElementVisible(findTestObject('Time/Merchant/User Settings/link_Logout'), 0)

WebUI.click(findTestObject('Time/Merchant/User Settings/link_Logout'))

