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

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_Search_search'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_BE A SELLER_be_seller'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_MORE_more'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_VIEW CART_btn_next'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_REGISTER  SIGN IN_register_signin'), 
    '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_SELLER_sell'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_PROFILE_profile'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_Dashboard_Dashboard'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_Purchases_Purchases'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_Your Items_Your Items'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_Settings_Settings'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_Upload_Upload'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_Logout_Logout'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_Orders_Orders'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_Sub-accounts_Sub-accounts'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_Sales_Sales'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_Browse_Browse'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_SELLER_sell1'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_PROFILE_profile1'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_Dashboard_Dashboard1'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_Purchases_Purchases1'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_Your Items_Your Items1'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_Settings_Settings1'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_Upload_Upload1'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_Logout_Logout1'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_Orders_Orders1'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_Sales_Sales1'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_ABOUT US_ABOUT US'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_SERVICE TERMS_SERVICE TERMS'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_PRIVACY_PRIVACY'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_RETURNS_RETURNS'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_FAQ_FAQ'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_CONTACT_CONTACT'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_All rights reserved _foot_copyright'), 
    '*')

WebUI.click(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Homepage/button_save'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Homepage/toaster_success'), 0)

