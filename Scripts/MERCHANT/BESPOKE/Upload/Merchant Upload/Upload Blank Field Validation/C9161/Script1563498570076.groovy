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

WebUI.click(findTestObject('MERCHANT/Category/Bespoke/Category 1'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('MERCHANT/Bespoke/Upload Page/input_item-name'), '')

WebUI.setText(findTestObject('MERCHANT/Bespoke/Upload Page/textbox_item-price'), '10')

WebUI.setText(findTestObject('MERCHANT/Bespoke/Upload Page/textarea_item-description'), '"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum."')

WebUI.click(findTestObject('MERCHANT/Bespoke/Upload Page/button_BROWSE'))

WebUI.delay(1)

WebUI.uploadFile(findTestObject('MERCHANT/SpaceTime/Service Creation/Images/browse_img/img_upload container'), 'C:\\Katalon\\Image\\drug9.jpg')

WebUI.click(findTestObject('MERCHANT/SpaceTime/Service Creation/Images/browse_img/button_ok'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1)

WebUI.setText(findTestObject('MERCHANT/Bespoke/Upload Page/textbox_item-quantity'), '10')

WebUI.comment('Custom Fields')

WebUI.click(findTestObject('MERCHANT/Upload Item Page/Custom Fields/checkbox 1'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('MERCHANT/Upload Item Page/Custom Fields/checkbox 2'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('MERCHANT/Upload Item Page/Custom Fields/checkbox 3'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('MERCHANT/Upload Item Page/Custom Fields/checkbox 4'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('MERCHANT/Upload Item Page/Custom Fields/checkbox 5'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('MERCHANT/Upload Item Page/Custom Fields/custom-time'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('MERCHANT/Upload Item Page/Custom Fields/custom-date'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Custom Fields/custom-email'), 'arcadierteam@gmail.com')

WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Custom Fields/custom-number'), '69')

WebUI.uploadFile(findTestObject('MERCHANT/Upload Item Page/Custom Fields/PDF'), 'C:\\\\Katalon\\\\Image\\\\1mb.pdf')

WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Custom Fields/percentage'), '98')

WebUI.setText(findTestObject('Utilities/Text Editor Icon/Text Area/text area object/p'), 'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.')

WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Custom Fields/input_txt-field edited'), 'EDITED CUSTOM FIELD')

WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Custom Fields/input_txt-field'), 'TEXT FIELD !@#$%^&*()_')

WebUI.click(findTestObject('MERCHANT/Bespoke/Upload Page/button_SAVE'))

WebUI.verifyElementAttributeValue(findTestObject('MERCHANT/Bespoke/Upload Page/input_item-name'), 'value', '', 0)

