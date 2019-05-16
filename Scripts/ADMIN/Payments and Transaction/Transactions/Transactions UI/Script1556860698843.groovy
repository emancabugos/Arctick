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

WebUI.callTestCase(findTestCase('Utilities/ADMIN/Admin Login'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Transactions/sidemenu_Payments  Transactions'), 0)

WebUI.click(findTestObject('ADMIN/Transactions/sidemenu_Payments  Transactions'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Transactions/sidemenu_Transactions'), 0)

WebUI.click(findTestObject('ADMIN/Transactions/sidemenu_Transactions'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Transactions/img 1'), 0)

WebUI.verifyElementText(findTestObject('ADMIN/Transactions/textlabel_Transaction History'), '')

WebUI.verifyElementPresent(findTestObject('ADMIN/Transactions/textbox_search'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Transactions/input_filter_merchant'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Transactions/dropdown_Payment Status'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Transactions/dropdown_Order Status'), 0)

WebUI.verifyElementText(findTestObject('ADMIN/Transactions/textlabel_Timestamp'), 'Timestamp')

WebUI.verifyElementPresent(findTestObject('ADMIN/Transactions/input_filter_start_date'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Transactions/input_filter_end_date'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Transactions/button_Search'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Transactions/a_Clear'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Transactions/counter'), 0)

WebUI.verifyElementText(findTestObject('ADMIN/Transactions/textlabel_Transactions Found'), 'Transactions Found')

WebUI.verifyElementPresent(findTestObject('ADMIN/Transactions/button_Export CSV'), 0)

WebUI.verifyElementText(findTestObject('ADMIN/Transactions/textlabel_Timestamp (1)'), 'Timestamp')

WebUI.verifyElementText(findTestObject('ADMIN/Transactions/textlabel_Invoice ID'), 'Invoice ID')

WebUI.verifyElementText(findTestObject('ADMIN/Transactions/textlabel_Order ID'), 'Order ID')

WebUI.verifyElementText(findTestObject('ADMIN/Transactions/textlabel_Seller'), 'Seller')

WebUI.verifyElementText(findTestObject('ADMIN/Transactions/textlabel_Buyer'), 'Buyer')

WebUI.verifyElementText(findTestObject('ADMIN/Transactions/textlabel_Order Amt.'), 'Order Amt.')

WebUI.verifyElementText(findTestObject('ADMIN/Transactions/textlabel_Admin Fees'), 'Admin Fees')

WebUI.verifyElementText(findTestObject('ADMIN/Transactions/textlabel_Order Status'), 'Order Status')

WebUI.verifyElementText(findTestObject('ADMIN/Transactions/textlabel_Payment Status'), 'Payment Status')

WebUI.verifyElementText(findTestObject('ADMIN/Transactions/textlabel_Payment'), 'Payment')

WebUI.click(findTestObject('Utilities/Admin Logout/button_Logout'), FailureHandling.CONTINUE_ON_FAILURE)

