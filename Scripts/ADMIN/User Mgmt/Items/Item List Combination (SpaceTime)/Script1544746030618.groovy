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

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.AdminURL)

WebUI.maximizeWindow()

WebUI.waitForElementVisible(findTestObject('ADMIN/Admin Login/Admin Login/txtbox_username'), 0)

if (GlobalVariable.AdminAccount == 'custom') {
    WebUI.setText(findTestObject('ADMIN/Admin Login/Admin Login/txtbox_username'), GlobalVariable.AdminCustom)

    WebUI.setText(findTestObject('ADMIN/Admin Login/Admin Login/txtbox_password'), GlobalVariable.CustomPass)

    WebUI.click(findTestObject('ADMIN/Admin Login/Admin Login/btn_signin'))
} else if (GlobalVariable.AdminAccount == 'google') {
    WebUI.click(findTestObject('ADMIN/Admin Login/Admin Login/a_Login with Google'))

    WebUI.setText(findTestObject('ADMIN/Admin Login/Admin Login/Google Login/input_identifier'), GlobalVariable.AdminGoogle)

    WebUI.click(findTestObject('ADMIN/Admin Login/Admin Login/Google Login/span_Susunod'))

    WebUI.delay(1)

    WebUI.setText(findTestObject('ADMIN/Admin Login/Admin Login/Google Login/input_password'), GlobalVariable.GooglePass)

    WebUI.delay(1)

    WebUI.click(findTestObject('ADMIN/Admin Login/Admin Login/Google Login/span_Susunod'))
} else if (GlobalVariable.AdminAccount == 'facebook') {
    WebUI.click(findTestObject('ADMIN/Admin Login/Admin Login/a_Login with Facebook'))

    WebUI.setText(findTestObject('ADMIN/Admin Login/Admin Login/Facebook Login/input_email'), GlobalVariable.AdminFacebook)

    WebUI.setText(findTestObject('ADMIN/Admin Login/Admin Login/Facebook Login/input_pass'), GlobalVariable.FacebookPass)

    WebUI.click(findTestObject('ADMIN/Admin Login/Admin Login/Facebook Login/button_Log In'))
}

WebUI.waitForElementVisible(findTestObject('ADMIN/Admin Users/a_User Mgmt.'), 0)

WebUI.click(findTestObject('ADMIN/Admin Users/a_User Mgmt.'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Item List/a_Items'), 0)

WebUI.click(findTestObject('ADMIN/Item List/a_Items'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Item List/h1_Items'), 0)

WebUI.waitForElementVisible(findTestObject('ADMIN/Item List/input_search-text'), 0)

WebUI.setText(findTestObject('ADMIN/Item List/input_search-text'), varItemName)

WebUI.comment('Search Merchant')

WebUI.click(findTestObject('ADMIN/Item List/input_filter_merchant'))

WebUI.waitForElementPresent(findTestObject('ADMIN/Item List/input_search merchant'), 0)

WebUI.setText(findTestObject('ADMIN/Item List/input_search merchant'), varMerchant)

if (varMerchant == 'All') {
    WebUI.waitForElementVisible(findTestObject('ADMIN/Item List/Search Result/merchant_all'), 0)

    WebUI.click(findTestObject('ADMIN/Item List/Search Result/merchant_all'))
} else {
    WebUI.waitForElementVisible(findTestObject('ADMIN/Item List/Search Result/merchant_1st search'), 0)

    WebUI.click(findTestObject('ADMIN/Item List/Search Result/merchant_1st search'))
}

WebUI.comment('Search Category')

WebUI.click(findTestObject('ADMIN/Item List/input_filter_category'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Item List/input_search category'), 0)

WebUI.setText(findTestObject('ADMIN/Item List/input_search category'), varCategory)

if (varCategory == 'All') {
    WebUI.waitForElementVisible(findTestObject('ADMIN/Item List/Search Result/category_all'), 0)

    WebUI.click(findTestObject('ADMIN/Item List/Search Result/category_all'))
} else if (varCategory == 'Category 1') {
    WebUI.waitForElementVisible(findTestObject('ADMIN/Item List/Search Result/label_Category 1'), 0)

    WebUI.click(findTestObject('ADMIN/Item List/Search Result/label_Category 1'))
} else if (varCategory == 'Category 2') {
    WebUI.waitForElementVisible(findTestObject('ADMIN/Item List/Search Result/label_Category 2'), 0)

    WebUI.click(findTestObject('ADMIN/Item List/Search Result/label_Category 2'))
} else if (varCategory == 'Category 3') {
    WebUI.waitForElementVisible(findTestObject('ADMIN/Item List/Search Result/label_Category 3'), 0)

    WebUI.click(findTestObject('ADMIN/Item List/Search Result/label_Category 3'))
}

WebUI.comment('Purchasability')

WebUI.selectOptionByLabel(findTestObject('ADMIN/Item List/select_Select Purchasable'), varPurchasability, false)

WebUI.click(findTestObject('ADMIN/Item List/button_Search'))

WebUI.click(findTestObject('ADMIN/Admin Permission/Admin Activity Log/a_Logout'))

