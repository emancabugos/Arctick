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

WebUI.callTestCase(findTestCase('Utilities/ADMIN/Admin Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Custom Item Fields List Page/menulink_Content Mgmt.'), 0)

WebUI.click(findTestObject('ADMIN/Custom Item Fields List Page/menulink_Content Mgmt.'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Custom Item Fields List Page/submenulink_Custom Fields'), 0)

WebUI.click(findTestObject('ADMIN/Custom Item Fields List Page/submenulink_Custom Fields'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Custom Item Fields List Page/button_Add Field'), 0)

WebUI.click(findTestObject('ADMIN/Custom Item Fields List Page/button_Add Field'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Custom Item Fields Page/a_Default/dropdown_fieldtype'), 0)

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('ADMIN/Custom Item Fields Page/a_Default/dropdown_fieldtype'))

WebUI.delay(2)

WebUI.selectOptionByLabel(findTestObject('ADMIN/Custom Item Fields Page/a_Default/dropdown_fieldtype'), 'Checkbox', false)

not_run: WebUI.verifyOptionSelectedByLabel(findTestObject('ADMIN/Custom Item Fields Page/a_Default/dropdown_fieldtype'), 
    'Checkbox', false, 0)

WebUI.setText(findTestObject('ADMIN/Custom Item Fields Page/a_Default/textfield_fieldname'), 'Checkbox')

WebUI.waitForElementVisible(findTestObject('ADMIN/Custom Item Fields Page/a_Checkbox/textfield_option1'), 0)

WebUI.click(findTestObject('ADMIN/Custom Item Fields Page/a_Checkbox/button_addoption'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Custom Item Fields Page/a_Checkbox/textfield_option3'), 0)

WebUI.click(findTestObject('ADMIN/Custom Item Fields Page/a_Checkbox/button_addoption'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Custom Item Fields Page/a_Checkbox/textfield_option4'), 0)

WebUI.click(findTestObject('ADMIN/Custom Item Fields Page/a_Checkbox/button_addoption'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Custom Item Fields Page/a_Checkbox/textfield_option5'), 0)

WebUI.setText(findTestObject('ADMIN/Custom Item Fields Page/a_Checkbox/textfield_option1'), 'Checkbox 1')

WebUI.setText(findTestObject('ADMIN/Custom Item Fields Page/a_Checkbox/textfield_option2'), 'Checkbox 2')

WebUI.setText(findTestObject('ADMIN/Custom Item Fields Page/a_Checkbox/textfield_option3'), 'Checkbox 3')

WebUI.setText(findTestObject('ADMIN/Custom Item Fields Page/a_Checkbox/textfield_option4'), 'Checkbox 4')

WebUI.setText(findTestObject('ADMIN/Custom Item Fields Page/a_Checkbox/textfield_option5'), 'Checkbox 5')

WebUI.click(findTestObject('ADMIN/Custom Item Fields Page/a_Default/button_Save1'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Custom Item Fields Page/a_ToasterMessage/toaster_SuccessfullyAdded'), 
    0)

WebUI.waitForElementNotVisible(findTestObject('ADMIN/Custom Item Fields Page/a_ToasterMessage/toaster_SuccessfullyAdded'), 
    0)

WebUI.closeBrowser()
