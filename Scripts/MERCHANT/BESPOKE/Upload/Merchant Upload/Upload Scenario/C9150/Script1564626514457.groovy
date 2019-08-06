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

WebUI.waitForElementVisible(findTestObject('MERCHANT/Bespoke/Upload Page/textlabel_Category(s)'), 0)

WebUI.click(findTestObject('MERCHANT/Category/Bespoke/Category 20'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('MERCHANT/Bespoke/Upload Page/input_item-name'), 'ITEM')

WebUI.setText(findTestObject('MERCHANT/Bespoke/Upload Page/textbox_item-price'), '10')

WebUI.setText(findTestObject('MERCHANT/Bespoke/Upload Page/textbox_sku-field'), 'C9136SKU')

WebUI.setText(findTestObject('MERCHANT/Bespoke/Upload Page/textarea_item-description'), 'DESCRIPTION')

WebUI.click(findTestObject('MERCHANT/Bespoke/Upload Page/button_BROWSE'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1)

WebUI.uploadFile(findTestObject('MERCHANT/SpaceTime/Service Creation/Images/browse_img/img_upload container'), 'C:\\\\Katalon\\\\Image\\\\halls.jpg')

WebUI.click(findTestObject('MERCHANT/SpaceTime/Service Creation/Images/browse_img/button_ok'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1)

WebUI.setText(findTestObject('MERCHANT/Bespoke/Upload Page/textbox_item-quantity'), ' ')

WebUI.click(findTestObject('MERCHANT/Bespoke/Upload Page/button_SAVE'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementAttributeValue(findTestObject('MERCHANT/Bespoke/Upload Page/textbox_item-quantity'), 'value', '', 0)
