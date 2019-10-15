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

WebUI.click(findTestObject('Utilities/Header/BESPOKE/Merchant Header/linktext_Upload'))

WebUI.waitForElementVisible(findTestObject('Bespoke/Merchant/Upload Page (1)/textlabel_Category(s)'), 0)

WebUI.click(findTestObject('MERCHANT/Category/Bespoke/Category 20'))

WebUI.setText(findTestObject('Bespoke/Merchant/Upload Page (1)/input_item-name'), 'C9180')

WebUI.setText(findTestObject('Bespoke/Merchant/Upload Page (1)/textbox_item-price'), '10')

WebUI.setText(findTestObject('Bespoke/Merchant/Upload Page (1)/textbox_sku-field'), 'C9180SKU')

WebUI.setText(findTestObject('Bespoke/Merchant/Upload Page (1)/textarea_item-description'), 'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.')

WebUI.click(findTestObject('Bespoke/Merchant/Upload Page (1)/button_BROWSE'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1)

WebUI.uploadFile(findTestObject('MERCHANT/SpaceTime/Service Creation/Images/browse_img/img_upload container'), 'C:\\\\Katalon\\\\Image\\\\halls.jpg')

WebUI.click(findTestObject('MERCHANT/SpaceTime/Service Creation/Images/browse_img/button_ok'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1)

WebUI.click(findTestObject('Bespoke/Merchant/Upload Page (1)/toggle_variant'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Bespoke/Merchant/Upload Page (1)/Variants/textbox_opt1'), 'Color')

WebUI.setText(findTestObject('Bespoke/Merchant/Upload Page (1)/Variants/textbox_choices1'), '#,')

WebUI.setText(findTestObject('Bespoke/Merchant/Upload Page (1)/Variants/stock'), '1')

WebUI.setText(findTestObject('Bespoke/Merchant/Upload Page (1)/Variants/stock2'), '1')

WebUI.click(findTestObject('Bespoke/Merchant/Upload Page (1)/button_SAVE'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Bespoke/Merchant/Your Items/button_Upload'), 0)

