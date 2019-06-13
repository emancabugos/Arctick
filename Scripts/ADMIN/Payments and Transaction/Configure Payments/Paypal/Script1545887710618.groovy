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

WebUI.callTestCase(findTestCase('Utilities/ADMIN/Admin Login'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Configure Payments/a_Payments  Transactions'), 0)

WebUI.click(findTestObject('ADMIN/Configure Payments/a_Payments  Transactions'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Configure Payments/a_Configure Payments'), 0)

WebUI.click(findTestObject('ADMIN/Configure Payments/a_Configure Payments'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Configure Payments/i_icon icon-creditcard'), 0)

WebUI.verifyElementText(findTestObject('ADMIN/Configure Payments/h1_Payments'), 'Payments')

WebUI.click(findTestObject('ADMIN/Configure Payments/Paypal/div_Link Account'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Configure Payments/Paypal/a_Login to Paypal'), 0)

WebUI.click(findTestObject('ADMIN/Configure Payments/Paypal/a_Login to Paypal'), FailureHandling.CONTINUE_ON_FAILURE)

if (GlobalVariable.Server == 'https://www.test.arcadier.io') {
    WebUI.waitForElementVisible(findTestObject('ADMIN/Configure Payments/Paypal/input_login_email'), 0)

    WebUI.setText(findTestObject('ADMIN/Configure Payments/Paypal/input_login_email'), '01qabonsol@yopmail.com')

    WebUI.click(findTestObject('ADMIN/Configure Payments/Paypal/button_Next'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.waitForElementVisible(findTestObject('ADMIN/Configure Payments/Paypal/input_login_password'), 0)

    WebUI.setText(findTestObject('ADMIN/Configure Payments/Paypal/input_login_password'), 'welcome8')

    WebUI.click(findTestObject('ADMIN/Configure Payments/Paypal/button_Log In'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.waitForElementVisible(findTestObject('ADMIN/Configure Payments/Paypal/button_Agree'), 0)

    WebUI.click(findTestObject('ADMIN/Configure Payments/Paypal/button_Agree'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.waitForElementVisible(findTestObject('ADMIN/Configure Payments/Paypal/a_Back'), 0)

    WebUI.click(findTestObject('ADMIN/Configure Payments/Paypal/a_Back'), FailureHandling.CONTINUE_ON_FAILURE)
} else if (GlobalVariable.Server == 'https://www.staging.arcadier.io') {
    WebUI.waitForElementVisible(findTestObject('ADMIN/Configure Payments/Paypal/input_login_email'), 0)

    WebUI.setText(findTestObject('ADMIN/Configure Payments/Paypal/input_login_email'), 'jqseph@gmail.com')

    WebUI.click(findTestObject('ADMIN/Configure Payments/Paypal/button_Next'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.waitForElementVisible(findTestObject('ADMIN/Configure Payments/Paypal/input_login_password'), 0)

    WebUI.setText(findTestObject('ADMIN/Configure Payments/Paypal/input_login_password'), 'Arcadier_RP')

    WebUI.waitForElementVisible(findTestObject('ADMIN/Configure Payments/Paypal/button_Agree'), 0)

    WebUI.click(findTestObject('ADMIN/Configure Payments/Paypal/button_Agree'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.waitForElementVisible(findTestObject('ADMIN/Configure Payments/Paypal/a_Back'), 0)

    WebUI.click(findTestObject('ADMIN/Configure Payments/Paypal/a_Back'), FailureHandling.CONTINUE_ON_FAILURE)
}

WebUI.waitForElementVisible(findTestObject('ADMIN/Configure Payments/Paypal/a_Back'), 0)

WebUI.click(findTestObject('ADMIN/Configure Payments/Paypal/a_Back'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Configure Payments/Paypal/div_payment-status-color2'), 0)

WebUI.click(findTestObject('ADMIN/Admin Permission/Admin Activity Log/a_Logout'))

WebUI.closeBrowser()

