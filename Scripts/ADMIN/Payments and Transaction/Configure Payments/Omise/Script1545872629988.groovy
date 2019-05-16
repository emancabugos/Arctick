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

    WebUI.waitForElementVisible(findTestObject('ADMIN/Admin Login/Admin Login/txtbox_username'), 0)

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

WebUI.waitForElementVisible(findTestObject('ADMIN/Configure Payments/a_Payments  Transactions'), 0)

WebUI.click(findTestObject('ADMIN/Configure Payments/a_Payments  Transactions'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Configure Payments/a_Configure Payments'), 0)

WebUI.click(findTestObject('ADMIN/Configure Payments/a_Configure Payments'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Configure Payments/i_icon icon-creditcard'), 0)

WebUI.verifyElementText(findTestObject('ADMIN/Configure Payments/h1_Payments'), 'Payments')

WebUI.click(findTestObject('ADMIN/Configure Payments/div_Link Account'), FailureHandling.CONTINUE_ON_FAILURE)

if (GlobalVariable.Currency == 'SGD') {
    WebUI.setText(findTestObject('ADMIN/Configure Payments/Omise/input_live-publishable-key'), varPublicSGD)

    WebUI.setText(findTestObject('ADMIN/Configure Payments/Omise/input_live-secret-key'), varSecretSGD)

    WebUI.delay(1)

    WebUI.click(findTestObject('ADMIN/Configure Payments/Omise/input_save'))
} else if (GlobalVariable.Currency == 'THB') {
    WebUI.setText(findTestObject('ADMIN/Configure Payments/Omise/input_live-publishable-key'), varPublicTHB)

    WebUI.setText(findTestObject('ADMIN/Configure Payments/Omise/input_live-secret-key'), varSecretTHB)

    WebUI.delay(1)

    WebUI.click(findTestObject('ADMIN/Configure Payments/Omise/input_save'))
} else if (GlobalVariable.Currency == 'JPY') {
    WebUI.setText(findTestObject('ADMIN/Configure Payments/Omise/input_live-publishable-key'), varPublicJPY)

    WebUI.setText(findTestObject('ADMIN/Configure Payments/Omise/input_live-secret-key'), varSecretJPY)

    WebUI.delay(1)

    WebUI.click(findTestObject('ADMIN/Configure Payments/Omise/input_save'))
}

WebUI.click(findTestObject('ADMIN/Configure Payments/Omise/a_Back'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Configure Payments/Omise/div_payment-status-color2'), 0)

WebUI.click(findTestObject('ADMIN/Admin Permission/Admin Activity Log/a_Logout'))

WebUI.closeBrowser()

