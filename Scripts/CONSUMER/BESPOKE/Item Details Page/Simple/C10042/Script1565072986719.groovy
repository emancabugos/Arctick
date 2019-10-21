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

'Verify if Show More is displayed'
WebUI.callTestCase(findTestCase('Utilities/CONSUMER/Consumer Login'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/CONSUMER/Homepage/textfield_Search'), 0)

WebUI.setText(findTestObject('BESPOKE DEL 2/CONSUMER/Homepage/textfield_Search'), '')

WebUI.click(findTestObject('BESPOKE DEL 2/CONSUMER/Homepage/button_Search'))

WebUI.verifyElementVisible(findTestObject('BESPOKE DEL 2/CONSUMER/Search Results Page/button_Filters'))

WebUI.click(findTestObject('BESPOKE DEL 2/CONSUMER/Search Results Page/item_Result'))

WebUI.switchToWindowIndex(1)

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/CONSUMER/Item Details Page/button_AddtoCart'), 0)

WebUI.click(findTestObject('BESPOKE DEL 2/CONSUMER/Item Details Page/linktext_ShowMore'))

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/CONSUMER/Item Details Page/linktext_ShowLess'), 0)

WebUI.scrollToElement(findTestObject('BESPOKE DEL 2/CONSUMER/Item Details Page/linktext_ShowLess'), 0)

WebUI.verifyElementVisible(findTestObject('BESPOKE DEL 2/CONSUMER/Item Details Page/linktext_ShowLess'))

WebUI.click(findTestObject('BESPOKE DEL 2/CONSUMER/Item Details Page/linktext_ShowLess'))

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/CONSUMER/Item Details Page/linktext_ShowMore'), 0)

WebUI.scrollToElement(findTestObject('BESPOKE DEL 2/CONSUMER/Item Details Page/linktext_ShowMore'), 0)

WebUI.verifyElementVisible(findTestObject('BESPOKE DEL 2/CONSUMER/Item Details Page/linktext_ShowMore'), FailureHandling.CONTINUE_ON_FAILURE)

