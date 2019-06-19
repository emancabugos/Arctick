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

WebUI.waitForElementVisible(findTestObject('ADMIN/Language/Header/dropdown_language'), 0)

WebUI.delay(1)

WebUI.selectOptionByLabel(findTestObject('ADMIN/Language/Header/dropdown_language'), language, true)

WebUI.waitForElementClickable(findTestObject('ADMIN/Language/Spacetime/Admin Pages/Edit Text - Custom Fields/checkbox_NM'), 
    0)

WebUI.setText(findTestObject('ADMIN/Language/Spacetime/Admin Pages/Edit Text - Custom Fields/checkbox_NM'), checkboxNM)

WebUI.setText(findTestObject('ADMIN/Language/Spacetime/Admin Pages/Edit Text - Custom Fields/checkboxOpt1_NM'), checkboxopt1)

WebUI.setText(findTestObject('ADMIN/Language/Spacetime/Admin Pages/Edit Text - Custom Fields/checkboxOpt2_NM'), checkboxopt2)

WebUI.setText(findTestObject('ADMIN/Language/Spacetime/Admin Pages/Edit Text - Custom Fields/checkboxOpt3_NM'), checkboxopt3)

WebUI.setText(findTestObject('ADMIN/Language/Spacetime/Admin Pages/Edit Text - Custom Fields/checkboxOpt4_NM'), checkboxopt4)

WebUI.setText(findTestObject('ADMIN/Language/Spacetime/Admin Pages/Edit Text - Custom Fields/checkboxOpt5_NM'), checkboxopt5)

WebUI.setText(findTestObject('ADMIN/Language/Spacetime/Admin Pages/Edit Text - Custom Fields/checkbox_M'), checkboxM)

WebUI.setText(findTestObject('ADMIN/Language/Spacetime/Admin Pages/Edit Text - Custom Fields/checkboxOpt1_M'), checkboxopt1)

WebUI.setText(findTestObject('ADMIN/Language/Spacetime/Admin Pages/Edit Text - Custom Fields/checkboxOpt2_M'), checkboxopt2)

WebUI.setText(findTestObject('ADMIN/Language/Spacetime/Admin Pages/Edit Text - Custom Fields/checkboxOpt3_M'), checkboxopt3)

WebUI.setText(findTestObject('ADMIN/Language/Spacetime/Admin Pages/Edit Text - Custom Fields/checkboxOpt4_M'), checkboxopt4)

WebUI.setText(findTestObject('ADMIN/Language/Spacetime/Admin Pages/Edit Text - Custom Fields/checkboxOpt5_M'), checkboxopt5)

WebUI.setText(findTestObject('ADMIN/Language/Spacetime/Admin Pages/Edit Text - Custom Fields/DateTime'), datetime)

WebUI.setText(findTestObject('ADMIN/Language/Spacetime/Admin Pages/Edit Text - Custom Fields/dropdown_NM'), dropdownNM)

WebUI.setText(findTestObject('ADMIN/Language/Spacetime/Admin Pages/Edit Text - Custom Fields/dropdownOpt1_NM'), dropdownopt1)

WebUI.setText(findTestObject('ADMIN/Language/Spacetime/Admin Pages/Edit Text - Custom Fields/dropdownOpt2_NM'), dropdownopt2)

WebUI.setText(findTestObject('ADMIN/Language/Spacetime/Admin Pages/Edit Text - Custom Fields/dropdownOpt3_NM'), dropdownopt3)

WebUI.setText(findTestObject('ADMIN/Language/Spacetime/Admin Pages/Edit Text - Custom Fields/dropdownOpt4_NM'), dropdownopt4)

WebUI.setText(findTestObject('ADMIN/Language/Spacetime/Admin Pages/Edit Text - Custom Fields/dropdownOpt5_NM'), dropdownopt5)

WebUI.setText(findTestObject('ADMIN/Language/Spacetime/Admin Pages/Edit Text - Custom Fields/dropdown_M'), dropdownM)

WebUI.setText(findTestObject('ADMIN/Language/Spacetime/Admin Pages/Edit Text - Custom Fields/dropdownOpt1_M'), dropdownopt1)

WebUI.setText(findTestObject('ADMIN/Language/Spacetime/Admin Pages/Edit Text - Custom Fields/dropdownOpt2_M'), dropdownopt2)

WebUI.setText(findTestObject('ADMIN/Language/Spacetime/Admin Pages/Edit Text - Custom Fields/dropdownOpt3_M'), dropdownopt3)

WebUI.setText(findTestObject('ADMIN/Language/Spacetime/Admin Pages/Edit Text - Custom Fields/dropdownOpt4_M'), dropdownopt4)

WebUI.setText(findTestObject('ADMIN/Language/Spacetime/Admin Pages/Edit Text - Custom Fields/dropdownOpt5_M'), dropdownopt5)

WebUI.setText(findTestObject('ADMIN/Language/Spacetime/Admin Pages/Edit Text - Custom Fields/emailAddress_M'), emailAdd)

WebUI.setText(findTestObject('ADMIN/Language/Spacetime/Admin Pages/Edit Text - Custom Fields/embededVideo_M'), embededVid)

WebUI.setText(findTestObject('ADMIN/Language/Spacetime/Admin Pages/Edit Text - Custom Fields/hyperlink_M'), hyperlink)

WebUI.setText(findTestObject('ADMIN/Language/Spacetime/Admin Pages/Edit Text - Custom Fields/location_M'), location)

WebUI.setText(findTestObject('ADMIN/Language/Spacetime/Admin Pages/Edit Text - Custom Fields/locationName_textfield'), locationName)

WebUI.setText(findTestObject('ADMIN/Language/Spacetime/Admin Pages/Edit Text - Custom Fields/number_M'), number)

WebUI.setText(findTestObject('ADMIN/Language/Spacetime/Admin Pages/Edit Text - Custom Fields/filePDF_M'), pdfFile)

WebUI.setText(findTestObject('ADMIN/Language/Spacetime/Admin Pages/Edit Text - Custom Fields/percentage_M'), percentage)

WebUI.setText(findTestObject('ADMIN/Language/Spacetime/Admin Pages/Edit Text - Custom Fields/texteditor_M'), texteditor)

WebUI.setText(findTestObject('ADMIN/Language/Spacetime/Admin Pages/Edit Text - Custom Fields/textfield_M'), textfield)

WebUI.delay(2)

WebUI.click(findTestObject('ADMIN/Language/Header/button_Save'))

WebUI.delay(2)

