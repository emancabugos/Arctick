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

WebUI.waitForElementVisible(findTestObject('Utilities/Header/BESPOKE/Merchant Header v2/header_Delivery'), 0)

WebUI.click(findTestObject('Utilities/Header/BESPOKE/Merchant Header v2/header_Delivery'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/MERCHANT/Delivery Settings/Settings/icon_delivery settings'), 0)

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Delivery Settings/Settings/button_Add Delivery Option'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/MERCHANT/Delivery Settings/Add Edit Delivery Option/icon_addedit'), 
    0)

WebUI.verifyElementPresent(findTestObject('BESPOKE DEL 2/MERCHANT/Delivery Settings/Add Edit Delivery Option/textlabel_Define the locations availab'), 
    0)

WebUI.verifyElementPresent(findTestObject('BESPOKE DEL 2/MERCHANT/Delivery Settings/Add Edit Delivery Option/textlabel_Delivery option settings'), 
    0)

WebUI.verifyElementPresent(findTestObject('BESPOKE DEL 2/MERCHANT/Delivery Settings/Add Edit Delivery Option/textlabel_Delivery option name'), 
    0)

WebUI.verifyElementPresent(findTestObject('BESPOKE DEL 2/MERCHANT/Delivery Settings/Add Edit Delivery Option/textbox_delivery option name'), 
    0)

WebUI.verifyElementPresent(findTestObject('BESPOKE DEL 2/MERCHANT/Delivery Settings/Add Edit Delivery Option/textlabel_Delivers to'), 
    0)

WebUI.verifyElementPresent(findTestObject('BESPOKE DEL 2/MERCHANT/Delivery Settings/Add Edit Delivery Option/dd_coutnry'), 0)

WebUI.verifyElementPresent(findTestObject('BESPOKE DEL 2/MERCHANT/Delivery Settings/Add Edit Delivery Option/textlabel_Minimum lead time'), 
    0)

WebUI.verifyElementPresent(findTestObject('BESPOKE DEL 2/MERCHANT/Delivery Settings/Add Edit Delivery Option/textbox_minimumLeadTime'), 
    0)

WebUI.verifyElementPresent(findTestObject('BESPOKE DEL 2/MERCHANT/Delivery Settings/Add Edit Delivery Option/textlabel_Where are you delivering'), 
    0)

WebUI.verifyElementPresent(findTestObject('BESPOKE DEL 2/MERCHANT/Delivery Settings/Add Edit Delivery Option/textbox_deliveryFrom'), 
    0)

WebUI.verifyElementPresent(findTestObject('BESPOKE DEL 2/MERCHANT/Delivery Settings/Add Edit Delivery Option/textlabel_Select if you would like'), 
    0)

WebUI.verifyElementPresent(findTestObject('BESPOKE DEL 2/MERCHANT/Delivery Settings/Add Edit Delivery Option/radiobutton_Weight (kg)'), 
    0)

WebUI.verifyElementPresent(findTestObject('BESPOKE DEL 2/MERCHANT/Delivery Settings/Add Edit Delivery Option/radiobutton_Price'), 
    0)

WebUI.verifyElementPresent(findTestObject('BESPOKE DEL 2/MERCHANT/Delivery Settings/Add Edit Delivery Option/textlabel_Delivery Rate(s)'), 
    0)

WebUI.verifyElementPresent(findTestObject('BESPOKE DEL 2/MERCHANT/Delivery Settings/Add Edit Delivery Option/textlabel_Name'), 
    0)

WebUI.verifyElementPresent(findTestObject('BESPOKE DEL 2/MERCHANT/Delivery Settings/Add Edit Delivery Option/textlabel_Range (kg)'), 
    0)

WebUI.verifyElementPresent(findTestObject('BESPOKE DEL 2/MERCHANT/Delivery Settings/Add Edit Delivery Option/textlabel_Delivery Cost'), 
    0)

WebUI.verifyElementPresent(findTestObject('BESPOKE DEL 2/MERCHANT/Delivery Settings/Add Edit Delivery Option/button_Add Delivery Rate'), 
    0)

WebUI.verifyElementPresent(findTestObject('BESPOKE DEL 2/MERCHANT/Delivery Settings/Add Edit Delivery Option/button_Cancel'), 
    0)

WebUI.verifyElementPresent(findTestObject('BESPOKE DEL 2/MERCHANT/Delivery Settings/Add Edit Delivery Option/button_Save'), 0)

