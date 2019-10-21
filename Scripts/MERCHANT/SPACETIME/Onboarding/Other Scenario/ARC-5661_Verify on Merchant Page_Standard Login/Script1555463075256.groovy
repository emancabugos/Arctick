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

WebUI.navigateToUrl(GlobalVariable.url)

WebUI.waitForElementVisible(findTestObject('Time/Consumer/Homepage/BeASeller_Link'), 0)

WebUI.click(findTestObject('Time/Consumer/Homepage/BeASeller_Link'))

WebUI.waitForElementVisible(findTestObject('Time/Consumer/Register  Sign In/Create Account_button '), 0)

WebUI.click(findTestObject('Time/Consumer/Register  Sign In/Create Account_button '))

WebUI.waitForElementVisible(findTestObject('Time/Consumer/Register  Sign In/onboard_Username'), 0)

WebUI.setText(findTestObject('Time/Consumer/Register  Sign In/onboard_Username'), GlobalVariable.username_onboard)

WebUI.setText(findTestObject('Time/Consumer/Register  Sign In/onboard_Password'), GlobalVariable.password_onboard)

WebUI.setText(findTestObject('Time/Consumer/Register  Sign In/onboard_Reconfirm'), GlobalVariable.reconfirm_onboard)

WebUI.setText(findTestObject('Time/Consumer/Register  Sign In/onboard_NotificationEmail'), GlobalVariable.notificationemail_onboard)

WebUI.click(findTestObject('Time/Consumer/Register  Sign In/button_CreateAccount_Onboard'))

WebUI.waitForElementVisible(findTestObject('Time/Consumer/Register  Sign In/toast_ErrorDuplicateUsername'), 0)

