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

WebUI.navigateToUrl(GlobalVariable.homepage)

WebUI.verifyElementPresent(findTestObject('Time/Consumer/Homepage/BeASeller_Link'), 0)

WebUI.click(findTestObject('Time/Consumer/Homepage/BeASeller_Link'))

WebUI.waitForElementVisible(findTestObject('Time/Consumer/Register  Sign In/Create Account_button '), 0)

if (GlobalVariable.onboardseller == 'custom') {
    WebUI.click(findTestObject('Time/Consumer/Register  Sign In/Create Account_button '), FailureHandling.STOP_ON_FAILURE)

    WebUI.waitForElementVisible(findTestObject('Time/Consumer/Register  Sign In/onboard_Username'), 0)

    WebUI.acceptAlert()

    WebUI.acceptAlert()

    WebUI.setText(findTestObject('Time/Consumer/Register  Sign In/onboard_Username'), GlobalVariable.onboardusername)

    WebUI.setText(findTestObject('Time/Consumer/Register  Sign In/onboard_Password'), GlobalVariable.onboardpassword)

    WebUI.setText(findTestObject('Time/Consumer/Register  Sign In/onboard_Reconfirm'), GlobalVariable.onboardpassword)

    WebUI.setText(findTestObject('Time/Consumer/Register  Sign In/onboard_NotificationEmail'), GlobalVariable.onboardemail)

    WebUI.click(findTestObject('Time/Consumer/Register  Sign In/Create Account_button '))
} else if (GlobalVariable.onboardseller == 'google') {
    WebUI.click(findTestObject('ADMIN/Admin Onboarding Page/Create_Account_Page/Button_Signup_Google'))

    WebUI.setText(findTestObject('ADMIN/Admin Onboarding Page/Create_Account_Page/Google_Username'), GlobalVariable.AdminGoogle)

    WebUI.click(findTestObject('ADMIN/Admin Onboarding Page/Create_Account_Page/Button_Google_Next'))

    WebUI.delay(1)

    WebUI.setText(findTestObject('ADMIN/Admin Onboarding Page/Create_Account_Page/Google_Password'), GlobalVariable.AdminGooglePass)

    WebUI.delay(1)

    WebUI.click(findTestObject('ADMIN/Admin Onboarding Page/Create_Account_Page/Button_Google_Next'))
} else if (GlobalVariable.onboardseller == 'facebook') {
    WebUI.click(findTestObject('ADMIN/Admin Onboarding Page/Create_Account_Page/Button_Signup_Facebook'))

    WebUI.setText(findTestObject('ADMIN/Admin Onboarding Page/Create_Account_Page/Facebook_Email'), GlobalVariable.AdminFacebook)

    WebUI.setText(findTestObject('ADMIN/Admin Onboarding Page/Create_Account_Page/Facebook_Password'), GlobalVariable.AdminFacebookPass)

    WebUI.click(findTestObject('ADMIN/Admin Onboarding Page/Create_Account_Page/Button_Login_Facebook'))
}

WebUI.waitForElementVisible(findTestObject('Time/Merchant/User Settings/textfield_DisplayName'), 0)

