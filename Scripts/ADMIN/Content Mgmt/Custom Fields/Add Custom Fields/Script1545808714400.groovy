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

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.AdminURL)

WebUI.maximizeWindow()

WebUI.waitForElementVisible(findTestObject('ADMIN/Admin Login/Admin Login/txtbox_username'), 0)

if (GlobalVariable.AdminAccount == 'custom') {
    WebUI.setText(findTestObject('ADMIN/Admin Login/Admin Login/txtbox_username'), GlobalVariable.AdminCustom)

    WebUI.setText(findTestObject('ADMIN/Admin Login/Admin Login/txtbox_password'), GlobalVariable.CustomPass)

    WebUI.waitForElementVisible(findTestObject('ADMIN/Admin Login/Admin Login/txtbox_username'), 0)

    WebUI.click(findTestObject('ADMIN/Admin Login/Admin Login/btn_signin'))
} else if (GlobalVariable.AdminAccount == 'google') {
    WebUI.click(findTestObject('ADMIN/Admin Login/Admin Login/a_Login with Google'))

    WebUI.setText(findTestObject('ADMIN/Admin Login/Admin Login/Google Login/input_identifier'), GlobalVariable.AdminGoogle)

    WebUI.click(findTestObject('ADMIN/Admin Login/Admin Login/Google Login/span_Susunod'))

    WebUI.delay(1)

    WebUI.setText(findTestObject('ADMIN/Admin Login/Admin Login/Google Login/input_password'), GlobalVariable.GooglePass)

    WebUI.delay(1)

    WebUI.click(findTestObject('ADMIN/Admin Login/Admin Login/Google Login/span_Susunod'))
} else if (GlobalVariable.AdminAccount == 'facebook') {
    WebUI.click(findTestObject('ADMIN/Admin Login/Admin Login/a_Login with Facebook'))

    WebUI.setText(findTestObject('ADMIN/Admin Login/Admin Login/Facebook Login/input_email'), GlobalVariable.AdminFacebook)

    WebUI.setText(findTestObject('ADMIN/Admin Login/Admin Login/Facebook Login/input_pass'), GlobalVariable.FacebookPass)

    WebUI.click(findTestObject('ADMIN/Admin Login/Admin Login/Facebook Login/button_Log In'))
}

WebUI.waitForElementVisible(findTestObject('ADMIN/Custom Field/a_Content Mgmt.'), 0)

