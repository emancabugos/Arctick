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

WebUI.callTestCase(findTestCase('Utilities/CONSUMER/Consumer Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.comment('Validation on Homepage')

WebUI.waitForElementVisible(findTestObject('CONSUMER/Search Function/button_Search'), 0)

WebUI.delay(1)

WebUI.click(findTestObject('CONSUMER/Search Function/button_Search'))

WebUI.comment('Verify in Search Result Page')

WebUI.waitForPageLoad(0)

WebUI.waitForElementVisible(findTestObject('CONSUMER/Search Result Page/image_Item'), 0)

WebUI.click(findTestObject('CONSUMER/Search Result Page/image_Item'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForPageLoad(0)

WebUI.comment('Verify in Item Details Page')

WebUI.waitForElementVisible(findTestObject('CONSUMER/Item Details Page/button_ContactSeller'), 0)

if (WebUI.verifyElementVisible(findTestObject('Object Repository/CONSUMER/Item Details Page/timepicker_Time')) == true) {
    WebUI.verifyElementVisible(findTestObject('Object Repository/CONSUMER/Item Details Page/timepicker_Time'))

    WebUI.click(findTestObject('CONSUMER/Item Details Page/datepicker_Date'))

    WebUI.delay(1)

    WebUI.setText(findTestObject('CONSUMER/Item Details Page/datepicker_Date'), '23/05/2019')

    WebUI.delay(1)

    WebUI.setText(findTestObject('CONSUMER/Item Details Page/timepicker_Time'), '10:15 AM')

    WebUI.setText(findTestObject('CONSUMER/Item Details Page/textfield_Duration'), '2')
} else if (WebUI.verifyElementNotVisible(findTestObject('Object Repository/CONSUMER/Item Details Page/timepicker_Time'))) {
    WebUI.verifyElementNotVisible(findTestObject('Object Repository/CONSUMER/Item Details Page/timepicker_Time'))

    WebUI.verifyElementVisible(findTestObject('Object Repository/CONSUMER/Item Details Page/timepicker_Time'))

    WebUI.click(findTestObject('CONSUMER/Item Details Page/datepicker_Date'))

    WebUI.delay(1)

    WebUI.setText(findTestObject('CONSUMER/Item Details Page/datepicker_Date'), '23/05/2019')

    WebUI.delay(1)

    WebUI.setText(findTestObject('CONSUMER/Item Details Page/textfield_Duration'), '2')
}

WebUI.delay(0.5)

WebUI.click(findTestObject('CONSUMER/Item Details Page/button_BuyNow'))

WebUI.delay(1)

if (WebUI.verifyElementVisible(findTestObject('Object Repository/CONSUMER/Delivery Popup Window/button_Checkout')) == true) {
    WebUI.verifyElementVisible(findTestObject('CONSUMER/Delivery Popup Window/button_Checkout'))

    WebUI.click(findTestObject('CONSUMER/Delivery Popup Window/button_Delivery1'))

    WebUI.delay(0.5)

    WebUI.click(findTestObject('CONSUMER/Delivery Popup Window/button_Checkout'))
} else if (WebUI.verifyElementNotVisible(findTestObject('Object Repository/CONSUMER/Delivery Popup Window/button_Checkout'))) {
    WebUI.waitForElementVisible(findTestObject('CONSUMER/Delivery Details Page/button_SelectAddress'), 0)
}

WebUI.waitForElementVisible(findTestObject('CONSUMER/Delivery Details Page/button_SelectAddress'), 0)

WebUI.click(findTestObject('CONSUMER/Delivery Details Page/button_SelectAddress'))

WebUI.waitForElementVisible(findTestObject('CONSUMER/Delivery Details Page/button_Selected'), 0)

WebUI.scrollToElement(findTestObject('CONSUMER/Delivery Details Page/buttonDelivery_Next'), 0)

WebUI.click(findTestObject('CONSUMER/Delivery Details Page/buttonDelivery_Next'))

WebUI.waitForPageLoad(0)

WebUI.waitForElementVisible(findTestObject('CONSUMER/Review Details Page/button_Previous'), 0)

WebUI.scrollToElement(findTestObject('CONSUMER/Review Details Page/buttonReview_Next'), 0)

WebUI.click(findTestObject('CONSUMER/Review Details Page/buttonReview_Next'))

WebUI.waitForPageLoad(0)

WebUI.waitForElementVisible(findTestObject('CONSUMER/Payment Details Page/dropdown_Payment'), 0)

if (GlobalVariable.payment == 'stripe') {
    WebUI.click(findTestObject('CONSUMER/Payment Details Page/dropdown_Payment'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.selectOptionByLabel(findTestObject('CONSUMER/Payment Details Page/dropdown_Payment'), 'Stripe', true)

    WebUI.verifyOptionSelectedByLabel(findTestObject('CONSUMER/Payment Details Page/dropdown_Payment'), 'Stripe', true, 
        0)

    WebUI.scrollToElement(findTestObject('CONSUMER/Payment Details Page/button_PayNow'), 0)

    WebUI.click(findTestObject('CONSUMER/Payment Details Page/button_PayNow'))

    WebUI.delay(1)

    WebUI.setText(findTestObject('CONSUMER/Payment Details Page/Stripe Payment/textfield_Email'), 'test321@gmail.com')

    WebUI.sendKeys(findTestObject('CONSUMER/Payment Details Page/Stripe Payment/textfield_CardNumber'), '4242424242424242')

    WebUI.sendKeys(findTestObject('CONSUMER/Payment Details Page/Stripe Payment/textfield_Date'), '1120')

    WebUI.sendKeys(findTestObject('CONSUMER/Payment Details Page/Stripe Payment/textfield_cvc'), '123')

    WebUI.delay(0.5)

    WebUI.click(findTestObject('CONSUMER/Payment Details Page/Stripe Payment/button_Pay'))
} else if (GlobalVariable.payment == 'paypal') {
    WebUI.selectOptionByLabel(findTestObject('CONSUMER/Payment Details Page/dropdown_Payment'), 'PayPal', true)

    WebUI.verifyOptionSelectedByLabel(findTestObject('CONSUMER/Payment Details Page/dropdown_Payment'), 'PayPal', true, 
        0)

    WebUI.scrollToElement(findTestObject('CONSUMER/Payment Details Page/button_PayNow'), 0)

    WebUI.click(findTestObject('CONSUMER/Payment Details Page/button_PayNow'))

    WebUI.waitForElementVisible(findTestObject('CONSUMER/Payment Details Page/Paypal/tab_Paypal'), 0)

    WebUI.click(findTestObject('CONSUMER/Payment Details Page/Paypal/tab_Paypal'))

    WebUI.waitForElementVisible(findTestObject('CONSUMER/Payment Details Page/Paypal/textfield_Email'), 0)

    WebUI.setText(findTestObject('CONSUMER/Payment Details Page/Paypal/textfield_Email'), 'hiveboxstaging03@yopmail.com')

    WebUI.setText(findTestObject('CONSUMER/Payment Details Page/Paypal/textfield_Password'), 'welcome8')

    WebUI.click(findTestObject('CONSUMER/Payment Details Page/Paypal/button_Login'))

    WebUI.waitForElementVisible(findTestObject('CONSUMER/Payment Details Page/Paypal/button_Pay'), 0)

    WebUI.delay(0.5)

    WebUI.click(findTestObject('CONSUMER/Payment Details Page/Paypal/button_Pay'))

    WebUI.waitForElementVisible(findTestObject('CONSUMER/Payment Details Page/Paypal/button_Return'), 0)

    WebUI.delay(0.5)

    WebUI.click(findTestObject('CONSUMER/Payment Details Page/Paypal/button_Return'))
} else if (GlobalVariable.payment == 'omise') {
    WebUI.selectOptionByLabel(findTestObject('CONSUMER/Payment Details Page/dropdown_Payment'), 'Omise', true)

    WebUI.verifyOptionSelectedByLabel(findTestObject('CONSUMER/Payment Details Page/dropdown_Payment'), 'Omise', true, 0)

    WebUI.scrollToElement(findTestObject('CONSUMER/Payment Details Page/button_PayNow'), 0)

    WebUI.click(findTestObject('CONSUMER/Payment Details Page/button_PayNow'))

    WebUI.waitForElementVisible(findTestObject('CONSUMER/Payment Details Page/Omise/popupWindow_Omise'), 0)

    WebUI.sendKeys(findTestObject('CONSUMER/Payment Details Page/Omise/textfield_cardnumber'), '4242424242424242')

    WebUI.sendKeys(findTestObject('CONSUMER/Payment Details Page/Omise/textfield_name'), 'John Doe')

    WebUI.sendKeys(findTestObject('CONSUMER/Payment Details Page/Omise/textfield_date'), '1120')

    WebUI.sendKeys(findTestObject('CONSUMER/Payment Details Page/Omise/textfield_code'), '123')

    WebUI.delay(0.5)

    WebUI.click(findTestObject('CONSUMER/Payment Details Page/Omise/button_Pay'))
}

