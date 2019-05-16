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

WebUI.waitForElementVisible(findTestObject('ADMIN/Admin Users/a_User Mgmt.'), 0)

WebUI.click(findTestObject('ADMIN/Admin Users/a_User Mgmt.'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Admin Users/a_Users'), 0)

WebUI.click(findTestObject('ADMIN/Admin Users/a_Users'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Admin Users/h1_Users'), 0)

WebUI.comment('Login to merchant')

WebUI.setText(findTestObject('ADMIN/Admin Users/input_filter_email_name'), GlobalVariable.CustomMerchant)

WebUI.click(findTestObject('ADMIN/Admin Users/button_Search'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Admin Users/a_Login'), 0)

WebUI.click(findTestObject('ADMIN/Admin Users/a_Login'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Admin Users/Login Popup/div_You will be brought to ano'), 0)

WebUI.verifyElementText(findTestObject('ADMIN/Admin Users/Login Popup/div_You will be brought to ano'), 'You will be brought to another page to access these features. Press okay to continue!')

WebUI.verifyElementPresent(findTestObject('ADMIN/Admin Users/Login Popup/input_login-dialog-checkbox'), 0)

WebUI.verifyElementText(findTestObject('ADMIN/Admin Users/Login Popup/span_Dont show me this again'), 'Don’t show me this again')

WebUI.verifyElementPresent(findTestObject('ADMIN/Admin Users/Login Popup/input_cancel'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Admin Users/Login Popup/input_mybtn btn-blue'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Admin Users/Login Popup/i_icon icon-close'), 0)

WebUI.comment('click cancel')

WebUI.click(findTestObject('ADMIN/Admin Users/Login Popup/input_cancel'))

WebUI.waitForElementNotVisible(findTestObject('ADMIN/Admin Users/Login Popup/input_cancel'), 0)

WebUI.comment('click x icon')

WebUI.waitForElementVisible(findTestObject('ADMIN/Admin Users/a_Login'), 0)

WebUI.click(findTestObject('ADMIN/Admin Users/a_Login'))

WebUI.click(findTestObject('ADMIN/Admin Users/Login Popup/i_icon icon-close'))

WebUI.waitForElementNotVisible(findTestObject('ADMIN/Admin Users/Login Popup/i_icon icon-close'), 0)

WebUI.comment('Login to user')

WebUI.waitForElementVisible(findTestObject('ADMIN/Admin Users/a_Login'), 0)

WebUI.click(findTestObject('ADMIN/Admin Users/a_Login'))

WebUI.click(findTestObject('ADMIN/Admin Users/Login Popup/input_mybtn btn-blue'))

WebUI.waitForElementVisible(findTestObject('MERCHANT/SpaceTime/Listing Page/textlabel_Your listings'), 0)

WebUI.click(findTestObject('MERCHANT/SpaceTime/User Menu/img_usermenu'))

WebUI.click(findTestObject('MERCHANT/SpaceTime/User Menu/a_Logout'))

