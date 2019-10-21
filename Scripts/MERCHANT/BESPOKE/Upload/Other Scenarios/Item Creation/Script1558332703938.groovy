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

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/MERCHANT/Upload Page (1)/textlabel_Category(s)'), 0)

if (varCategory == 'Category 1') {
    WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Item Upload/searchbar_category-name'), varCategory)

    WebUI.click(findTestObject('Utilities/Category/Bespoke/Category 1'), FailureHandling.CONTINUE_ON_FAILURE)
} else if (varCategory == 'Category 2') {
    WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Item Upload/searchbar_category-name'), varCategory)

    WebUI.click(findTestObject('Utilities/Category/Bespoke/Category 2'), FailureHandling.CONTINUE_ON_FAILURE)
} else if (varCategory == 'Category 3') {
    WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Item Upload/searchbar_category-name'), varCategory)

    WebUI.click(findTestObject('Utilities/Category/Bespoke/Category 3'), FailureHandling.CONTINUE_ON_FAILURE)
} else if (varCategory == 'Category 4') {
    WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Item Upload/searchbar_category-name'), varCategory)

    WebUI.click(findTestObject('Utilities/Category/Bespoke/Category 4'), FailureHandling.CONTINUE_ON_FAILURE)
} else if (varCategory == 'Category 5') {
    WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Item Upload/searchbar_category-name'), varCategory)

    WebUI.click(findTestObject('Utilities/Category/Bespoke/Category 5'), FailureHandling.CONTINUE_ON_FAILURE)
} else if (varCategory == 'Category 6') {
    WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Item Upload/searchbar_category-name'), varCategory)

    WebUI.click(findTestObject('Utilities/Category/Bespoke/Category 6'), FailureHandling.CONTINUE_ON_FAILURE)
} else if (varCategory == 'Category 7') {
    WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Item Upload/searchbar_category-name'), varCategory)

    WebUI.click(findTestObject('Utilities/Category/Bespoke/Category 7'), FailureHandling.CONTINUE_ON_FAILURE)
} else if (varCategory == 'Category 8') {
    WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Item Upload/searchbar_category-name'), varCategory)

    WebUI.click(findTestObject('Utilities/Category/Bespoke/Category 8'), FailureHandling.CONTINUE_ON_FAILURE)
} else if (varCategory == 'Category 9') {
    WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Item Upload/searchbar_category-name'), varCategory)

    WebUI.click(findTestObject('Utilities/Category/Bespoke/Category 9'), FailureHandling.CONTINUE_ON_FAILURE)
} else if (varCategory == 'Category 10') {
    WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Item Upload/searchbar_category-name'), varCategory)

    WebUI.click(findTestObject('Utilities/Category/Bespoke/Category 10'), FailureHandling.CONTINUE_ON_FAILURE)
} else if (varCategory == 'Category 11') {
    WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Item Upload/searchbar_category-name'), varCategory)

    WebUI.click(findTestObject('Utilities/Category/Bespoke/Category 11'), FailureHandling.CONTINUE_ON_FAILURE)
} else if (varCategory == 'Category 12') {
    WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Item Upload/searchbar_category-name'), varCategory)

    WebUI.click(findTestObject('Utilities/Category/Bespoke/Category 12'), FailureHandling.CONTINUE_ON_FAILURE)
} else if (varCategory == 'Category 13') {
    WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Item Upload/searchbar_category-name'), varCategory)

    WebUI.click(findTestObject('Utilities/Category/Bespoke/Category 13'), FailureHandling.CONTINUE_ON_FAILURE)
} else if (varCategory == 'Category 14') {
    WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Item Upload/searchbar_category-name'), varCategory)

    WebUI.click(findTestObject('Utilities/Category/Bespoke/Category 14'), FailureHandling.CONTINUE_ON_FAILURE)
} else if (varCategory == 'Category 15') {
    WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Item Upload/searchbar_category-name'), varCategory)

    WebUI.click(findTestObject('Utilities/Category/Bespoke/Category 15'), FailureHandling.CONTINUE_ON_FAILURE)
} else if (varCategory == 'Category 16') {
    WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Item Upload/searchbar_category-name'), varCategory)

    WebUI.click(findTestObject('Utilities/Category/Bespoke/Category 16'), FailureHandling.CONTINUE_ON_FAILURE)
} else if (varCategory == 'Category 17') {
    WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Item Upload/searchbar_category-name'), varCategory)

    WebUI.click(findTestObject('Utilities/Category/Bespoke/Category 17'), FailureHandling.CONTINUE_ON_FAILURE)
} else if (varCategory == 'Category 18') {
    WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Item Upload/searchbar_category-name'), varCategory)

    WebUI.click(findTestObject('Utilities/Category/Bespoke/Category 18'), FailureHandling.CONTINUE_ON_FAILURE)
} else if (varCategory == 'Category 19') {
    WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Item Upload/searchbar_category-name'), varCategory)

    WebUI.click(findTestObject('Utilities/Category/Bespoke/Category 19'), FailureHandling.CONTINUE_ON_FAILURE)
} else if (varCategory == 'Category 20') {
    WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Item Upload/searchbar_category-name'), varCategory)

    WebUI.click(findTestObject('Utilities/Category/Bespoke/Category 20'), FailureHandling.CONTINUE_ON_FAILURE)
}

WebUI.comment('Item Name')

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Upload Page (1)/input_item-name'), varItemName + GlobalVariable.CustomMerchant)

WebUI.comment('Price')

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Upload Page (1)/textbox_item-price'), varPrice)

WebUI.comment('SKU')

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Upload Page (1)/textbox_sku-field'), varSKU)

WebUI.comment('Item Description')

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Upload Page (1)/textarea_item-description'), varItemDescription)

WebUI.comment('Image')

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Upload Page (1)/button_BROWSE'))

WebUI.delay(1)

WebUI.uploadFile(findTestObject('SPACETIME/MERCHANT/Service Creation/Images/browse_img/img_upload container'), varImage)

WebUI.click(findTestObject('SPACETIME/MERCHANT/Service Creation/Images/browse_img/button_ok'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1)

WebUI.comment('Variants & Quantity')

if (varVariants == 'yes') {
    WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Upload Page (1)/toggle_variant'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Upload Page (1)/Variants/textbox_opt1'), varVariantOption)

    WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Upload Page (1)/Variants/textbox_choices1'), varVariantChoices)
} else if (varVariants == 'no') {
    WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Upload Page (1)/textbox_item-quantity'), varQuantity)
}

WebUI.comment('Custom Fields')

WebUI.delay(1)

WebUI.callTestCase(findTestCase('MERCHANT/BESPOKE/Upload/Other Scenarios/Custom Field Input Bespoke'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Upload Page (1)/button_SAVE'))

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/MERCHANT/Your Items/button_Upload'), 0)

