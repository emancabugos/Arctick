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

WebUI.waitForElementVisible(findTestObject('ADMIN/Admin Permission/Admin Permission/a_Permission'), 0)

WebUI.click(findTestObject('ADMIN/Admin Permission/Admin Permission/a_Permission'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Admin Permission/Admin Permission/a_Admin Permission'), 0)

WebUI.click(findTestObject('ADMIN/Admin Permission/Admin Permission/a_Admin Permission'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Admin Permission/Admin Permission/i_icon icon-permission'), 0)

WebUI.verifyElementText(findTestObject('ADMIN/Admin Permission/Admin Permission/h1_Admin Permission'), 'Admin Permission')

WebUI.click(findTestObject('ADMIN/Admin Permission/Admin Permission/a_Invite Admin'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Admin Permission/Admin Permission/Invite Popup/h2_Invite Admin'), 0)

WebUI.setText(findTestObject('ADMIN/Admin Permission/Admin Permission/Invite Popup/input_invite_mail'), 'arcadierteam1@gmail.com')

WebUI.click(findTestObject('ADMIN/Admin Permission/Admin Permission/Invite Popup/input_blue-btn'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1)

WebUI.waitForElementVisible(findTestObject('ADMIN/Admin Permission/Admin Permission/h1_Admin Permission'), 0)

