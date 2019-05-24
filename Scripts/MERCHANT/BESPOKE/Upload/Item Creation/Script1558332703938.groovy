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

WebUI.waitForElementVisible(findTestObject('Utilities/Header/BESPOKE/Merchant Header/linktext_Upload'), 0)

WebUI.click(findTestObject('Utilities/Header/BESPOKE/Merchant Header/linktext_Upload'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Category')

WebUI.waitForElementVisible(findTestObject('MERCHANT/Bespoke/Upload Page/textlabel_Category(s)'), 0)

WebUI.click(findTestObject('MERCHANT/Bespoke/Upload Page/checkbox_cat1'))

WebUI.comment('Item Name')

WebUI.setText(findTestObject('MERCHANT/Bespoke/Upload Page/input_item-name'), varItemName)

WebUI.comment('Price')

WebUI.setText(findTestObject('MERCHANT/Bespoke/Upload Page/textbox_item-price'), varPrice)

WebUI.comment('SKU')

WebUI.setText(findTestObject('MERCHANT/Bespoke/Upload Page/textbox_sku-field'), varSKU)

WebUI.comment('Item Description')

WebUI.setText(findTestObject('MERCHANT/Bespoke/Upload Page/textarea_item-description'), varItemDescription)

WebUI.comment('Image')

WebUI.click(findTestObject('MERCHANT/Bespoke/Upload Page/button_BROWSE'))

WebUI.delay(1)

WebUI.uploadFile(findTestObject('MERCHANT/SpaceTime/Service Creation/Images/browse_img/img_upload container'), varImage)

WebUI.click(findTestObject('MERCHANT/SpaceTime/Service Creation/Images/browse_img/button_ok'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1)

WebUI.comment('Variants & Quantity')

if (varVariants == 'yes') {
    WebUI.click(findTestObject('MERCHANT/Bespoke/Upload Page/toggle_variant'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.setText(findTestObject('MERCHANT/Bespoke/Upload Page/Variants/textbox_opt1'), varVariantOption)

    WebUI.setText(findTestObject('MERCHANT/Bespoke/Upload Page/Variants/textbox_choices1'), varVariantChoices)
} else if (varVariants == 'no') {
    WebUI.setText(findTestObject('MERCHANT/Bespoke/Upload Page/textbox_item-quantity'), varQuantity)
}

WebUI.click(findTestObject('MERCHANT/Bespoke/Upload Page/button_SAVE'))

WebUI.waitForElementVisible(findTestObject('MERCHANT/Bespoke/Your Items/button_Upload'), 0)

