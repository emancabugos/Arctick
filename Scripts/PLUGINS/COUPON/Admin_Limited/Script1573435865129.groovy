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

WebUI.delay(2)

WebUI.waitForElementVisible(findTestObject('Coupon_Package/ADMIN/a_Plug-ins'), 0)

WebUI.scrollToElement(findTestObject('Coupon_Package/ADMIN/a_Plug-ins'), 0)

WebUI.click(findTestObject('Coupon_Package/ADMIN/a_Plug-ins'))

WebUI.waitForElementVisible(findTestObject('Coupon_Package/COUPON_PAGE/a_Discount Coupon Generator'), 0)

WebUI.click(findTestObject('Coupon_Package/COUPON_PAGE/a_Discount Coupon Generator'))

WebUI.verifyElementVisible(findTestObject('Coupon_Package/COUPON_PAGE/a_Create New Campaign'))

WebUI.click(findTestObject('Coupon_Package/COUPON_PAGE/a_Create New Campaign'))

WebUI.delay(2)

WebUI.verifyElementVisible(findTestObject('Coupon_Package/COUPON_PAGE/h4_Campaign Details'))

WebUI.setText(findTestObject('Coupon_Package/COUPON_PAGE/input_campaign_name'), variable_name)

WebUI.waitForElementVisible(findTestObject('Coupon_Package/COUPON_PAGE/span_onoffswitch-inner'), 0)

WebUI.click(findTestObject('Coupon_Package/COUPON_PAGE/span_onoffswitch-inner'))

WebUI.setText(findTestObject('Coupon_Package/COUPON_PAGE/input_redeem'), variable_redeem)

WebUI.setText(findTestObject('Coupon_Package/COUPON_PAGE/input_d-val'), variable_value)

WebUI.click(findTestObject('Coupon_Package/COUPON_PAGE/input_save_details'))

WebUI.getText(findTestObject('Coupon_Package/COUPON_PAGE/Page_trishabespoke/Page_trishabespoke/td_7894a'))

WebUI.getText(findTestObject('Coupon_Package/COUPON_PAGE/Page_trishabespoke/Page_trishabespoke/td_5'))

WebUI.delay(2)

WebUI.callTestCase(findTestCase('Utilities/ADMIN/Admin Logout'), [:], FailureHandling.CONTINUE_ON_FAILURE)

