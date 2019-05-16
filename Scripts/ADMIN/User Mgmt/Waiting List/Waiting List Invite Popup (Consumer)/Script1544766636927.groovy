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

WebUI.click(findTestObject('ADMIN/Admin Users/Waiting List/a_Consumer'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Admin Users/Waiting List/Consumer Waiting List/div_Invite Consumer'), 
    0)

WebUI.click(findTestObject('ADMIN/Admin Users/Waiting List/Consumer Waiting List/div_Invite Consumer'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Admin Users/Waiting List/Consumer Waiting List/Invite Popup/div_Invite your Consumer to on'), 
    0)

WebUI.verifyElementText(findTestObject('ADMIN/Admin Users/Waiting List/Consumer Waiting List/Invite Popup/div_Invite your Consumer to on'), 
    'Invite your Consumer to onboard on your marketplace')

WebUI.verifyElementPresent(findTestObject('ADMIN/Admin Users/Waiting List/Consumer Waiting List/Invite Popup/div_popoup-seller-img'), 
    0)

WebUI.verifyElementText(findTestObject('ADMIN/Admin Users/Waiting List/p_Enter your recipient emails'), 'Enter your recipient emails below')

WebUI.verifyElementText(findTestObject('ADMIN/Admin Users/Waiting List/Consumer Waiting List/Invite Popup/p_(Use commas separate multipl'), 
    '(Use commas separate multiple recipients).')

WebUI.verifyElementPresent(findTestObject('ADMIN/Admin Users/Waiting List/Consumer Waiting List/Invite Popup/textarea'), 
    0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Admin Users/Waiting List/Consumer Waiting List/Invite Popup/input_mybtn btn-blue'), 
    0)

WebUI.comment('Click Close invite pop up')

WebUI.click(findTestObject('ADMIN/Admin Users/Waiting List/Consumer Waiting List/Invite Popup/button_close'))

WebUI.waitForElementNotVisible(findTestObject('ADMIN/Admin Users/Waiting List/Consumer Waiting List/Invite Popup/div_Invite your Consumer to on'), 
    0)

WebUI.comment('Invite Consumer Invalid Email')

WebUI.click(findTestObject('ADMIN/Admin Users/Waiting List/Consumer Waiting List/div_Invite Consumer'))

WebUI.setText(findTestObject('ADMIN/Admin Users/Waiting List/Consumer Waiting List/Invite Popup/textarea'), '.abcdefgh@gmail.com')

WebUI.click(findTestObject('ADMIN/Admin Users/Waiting List/Consumer Waiting List/Invite Popup/input_mybtn btn-blue'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Admin Users/Waiting List/Error Toaster Message/div_Oops Something went wrong.'), 
    0)

WebUI.verifyElementText(findTestObject('ADMIN/Admin Users/Waiting List/Error Toaster Message/div_One of the emails you ente'), 
    'One of the emails you entered is invalid.')

WebUI.waitForElementNotPresent(findTestObject('ADMIN/Admin Users/Waiting List/Error Toaster Message/div_One of the emails you ente'), 
    0)

WebUI.setText(findTestObject('ADMIN/Admin Users/Waiting List/textarea'), 'abcd..efgh@gmail.com')

WebUI.click(findTestObject('ADMIN/Admin Users/Waiting List/input_mybtn btn-blue'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Admin Users/Waiting List/Error Toaster Message/div_Oops Something went wrong.'), 
    0)

WebUI.verifyElementText(findTestObject('ADMIN/Admin Users/Waiting List/Error Toaster Message/div_One of the emails you ente'), 
    'One of the emails you entered is invalid.')

WebUI.waitForElementNotPresent(findTestObject('ADMIN/Admin Users/Waiting List/Error Toaster Message/div_One of the emails you ente'), 
    0)

WebUI.setText(findTestObject('ADMIN/Admin Users/Waiting List/textarea'), 'jsmith@192.168.2.1')

WebUI.click(findTestObject('ADMIN/Admin Users/Waiting List/input_mybtn btn-blue'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Admin Users/Waiting List/Error Toaster Message/div_Oops Something went wrong.'), 
    0)

WebUI.verifyElementText(findTestObject('ADMIN/Admin Users/Waiting List/Error Toaster Message/div_One of the emails you ente'), 
    'One of the emails you entered is invalid.')

WebUI.waitForElementNotPresent(findTestObject('ADMIN/Admin Users/Waiting List/Error Toaster Message/div_One of the emails you ente'), 
    0)

WebUI.setText(findTestObject('ADMIN/Admin Users/Waiting List/textarea'), 'jsmith@IPv6:2001:db8::1')

WebUI.click(findTestObject('ADMIN/Admin Users/Waiting List/input_mybtn btn-blue'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Admin Users/Waiting List/Error Toaster Message/div_Oops Something went wrong.'), 
    0)

WebUI.verifyElementText(findTestObject('ADMIN/Admin Users/Waiting List/Error Toaster Message/div_One of the emails you ente'), 
    'One of the emails you entered is invalid.')

WebUI.waitForElementNotPresent(findTestObject('ADMIN/Admin Users/Waiting List/Error Toaster Message/div_One of the emails you ente'), 
    0)

WebUI.setText(findTestObject('ADMIN/Admin Users/Waiting List/textarea'), '一个@阿育王. 巴拉特')

WebUI.click(findTestObject('ADMIN/Admin Users/Waiting List/input_mybtn btn-blue'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Admin Users/Waiting List/Error Toaster Message/div_Oops Something went wrong.'), 
    0)

WebUI.verifyElementText(findTestObject('ADMIN/Admin Users/Waiting List/Error Toaster Message/div_One of the emails you ente'), 
    'One of the emails you entered is invalid.')

WebUI.waitForElementNotPresent(findTestObject('ADMIN/Admin Users/Waiting List/Error Toaster Message/div_One of the emails you ente'), 
    0)

WebUI.click(findTestObject('ADMIN/Admin Users/Waiting List/close_button'))

WebUI.comment('Invite Valid Email')

WebUI.click(findTestObject('ADMIN/Admin Users/Waiting List/div_Invite Merchants'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Admin Users/Waiting List/div_Invite your Merchant to on'), 0)

WebUI.setText(findTestObject('ADMIN/Admin Users/Waiting List/textarea'), 'arcadierteam1@gmail.com')

WebUI.click(findTestObject('ADMIN/Admin Users/Waiting List/input_mybtn btn-blue'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Admin Users/Waiting List/Success Toaster Message/div_SuccessInvites have been s'), 
    0)

WebUI.verifyElementText(findTestObject('ADMIN/Admin Users/Waiting List/Success Toaster Message/div_Invites have been successf'), 
    'Invites have been successfully sent.')

WebUI.waitForElementNotPresent(findTestObject('ADMIN/Admin Users/Waiting List/Success Toaster Message/div_Invites have been successf'), 
    0)

WebUI.comment('Invite Valid Multiple Email')

WebUI.click(findTestObject('ADMIN/Admin Users/Waiting List/div_Invite Merchants'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Admin Users/Waiting List/div_Invite your Merchant to on'), 0)

WebUI.setText(findTestObject('ADMIN/Admin Users/Waiting List/textarea'), 'arcadierteam1@gmail.com,arcadierteam2@gmail.com,arcadier.tester1@gmail.com')

WebUI.click(findTestObject('ADMIN/Admin Users/Waiting List/input_mybtn btn-blue'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Admin Users/Waiting List/Success Toaster Message/div_SuccessInvites have been s'), 
    0)

WebUI.verifyElementText(findTestObject('ADMIN/Admin Users/Waiting List/Success Toaster Message/div_Invites have been successf'), 
    'Invites have been successfully sent.')

WebUI.waitForElementNotPresent(findTestObject('ADMIN/Admin Users/Waiting List/Success Toaster Message/div_Invites have been successf'), 
    0)

