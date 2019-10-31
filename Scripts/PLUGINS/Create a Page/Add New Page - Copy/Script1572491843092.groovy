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
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger

WebUI.click(findTestObject('ADMIN/Plugins/Web Page Builder/button_CreateAPage'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Plugins/Web Page Builder/textlabel_headerWebpageBuilder'), 0)

String beforeURL = WebUI.getText(findTestObject('ADMIN/Plugins/Web Page Builder/textfield_WebURL'))

KeywordLogger log = new KeywordLogger()

log.logInfo(beforeURL)

String actualwebURL = beforeURL + PageTitle

WebUI.setText(findTestObject('ADMIN/Plugins/Web Page Builder/textfield_PageTitle'), PageTitle)

afterURL = WebUI.getText(findTestObject('ADMIN/Plugins/Web Page Builder/textfield_WebURL'))

log.logInfo(afterURL)

WebUI.verifyMatch(afterURL, actualwebURL, false)

WebUI.click(findTestObject('null'))

WebUI.sendKeys(findTestObject('null'), Content)

