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

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.HomepageURL)

WebUI.waitForElementVisible(findTestObject('CONSUMER/Homepage/a_BE A SELLER'), 0)

if (WebUI.verifyElementPresent(findTestObject('Utilities/Login Seller/Accept Cookies/a_Accept Cookies'), 3) == true) {
    WebUI.click(findTestObject('Utilities/Login Seller/Accept Cookies/a_Accept Cookies'), FailureHandling.CONTINUE_ON_FAILURE)
} else {
    WebUI.verifyElementPresent(findTestObject('CONSUMER/Homepage/a_BE A SELLER'), 0)
}

WebUI.click(findTestObject('CONSUMER/Homepage/a_BE A SELLER'), FailureHandling.CONTINUE_ON_FAILURE)

if (GlobalVariable.MerchantAccountType == 'custom') {
    WebUI.waitForElementVisible(findTestObject('CONSUMER/Login Buyer/input_username'), 0)

    WebUI.setText(findTestObject('CONSUMER/Login Buyer/input_username'), GlobalVariable.CustomMerchant)

    WebUI.setText(findTestObject('CONSUMER/Login Buyer/input_password'), GlobalVariable.CustomPass)

    WebUI.click(findTestObject('CONSUMER/Login Buyer/a_Sign In'))
} else if (GlobalVariable.MerchantAccountType == 'google') {
    WebUI.waitForElementVisible(findTestObject('CONSUMER/Login Buyer/a_Google Login'), 0)

    WebUI.click(findTestObject('CONSUMER/Login Buyer/a_Google Login'))

    WebUI.waitForElementVisible(findTestObject('ADMIN/Admin Login Page/Google Accounts/textbox_username'), 0)

    WebUI.setText(findTestObject('ADMIN/Admin Login Page/Google Accounts/textbox_username'), GlobalVariable.GoogleConsumer)

    WebUI.click(findTestObject('ADMIN/Admin Login Page/Google Accounts/button_next_username'))

    WebUI.delay(1)

    WebUI.setText(findTestObject('ADMIN/Admin Login Page/Google Accounts/textbox_password'), GlobalVariable.GooglePass)

    WebUI.delay(1)

    WebUI.click(findTestObject('ADMIN/Admin Login Page/Google Accounts/button_next_password'))
} else if (GlobalVariable.MerchantAccountType == 'facebook') {
    WebUI.waitForElementVisible(findTestObject('CONSUMER/Login Buyer/span_Facebook Login'), 0)

    WebUI.click(findTestObject('MERCHANT/Login Seller/button_Facebook Login'))

    WebUI.setText(findTestObject('ADMIN/Admin Login Page/Login Facebook/textbox_email'), GlobalVariable.FacebookConsumer)

    WebUI.setText(findTestObject('ADMIN/Admin Login Page/Login Facebook/textbox_password'), GlobalVariable.FacebookPass)

    WebUI.click(findTestObject('ADMIN/Admin Login Page/Login Facebook/button_login'))
}

WebUI.waitForElementVisible(findTestObject('Bespoke/Merchant/Dashboard/textlabel_DASHBOARD'), 0)

