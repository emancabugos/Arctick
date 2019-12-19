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
import org.openqa.selenium.Keys as Keys

WebUI.comment('Publish / All Users')

WebUI.click(findTestObject('ADMIN/Plugins/Web Page Builder/button_CreateAPage'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Plugins/Web Page Builder/textlabel_headerWebpageBuilder'), 0)

String beforeURL = WebUI.getText(findTestObject('ADMIN/Plugins/Web Page Builder/textfield_WebURL'))

KeywordLogger log = new KeywordLogger()

log.logInfo(beforeURL)

WebUI.setText(findTestObject('ADMIN/Plugins/Web Page Builder/textfield_PageTitle'), 'AvailabletoAll')

dianaprofile = WebUI.getText(findTestObject('ADMIN/Plugins/Web Page Builder/textfield_PageTitle'))

afterURL = WebUI.getText(findTestObject('ADMIN/Plugins/Web Page Builder/textfield_WebURL'))

log.logInfo(afterURL)

WebUI.setText(findTestObject('Utilities/Text Editor Icon/Text Area/text area object/p'), 'diana0001')

String webcontentdiana = WebUI.getText(findTestObject('Utilities/Text Editor Icon/Text Area/text area object/p'))

WebUI.click(findTestObject('ADMIN/Plugins/Web Page Builder/radiobutton_Publish'))

WebUI.click(findTestObject('ADMIN/Plugins/Web Page Builder/radiobutton_AllUsers'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('ADMIN/Plugins/Web Page Builder/button_Edit'))

metatitleactual = WebUI.getText(findTestObject('ADMIN/Plugins/Web Page Builder/textfield_Metatitle'))

log.logInfo(metatitleactual)

//WebUI.verifyMatch(metatitleactual, PageTitle, false)
metadescactual = WebUI.getText(findTestObject('ADMIN/Plugins/Web Page Builder/textarea_meta_desc'))

log.logInfo(metadescactual)

WebUI.verifyMatch(metadescactual, webcontentdiana, false)

WebUI.comment('Check Preview')

WebUI.click(findTestObject('ADMIN/Plugins/Web Page Builder/button_Preview'))

WebUI.waitForPageLoad(0)

WebUI.switchToWindowIndex(1)

WebUI.comment('Validate content')

WebUI.verifyTextPresent(dianaprofile, false)

WebUI.verifyTextPresent(webcontentdiana, false)

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

WebUI.waitForElementVisible(findTestObject('ADMIN/Plugins/Web Page Builder/button_Save'), 0)

WebUI.click(findTestObject('ADMIN/Plugins/Web Page Builder/button_Save'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Plugins/Web Page Builder/toaster_successfulAddofPage'), 0)

WebUI.waitForElementNotVisible(findTestObject('ADMIN/Plugins/Web Page Builder/toaster_successfulAddofPage'), 0)

WebUI.verifyTextPresent(dianaprofile, false)

WebUI.comment('Validate All Users')

WebUI.openBrowser('')

String navigateurl = afterURL + 'AvailabletoAll'

log.logInfo(navigateurl)

WebUI.navigateToUrl(navigateurl)

WebUI.verifyTextPresent(webcontentdiana, false)

