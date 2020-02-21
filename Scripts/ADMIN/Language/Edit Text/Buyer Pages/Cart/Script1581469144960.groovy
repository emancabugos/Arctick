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

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Cart/input_MY CART_my-cart'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Cart/input_It seems like your cart is empty_my-cart-empty-msg'), 
    '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Cart/input_Start searching and adding_my-cart-start-search-add'), 
    '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Cart/input_CONTINUE SHOPPING_btn_add_cart'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Cart/input_CHECKOUT_btn_add_cart'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Cart/input_Select Delivery Option_delivery-option-text'), 
    '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Cart/input_Choose one_delivery-start-text'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Cart/input_Delivery_delivery-text'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Cart/input_Pick-up_pickup-text'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Cart/input_CHANGE_btn_add_cart'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Cart/input_Sold Out_cart-sub-total'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Cart/input_QTY_cart-qty'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Cart/input_Sub Total_cart-sub-total'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Cart/input_Delivery Costs_cart-delivery-costs'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Cart/input_Bulk Delivery Discount_cart-bulk-delivery-discount'), 
    '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Cart/input_TOTAL_cart-total'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Cart/input_REMOVE ITEM_popup-title'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Cart/textarea_You sure about removing this item from your list (Itll be gone forever)'), 
    '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Cart/input_CANCEL_btn_apply'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Cart/input_OKAY_btn_apply'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Cart/input_DELIVERY METHOD_popup-title'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Cart/input_Choose a delivery method later_popup-title2 (1)'), 
    '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Cart/input_Delivery_popup-title3'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Cart/input_Pick-up_popup-title4'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Cart/input_Apply_btn_apply 2'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Cart/input_the following'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Cart/textarea_Please select a delivery method for each item before checkout If this problem still persists the item may be no longer available ('), 
    '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Cart/input_OKAY_btn_apply - Copy'), '*')

WebUI.click(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Homepage/button_save'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Homepage/toaster_success'), 0)

