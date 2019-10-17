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

if (GlobalVariable.payment == 'stripe') {
    WebUI.click(findTestObject('SPACETIME/CONSUMER/Payment Details Page/dropdown_Payment'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.selectOptionByLabel(findTestObject('SPACETIME/CONSUMER/Payment Details Page/dropdown_Payment'), 'Stripe', true)

    WebUI.verifyOptionSelectedByLabel(findTestObject('SPACETIME/CONSUMER/Payment Details Page/dropdown_Payment'), 'Stripe', true, 
        0)

    WebUI.scrollToElement(findTestObject('SPACETIME/CONSUMER/Payment Details Page/button_PayNow'), 0)

    WebUI.click(findTestObject('SPACETIME/CONSUMER/Payment Details Page/button_PayNow'))

    WebUI.delay(1)

    WebUI.setText(findTestObject('SPACETIME/CONSUMER/Payment Details Page/Stripe Payment/textfield_Email'), 'test321@gmail.com')

    WebUI.sendKeys(findTestObject('SPACETIME/CONSUMER/Payment Details Page/Stripe Payment/textfield_CardNumber'), '4242424242424242')

    WebUI.sendKeys(findTestObject('SPACETIME/CONSUMER/Payment Details Page/Stripe Payment/textfield_Date'), '1120')

    WebUI.sendKeys(findTestObject('SPACETIME/CONSUMER/Payment Details Page/Stripe Payment/textfield_cvc'), '123')

    WebUI.delay(0.5)

    WebUI.click(findTestObject('SPACETIME/CONSUMER/Payment Details Page/Stripe Payment/button_Pay'))
} else if (GlobalVariable.payment == 'paypal') {
    WebUI.selectOptionByLabel(findTestObject('SPACETIME/CONSUMER/Payment Details Page/dropdown_Payment'), 'PayPal', true)

    WebUI.verifyOptionSelectedByLabel(findTestObject('SPACETIME/CONSUMER/Payment Details Page/dropdown_Payment'), 'PayPal', true, 
        0)

    WebUI.scrollToElement(findTestObject('SPACETIME/CONSUMER/Payment Details Page/button_PayNow'), 0)

    WebUI.click(findTestObject('SPACETIME/CONSUMER/Payment Details Page/button_PayNow'))

    WebUI.waitForElementVisible(findTestObject('SPACETIME/CONSUMER/Payment Details Page/Paypal/tab_Paypal'), 0)

    WebUI.click(findTestObject('SPACETIME/CONSUMER/Payment Details Page/Paypal/tab_Paypal'))

    WebUI.waitForElementVisible(findTestObject('SPACETIME/CONSUMER/Payment Details Page/Paypal/textfield_Email'), 0)

    WebUI.setText(findTestObject('SPACETIME/CONSUMER/Payment Details Page/Paypal/textfield_Email'), 'hiveboxstaging03@yopmail.com')

    WebUI.setText(findTestObject('SPACETIME/CONSUMER/Payment Details Page/Paypal/textfield_Password'), 'welcome8')

    WebUI.click(findTestObject('SPACETIME/CONSUMER/Payment Details Page/Paypal/button_Login'))

    WebUI.waitForElementVisible(findTestObject('SPACETIME/CONSUMER/Payment Details Page/Paypal/button_Pay'), 0)

    WebUI.delay(0.5)

    WebUI.click(findTestObject('SPACETIME/CONSUMER/Payment Details Page/Paypal/button_Pay'))

    WebUI.waitForElementVisible(findTestObject('SPACETIME/CONSUMER/Payment Details Page/Paypal/button_Return'), 0)

    WebUI.delay(0.5)

    WebUI.click(findTestObject('SPACETIME/CONSUMER/Payment Details Page/Paypal/button_Return'))
} else if (GlobalVariable.payment == 'omise') {
    WebUI.selectOptionByLabel(findTestObject('SPACETIME/CONSUMER/Payment Details Page/dropdown_Payment'), 'Omise', true)

    WebUI.verifyOptionSelectedByLabel(findTestObject('SPACETIME/CONSUMER/Payment Details Page/dropdown_Payment'), 'Omise', true, 0)

    WebUI.scrollToElement(findTestObject('SPACETIME/CONSUMER/Payment Details Page/button_PayNow'), 0)

    WebUI.click(findTestObject('SPACETIME/CONSUMER/Payment Details Page/button_PayNow'))

    WebUI.waitForElementVisible(findTestObject('SPACETIME/CONSUMER/Payment Details Page/Omise/popupWindow_Omise'), 0)

    WebUI.sendKeys(findTestObject('SPACETIME/CONSUMER/Payment Details Page/Omise/textfield_cardnumber'), '4242424242424242')

    WebUI.sendKeys(findTestObject('SPACETIME/CONSUMER/Payment Details Page/Omise/textfield_name'), 'John Doe')

    WebUI.sendKeys(findTestObject('SPACETIME/CONSUMER/Payment Details Page/Omise/textfield_date'), '1120')

    WebUI.sendKeys(findTestObject('SPACETIME/CONSUMER/Payment Details Page/Omise/textfield_code'), '123')

    WebUI.delay(0.5)

    WebUI.click(findTestObject('SPACETIME/CONSUMER/Payment Details Page/Omise/button_Pay'))
} else if (GlobalVariable.payment == 'custom') {
    WebUI.click(findTestObject('SPACETIME/CONSUMER/Payment Details Page/dropdown_Payment'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.selectOptionByLabel(findTestObject('SPACETIME/CONSUMER/Payment Details Page/dropdown_Payment'), 'Handshake', true)

    WebUI.verifyOptionSelectedByLabel(findTestObject('SPACETIME/CONSUMER/Payment Details Page/dropdown_Payment'), 'Handshake', true, 
        0)

    WebUI.scrollToElement(findTestObject('SPACETIME/CONSUMER/Payment Details Page/button_PayNow'), 0)

    WebUI.click(findTestObject('SPACETIME/CONSUMER/Payment Details Page/button_PayNow'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.waitForElementVisible(findTestObject('SPACETIME/CONSUMER/Payment Details Page/Custom Payment/button_Accept'), 0)

    WebUI.setText(findTestObject('SPACETIME/CONSUMER/Payment Details Page/Custom Payment/textfield_Note'), 'test')

    WebUI.delay(1)

    WebUI.click(findTestObject('SPACETIME/CONSUMER/Payment Details Page/Custom Payment/button_Accept'))
}

WebUI.waitForElementVisible(findTestObject('SPACETIME/CONSUMER/Thank You Page/button_PurchaseHistory'), 0)

String invoice = WebUI.getText(findTestObject('SPACETIME/CONSUMER/Thank You Page/textlabel_Invoice'))

WebUI.delay(1)

WebUI.click(findTestObject('SPACETIME/CONSUMER/Thank You Page/button_PurchaseHistory'))

