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

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Homepage/input_(Source is editable)_slider-panel-title'), 
    '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Homepage/input_Find and schedule a service'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Homepage/input_Scroll down for more_scroll-down'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Homepage/input_SERVICE YOU ARE LOOKING FOR_service_looking_for'), 
    '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Homepage/input_OUR ITEMS_our_services'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Homepage/input_What kind of items are you searching for_search_service'), 
    '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Homepage/input_BROWSE CATEGORIES_browse_cat_btn'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Homepage/input_HIDE CATEGORIES_hide_cat_btn'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Homepage/input_OUR LATEST ITEMS_our_listings'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Homepage/input_Find the best items to suit your needs_best_service'), 
    '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Homepage/input_VIEW ALL ITEMS_view_cat_btn'), '*')

WebUI.click(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Homepage/button_save'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Homepage/toaster_success'), 0)

