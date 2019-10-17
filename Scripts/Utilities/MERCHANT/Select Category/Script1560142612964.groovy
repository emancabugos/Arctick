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

if (varCategory == 'Category 1') {
    WebUI.click(findTestObject('SPACETIME/MERCHANT/Service Creation/Category List/checkbox_cat1'))
} else if (varCategory == 'Category 2') {
    WebUI.click(findTestObject('SPACETIME/MERCHANT/Service Creation/Category List/checkbox_cat2'), 0)
} else if (varCategory == 'Category 3') {
    WebUI.click(findTestObject('SPACETIME/MERCHANT/Service Creation/Category List/checkbox_cat3'), 0)
} else if (varCategory == 'Category 4') {
    WebUI.click(findTestObject('SPACETIME/MERCHANT/Service Creation/Category List/checkbox_cat4'), 0)
} else if (varCategory == 'Category 5') {
    WebUI.click(findTestObject('SPACETIME/MERCHANT/Service Creation/Category List/checkbox_cat5'), 0)
} else if (varCategory == 'Category 6') {
    WebUI.click(findTestObject('SPACETIME/MERCHANT/Service Creation/Category List/checkbox_cat6'), 0)
} else if (varCategory == 'Category 7') {
    WebUI.click(findTestObject('SPACETIME/MERCHANT/Service Creation/Category List/checkbox_cat7'), 0)
} else if (varCategory == 'Category 8') {
    WebUI.click(findTestObject('SPACETIME/MERCHANT/Service Creation/Category List/checkbox_cat8'), 0)
} else if (varCategory == 'Category 9') {
    WebUI.click(findTestObject('SPACETIME/MERCHANT/Service Creation/Category List/checkbox_cat9'), 0)
} else if (varCategory == 'Category 10') {
    WebUI.click(findTestObject('SPACETIME/MERCHANT/Service Creation/Category List/checkbox_cat10'), 0)
} else if (varCategory == 'Category 11') {
    WebUI.click(findTestObject('SPACETIME/MERCHANT/Service Creation/Category List/checkbox_cat11'), 0)
} else if (varCategory == 'Category 12') {
    WebUI.click(findTestObject('SPACETIME/MERCHANT/Service Creation/Category List/checkbox_cat12'), 0)
} else if (varCategory == 'Category 13') {
    WebUI.click(findTestObject('SPACETIME/MERCHANT/Service Creation/Category List/checkbox_cat13'), 0)
} else if (varCategory == 'Category 14') {
    WebUI.click(findTestObject('SPACETIME/MERCHANT/Service Creation/Category List/checkbox_cat14'), 0)
} else if (varCategory == 'Category 15') {
    WebUI.click(findTestObject('SPACETIME/MERCHANT/Service Creation/Category List/checkbox_cat15'), 0)
} else if (varCategory == 'Category 16') {
    WebUI.click(findTestObject('SPACETIME/MERCHANT/Service Creation/Category List/checkbox_cat16'), 0)
} else if (varCategory == 'Category 17') {
    WebUI.click(findTestObject('SPACETIME/MERCHANT/Service Creation/Category List/checkbox_cat17'), 0)
} else if (varCategory == 'Category 18') {
    WebUI.click(findTestObject('SPACETIME/MERCHANT/Service Creation/Category List/checkbox_cat18'), 0)
} else if (varCategory == 'Category 19') {
    WebUI.waitForElementVisible(findTestObject('SPACETIME/MERCHANT/Service Creation/Category List/checkbox_cat19'), 0)

    WebUI.click(findTestObject('SPACETIME/MERCHANT/Service Creation/Category List/checkbox_cat19'), 0)
} else if (varCategory == 'Category 20') {
    WebUI.click(findTestObject('SPACETIME/MERCHANT/Service Creation/Category List/checkbox_cat20'), 0)
}

