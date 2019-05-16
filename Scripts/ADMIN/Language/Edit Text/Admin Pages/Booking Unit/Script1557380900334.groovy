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

WebUI.callTestCase(findTestCase('Utilities/ADMIN/Admin Login'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Language/sidemenu_Language'), 0)

WebUI.click(findTestObject('ADMIN/Language/sidemenu_Language'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Language/sidemenu_Edit Text'), 0)

WebUI.click(findTestObject('ADMIN/Language/sidemenu_Edit Text'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Language/textlabel_Admin Pages'), 0)

WebUI.click(findTestObject('ADMIN/Language/icon_admin'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Language/Spacetime/Admin Pages/span_Booking Unit'), 0)

WebUI.click(findTestObject('ADMIN/Language/Spacetime/Admin Pages/span_Booking Unit'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Language Dropdown')

WebUI.waitForElementVisible(findTestObject('ADMIN/Language/Spacetime/Admin Pages/Booking Unit/dropdown_English'), 0)

WebUI.selectOptionByLabel(findTestObject('ADMIN/Language/Spacetime/Admin Pages/Booking Unit/dropdown_English'), 'French', 
    false)

WebUI.comment('Edit Text')

WebUI.setText(findTestObject('ADMIN/Language/Spacetime/Admin Pages/Booking Unit/textbox_Default Overnight(SE)'), 'Default Overnight*')

WebUI.setText(findTestObject('ADMIN/Language/Spacetime/Admin Pages/Booking Unit/textbox_Default Overnight(s)'), 'Default Overnight(s)*')

WebUI.setText(findTestObject('ADMIN/Language/Spacetime/Admin Pages/Booking Unit/textbox_Default'), 'Default*')

WebUI.setText(findTestObject('ADMIN/Language/Spacetime/Admin Pages/Booking Unit/textlabel_Default(s)'), 'Default(s)*')

WebUI.click(findTestObject('ADMIN/Language/Spacetime/Admin Pages/Booking Unit/btn_save'), FailureHandling.CONTINUE_ON_FAILURE)

