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

WebUI.maximizeWindow()

WebUI.waitForElementVisible(findTestObject('ADMIN/Arcadier Dashboard (1)/Dashboard - Login Page/logo_Arcadier'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Arcadier Dashboard (1)/Dashboard - Login Page/logo_Arcadier'), 0)

WebUI.setText(findTestObject('ADMIN/Arcadier Dashboard (1)/Dashboard - Login Page/textfield_Email'), GlobalVariable.dashboardusername)

WebUI.setText(findTestObject('ADMIN/Arcadier Dashboard (1)/Dashboard - Login Page/textfield_Password'), GlobalVariable.dashboardpassword)

WebUI.click(findTestObject('ADMIN/Arcadier Dashboard (1)/Dashboard - Login Page/button_Login'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Arcadier Dashboard (1)/Dashboard - CS Support Page/link_Announcement'), 0)

WebUI.click(findTestObject('ADMIN/Arcadier Dashboard (1)/Dashboard - CS Support Page/link_Notice'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Arcadier Dashboard (1)/Dashboard - Notice Page/button_Add New'), 0)

WebUI.click(findTestObject('ADMIN/Arcadier Dashboard (1)/Dashboard - Notice Page/button_Add New'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Arcadier Dashboard (1)/Dashboard - Notice Page/popup_textfield_Title'), 0)

WebUI.setText(findTestObject('ADMIN/Arcadier Dashboard (1)/Dashboard - Notice Page/popup_textfield_Title'), 'Test News')

WebUI.setText(findTestObject('ADMIN/Arcadier Dashboard (1)/Dashboard - Notice Page/popup_textfield_Hyperlink'), 'https:/www.google.com')

WebUI.click(findTestObject('ADMIN/Arcadier Dashboard (1)/Dashboard - Notice Page/popup_dropdown_Notice'))

WebUI.click(findTestObject('ADMIN/Arcadier Dashboard (1)/Dashboard - Notice Page/link_News'))

WebUI.click(findTestObject('ADMIN/Arcadier Dashboard (1)/Dashboard - Notice Page/popup_button_Upload'))

WebUI.delay(3)

WebUI.click(findTestObject('ADMIN/Arcadier Dashboard (1)/Dashboard - Notice Page/button_Add New'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Arcadier Dashboard (1)/Dashboard - Notice Page/popup_textfield_Title'), 0)

WebUI.setText(findTestObject('ADMIN/Arcadier Dashboard (1)/Dashboard - Notice Page/popup_textfield_Title'), 'Test Update')

WebUI.setText(findTestObject('ADMIN/Arcadier Dashboard (1)/Dashboard - Notice Page/popup_textfield_Hyperlink'), 'https:/www.google.com')

WebUI.click(findTestObject('ADMIN/Arcadier Dashboard (1)/Dashboard - Notice Page/popup_dropdown_Notice'))

WebUI.click(findTestObject('ADMIN/Arcadier Dashboard (1)/Dashboard - Notice Page/link_Update'))

WebUI.click(findTestObject('ADMIN/Arcadier Dashboard (1)/Dashboard - Notice Page/popup_button_Upload'))

WebUI.delay(3)

WebUI.click(findTestObject('ADMIN/Arcadier Dashboard (1)/Dashboard - Notice Page/button_Add New'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Arcadier Dashboard (1)/Dashboard - Notice Page/popup_textfield_Title'), 0)

WebUI.setText(findTestObject('ADMIN/Arcadier Dashboard (1)/Dashboard - Notice Page/popup_textfield_Title'), 'Test Event')

WebUI.setText(findTestObject('ADMIN/Arcadier Dashboard (1)/Dashboard - Notice Page/popup_textfield_Hyperlink'), 'https:/www.google.com')

WebUI.click(findTestObject('ADMIN/Arcadier Dashboard (1)/Dashboard - Notice Page/popup_dropdown_Notice'))

WebUI.click(findTestObject('ADMIN/Arcadier Dashboard (1)/Dashboard - Notice Page/link_Event'))

WebUI.click(findTestObject('ADMIN/Arcadier Dashboard (1)/Dashboard - Notice Page/popup_button_Upload'))

WebUI.delay(2)

WebUI.click(findTestObject('ADMIN/Arcadier Dashboard (1)/Dashboard - CS Support Page/button_Logout'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Arcadier Dashboard (1)/Dashboard - Login Page/textfield_Email'), 0)

