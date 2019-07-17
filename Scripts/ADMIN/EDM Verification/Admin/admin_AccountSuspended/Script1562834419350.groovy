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

WebUI.waitForElementVisible(findTestObject('ADMIN/Language/sidemenu_Language'), 0)

WebUI.click(findTestObject('ADMIN/Language/sidemenu_Language'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Language/sidemenu_Edit Text'), 0)

WebUI.click(findTestObject('ADMIN/Language/sidemenu_Edit Text'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Language/Edit Text/button_EmailNotifications'), 0)

WebUI.click(findTestObject('ADMIN/Language/Edit Text/button_EmailNotifications'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Edit Text/Spacetime/EDMs/textlink_Welcome Mail'), 0)

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('ADMIN/Edit Text/Spacetime/EDMs/textlink_Buyer Invite'), 0)

WebUI.click(findTestObject('ADMIN/Edit Text/Spacetime/EDMs/textlink_Account Suspended'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Edit Text/Spacetime/Welcome Mail/dd_Homepage'), 0)

greetings = WebUI.getText(findTestObject('ADMIN/Edit Text/Spacetime/Account Suspended/label_Hi'))

content = WebUI.getText(findTestObject('ADMIN/Edit Text/Spacetime/Account Suspended/label_It seems that your items'))

regards = WebUI.getText(findTestObject('ADMIN/Edit Text/Spacetime/Account Suspended/label_Best'))

CustomKeywords.'writeToExcel.accountsuspended.getaccountSuspended'(1, 1, greetings)

CustomKeywords.'writeToExcel.accountsuspended.getaccountSuspended'(1, 2, content)

CustomKeywords.'writeToExcel.accountsuspended.getaccountSuspended'(1, 3, regards)

