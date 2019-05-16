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

WebUI.navigateToUrl(GlobalVariable.ArcDashboardURL)

WebUI.maximizeWindow()

WebUI.waitForElementVisible(findTestObject('ADMIN/Arcadier Dashboard/div_brand-logo'), 0)

WebUI.setText(findTestObject('ADMIN/Arcadier Dashboard/input_Email'), GlobalVariable.ArcDashboardUser)

WebUI.setText(findTestObject('ADMIN/Arcadier Dashboard/input_Password'), GlobalVariable.ArcDashboardPass)

WebUI.click(findTestObject('ADMIN/Arcadier Dashboard/input_btn btn-default'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Arcadier Dashboard/a_Announcement'), 0)

WebUI.click(findTestObject('ADMIN/Arcadier Dashboard/a_Announcement'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Arcadier Dashboard/h1_Announcement'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Arcadier Dashboard/h1_Announcement'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Arcadier Dashboard/a_Add New'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Arcadier Dashboard/input_search'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Arcadier Dashboard/td_UPLOADED ON'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Arcadier Dashboard/td_TITLE'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Arcadier Dashboard/previous_page button'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Arcadier Dashboard/page1'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Arcadier Dashboard/next_page button'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Arcadier Dashboard/logout_button'), 0)

WebUI.click(findTestObject('ADMIN/Arcadier Dashboard/a_Add New'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Arcadier Dashboard/div_Upload'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Arcadier Dashboard/div_Upload'), 0)

WebUI.verifyElementText(findTestObject('ADMIN/Arcadier Dashboard/label_Title'), 'Title')

WebUI.verifyElementPresent(findTestObject('ADMIN/Arcadier Dashboard/input_title'), 0)

WebUI.verifyElementText(findTestObject('ADMIN/Arcadier Dashboard/label_Description'), 'Description')

WebUI.verifyElementPresent(findTestObject('ADMIN/Arcadier Dashboard/textarea_description'), 0)

WebUI.verifyElementText(findTestObject('ADMIN/Arcadier Dashboard/label_Hyperlink'), 'Hyperlink')

WebUI.verifyElementPresent(findTestObject('ADMIN/Arcadier Dashboard/input_hyperlink'), 0)

WebUI.verifyElementText(findTestObject('ADMIN/Arcadier Dashboard/label_Show NEW tag on this sta'), 'Show NEW tag on this status')

WebUI.verifyElementPresent(findTestObject('ADMIN/Arcadier Dashboard/span_onoffswitch-inner'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Arcadier Dashboard/button_Cancel'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Arcadier Dashboard/button_Upload'), 0)

WebUI.click(findTestObject('ADMIN/Arcadier Dashboard/button_Cancel'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Arcadier Dashboard/logout_button'), 0)

WebUI.click(findTestObject('ADMIN/Arcadier Dashboard/logout_button'))

WebUI.closeBrowser()

