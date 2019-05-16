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

WebUI.waitForElementVisible(findTestObject('ADMIN/Admin Users/Waiting List/a_Waiting List'), 0)

WebUI.click(findTestObject('ADMIN/Admin Users/Waiting List/a_Waiting List'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Admin Users/Waiting List/h1_Waiting List'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Admin Users/Waiting List/i_icon icon-users'), 0)

WebUI.verifyElementText(findTestObject('ADMIN/Admin Users/Waiting List/h1_Waiting List'), 'Waiting List')

WebUI.verifyElementText(findTestObject('ADMIN/Admin Users/Waiting List/a_Merchant'), 'Merchant')

WebUI.verifyElementText(findTestObject('ADMIN/Admin Users/Waiting List/a_Consumer'), 'Consumer')

WebUI.verifyElementPresent(findTestObject('ADMIN/Admin Users/Waiting List/input_filter_item'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Admin Users/Waiting List/select_AllInterestedInvited'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Admin Users/Waiting List/button_Search'), 0)

WebUI.verifyElementText(findTestObject('ADMIN/Admin Users/Waiting List/a_Clear'), 'Clear')

WebUI.verifyElementPresent(findTestObject('ADMIN/Admin Users/Waiting List/counter_waiting merchant'), 0)

WebUI.verifyElementText(findTestObject('ADMIN/Admin Users/Waiting List/div_Waiting Lists found'), 'Waiting Lists found')

WebUI.verifyElementPresent(findTestObject('ADMIN/Admin Users/Waiting List/checkbox_all'), 0)

WebUI.verifyElementText(findTestObject('ADMIN/Admin Users/Waiting List/th_Name merchant'), 'Name')

WebUI.verifyElementText(findTestObject('ADMIN/Admin Users/Waiting List/th_Email merchant'), 'Email')

WebUI.verifyElementText(findTestObject('ADMIN/Admin Users/Waiting List/th_Status merchant'), 'Status')

WebUI.verifyElementText(findTestObject('ADMIN/Admin Users/Waiting List/td_seller name'), 'Interested Seller')

WebUI.verifyElementText(findTestObject('ADMIN/Admin Users/Waiting List/td_email'), 'malikzayn9856@gmail.com')

WebUI.verifyElementText(findTestObject('ADMIN/Admin Users/Waiting List/td_status'), 'Interested')

WebUI.verifyElementPresent(findTestObject('ADMIN/Admin Users/Waiting List/a_Send Invite'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Admin Users/Waiting List/previous_page'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Admin Users/Waiting List/page_1'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Admin Users/Waiting List/next_page'), 0)

WebUI.comment('Consumer Waiting List')

WebUI.waitForElementVisible(findTestObject('ADMIN/Admin Users/Waiting List/Consumer Waiting List/a_Consumer'), 0)

WebUI.click(findTestObject('ADMIN/Admin Users/Waiting List/Consumer Waiting List/a_Consumer'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('ADMIN/Admin Users/Waiting List/Consumer Waiting List/td_name buyer'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Admin Users/Waiting List/Consumer Waiting List/div_Invite Consumer'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Admin Users/Waiting List/Consumer Waiting List/counter_consumer'), 0)

WebUI.verifyElementText(findTestObject('ADMIN/Admin Users/Waiting List/Consumer Waiting List/div_Waiting Lists found'), 
    'Waiting Lists found')

WebUI.verifyElementPresent(findTestObject('ADMIN/Admin Users/Waiting List/Consumer Waiting List/check_all'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Admin Users/Waiting List/Consumer Waiting List/th_Name consumer'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Admin Users/Waiting List/Consumer Waiting List/th_Email consumer'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Admin Users/Waiting List/Consumer Waiting List/th_Status consumer'), 0)

WebUI.verifyElementText(findTestObject('ADMIN/Admin Users/Waiting List/Consumer Waiting List/td_name buyer'), 'Interested Buyer')

WebUI.verifyElementText(findTestObject('ADMIN/Admin Users/Waiting List/Consumer Waiting List/td_email'), 'hestyles585@gmail.com')

WebUI.verifyElementText(findTestObject('ADMIN/Admin Users/Waiting List/Consumer Waiting List/td_status'), 'Interested')

WebUI.verifyElementPresent(findTestObject('ADMIN/Admin Users/Waiting List/Consumer Waiting List/a_Send Invite'), 0)

WebUI.click(findTestObject('ADMIN/Admin Permission/Admin Activity Log/a_Logout'))

WebUI.closeBrowser()