WebUI.click(findTestObject('ADMIN/Custom Field/a_Content Mgmt.'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Custom Field/a_Custom Fields'), 0)

WebUI.click(findTestObject('ADMIN/Custom Field/a_Custom Fields'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Custom Field/image1'), 0)

WebUI.verifyElementText(findTestObject('ADMIN/Custom Field/h1_Custom Item Fields'), 'Custom Item Fields')

WebUI.comment('Text Field')

WebUI.click(findTestObject('ADMIN/Custom Field/a_Add Field'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Custom Field/Add Field/input_contact-no'), 0)

WebUI.setText(findTestObject('ADMIN/Custom Field/Add Field/input_contact-no'), 'Text Field')

WebUI.selectOptionByLabel(findTestObject('ADMIN/Custom Field/Add Field/select_Select a type of field'), 'Text Field', false)

WebUI.click(findTestObject('ADMIN/Custom Field/Add Field/input_mybtn btn-blue savecusto'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Custom Field/i_icon icon-custom-list icon-3'), 0)

WebUI.comment('Hyperlink')

WebUI.click(findTestObject('ADMIN/Custom Field/a_Add Field'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Custom Field/Add Field/input_contact-no'), 0)

WebUI.setText(findTestObject('ADMIN/Custom Field/Add Field/input_contact-no'), 'Hyperlink')

WebUI.selectOptionByLabel(findTestObject('ADMIN/Custom Field/Add Field/select_Select a type of field'), 'Hyperlink / URL', 
    false)

WebUI.click(findTestObject('ADMIN/Custom Field/Add Field/input_mybtn btn-blue savecusto'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Custom Field/i_icon icon-custom-list icon-3'), 0)

WebUI.comment('Email')

WebUI.click(findTestObject('ADMIN/Custom Field/a_Add Field'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Custom Field/Add Field/input_contact-no'), 0)

WebUI.setText(findTestObject('ADMIN/Custom Field/Add Field/input_contact-no'), 'Email')

WebUI.selectOptionByLabel(findTestObject('ADMIN/Custom Field/Add Field/select_Select a type of field'), 'Email', false)

WebUI.click(findTestObject('ADMIN/Custom Field/Add Field/input_mybtn btn-blue savecusto'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Custom Field/i_icon icon-custom-list icon-3'), 0)

WebUI.comment('Percentage')

WebUI.click(findTestObject('ADMIN/Custom Field/a_Add Field'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Custom Field/Add Field/input_contact-no'), 0)

WebUI.setText(findTestObject('ADMIN/Custom Field/Add Field/input_contact-no'), 'Percentage')

WebUI.selectOptionByLabel(findTestObject('ADMIN/Custom Field/Add Field/select_Select a type of field'), 'Percentage', false)

WebUI.click(findTestObject('ADMIN/Custom Field/Add Field/input_mybtn btn-blue savecusto'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Custom Field/i_icon icon-custom-list icon-3'), 0)

WebUI.comment('Number')

WebUI.click(findTestObject('ADMIN/Custom Field/a_Add Field'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Custom Field/Add Field/input_contact-no'), 0)

WebUI.setText(findTestObject('ADMIN/Custom Field/Add Field/input_contact-no'), 'Number')

WebUI.selectOptionByLabel(findTestObject('ADMIN/Custom Field/Add Field/select_Select a type of field'), 'Number', false)

WebUI.waitForElementVisible(findTestObject('ADMIN/Custom Field/Number Field/input_minNumber'), 0)

WebUI.setText(findTestObject('ADMIN/Custom Field/Number Field/input_minNumber'), '10')

WebUI.setText(findTestObject('ADMIN/Custom Field/Number Field/input_maxNumber'), '100')

WebUI.click(findTestObject('ADMIN/Custom Field/Add Field/input_mybtn btn-blue savecusto'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Custom Field/i_icon icon-custom-list icon-3'), 0)

WebUI.comment('Number')

WebUI.click(findTestObject('ADMIN/Custom Field/a_Add Field'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Custom Field/Add Field/input_contact-no'), 0)

WebUI.setText(findTestObject('ADMIN/Custom Field/Add Field/input_contact-no'), 'Number')

WebUI.selectOptionByLabel(findTestObject('ADMIN/Custom Field/Add Field/select_Select a type of field'), 'Number', false)

WebUI.waitForElementVisible(findTestObject('ADMIN/Custom Field/Number Field/input_minNumber'), 0)

WebUI.setText(findTestObject('ADMIN/Custom Field/Number Field/input_minNumber'), '10')

WebUI.setText(findTestObject('ADMIN/Custom Field/Number Field/input_maxNumber'), '100')

WebUI.click(findTestObject('ADMIN/Custom Field/Add Field/input_mybtn btn-blue savecusto'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Custom Field/i_icon icon-custom-list icon-3'), 0)

WebUI.comment('Checkbox')

WebUI.click(findTestObject('ADMIN/Custom Field/a_Add Field'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Custom Field/Add Field/input_contact-no'), 0)

WebUI.setText(findTestObject('ADMIN/Custom Field/Add Field/input_contact-no'), 'Checkbox')

WebUI.selectOptionByLabel(findTestObject('ADMIN/Custom Field/Add Field/select_Select a type of field'), 'Checkbox', false)

WebUI.waitForElementVisible(findTestObject('ADMIN/Custom Field/Checkbox/input_checkbox-opt1'), 0)

WebUI.setText(findTestObject('ADMIN/Custom Field/Checkbox/input_checkbox-opt1'), 'Checkbox 1')

WebUI.setText(findTestObject('ADMIN/Custom Field/Checkbox/input_checkbox-opt2'), 'checkbox_selection_number_two')

WebUI.click(findTestObject('ADMIN/Custom Field/Checkbox/i_icon icon-addopt'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('ADMIN/Custom Field/Checkbox/i_icon icon-addopt'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('ADMIN/Custom Field/Checkbox/i_icon icon-addopt'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('ADMIN/Custom Field/Checkbox/input_checkbox-opt3'), 'checkbox_selection_number_three')

WebUI.setText(findTestObject('ADMIN/Custom Field/Checkbox/input_checkbox-opt4'), 'checkbox_selection_number_four')

WebUI.setText(findTestObject('ADMIN/Custom Field/Checkbox/input_checkbox-opt5'), 'checkbox_selection_number_five')

WebUI.click(findTestObject('ADMIN/Custom Field/Add Field/input_mybtn btn-blue savecusto'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Custom Field/i_icon icon-custom-list icon-3'), 0)

WebUI.comment('Dropdown')

WebUI.click(findTestObject('ADMIN/Custom Field/a_Add Field'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Custom Field/Add Field/input_contact-no'), 0)

WebUI.setText(findTestObject('ADMIN/Custom Field/Add Field/input_contact-no'), 'Drop Down')

WebUI.selectOptionByLabel(findTestObject('ADMIN/Custom Field/Add Field/select_Select a type of field'), 'Drop Down', false)

WebUI.waitForElementVisible(findTestObject('ADMIN/Custom Field/Dropdown/input_dropdown-opt1'), 0)

WebUI.setText(findTestObject('ADMIN/Custom Field/Dropdown/input_dropdown-opt1'), 'Drop Down 1')

WebUI.setText(findTestObject('ADMIN/Custom Field/Dropdown/input_dropdown-opt2'), 'dropdown_selection_number_two')

WebUI.click(findTestObject('ADMIN/Custom Field/Dropdown/i_icon icon-addopt'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('ADMIN/Custom Field/Dropdown/i_icon icon-addopt'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('ADMIN/Custom Field/Dropdown/i_icon icon-addopt'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('ADMIN/Custom Field/Dropdown/input_dropdown-opt3'), 'dropdown_selection_number_three')

WebUI.setText(findTestObject('ADMIN/Custom Field/Dropdown/input_dropdown-opt4'), 'dropdown_selection_number_four')

WebUI.setText(findTestObject('ADMIN/Custom Field/Dropdown/input_dropdown-opt5'), 'dropdown_selection_number_five')

WebUI.click(findTestObject('ADMIN/Custom Field/Add Field/input_mybtn btn-blue savecusto'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Custom Field/i_icon icon-custom-list icon-3'), 0)

WebUI.comment('Location')

WebUI.click(findTestObject('ADMIN/Custom Field/a_Add Field'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Custom Field/Add Field/input_contact-no'), 0)

WebUI.setText(findTestObject('ADMIN/Custom Field/Add Field/input_contact-no'), 'Location')

WebUI.selectOptionByLabel(findTestObject('ADMIN/Custom Field/Add Field/select_Select a type of field'), 'Location', false)

WebUI.click(findTestObject('ADMIN/Custom Field/Add Field/input_mybtn btn-blue savecusto'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Custom Field/i_icon icon-custom-list icon-3'), 0)

WebUI.comment('Date Time picker')

WebUI.click(findTestObject('ADMIN/Custom Field/a_Add Field'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Custom Field/Add Field/input_contact-no'), 0)

WebUI.setText(findTestObject('ADMIN/Custom Field/Add Field/input_contact-no'), 'Date Tim Picker')

WebUI.selectOptionByLabel(findTestObject('ADMIN/Custom Field/Add Field/select_Select a type of field'), 'Date / Time picker', 
    false)

WebUI.click(findTestObject('ADMIN/Custom Field/Add Field/input_mybtn btn-blue savecusto'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Custom Field/i_icon icon-custom-list icon-3'), 0)

WebUI.comment('PDF File')

WebUI.click(findTestObject('ADMIN/Custom Field/a_Add Field'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Custom Field/Add Field/input_contact-no'), 0)

WebUI.setText(findTestObject('ADMIN/Custom Field/Add Field/input_contact-no'), 'PDF File')

WebUI.selectOptionByLabel(findTestObject('ADMIN/Custom Field/Add Field/select_Select a type of field'), 'PDF File', false)

WebUI.click(findTestObject('ADMIN/Custom Field/Add Field/input_mybtn btn-blue savecusto'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Custom Field/i_icon icon-custom-list icon-3'), 0)

WebUI.comment('Embed Video')

WebUI.click(findTestObject('ADMIN/Custom Field/a_Add Field'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Custom Field/Add Field/input_contact-no'), 0)

WebUI.setText(findTestObject('ADMIN/Custom Field/Add Field/input_contact-no'), 'Embed Video')

WebUI.selectOptionByLabel(findTestObject('ADMIN/Custom Field/Add Field/select_Select a type of field'), 'Embed Video', false)

WebUI.click(findTestObject('ADMIN/Custom Field/Add Field/input_mybtn btn-blue savecusto'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Custom Field/i_icon icon-custom-list icon-3'), 0)

WebUI.comment('PDF File 2')

WebUI.click(findTestObject('ADMIN/Custom Field/a_Add Field'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Custom Field/Add Field/input_contact-no'), 0)

WebUI.setText(findTestObject('ADMIN/Custom Field/Add Field/input_contact-no'), 'PDF File 2')

WebUI.selectOptionByLabel(findTestObject('ADMIN/Custom Field/Add Field/select_Select a type of field'), 'PDF File 2', false)

WebUI.click(findTestObject('ADMIN/Custom Field/Add Field/input_mybtn btn-blue savecusto'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Custom Field/i_icon icon-custom-list icon-3'), 0)

WebUI.comment('Embed Video 2')

WebUI.click(findTestObject('ADMIN/Custom Field/a_Add Field'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Custom Field/Add Field/input_contact-no'), 0)

WebUI.setText(findTestObject('ADMIN/Custom Field/Add Field/input_contact-no'), 'Embed Video 2')

WebUI.selectOptionByLabel(findTestObject('ADMIN/Custom Field/Add Field/select_Select a type of field'), 'Embed Video 2', 
    false)

WebUI.click(findTestObject('ADMIN/Custom Field/Add Field/input_mybtn btn-blue savecusto'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Custom Field/i_icon icon-custom-list icon-3'), 0)

WebUI.click(findTestObject('ADMIN/Admin Permission/Admin Activity Log/a_Logout'))

WebUI.closeBrowser()

