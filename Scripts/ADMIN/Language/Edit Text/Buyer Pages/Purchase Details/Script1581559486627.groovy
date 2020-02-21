import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.waitForElementVisible(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Navigation/dd_language'), 0)

WebUI.selectOptionByLabel(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Navigation/dd_language'), varLanguage, false)

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Purchase Details/input_INVOICE ID_purchase-invoice-id'), 
    '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Purchase Details/input_TIMESTAMP_purchase-timestamp'), 
    '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Purchase Details/input_DELIVERY ADDRESS_purchase-delivery'), 
    '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Purchase Details/input_TRANSACTION TOTAL_purchase-transaction-total'), 
    '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Purchase Details/input_Subtotal_purchase-subtotal-txt'), 
    '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Purchase Details/input_PAYMENT METHOD_payment_method'), 
    '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Purchase Details/input_Delivery_purchase-delivery-txt'), 
    '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Purchase Details/input_PAYMENT STATUS_payment_status'), 
    '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Purchase Details/input_Bulk Delivery Discount_purchase-bulk-delivery-discount-txt'), 
    '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Purchase Details/input_ITEM_purchase-item-txt'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Purchase Details/input_PRICE_purchase-price-txt'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Purchase Details/input_QTY_purchase-qty-txt'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Purchase Details/input_DELIVERY_purchase-delivery-txt (1)'), 
    '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Purchase Details/input_ORDER STATUS_purchase-orderstatus-txt'), 
    '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Purchase Details/input_REVIEWS_purchase-review-txt'), 
    '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Purchase Details/input_Sold By_sold-by'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Purchase Details/input_Contact_Contact'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Purchase Details/input_Delivery_Delivery'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Purchase Details/input_Pickup_Pickup'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Purchase Details/input_Leave a feedback_purchase-leave-feedback-txt'), 
    '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Purchase Details/input_Left feedback_purchase-left-feedback-txt'), 
    '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Purchase Details/input_BACK TO LIST_btn_back'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Purchase Details/input_LEFT A FEEDBACK FOR_popup-title'), 
    '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Purchase Details/input_How much do you rate this item_popup-desc'), 
    '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Purchase Details/input_Leave a feedback_leave-feedback'), 
    '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Purchase Details/input_Excellent_excellent'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Purchase Details/input_Great_great'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Purchase Details/input_Good_good'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Purchase Details/input_Okay_ok'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Purchase Details/input_Unsatisfied_Unsatisfied'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Purchase Details/input_SUBMIT_btn_okay'), '*')

WebUI.click(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Homepage/button_save'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Homepage/toaster_success'), 0)

