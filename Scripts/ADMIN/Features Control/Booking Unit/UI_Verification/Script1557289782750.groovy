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

WebUI.waitForElementVisible(findTestObject('ADMIN/Features Control/Advance Search/a_Features Control'), 0)

WebUI.click(findTestObject('ADMIN/Features Control/Advance Search/a_Features Control'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Features Control/Booking Unit/button_Edit'), 0)

WebUI.click(findTestObject('ADMIN/Features Control/Booking Unit/button_Edit'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Features Control/Booking Unit/icon1st_NewBookingUnit'), 0)

WebUI.verifyElementVisible(findTestObject('ADMIN/Features Control/Booking Unit/textlabel_NewBookingUnit'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Features Control/Booking Unit/icon2nd_NewBookingUnit'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Features Control/Booking Unit/textlabel_ConfigureBooking'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Features Control/Booking Unit/infotext'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Features Control/Booking Unit/topbutton_Save'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Features Control/Booking Unit/textlabel_MarketplaceBookingType'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Features Control/Booking Unit/radiobutton_Duration'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Features Control/Booking Unit/radiobutton_Unit'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Features Control/Booking Unit/radiobutton_UnitDuration'))

WebUI.click(findTestObject('ADMIN/Features Control/Booking Unit/radiobutton_Duration'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Features Control/Booking Unit/info_Duration'), 0)

WebUI.verifyElementVisible(findTestObject('ADMIN/Features Control/Booking Unit/info_Duration'))

WebUI.click(findTestObject('ADMIN/Features Control/Booking Unit/radiobutton_Unit'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Features Control/Booking Unit/info_Unit'), 0)

WebUI.verifyElementVisible(findTestObject('ADMIN/Features Control/Booking Unit/info_Unit'))

WebUI.click(findTestObject('ADMIN/Features Control/Booking Unit/radiobutton_UnitDuration'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Features Control/Booking Unit/info_UnitDuration'), 0)

WebUI.verifyElementVisible(findTestObject('ADMIN/Features Control/Booking Unit/info_UnitDuration'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Features Control/Booking Unit/icon_ChangingBookingType'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Features Control/Booking Unit/textlabel_ChagingBookingType'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Features Control/Booking Unit/textlabel_MyBookingType(s)'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Features Control/Booking Unit/column_UNITNAME'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Features Control/Booking Unit/column_OVERNIGHTSERVICE'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Features Control/Booking Unit/column_DURATIONUNIT(S)'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Features Control/Booking Unit/button_AddBookingUnit'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Features Control/Booking Unit/default_Name1'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Features Control/Booking Unit/default_Service1'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Features Control/Booking Unit/default_DurationUnit1'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Features Control/Booking Unit/button_Edit1'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Features Control/Booking Unit/button_toggle1'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Features Control/Booking Unit/button_delete1'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Features Control/Booking Unit/default_Name2'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Features Control/Booking Unit/default_Service2'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Features Control/Booking Unit/default_DurationUnit2'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Features Control/Booking Unit/button_edit2'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Features Control/Booking Unit/button_toggle2'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Features Control/Booking Unit/button_delete2'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Features Control/Booking Unit/icon_Recommendation'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Features Control/Booking Unit/textlabel_Recommendation'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Features Control/Booking Unit/bottombutton_Save'))

WebUI.comment('Verify Save Popup (Book by Duration)')

WebUI.delay(1)

WebUI.click(findTestObject('ADMIN/Features Control/Booking Unit/radiobutton_Duration'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Features Control/Booking Unit/info_Duration'), 0)

WebUI.click(findTestObject('ADMIN/Features Control/Booking Unit/topbutton_Save'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Features Control/Booking Unit/a_Save Popup/button_Save'), 0)

WebUI.verifyElementVisible(findTestObject('ADMIN/Features Control/Booking Unit/a_Save Popup/button_Close'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Features Control/Booking Unit/a_Save Popup/textlabel_Confirmation'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Features Control/Booking Unit/a_Save Popup/button_Cancel'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Features Control/Booking Unit/a_Save Popup/button_Save'))

WebUI.click(findTestObject('ADMIN/Features Control/Booking Unit/a_Save Popup/button_Close'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Features Control/Booking Unit/button_AddBookingUnit'), 0)

WebUI.waitForElementVisible(findTestObject('ADMIN/Features Control/Booking Unit/info_Duration'), 0)

WebUI.scrollToElement(findTestObject('ADMIN/Features Control/Booking Unit/bottombutton_Save'), 0)

WebUI.delay(1)

WebUI.click(findTestObject('ADMIN/Features Control/Booking Unit/bottombutton_Save'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Features Control/Booking Unit/a_Save Popup/button_Save'), 0)

WebUI.verifyElementVisible(findTestObject('ADMIN/Features Control/Booking Unit/a_Save Popup/button_Close'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Features Control/Booking Unit/a_Save Popup/textlabel_Confirmation'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Features Control/Booking Unit/a_Save Popup/button_Cancel'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Features Control/Booking Unit/a_Save Popup/button_Save'))

WebUI.click(findTestObject('ADMIN/Features Control/Booking Unit/a_Save Popup/button_Close'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Features Control/Booking Unit/button_AddBookingUnit'), 0)

WebUI.waitForElementVisible(findTestObject('ADMIN/Features Control/Booking Unit/info_Duration'), 0)

WebUI.comment('Verify Save Popup (Book by Unit)')

WebUI.delay(1)

WebUI.click(findTestObject('ADMIN/Features Control/Booking Unit/radiobutton_Unit'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Features Control/Booking Unit/info_Unit'), 0)

WebUI.click(findTestObject('ADMIN/Features Control/Booking Unit/topbutton_Save'))

WebUI.delay(1)

WebUI.waitForElementVisible(findTestObject('ADMIN/Features Control/Booking Unit/a_Save Popup/button_Save'), 0)

WebUI.verifyElementVisible(findTestObject('ADMIN/Features Control/Booking Unit/a_Save Popup/button_Close'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Features Control/Booking Unit/a_Save Popup/textlabel_Confirmation'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Features Control/Booking Unit/a_Save Popup/button_Cancel'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Features Control/Booking Unit/a_Save Popup/button_Save'))

WebUI.click(findTestObject('ADMIN/Features Control/Booking Unit/a_Save Popup/button_Close'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Features Control/Booking Unit/button_AddBookingUnit'), 0)

WebUI.waitForElementVisible(findTestObject('ADMIN/Features Control/Booking Unit/info_Unit'), 0)

WebUI.delay(1)

WebUI.click(findTestObject('ADMIN/Features Control/Booking Unit/bottombutton_Save'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Features Control/Booking Unit/a_Save Popup/button_Save'), 0)

WebUI.verifyElementVisible(findTestObject('ADMIN/Features Control/Booking Unit/a_Save Popup/button_Close'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Features Control/Booking Unit/a_Save Popup/textlabel_Confirmation'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Features Control/Booking Unit/a_Save Popup/button_Cancel'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Features Control/Booking Unit/a_Save Popup/button_Save'))

WebUI.click(findTestObject('ADMIN/Features Control/Booking Unit/a_Save Popup/button_Close'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Features Control/Booking Unit/button_AddBookingUnit'), 0)

WebUI.waitForElementVisible(findTestObject('ADMIN/Features Control/Booking Unit/info_Unit'), 0)

WebUI.comment('Verify Save Popup (Book by Unit and Duration)')

WebUI.delay(1)

WebUI.click(findTestObject('ADMIN/Features Control/Booking Unit/radiobutton_UnitDuration'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Features Control/Booking Unit/info_UnitDuration'), 0)

WebUI.click(findTestObject('ADMIN/Features Control/Booking Unit/topbutton_Save'))

WebUI.delay(1)

WebUI.waitForElementVisible(findTestObject('ADMIN/Features Control/Booking Unit/a_Save Popup/button_Save'), 0)

WebUI.verifyElementVisible(findTestObject('ADMIN/Features Control/Booking Unit/a_Save Popup/button_Close'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Features Control/Booking Unit/a_Save Popup/textlabel_Confirmation'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Features Control/Booking Unit/a_Save Popup/button_Cancel'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Features Control/Booking Unit/a_Save Popup/button_Save'))

WebUI.click(findTestObject('ADMIN/Features Control/Booking Unit/a_Save Popup/button_Close'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Features Control/Booking Unit/button_AddBookingUnit'), 0)

WebUI.waitForElementVisible(findTestObject('ADMIN/Features Control/Booking Unit/info_UnitDuration'), 0)

WebUI.delay(1)

WebUI.click(findTestObject('ADMIN/Features Control/Booking Unit/bottombutton_Save'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Features Control/Booking Unit/a_Save Popup/button_Save'), 0)

WebUI.verifyElementVisible(findTestObject('ADMIN/Features Control/Booking Unit/a_Save Popup/button_Close'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Features Control/Booking Unit/a_Save Popup/textlabel_Confirmation'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Features Control/Booking Unit/a_Save Popup/button_Cancel'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Features Control/Booking Unit/a_Save Popup/button_Save'))

WebUI.click(findTestObject('ADMIN/Features Control/Booking Unit/a_Save Popup/button_Close'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Features Control/Booking Unit/button_AddBookingUnit'), 0)

WebUI.waitForElementVisible(findTestObject('ADMIN/Features Control/Booking Unit/info_UnitDuration'), 0)

WebUI.delay(1)

WebUI.comment('Verify Add Booking Unit popup')

WebUI.click(findTestObject('ADMIN/Features Control/Booking Unit/button_AddBookingUnit'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Features Control/Booking Unit/a_Add New Booking Unit/textlabel_AddNewBookingUnit'), 
    0)

WebUI.verifyElementVisible(findTestObject('ADMIN/Features Control/Booking Unit/a_Add New Booking Unit/textlabel_AddNewBookingUnit'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Features Control/Booking Unit/a_Add New Booking Unit/textfield_UnitName'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Features Control/Booking Unit/a_Add New Booking Unit/textlabel_Duration'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Features Control/Booking Unit/a_Add New Booking Unit/checkbox_Hour'))

WebUI.verifyElementPresent(findTestObject('ADMIN/Features Control/Booking Unit/a_Add New Booking Unit/checkbox_Day'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Features Control/Booking Unit/a_Add New Booking Unit/checkbox_Week'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Features Control/Booking Unit/a_Add New Booking Unit/checkbox_Month'), 
    0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Features Control/Booking Unit/a_Add New Booking Unit/checkbox_Custom'), 
    0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Features Control/Booking Unit/a_Add New Booking Unit/infotext'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Features Control/Booking Unit/a_Add New Booking Unit/textlabel_OvernightService'), 
    0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Features Control/Booking Unit/a_Add New Booking Unit/button_toggle'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Features Control/Booking Unit/a_Add New Booking Unit/button_Save'), 0)

WebUI.click(findTestObject('ADMIN/Features Control/Booking Unit/a_Add New Booking Unit/button_toggle'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Features Control/Booking Unit/a_Add New Booking Unit/checkbox_Night'), 
    0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Features Control/Booking Unit/a_Add New Booking Unit/checkbox_Night'), 
    0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Features Control/Booking Unit/a_Add New Booking Unit/checkbox_NightWeek'), 
    0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Features Control/Booking Unit/a_Add New Booking Unit/checkbox_NightMonth'), 
    0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Features Control/Booking Unit/a_Add New Booking Unit/checkbox_NightCustom'), 
    0)

WebUI.delay(1)

WebUI.mouseOver(findTestObject('ADMIN/Features Control/Booking Unit/a_Add New Booking Unit/infotext'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Features Control/Booking Unit/a_Add New Booking Unit/textllabel_tooltip'), 
    0)

WebUI.verifyElementVisible(findTestObject('ADMIN/Features Control/Booking Unit/a_Add New Booking Unit/textllabel_tooltip'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Features Control/Booking Unit/a_Add New Booking Unit/button_close'))

WebUI.delay(1)

WebUI.click(findTestObject('ADMIN/Features Control/Booking Unit/a_Add New Booking Unit/button_close'))

WebUI.delay(1)

WebUI.click(findTestObject('Utilities/Admin Logout/button_Logout'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Admin Login/Admin Login/txtbox_username'), 0)

WebUI.closeBrowser()

