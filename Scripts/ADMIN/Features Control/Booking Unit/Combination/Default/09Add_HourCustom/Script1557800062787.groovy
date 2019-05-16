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

WebUI.waitForElementVisible(findTestObject('ADMIN/Features Control/Advance Search/a_Features Control'), 0)

WebUI.click(findTestObject('ADMIN/Features Control/Advance Search/a_Features Control'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Features Control/Booking Unit/button_Edit'), 0)

WebUI.click(findTestObject('ADMIN/Features Control/Booking Unit/button_Edit'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Features Control/Booking Unit/icon1st_NewBookingUnit'), 0)

WebUI.verifyElementVisible(findTestObject('ADMIN/Features Control/Booking Unit/textlabel_NewBookingUnit'))

WebUI.delay(1)

WebUI.click(findTestObject('ADMIN/Features Control/Booking Unit/button_AddBookingUnit'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Features Control/Booking Unit/a_Add New Booking Unit/textlabel_AddNewBookingUnit'), 
    0)

WebUI.delay(1)

WebUI.setText(findTestObject('ADMIN/Features Control/Booking Unit/a_Add New Booking Unit/textfield_UnitName'), 'Day 9')

WebUI.delay(1)

WebUI.click(findTestObject('ADMIN/Features Control/Booking Unit/a_Add New Booking Unit/checkbox_Hour'))

WebUI.click(findTestObject('ADMIN/Features Control/Booking Unit/a_Add New Booking Unit/checkbox_Custom'))

WebUI.click(findTestObject('ADMIN/Features Control/Booking Unit/a_Add New Booking Unit/button_Save'))

WebUI.delay(1)

WebUI.click(findTestObject('ADMIN/Features Control/Booking Unit/topbutton_Save'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Features Control/Booking Unit/a_Save Popup/button_Save'), 0)

WebUI.click(findTestObject('ADMIN/Features Control/Booking Unit/a_Save Popup/button_Save'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Features Control/Booking Unit/a_ToasterMessage/toaster_SaveSuccessfully'), 
    0)

WebUI.waitForElementNotPresent(findTestObject('ADMIN/Features Control/Booking Unit/a_ToasterMessage/toaster_SaveSuccessfully'), 
    0)

