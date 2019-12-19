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

WebUI.callTestCase(findTestCase('Utilities/MERCHANT/Merchant Login'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Utilities/Header/SPACETIME/header_Bookings'), 0)

WebUI.click(findTestObject('Utilities/Header/SPACETIME/header_Bookings'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('SPACETIME/MERCHANT/Bookings/img_your bookings'), 0)

WebUI.verifyElementPresent(findTestObject('SPACETIME/MERCHANT/Bookings/dropdown_AllUpcomingOngoingpast'), 0)

WebUI.verifyElementPresent(findTestObject('SPACETIME/MERCHANT/Bookings/textbox_search-item'), 0)

WebUI.verifyElementPresent(findTestObject('SPACETIME/MERCHANT/Bookings/button_Export CSV'), 0)

WebUI.verifyElementText(findTestObject('SPACETIME/MERCHANT/Bookings/textlabel_FILTER SERVICE START DAT'), 'FILTER SERVICE START DATE FROM')

WebUI.verifyElementPresent(findTestObject('SPACETIME/MERCHANT/Bookings/textbox_booking-date'), 0)

WebUI.verifyElementPresent(findTestObject('SPACETIME/MERCHANT/Bookings/button_Apply'), 0)

WebUI.click(findTestObject('Utilities/Buyer Seller Logout/button_dropdown'))

WebUI.click(findTestObject('Utilities/Buyer Seller Logout/textlink_Logout'))

