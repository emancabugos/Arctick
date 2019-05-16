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

findTestData('null').getValue(1, 1) == findTestData('null').getValue(1, 1)

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.homepage)

WebUI.verifyElementPresent(findTestObject('Time/Consumer/Homepage/RegisterSignIn_Link'), 0)

WebUI.click(findTestObject('Time/Consumer/Homepage/RegisterSignIn_Link'))

WebUI.waitForElementVisible(findTestObject('Time/Consumer/Register  Sign In/Create Account_button '), 0)

if (GlobalVariable.consumercredentail == 'custom') {
    WebUI.setText(findTestObject('Time/Consumer/Register  Sign In/Username_field'), GlobalVariable.consumerusername)

    WebUI.setText(findTestObject('Time/Consumer/Register  Sign In/Password_field'), GlobalVariable.consumerpassword)

    WebUI.click(findTestObject('Time/Consumer/Register  Sign In/Login_button'))
} else if (GlobalVariable.consumercredentail == 'google') {
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

WebUI.waitForElementPresent(findTestObject('Time/Consumer/Homepage/Searchbar'), 0)

WebUI.mouseOver(findTestObject('Time/Merchant/User Settings/image_Seller'))

WebUI.waitForElementVisible(findTestObject('Time/Merchant/User Settings/link_Settings'), 0)

WebUI.click(findTestObject('Time/Merchant/User Settings/link_Settings'))

WebUI.waitForElementVisible(findTestObject('Time/Merchant/User Settings/textfield_DisplayName'), 0)

//Looping of invalid data
for (def rowNum = 1; rowNum <= findTestData('null').getRowNumbers(); rowNum++) {
    WebUI.setText(findTestObject('Time/Merchant/User Settings/textfield_DisplayName'), findTestData('null').getValue(
            1, rowNum))

    WebUI.scrollToElement(findTestObject('Time/Merchant/User Settings/button_NextProfile'), 3)

    WebUI.click(findTestObject('Time/Merchant/User Settings/button_NextProfile'))

    WebUI.scrollToPosition(50, 60)

    WebUI.waitForElementVisible(findTestObject('Time/Merchant/User Settings/email_Validation'), 3)

    WebUI.verifyElementVisible(findTestObject('Time/Merchant/User Settings/email_Validation'))

    WebUI.verifyElementText(findTestObject('Time/Merchant/User Settings/email_Validation'), 'No email allowed')

    Thread.sleep(1000)
}

WebUI.mouseOver(findTestObject('Time/Merchant/User Settings/image_Seller'))

WebUI.waitForElementVisible(findTestObject('Time/Merchant/User Settings/link_Logout'), 0)

WebUI.click(findTestObject('Time/Merchant/User Settings/link_Logout'))

