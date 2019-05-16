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

WebUI.waitForElementVisible(findTestObject('ADMIN/Language Settings/a_Language'), 0)

WebUI.click(findTestObject('ADMIN/Language Settings/a_Language'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Language Settings/a_Language Settings'), 0)

WebUI.click(findTestObject('ADMIN/Language Settings/a_Language Settings'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Language Settings/i_icon icon-language'), 0)

WebUI.verifyElementText(findTestObject('ADMIN/Language Settings/h1_Language Settings'), 'Language Settings')

WebUI.selectOptionByLabel(findTestObject('ADMIN/Language Settings/select_Select New Language'), 'French', false)

WebUI.click(findTestObject('ADMIN/Language Settings/div_Add New Language'))

WebUI.selectOptionByLabel(findTestObject('ADMIN/Language Settings/select_Select New Language'), 'Spanish', false)

WebUI.click(findTestObject('ADMIN/Language Settings/div_Add New Language'))

WebUI.selectOptionByLabel(findTestObject('ADMIN/Language Settings/select_Select New Language'), 'Hindi', false)

WebUI.click(findTestObject('ADMIN/Language Settings/div_Add New Language'))

WebUI.selectOptionByLabel(findTestObject('ADMIN/Language Settings/select_Select New Language'), 'German', false)

WebUI.click(findTestObject('ADMIN/Language Settings/div_Add New Language'))

WebUI.selectOptionByLabel(findTestObject('ADMIN/Language Settings/select_Select New Language'), 'Japanese', false)

WebUI.click(findTestObject('ADMIN/Language Settings/div_Add New Language'))

WebUI.selectOptionByLabel(findTestObject('ADMIN/Language Settings/select_Select New Language'), 'Chinese (Traditional)', 
    false)

WebUI.click(findTestObject('ADMIN/Language Settings/div_Add New Language'))

WebUI.selectOptionByLabel(findTestObject('ADMIN/Language Settings/select_Select New Language'), 'Portuguese', false)

WebUI.click(findTestObject('ADMIN/Language Settings/div_Add New Language'))

WebUI.selectOptionByLabel(findTestObject('ADMIN/Language Settings/select_Select New Language'), 'Indonesian', false)

WebUI.click(findTestObject('ADMIN/Language Settings/div_Add New Language'))

WebUI.selectOptionByLabel(findTestObject('ADMIN/Language Settings/select_Select New Language'), 'Russian', false)

WebUI.click(findTestObject('ADMIN/Language Settings/div_Add New Language'))

WebUI.selectOptionByLabel(findTestObject('ADMIN/Language Settings/select_Select New Language'), 'Italian', false)

WebUI.click(findTestObject('ADMIN/Language Settings/div_Add New Language'))

WebUI.selectOptionByLabel(findTestObject('ADMIN/Language Settings/select_Select New Language'), 'Arabic', false)

WebUI.click(findTestObject('ADMIN/Language Settings/div_Add New Language'))

WebUI.selectOptionByLabel(findTestObject('ADMIN/Language Settings/select_Select New Language'), 'Dutch', false)

WebUI.click(findTestObject('ADMIN/Language Settings/div_Add New Language'))

WebUI.selectOptionByLabel(findTestObject('ADMIN/Language Settings/select_Select New Language'), 'Swedish', false)

WebUI.click(findTestObject('ADMIN/Language Settings/div_Add New Language'))

WebUI.selectOptionByLabel(findTestObject('ADMIN/Language Settings/select_Select New Language'), 'Chinese (Simplified)', 
    false)

WebUI.click(findTestObject('ADMIN/Language Settings/div_Add New Language'))

WebUI.selectOptionByLabel(findTestObject('ADMIN/Language Settings/select_Select New Language'), 'Hebrew', false)

WebUI.click(findTestObject('ADMIN/Language Settings/div_Add New Language'))

WebUI.selectOptionByLabel(findTestObject('ADMIN/Language Settings/select_Select New Language'), 'Vietnamese', false)

WebUI.click(findTestObject('ADMIN/Language Settings/div_Add New Language'))

WebUI.selectOptionByLabel(findTestObject('ADMIN/Language Settings/select_Select New Language'), 'Turkish', false)

WebUI.click(findTestObject('ADMIN/Language Settings/div_Add New Language'))

WebUI.delay(2)

WebUI.click(findTestObject('ADMIN/Language Settings/span_Save'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Language Settings/Success Toaster Message/div_SuccessNew language was su'), 
    0)

WebUI.verifyElementText(findTestObject('ADMIN/Language Settings/Success Toaster Message/div_New language was successfu'), 
    'New language was successfully saved.')

WebUI.waitForElementNotPresent(findTestObject('ADMIN/Language Settings/Success Toaster Message/div_New language was successfu'), 
    0)

WebUI.click(findTestObject('ADMIN/Admin Permission/Admin Activity Log/a_Logout'))

WebUI.closeBrowser()

