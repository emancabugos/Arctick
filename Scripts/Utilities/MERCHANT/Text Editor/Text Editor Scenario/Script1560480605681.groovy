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
import org.openqa.selenium.Keys as Keys

WebUI.comment('Input Text')

WebUI.setText(findTestObject('Utilities/Text Editor Icon/Text Area/text area object/p'), 'BOLD')

WebUI.comment('Paste as plain text')

WebUI.waitForElementVisible(findTestObject('Utilities/Text Editor Icon/a_Paste as plain textKeyboard'), 0)

WebUI.click(findTestObject('Utilities/Text Editor Icon/a_Paste as plain textKeyboard'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Paste from word')

WebUI.waitForElementVisible(findTestObject('Utilities/Text Editor Icon/a_Paste from Word'), 0)

WebUI.click(findTestObject('Utilities/Text Editor Icon/a_Paste from Word'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Select All')

WebUI.waitForElementVisible(findTestObject('Utilities/Text Editor Icon/a_Select All'), 0)

WebUI.click(findTestObject('Utilities/Text Editor Icon/a_Select All'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Bold')

WebUI.waitForElementVisible(findTestObject('Utilities/Text Editor Icon/a_BoldKeyboard shortcut CtrlB'), 0)

WebUI.click(findTestObject('Utilities/Text Editor Icon/a_BoldKeyboard shortcut CtrlB'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Italic')

WebUI.waitForElementVisible(findTestObject('Utilities/Text Editor Icon/a_ItalicKeyboard shortcut Ctrl'), 0)

WebUI.click(findTestObject('Utilities/Text Editor Icon/a_ItalicKeyboard shortcut Ctrl'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Underlined')

WebUI.waitForElementVisible(findTestObject('Utilities/Text Editor Icon/a_UnderlineKeyboard shortcut C'), 0)

WebUI.click(findTestObject('Utilities/Text Editor Icon/a_UnderlineKeyboard shortcut C'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Strikethrough')

WebUI.waitForElementVisible(findTestObject('Utilities/Text Editor Icon/a_Strikethrough'), 0)

WebUI.click(findTestObject('Utilities/Text Editor Icon/a_Strikethrough'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Subscript')

WebUI.waitForElementVisible(findTestObject('Utilities/Text Editor Icon/a_Subscript'), 0)

WebUI.click(findTestObject('Utilities/Text Editor Icon/a_Subscript'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Superscript')

WebUI.waitForElementVisible(findTestObject('Utilities/Text Editor Icon/a_Superscript'), 0)

WebUI.click(findTestObject('Utilities/Text Editor Icon/a_Superscript'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Numbered')

WebUI.waitForElementVisible(findTestObject('Utilities/Text Editor Icon/a_InsertRemove Numbered List'), 0)

WebUI.click(findTestObject('Utilities/Text Editor Icon/a_InsertRemove Numbered List'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Bulleted')

WebUI.waitForElementVisible(findTestObject('Utilities/Text Editor Icon/a_InsertRemove Bulleted List'), 0)

WebUI.click(findTestObject('Utilities/Text Editor Icon/a_InsertRemove Bulleted List'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Decrease Indent')

WebUI.waitForElementVisible(findTestObject('Utilities/Text Editor Icon/a_Decrease Indent'), 0)

WebUI.click(findTestObject('Utilities/Text Editor Icon/a_Decrease Indent'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Increase Indent')

WebUI.waitForElementVisible(findTestObject('Utilities/Text Editor Icon/a_Increase Indent'), 0)

WebUI.click(findTestObject('Utilities/Text Editor Icon/a_Increase Indent'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Number List')

WebUI.waitForElementVisible(findTestObject('Utilities/Text Editor Icon/a_InsertRemove Numbered List'), 0)

WebUI.click(findTestObject('Utilities/Text Editor Icon/a_InsertRemove Numbered List'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Bulleted List')

WebUI.waitForElementVisible(findTestObject('Utilities/Text Editor Icon/a_InsertRemove Bulleted List'), 0)

WebUI.click(findTestObject('Utilities/Text Editor Icon/a_InsertRemove Bulleted List'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Bulleted List')

WebUI.waitForElementVisible(findTestObject('Utilities/Text Editor Icon/a_InsertRemove Bulleted List'), 0)

WebUI.click(findTestObject('Utilities/Text Editor Icon/a_InsertRemove Bulleted List'), FailureHandling.CONTINUE_ON_FAILURE)

