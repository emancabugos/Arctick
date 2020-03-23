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

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Common Words/input_Cash on delivery_cash-delivery'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Common Words/input_Paid_paidcod'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Common Words/input_To be collected_to_be_collected'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Common Words/input_Delivery_delivery'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Common Words/input_Pick up_pickup'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Common Words/input_SKU_sku'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Common Words/input_Save_sku'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Common Words/input_Drop your image here or click to add one_sku'), 
    '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Common Words/input_Search_search'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Common Words/input_Acknowledged_Acknowledged'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Common Words/input_Processing_Processing'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Common Words/input_Pending_Pending'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Common Words/input_Paid_Paid'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Common Words/input_Waiting for payments_Waitingforpayments'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Common Words/input_Created_Created'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Common Words/input_Fully Paid_FullyPaid'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Common Words/input_Delivered_Delivered'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Common Words/input_Ready for Pick-up_ReadyforPick-up'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Common Words/input_Collected_Collected'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Common Words/input_Refunded_Refunded'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Common Words/input_MERCHANT ACCESS DENIED_merchant-access'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Common Words/input_concat(Your action is not allowed Please contact the site  s administrator)_action-not-allowed'), 
    '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Common Words/input_No email allowed_no-email-allowed'), '*')

WebUI.click(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Homepage/button_save'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Homepage/toaster_success'), 0)

