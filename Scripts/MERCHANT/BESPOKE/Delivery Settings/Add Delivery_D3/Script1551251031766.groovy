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

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Delivery Settings/Add Edit Delivery Option/textbox_delivery option name'), 
    'Delivery 3')

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Delivery Settings/Add Edit Delivery Option/dd_coutnry'))

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/MERCHANT/Delivery Settings/Add Edit Delivery Option/Add Delivery Rate/text_Select all'), 
    0)

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Delivery Settings/Add Edit Delivery Option/Add Delivery Rate/text_Select all'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Delivery Settings/Add Edit Delivery Option/textbox_minimumLeadTime'), '1 - 7 days')

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Delivery Settings/Add Edit Delivery Option/textbox_deliveryFrom'), 'Philippines')

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Delivery Settings/Add Edit Delivery Option/button_Add Delivery Rate'))

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/MERCHANT/Delivery Settings/Add Edit Delivery Option/Add Delivery Rate/textlabel_Delivery Rate Name (Buye'), 
    0)

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Delivery Settings/Add Edit Delivery Option/Add Delivery Rate/textbox_rate_name'), 
    'Rate 1')

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Delivery Settings/Add Edit Delivery Option/Add Delivery Rate/textbox_range_start'), 
    '1')

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Delivery Settings/Add Edit Delivery Option/Add Delivery Rate/textbox_range_end'), 
    '4')

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Delivery Settings/Add Edit Delivery Option/Add Delivery Rate/textbox_rate_cost'), 
    '1.00')

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Delivery Settings/Add Edit Delivery Option/Add Delivery Rate/button_Save rate'))

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Delivery Settings/Add Edit Delivery Option/button_Add Delivery Rate'))

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/MERCHANT/Delivery Settings/Add Edit Delivery Option/Add Delivery Rate/textlabel_Delivery Rate Name (Buye'), 
    0)

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Delivery Settings/Add Edit Delivery Option/Add Delivery Rate/textbox_rate_name'), 
    'Rate 2')

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Delivery Settings/Add Edit Delivery Option/Add Delivery Rate/textbox_range_start'), 
    '5')

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Delivery Settings/Add Edit Delivery Option/Add Delivery Rate/textbox_range_end'), 
    '9')

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Delivery Settings/Add Edit Delivery Option/Add Delivery Rate/textbox_rate_cost'), 
    '1.50')

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Delivery Settings/Add Edit Delivery Option/Add Delivery Rate/button_Save rate'))

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Delivery Settings/Add Edit Delivery Option/button_Add Delivery Rate'))

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/MERCHANT/Delivery Settings/Add Edit Delivery Option/Add Delivery Rate/textlabel_Delivery Rate Name (Buye'), 
    0)

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Delivery Settings/Add Edit Delivery Option/Add Delivery Rate/textbox_rate_name'), 
    'Rate 3')

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Delivery Settings/Add Edit Delivery Option/Add Delivery Rate/textbox_range_start'), 
    '10')

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Delivery Settings/Add Edit Delivery Option/Add Delivery Rate/textbox_range_end'), 
    '15')

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Delivery Settings/Add Edit Delivery Option/Add Delivery Rate/textbox_rate_cost'), 
    '2.00')

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Delivery Settings/Add Edit Delivery Option/Add Delivery Rate/button_Save rate'))

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Delivery Settings/Add Edit Delivery Option/button_Add Delivery Rate'))

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/MERCHANT/Delivery Settings/Add Edit Delivery Option/Add Delivery Rate/textlabel_Delivery Rate Name (Buye'), 
    0)

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Delivery Settings/Add Edit Delivery Option/Add Delivery Rate/textbox_rate_name'), 
    'Rate 4')

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Delivery Settings/Add Edit Delivery Option/Add Delivery Rate/radiobutton_Onwards'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Delivery Settings/Add Edit Delivery Option/Add Delivery Rate/textbox_range onwards'), 
    '16')

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Delivery Settings/Add Edit Delivery Option/Add Delivery Rate/textbox_rate_cost'), 
    '2.50')

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Delivery Settings/Add Edit Delivery Option/Add Delivery Rate/button_Save rate'))

WebUI.delay(1)

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Delivery Settings/Add Edit Delivery Option/button_Save'))

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/MERCHANT/Delivery Settings/Settings/button_Add Delivery Option'), 0)

