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

WebUI.waitForElementVisible(findTestObject('ADMIN/Admin Merchant Sub Accounts/sidemenu_Permission'), 0)

WebUI.click(findTestObject('ADMIN/Admin Merchant Sub Accounts/sidemenu_Permission'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Admin Merchant Sub Accounts/sidemenu_Merchant Sub-Accounts'), 0)

WebUI.click(findTestObject('ADMIN/Admin Merchant Sub Accounts/sidemenu_Merchant Sub-Accounts'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Admin Merchant Sub Accounts/icon_merchant sub'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Admin Merchant Sub Accounts/textlabel_Merchant Sub-Accounts'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Admin Merchant Sub Accounts/img_beta'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Admin Merchant Sub Accounts/textlabel_Please note that this feat'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Admin Merchant Sub Accounts/icon_enable'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Admin Merchant Sub Accounts/textlabel_Enable Sub-Accounts for you'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Admin Merchant Sub Accounts/toggle_'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Admin Merchant Sub Accounts/textlabel_What are Merchant Sub-Accou'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Admin Merchant Sub Accounts/icon_info'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Admin Merchant Sub Accounts/textlabel_Merchant Sub-Accounts allow'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Admin Merchant Sub Accounts/textalbel_Access Tab'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Admin Merchant Sub Accounts/textlabel_Access tab will be available'), 0)

