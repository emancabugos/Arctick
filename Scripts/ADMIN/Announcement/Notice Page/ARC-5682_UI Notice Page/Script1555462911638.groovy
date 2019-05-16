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

WebUI.navigateToUrl(GlobalVariable.dashboardurl)

WebUI.waitForElementVisible(findTestObject('Dashboard/Dashboard - Login Page/logo_Arcadier'), 0)

WebUI.maximizeWindow()

WebUI.verifyElementPresent(findTestObject('Dashboard/Dashboard - Login Page/logo_Arcadier'), 0)

WebUI.setText(findTestObject('Dashboard/Dashboard - Login Page/textfield_Email'), GlobalVariable.dashboardusername)

WebUI.setText(findTestObject('Dashboard/Dashboard - Login Page/textfield_Password'), GlobalVariable.dashboardpassword)

WebUI.click(findTestObject('Dashboard/Dashboard - Login Page/button_Login'))

WebUI.waitForElementVisible(findTestObject('Dashboard/Dashboard - CS Support Page/link_Announcement'), 0)

WebUI.click(findTestObject('Dashboard/Dashboard - CS Support Page/link_Notice'))

WebUI.waitForElementVisible(findTestObject('Dashboard/Dashboard - Notice Page/button_Add New'), 0)

WebUI.verifyElementPresent(findTestObject('Dashboard/Dashboard - Notice Page/sign_(plus)'), 0)

WebUI.verifyElementPresent(findTestObject('Dashboard/Dashboard - Notice Page/column_NOTICE'), 0)

WebUI.verifyElementPresent(findTestObject('Dashboard/Dashboard - Notice Page/column_TITLE'), 0)

WebUI.verifyElementPresent(findTestObject('Dashboard/Dashboard - Notice Page/column_UPLOADED ON'), 0)

WebUI.verifyElementPresent(findTestObject('Dashboard/Dashboard - Notice Page/textfield_search'), 0)

WebUI.click(findTestObject('Dashboard/Dashboard - Notice Page/button_Add New'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Dashboard/Dashboard - Notice Page/popup_label_Title'), 0)

WebUI.verifyElementPresent(findTestObject('Dashboard/Dashboard - Notice Page/popup_label_Title'), 0)

WebUI.verifyElementPresent(findTestObject('Dashboard/Dashboard - Notice Page/popup_textfield_Title'), 0)

WebUI.verifyElementPresent(findTestObject('Dashboard/Dashboard - Notice Page/popup_label_Hyperlink'), 0)

WebUI.verifyElementPresent(findTestObject('Dashboard/Dashboard - Notice Page/popup_textfield_Hyperlink'), 0)

WebUI.verifyElementPresent(findTestObject('Dashboard/Dashboard - Notice Page/popup_label_Notice'), 0)

WebUI.verifyElementPresent(findTestObject('Dashboard/Dashboard - Notice Page/popup_dropdown_Notice'), 0)

WebUI.click(findTestObject('Dashboard/Dashboard - Notice Page/popup_dropdown_Notice'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Dashboard/Dashboard - Notice Page/link_Update'), 0)

WebUI.verifyElementPresent(findTestObject('Dashboard/Dashboard - Notice Page/link_News'), 0)

WebUI.verifyElementPresent(findTestObject('Dashboard/Dashboard - Notice Page/link_Event'), 0)

WebUI.click(findTestObject('Dashboard/Dashboard - Notice Page/popup_dropdown_Notice'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Dashboard/Dashboard - Notice Page/label_Show NEW tag on this status'), 0)

WebUI.verifyElementPresent(findTestObject('Dashboard/Dashboard - Notice Page/toggle_Status'), 0)

WebUI.verifyElementClickable(findTestObject('Dashboard/Dashboard - Notice Page/toggle_Status'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Dashboard/Dashboard - Notice Page/popup_button_Cancel'), 0)

WebUI.verifyElementPresent(findTestObject('Dashboard/Dashboard - Notice Page/popup_button_Upload'), 0)

WebUI.click(findTestObject('Dashboard/Dashboard - Notice Page/popup_button_Cancel'))

WebUI.verifyElementPresent(findTestObject('Dashboard/Dashboard - Notice Page/button_Add New'), 0)

WebUI.verifyElementPresent(findTestObject('Dashboard/Dashboard - CS Support Page/button_Logout'), 0)

WebUI.waitForElementClickable(findTestObject('Dashboard/Dashboard - CS Support Page/button_Logout'), 0)

WebUI.click(findTestObject('Dashboard/Dashboard - CS Support Page/button_Logout'))

WebUI.waitForElementVisible(findTestObject('Dashboard/Dashboard - Login Page/textfield_Email'), 0)

