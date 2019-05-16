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
import groovy.time.TimeCategory as TimeCategory

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

use(TimeCategory, { 
        today = new Date()
    })

WebUI.comment('Input on Date')

WebUI.setText(findTestObject('ADMIN/Item List/input_datecreated_start_date'), 'today')

WebUI.setText(findTestObject('ADMIN/Item List/input_datecreated_end_date'), 'today')

WebUI.setText(findTestObject('ADMIN/Item List/input_filter_start_date'), 'today')

WebUI.setText(findTestObject('ADMIN/Item List/input_filter_end_date'), 'today')

WebUI.comment('Select Date (Current Date only)')

WebUI.click(findTestObject('ADMIN/Item List/a_Items'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Item List/h1_Items'), 0)

WebUI.click(findTestObject('ADMIN/Item List/input_datecreated_start_date'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('ADMIN/Item List/input_datecreated_end_date'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('ADMIN/Item List/input_filter_start_date'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('ADMIN/Item List/input_filter_end_date'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Search Merchant')

WebUI.click(findTestObject('ADMIN/Item List/a_Items'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Item List/h1_Items'), 0)

WebUI.click(findTestObject('ADMIN/Item List/input_filter_merchant'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Item List/input_search merchant'), 0)

WebUI.setText(findTestObject('ADMIN/Item List/input_search merchant'), 'Custom')

WebUI.waitForElementVisible(findTestObject('ADMIN/Item List/label_Custom Merchant'), 0)

WebUI.verifyElementText(findTestObject('ADMIN/Item List/label_Custom Merchant'), 'Custom Merchant')

WebUI.comment('Search Category')

WebUI.click(findTestObject('ADMIN/Item List/a_Items'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Item List/h1_Items'), 0)

WebUI.click(findTestObject('ADMIN/Item List/input_filter_category'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Item List/input_search category'), 0)

WebUI.setText(findTestObject('ADMIN/Item List/input_search category'), 'Category 1')

WebUI.waitForElementVisible(findTestObject('ADMIN/Item List/label_Category 1'), 0)

WebUI.verifyElementText(findTestObject('ADMIN/Item List/label_Category 1'), 'Category 1')

WebUI.comment('Admin Delete Item')

WebUI.click(findTestObject('ADMIN/Item List/a_Items'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Item List/h1_Items'), 0)

WebUI.setText(findTestObject('ADMIN/Item List/input_search-text'), 'Custom Overnight 2PM-11AM Deleted by Admin')

WebUI.click(findTestObject('ADMIN/Item List/button_Search'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Item List/table_item name'), 0)

WebUI.click(findTestObject('ADMIN/Item List/delete_icon'))

