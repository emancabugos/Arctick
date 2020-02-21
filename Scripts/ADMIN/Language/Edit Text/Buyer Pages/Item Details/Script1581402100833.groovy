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

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Item Details/input_Positive Feedback_item-feedbak'), 
    '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Item Details/input_ADD TO CART_1'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Item Details/input_Quantity_item-qty'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Item Details/input_Only_item-one'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Item Details/input_left_item-left'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Item Details/input_Out of Stock_text-stock'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Item Details/input_Description_text-description'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Item Details/input_Show More_text-show-more'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Item Details/input_Show Less_text-show-less'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Item Details/input_Choose a delivery method later_text-deliver-method'), 
    '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Item Details/input_Delivery_text-delivery'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Item Details/input_Pick-Up_text-pickup'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Item Details/input_Contact Seller_btn_add_cart'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Item Details/input_ADD TO CART_2'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Item Details/input_THIS ITEM HAS BEEN ADDED_item-has-been-added'), 
    '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Item Details/input_VIEW CART_btn_view_cart'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Item Details/input_Reviews_reviews'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Item Details/input_Rating Summary_rating-summary'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Item Details/input_Positive Feedback_positive-feedback'), 
    '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Item Details/input_Excellent_excellent'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Item Details/input_Great_great'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Item Details/input_Good_good'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Item Details/input_Okay_ok'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Item Details/input_Unsatisfied_Unsatisfied'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Item Details/input_Reply from_reply-from'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Item Details/input_Reply_btn_view_cart'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Item Details/input_REPLY TO_reply'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Item Details/input_Leave a comment_leave-comment'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Item Details/input_SUBMIT_btn_submit'), '*')

WebUI.click(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Homepage/button_save'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Homepage/toaster_success'), 0)

