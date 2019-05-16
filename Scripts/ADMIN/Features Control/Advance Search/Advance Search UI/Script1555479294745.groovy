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

WebUI.click(findTestObject('ADMIN/Features Control/Advance Search/a_Features Control'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Features Control/Advance Search/textlabel_Advanced Search'), 0)

WebUI.click(findTestObject('ADMIN/Features Control/Advance Search/button_Edit'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Features Control/Advance Search/textlabel_Advanced Search beta'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Features Control/Advance Search/icon_magnifier1'), 0)

WebUI.verifyElementText(findTestObject('ADMIN/Features Control/Advance Search/textlabel_Advanced Search beta'), 'Advanced Search')

WebUI.verifyElementPresent(findTestObject('ADMIN/Features Control/Advance Search/beta image'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Features Control/Advance Search/icon_magnifier2'), 0)

WebUI.verifyElementText(findTestObject('ADMIN/Features Control/Advance Search/textlabel_Congure the search settings'), 'Conﬁgure the search settings in your marketplace')

WebUI.verifyElementText(findTestObject('ADMIN/Features Control/Advance Search/textlabel_You should enable search'), 'You should enable search bar in Content mgmt - General menu to use this feature')

WebUI.verifyElementPresent(findTestObject('ADMIN/Features Control/Advance Search/button_Save'), 0)

WebUI.comment('Search Settings')

WebUI.verifyElementText(findTestObject('ADMIN/Features Control/Advance Search/textlabel_Search Settings'), 'Search Settings')

WebUI.verifyElementPresent(findTestObject('ADMIN/Features Control/Advance Search/icon_info search settings'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Features Control/Advance Search/button_Search by keywords'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Features Control/Advance Search/button_Search by location'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Features Control/Advance Search/button_Search by keywords and locat'), 
    0)

WebUI.verifyElementText(findTestObject('ADMIN/Features Control/Advance Search/textlabel_Enable date filter'), 'Enable date filter')

WebUI.verifyElementPresent(findTestObject('ADMIN/Features Control/Advance Search/toggle_date filter keyword'), 0)

WebUI.verifyElementText(findTestObject('ADMIN/Features Control/Advance Search/textlabel_Search bar look'), 'Search bar look')

WebUI.verifyElementPresent(findTestObject('ADMIN/Features Control/Advance Search/img_search bar look'), 0)

WebUI.verifyElementText(findTestObject('ADMIN/Features Control/Advance Search/textlabel_Location Search Radius'), 'Location Search Radius')

WebUI.verifyElementPresent(findTestObject('ADMIN/Features Control/Advance Search/icon_info location search radius'), 0)

WebUI.verifyElementText(findTestObject('ADMIN/Features Control/Advance Search/textlabel_Search Unit'), 'Search Unit')

WebUI.verifyElementText(findTestObject('ADMIN/Features Control/Advance Search/texttoggle_Km'), 'Km')

WebUI.verifyElementPresent(findTestObject('ADMIN/Features Control/Advance Search/toggle_search unit'), 0)

WebUI.verifyElementText(findTestObject('ADMIN/Features Control/Advance Search/texttoggle_Miles'), 'Miles')

WebUI.verifyElementText(findTestObject('ADMIN/Features Control/Advance Search/textlabel_Max Search Radius'), 'Max Search Radius')

WebUI.verifyElementPresent(findTestObject('ADMIN/Features Control/Advance Search/dropdown_radius km'), 0)

WebUI.verifyElementText(findTestObject('ADMIN/Features Control/Advance Search/textlabel_Km'), 'Km')

WebUI.verifyElementPresent(findTestObject('ADMIN/Features Control/Advance Search/button_Save bottom'), 0)

