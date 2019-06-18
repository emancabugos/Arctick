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

WebUI.waitForElementPresent(findTestObject('MERCHANT/SpaceTime/Service Creation/Custom Fields/custom-email'), 0)

WebUI.comment('EMAIL')

WebUI.setText(findTestObject('MERCHANT/SpaceTime/Service Creation/Custom Fields/custom-email'), 'arcadierteam@gmail.com')

WebUI.comment('NUMBER')

WebUI.setText(findTestObject('MERCHANT/SpaceTime/Service Creation/Custom Fields/custom-number'), '69')

WebUI.comment('PDF')

WebUI.uploadFile(findTestObject('MERCHANT/SpaceTime/Service Creation/Custom Fields/PDF'), 'C:\\\\Katalon\\\\Image\\\\1mb.pdf')

WebUI.comment('TEXT EDITOR')

WebUI.setText(findTestObject('Utilities/Text Editor Icon/Text Area/text area object/p'), 'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.')

WebUI.click(findTestObject('Utilities/Text Editor Icon/a_Select All'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Utilities/Text Editor Icon/a_BoldKeyboard shortcut CtrlB'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Utilities/Text Editor Icon/a_ItalicKeyboard shortcut Ctrl'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Utilities/Text Editor Icon/a_UnderlineKeyboard shortcut C'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Utilities/Text Editor Icon/a_Strikethrough'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Utilities/Text Editor Icon/a_Subscript'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Utilities/Text Editor Icon/a_Superscript'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Utilities/Text Editor Icon/a_InsertRemove Bulleted List'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Text Fields')

WebUI.setText(findTestObject('MERCHANT/SpaceTime/Service Creation/Custom Fields/input_txt-field edited'), 'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.')

WebUI.setText(findTestObject('MERCHANT/SpaceTime/Service Creation/Custom Fields/input_txt-field'), 'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.')

