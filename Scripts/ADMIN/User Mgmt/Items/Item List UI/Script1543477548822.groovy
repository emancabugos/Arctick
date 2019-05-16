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

WebUI.verifyElementPresent(findTestObject('ADMIN/Item List/i_icon icon-item icon-item-hea'), 0)

WebUI.verifyElementText(findTestObject('ADMIN/Item List/h1_Items'), 'Items')

WebUI.verifyElementPresent(findTestObject('ADMIN/Item List/input_search-text'), 0)

WebUI.verifyElementText(findTestObject('ADMIN/Item List/label_Date Created'), 'Date Created')

WebUI.verifyElementPresent(findTestObject('ADMIN/Item List/input_datecreated_start_date'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Item List/input_datecreated_end_date'), 0)

WebUI.verifyElementText(findTestObject('ADMIN/Item List/label_Last Updated'), 'Last Updated')

WebUI.verifyElementPresent(findTestObject('ADMIN/Item List/input_filter_start_date'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Item List/input_filter_end_date'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Item List/input_filter_merchant'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Item List/input_filter_category'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Item List/select_Select Stock'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Item List/select_Select Purchasable'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Item List/button_Search'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Item List/a_Clear'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Item List/counter_item found'), 0)

WebUI.verifyElementText(findTestObject('ADMIN/Item List/div_Items found'), 'Items found')

WebUI.verifyElementPresent(findTestObject('ADMIN/Item List/counter_purchasable'), 0)

WebUI.verifyElementText(findTestObject('ADMIN/Item List/div_Purchasable'), 'Purchasable')

WebUI.verifyElementPresent(findTestObject('ADMIN/Item List/counter_non purchasable'), 0)

WebUI.verifyElementText(findTestObject('ADMIN/Item List/div_Non-purchasable'), 'Non-purchasable')

WebUI.verifyElementPresent(findTestObject('ADMIN/Item List/counter_out of stock'), 0)

WebUI.verifyElementText(findTestObject('ADMIN/Item List/div_Out of Stock'), 'Out of Stock')

WebUI.verifyElementPresent(findTestObject('ADMIN/Item List/button_Download CSV'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Item List/select_Sort By'), 0)

WebUI.verifyElementText(findTestObject('ADMIN/Item List/td_Item'), 'Item')

WebUI.verifyElementText(findTestObject('ADMIN/Item List/td_Price'), 'Price')

WebUI.verifyElementText(findTestObject('ADMIN/Item List/td_Merchant'), 'Merchant')

WebUI.verifyElementText(findTestObject('ADMIN/Item List/td_Category'), 'Category')

WebUI.verifyElementText(findTestObject('ADMIN/Item List/td_Date Created'), 'Date Created')

WebUI.verifyElementText(findTestObject('ADMIN/Item List/td_Total Stock'), 'Total Stock')

WebUI.verifyElementText(findTestObject('ADMIN/Item List/td_Last Updated'), 'Last Updated')

WebUI.verifyElementText(findTestObject('ADMIN/Item List/td_Purchasable'), 'Purchasable')

WebUI.verifyElementPresent(findTestObject('ADMIN/Item List/delete_icon'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Item List/span_onoffswitch-switch'), 0)

WebUI.click(findTestObject('ADMIN/Item List/input_filter_merchant'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Item List/input_search merchant'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Item List/input_search merchant'), 0)

WebUI.verifyElementText(findTestObject('ADMIN/Item List/label_Select All Merchant'), 'Select All')

WebUI.click(findTestObject('ADMIN/Item List/label_Select All Merchant'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Item List/X icon/x_icon merchant search'), 0)

WebUI.verifyElementVisible(findTestObject('ADMIN/Item List/X icon/x_icon merchant search'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('ADMIN/Item List/input_filter_category'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Item List/input_search category'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Item List/input_search category'), 0)

WebUI.verifyElementText(findTestObject('ADMIN/Item List/label_Select All Category'), 'Select All')

WebUI.click(findTestObject('ADMIN/Item List/label_Select All Category'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Item List/X icon/x_icon category search'), 0)

WebUI.verifyElementVisible(findTestObject('ADMIN/Item List/X icon/x_icon category search'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('ADMIN/Item List/a_Items'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Item List/h1_Items'), 0)

WebUI.verifyElementVisible(findTestObject('ADMIN/Item List/Pagination/previous_page icon'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('ADMIN/Item List/Pagination/page_1 icon'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('ADMIN/Item List/Pagination/page_2 icon'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('ADMIN/Item List/Pagination/next_page icon'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('ADMIN/Admin Permission/Admin Activity Log/a_Logout'))

WebUI.closeBrowser(FailureHandling.CONTINUE_ON_FAILURE)

