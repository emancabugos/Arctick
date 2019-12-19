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

WebUI.click(findTestObject('Utilities/Header/BESPOKE/Merchant Header v2/header_Your Items'))

WebUI.waitForElementPresent(findTestObject('BESPOKE DEL 2/MERCHANT/Your Items/textbox_search-item'), 0)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Your Items/textbox_search-item'), 'for edit')

WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Your Items/icon_search'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('BESPOKE DEL 2/MERCHANT/Your Items/1st Item Name'), 0)

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Your Items/Item Info/icon_edit'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/MERCHANT/Upload Page (1)/textlabel_Category(s)'), 0)

WebUI.click(findTestObject('Utilities/Custom Fields/custom-time'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Utilities/Custom Fields/custom-date'), '06/08/3000')

WebUI.delay(1)

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Upload Page (1)/button_SAVE'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('BESPOKE DEL 2/MERCHANT/Your Items/button_Upload'), 0)

