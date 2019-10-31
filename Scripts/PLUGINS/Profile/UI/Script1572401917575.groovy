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

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/MERCHANT/Upload Page (1)/textlabel_Category(s)'), 0)

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/MERCHANT/Upload Page (1)/checkbox_cat1'), 0)

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Upload Page (1)/checkbox_cat1'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Upload Page (1)/input_item-name'), variable_item)

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Upload Page (1)/textbox_item-price'), variable_price)

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Upload Page (1)/textbox_sku-field'), variable_SKU)

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Upload Page (1)/input_RRP'), variable_RRP)

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Upload Page (1)/textarea_item-description'), variable_desc)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Upload Page (1)/button_BROWSE'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.uploadFile(findTestObject('BESPOKE DEL 2/MERCHANT/Upload Page (1)/input_upload-file'), 'C:\\\\Users\\\\Chrysler\\\\git\\\\Arctick\\\\Item Image\\\\1.png')

WebUI.waitForElementVisible(findTestObject('Utilities/Image Cropper/button_ok'), 0)

WebUI.click(findTestObject('Utilities/Image Cropper/button_ok'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Upload Page (1)/textbox_item-quantity'), variable_qty)

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Upload Page (1)/button_SAVE'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/MERCHANT/Your Items/button_Upload'), 0)

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Upload Page (1)/input_search-item'), variable_item)

WebUI.click(findTestObject('RRP_Package/img_item-preview'))

WebUI.verifyElementVisible(findTestObject('RRP_Package/del_PHP  150.00'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('RRP_Package/Page_trishabespoke/a_TRISHASELLER'))

WebUI.verifyElementVisible(findTestObject('RRP_Package/Page_trishabespoke/span_PHP'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('RRP_Package/Page_trishabespoke/span_150.00'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('RRP_Package/Page_trishabespoke/img_Home'))

WebUI.delay(2)

WebUI.verifyElementVisible(findTestObject('RRP_Package/Page_trishabespoke/span_PHP 1'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('RRP_Package/Page_trishabespoke/span_150.001'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.setText(findTestObject('RRP_Package/Page_trishabespoke (1)/input_KeyWords'), variable_item)

WebUI.click(findTestObject('RRP_Package/Page_trishabespoke (1)/Page_trishabespoke/input_btn-find'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.verifyElementVisible(findTestObject('RRP_Package/Page_trishabespoke/span_PHP 2'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('RRP_Package/Page_trishabespoke/span_150.002'), FailureHandling.CONTINUE_ON_FAILURE)

