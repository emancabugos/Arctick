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

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Your Items/button_Upload'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/MERCHANT/Item Upload/searchbar_category-name'), 0)

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Item Upload/searchbar_category-name'), varCategory)

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/MERCHANT/Upload Page (1)/checkbox_cat1'), 0)

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Upload Page (1)/checkbox_cat1'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Upload Page (1)/input_item-name'), varItemName)

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Upload Page (1)/textbox_item-price'), varPrice)

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Upload Page (1)/textbox_sku-field'), varSKU)

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Upload Page (1)/textarea_item-description'), varDescription)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Upload Page (1)/button_BROWSE'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1)

WebUI.uploadFile(findTestObject('Utilities/Image Cropper/image_container'), varImage)

WebUI.waitForElementVisible(findTestObject('Utilities/Image Cropper/button_ok'), 0)

WebUI.click(findTestObject('Utilities/Image Cropper/button_ok'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Upload Page (1)/textbox_item-quantity'), varQuantity)

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Upload Page (1)/button_SAVE'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/MERCHANT/Your Items/button_Upload'), 0)

