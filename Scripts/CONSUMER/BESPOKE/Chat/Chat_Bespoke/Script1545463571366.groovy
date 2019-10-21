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

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/MERCHANT/Item Details Page/textfield_searchbar'), 0)

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Item Details Page/textfield_searchbar'), 'Item B')

WebUI.delay(3)

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Item Details Page/button_search'))

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/MERCHANT/Item Details Page/searchresult_Image'), 0)

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Item Details Page/searchresult_Image'), FailureHandling.STOP_ON_FAILURE)

WebUI.switchToWindowIndex(1)

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/MERCHANT/Item Details Page/button_Contact seller'), 0)

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Item Details Page/button_Contact seller'), FailureHandling.STOP_ON_FAILURE)

WebUI.switchToWindowIndex(2)

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/MERCHANT/Item Details Page/textarea_message'), 0)

WebUI.waitForElementClickable(findTestObject('BESPOKE DEL 2/MERCHANT/Item Details Page/textarea_message'), 0)

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Item Details Page/textarea_message'), 'test consumer')

WebUI.sendKeys(findTestObject('BESPOKE DEL 2/MERCHANT/Item Details Page/textarea_message'), Keys.chord(Keys.ENTER))

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

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Merchant Header/icon_Inbox'))

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Item Details Page/link_Buyers'))

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/MERCHANT/Item Details Page/content_Buyer'), 0)

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Item Details Page/content_Buyer'))

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/MERCHANT/Item Details Page/textarea_message'), 0)

WebUI.waitForElementClickable(findTestObject('BESPOKE DEL 2/MERCHANT/Item Details Page/textarea_message'), 0)

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Item Details Page/textarea_message'), 'test merchant')

WebUI.sendKeys(findTestObject('BESPOKE DEL 2/MERCHANT/Item Details Page/textarea_message'), Keys.chord(Keys.ENTER))

WebUI.mouseOver(findTestObject('Time/Merchant/User Settings/image_Seller'))

WebUI.waitForElementVisible(findTestObject('Time/Merchant/User Settings/link_Logout'), 0)

WebUI.click(findTestObject('Time/Merchant/User Settings/link_Logout'))

