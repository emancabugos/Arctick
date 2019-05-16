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

WebUI.callTestCase(findTestCase('Utilities/MERCHANT/Merchant Login'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Utilities/Header/BESPOKE/Merchant Header/linktext_Upload'))

WebUI.waitForElementVisible(findTestObject('MERCHANT/Bespoke/Upload Page/textlabel_Category(s)'), 0)

WebUI.waitForElementVisible(findTestObject('MERCHANT/Bespoke/Upload Page/checkbox_cat1'), 0)

WebUI.click(findTestObject('MERCHANT/Bespoke/Upload Page/checkbox_cat1'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('MERCHANT/Bespoke/Upload Page/input_item-name'), varItemName)

WebUI.setText(findTestObject('MERCHANT/Bespoke/Upload Page/textbox_item-price'), varPrice)

WebUI.setText(findTestObject('MERCHANT/Bespoke/Upload Page/textbox_sku-field'), varSKU)

WebUI.setText(findTestObject('MERCHANT/Bespoke/Upload Page/textarea_item-description'), varDescription)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('MERCHANT/Bespoke/Upload Page/button_BROWSE'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('Utilities/Upload Image(with cropper) - Spacetime Merchant'), [('varImagePath') : varImage], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('MERCHANT/Bespoke/Upload Page/textbox_item-quantity'), varQuantity)

WebUI.click(findTestObject('MERCHANT/Bespoke/Upload Page/button_SAVE'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('MERCHANT/Bespoke/Your Items/button_Upload'), 0)

WebUI.callTestCase(findTestCase('Utilities/MERCHANT/Logout'), [:], FailureHandling.CONTINUE_ON_FAILURE)

