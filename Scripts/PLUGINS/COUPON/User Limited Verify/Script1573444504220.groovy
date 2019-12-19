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
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger
import java.text.DecimalFormat as DecimalFormat

WebUI.callTestCase(findTestCase('Utilities/CONSUMER/Consumer Login'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Coupon_Package/COUPON_PAGE/Page_trishabespoke (2)/Page_trishabespoke/img_home'), 
    0)

WebUI.click(findTestObject('Coupon_Package/COUPON_PAGE/Page_trishabespoke (2)/Page_trishabespoke/img_home'))

WebUI.scrollToElement(findTestObject('Coupon_Package/COUPON_PAGE/Page_trishabespoke (2)/Page_trishabespoke/div_border-preview'), 
    0)

WebUI.click(findTestObject('Coupon_Package/COUPON_PAGE/Page_trishabespoke (2)/Page_trishabespoke/div_border-preview'))

WebUI.selectOptionByLabel(findTestObject('BESPOKE DEL 2/CONSUMER/Item Details Page/dropdown_Quantity'), '5', true)

WebUI.verifyOptionSelectedByLabel(findTestObject('BESPOKE DEL 2/CONSUMER/Item Details Page/dropdown_Quantity'), '5', true, 
    0)

def price = WebUI.getText(findTestObject('Coupon_Package/COUPON_PAGE/Page_trishabespoke (3)/Page_trishabespoke/span_100.00'))

def quantity = WebUI.getAttribute(findTestObject('BESPOKE DEL 2/CONSUMER/Item Details Page/dropdown_Quantity'), 'value')

WebUI.delay(1)

WebUI.click(findTestObject('BESPOKE DEL 2/CONSUMER/Item Details Page/button_AddtoCart'))

WebUI.mouseOver(findTestObject('BESPOKE DEL 2/CONSUMER/Item Details Page/icon_Cart'))

WebUI.click(findTestObject('BESPOKE DEL 2/CONSUMER/Item Details Page/button_ViewCart'))

WebUI.click(findTestObject('Coupon_Package/COUPON_PAGE/Page_trishabespoke (2)/Page_trishabespoke/a_CHECKOUT'))

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('BESPOKE DEL 2/CONSUMER/Delivery Details Page/button_SelectAddress'), 0)

WebUI.click(findTestObject('BESPOKE DEL 2/CONSUMER/Delivery Details Page/button_SelectAddress'))

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/CONSUMER/Delivery Details Page/button_Selected'), 0)

WebUI.scrollToElement(findTestObject('BESPOKE DEL 2/CONSUMER/Delivery Details Page/button_Next'), 0)

WebUI.delay(1)

WebUI.click(findTestObject('BESPOKE DEL 2/CONSUMER/Delivery Details Page/button_Next'))

WebUI.waitForPageLoad(0)

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/CONSUMER/Review Details Page/dropdown_SelectDeliveryMethod'), 
    0)

WebUI.click(findTestObject('BESPOKE DEL 2/CONSUMER/Review Details Page/dropdown_SelectDeliveryMethod'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.selectOptionByIndex(findTestObject('BESPOKE DEL 2/CONSUMER/Review Details Page/dropdown_SelectDeliveryMethod'), 1, 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1)

WebUI.verifyElementVisible(findTestObject('Coupon_Package/COUPON_PAGE/Page_trishabespoke (2)/Page_trishabespoke/input_coupon-code'))

WebUI.setText(findTestObject('Coupon_Package/COUPON_PAGE/Page_trishabespoke (2)/Page_trishabespoke/input_coupon-code'), 
    variable_code)

WebUI.click(findTestObject('Coupon_Package/COUPON_PAGE/Page_trishabespoke (2)/Page_trishabespoke/button_Apply'))

WebUI.delay(1)

WebUI.verifyElementVisible(findTestObject('Coupon_Package/COUPON_PAGE/Page_trishabespoke (2)/Calculate/span_350.00'))

WebUI.getText(findTestObject('Coupon_Package/COUPON_PAGE/Page_trishabespoke (2)/Calculate/span_350.00'))

WebUI.getText(findTestObject('Coupon_Package/COUPON_PAGE/Page_trishabespoke (2)/Calculate/span_3160.00'))

def delivery = WebUI.getText(findTestObject('Coupon_Package/COUPON_PAGE/Page_trishabespoke (2)/Calculate/span_10.00'))

BigDecimal intprice = new BigDecimal(price)

BigDecimal intquantity = new BigDecimal(quantity)

def subtotal = intprice * intquantity

DecimalFormat df = new DecimalFormat('#,###.00')

println(df.format(new BigDecimal(subtotal)))

WebUI.verifyEqual(df.format(subtotal), WebUI.getText(findTestObject('Object Repository/Coupon_Package/COUPON_PAGE/Page_trishabespoke (2)/Calculate/span_3500.00')), 
    FailureHandling.CONTINUE_ON_FAILURE)

BigDecimal intcoupon = new BigDecimal(variable_value)

BigDecimal intsubtotal = new BigDecimal(subtotal)

def discount = intsubtotal / intcoupon

println(df.format(new BigDecimal(discount)))

WebUI.verifyEqual(df.format(discount), WebUI.getText(findTestObject('Object Repository/Coupon_Package/COUPON_PAGE/Page_trishabespoke (2)/Calculate/span_350.00')), 
    FailureHandling.CONTINUE_ON_FAILURE)

BigDecimal intdiscount = new BigDecimal(discount)

BigDecimal intdelivery = new BigDecimal(delivery)

def total = (intsubtotal - intdiscount) + intdelivery

println(df.format(new BigDecimal(delivery)))

WebUI.verifyEqual(df.format(total), WebUI.getText(findTestObject('Object Repository/Coupon_Package/COUPON_PAGE/Page_trishabespoke (2)/Calculate/span_3160.00')), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Coupon_Package/COUPON_PAGE/Page_trishabespoke (2)/Page_trishabespoke/a_PROCEED TO PAYMENT'))

WebUI.selectOptionByIndex(findTestObject('Coupon_Package/COUPON_PAGE/Page_trishabespoke (3)/Page_trishabespoke/Checkout coupon/Dropdown_Payment'), 
    2)

WebUI.click(findTestObject('Coupon_Package/COUPON_PAGE/Page_trishabespoke (3)/Page_trishabespoke/Checkout coupon/a_PAY NOW'))

WebUI.click(findTestObject('Coupon_Package/COUPON_PAGE/Page_trishabespoke (3)/Page_trishabespoke/Page_Generic Payment Sample/input_agree'))

