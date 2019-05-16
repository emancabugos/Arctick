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

WebUI.waitForElementVisible(findTestObject('ADMIN/Transactions/sidemenu_Payments  Transactions'), 0)

WebUI.click(findTestObject('ADMIN/Transactions/sidemenu_Payments  Transactions'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Transactions/sidemenu_Transactions'), 0)

WebUI.click(findTestObject('ADMIN/Transactions/sidemenu_Transactions'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Transactions/img 1'), 0)

WebUI.comment('Created')

WebUI.selectOptionByLabel(findTestObject('ADMIN/Transactions/dropdown_Order Status'), 'Created', false)

WebUI.click(findTestObject('ADMIN/Transactions/button_Search'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Transactions/textlabel_Order Status'), 0)

WebUI.comment('Acknowledged')

WebUI.selectOptionByLabel(findTestObject('ADMIN/Transactions/dropdown_Order Status'), 'Acknowledged', false)

WebUI.click(findTestObject('ADMIN/Transactions/button_Search'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Transactions/textlabel_Order Status'), 0)

WebUI.comment('Ready for Pick-up')

WebUI.selectOptionByLabel(findTestObject('ADMIN/Transactions/dropdown_Order Status'), 'Ready for Pick-up', false)

WebUI.click(findTestObject('ADMIN/Transactions/button_Search'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Transactions/textlabel_Order Status'), 0)

WebUI.comment('Collected')

WebUI.selectOptionByLabel(findTestObject('ADMIN/Transactions/dropdown_Order Status'), 'Collected', false)

WebUI.click(findTestObject('ADMIN/Transactions/button_Search'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Transactions/textlabel_Order Status'), 0)

WebUI.comment('Delivered')

WebUI.selectOptionByLabel(findTestObject('ADMIN/Transactions/dropdown_Order Status'), 'Delivered', false)

WebUI.click(findTestObject('ADMIN/Transactions/button_Search'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Transactions/textlabel_Order Status'), 0)

WebUI.click(findTestObject('Utilities/Admin Logout/button_Logout'), FailureHandling.CONTINUE_ON_FAILURE)

