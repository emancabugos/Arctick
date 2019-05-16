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

WebUI.navigateToUrl(GlobalVariable.dashboardurl)

WebUI.maximizeWindow()

WebUI.waitForElementVisible(findTestObject('Dashboard/Dashboard - Login Page/logo_Arcadier'), 0)

WebUI.verifyElementPresent(findTestObject('Dashboard/Dashboard - Login Page/logo_Arcadier'), 0)

WebUI.setText(findTestObject('Dashboard/Dashboard - Login Page/textfield_Email'), GlobalVariable.dashboardusername)

WebUI.setText(findTestObject('Dashboard/Dashboard - Login Page/textfield_Password'), GlobalVariable.dashboardpassword)

WebUI.click(findTestObject('Dashboard/Dashboard - Login Page/button_Login'))

WebUI.waitForElementVisible(findTestObject('Dashboard/Dashboard - CS Support Page/link_Announcement'), 0)

WebUI.click(findTestObject('Dashboard/Dashboard - CS Support Page/link_Notice'))

WebUI.waitForElementVisible(findTestObject('Dashboard/Dashboard - Notice Page/button_Add New'), 0)

WebUI.click(findTestObject('Dashboard/Dashboard - Notice Page/button_Add New'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Dashboard/Dashboard - Notice Page/popup_textfield_Title'), 0)

WebUI.setText(findTestObject('Dashboard/Dashboard - Notice Page/popup_textfield_Title'), 'Test News')

WebUI.setText(findTestObject('Dashboard/Dashboard - Notice Page/popup_textfield_Hyperlink'), 'https:/www.google.com')

WebUI.click(findTestObject('Dashboard/Dashboard - Notice Page/popup_dropdown_Notice'))

WebUI.click(findTestObject('Dashboard/Dashboard - Notice Page/link_Event'))

WebUI.click(findTestObject('Dashboard/Dashboard - Notice Page/popup_button_Upload'))

WebUI.delay(3)

WebUI.navigateToUrl(GlobalVariable.url)

if (GlobalVariable.admincredential == 'custom') {
    WebUI.setText(findTestObject('ADMIN/Login Page/textfield_username'), GlobalVariable.customusername_admin)

    WebUI.setText(findTestObject('ADMIN/Login Page/textfield_password'), GlobalVariable.custompassword_admin)

    WebUI.click(findTestObject('ADMIN/Login Page/button_login-submit'))
} else if (GlobalVariable.admincredential == 'google') {
    WebUI.click(findTestObject('ADMIN/Admin Onboarding Page/Create_Account_Page/Button_Signup_Google'))

    WebUI.setText(findTestObject('ADMIN/Admin Onboarding Page/Create_Account_Page/Google_Username'), GlobalVariable.googleusername_admin)

    WebUI.click(findTestObject('ADMIN/Admin Onboarding Page/Create_Account_Page/Button_Google_Next'))

    WebUI.delay(1)

    WebUI.setText(findTestObject('ADMIN/Admin Onboarding Page/Create_Account_Page/Google_Password'), GlobalVariable.googlepassword_admin)

    WebUI.delay(1)

    WebUI.click(findTestObject('ADMIN/Admin Onboarding Page/Create_Account_Page/Button_Google_Next'))
} else if (GlobalVariable.admincredential == 'facebook') {
    WebUI.click(findTestObject('ADMIN/Admin Onboarding Page/Create_Account_Page/Button_Signup_Facebook'))

    WebUI.setText(findTestObject('ADMIN/Admin Onboarding Page/Create_Account_Page/Facebook_Email'), GlobalVariable.fbusername_admin)

    WebUI.setText(findTestObject('ADMIN/Admin Onboarding Page/Create_Account_Page/Facebook_Password'), GlobalVariable.fbpassword_admin)

    WebUI.click(findTestObject('ADMIN/Admin Onboarding Page/Create_Account_Page/Button_Login_Facebook'))
}

WebUI.waitForElementVisible(findTestObject('Dashboard/Dashboard - Notice Page/notice_EVENT'), 0)

WebUI.verifyElementPresent(findTestObject('Dashboard/Dashboard - Notice Page/notice_EVENT'), 0)

WebUI.click(findTestObject('Time/Admin/Admin Menu/Logout_Link'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Login Page/textfield_username'), 0)

WebUI.navigateToUrl(GlobalVariable.dashboardurl)

WebUI.maximizeWindow()

WebUI.waitForElementVisible(findTestObject('Dashboard/Dashboard - Login Page/logo_Arcadier'), 0)

WebUI.verifyElementPresent(findTestObject('Dashboard/Dashboard - Login Page/logo_Arcadier'), 0)

WebUI.setText(findTestObject('Dashboard/Dashboard - Login Page/textfield_Email'), GlobalVariable.dashboardusername)

WebUI.setText(findTestObject('Dashboard/Dashboard - Login Page/textfield_Password'), GlobalVariable.dashboardpassword)

WebUI.click(findTestObject('Dashboard/Dashboard - Login Page/button_Login'))

WebUI.waitForElementVisible(findTestObject('Dashboard/Dashboard - CS Support Page/link_Announcement'), 0)

WebUI.click(findTestObject('Dashboard/Dashboard - CS Support Page/link_Notice'))

WebUI.waitForElementVisible(findTestObject('Dashboard/Dashboard - Notice Page/button_Delete'), 0)

WebUI.delay(1)

WebUI.click(findTestObject('Dashboard/Dashboard - Notice Page/button_Delete'))

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('Dashboard/Dashboard - Notice Page/label_Are you sure you want to delete this notice'), 
    0)

WebUI.click(findTestObject('Dashboard/Dashboard - Notice Page/delete_button_Delete'))

WebUI.delay(2)

WebUI.click(findTestObject('Dashboard/Dashboard - CS Support Page/button_Logout'))

WebUI.waitForElementVisible(findTestObject('Dashboard/Dashboard - Login Page/textfield_Email'), 0)

WebUI.navigateToUrl(GlobalVariable.url)

if (GlobalVariable.admincredential == 'custom') {
    WebUI.setText(findTestObject('ADMIN/Login Page/textfield_username'), GlobalVariable.customusername_admin)

    WebUI.setText(findTestObject('ADMIN/Login Page/textfield_password'), GlobalVariable.custompassword_admin)

    WebUI.click(findTestObject('ADMIN/Login Page/button_login-submit'))
} else if (GlobalVariable.admincredential == 'google') {
    WebUI.click(findTestObject('ADMIN/Admin Onboarding Page/Create_Account_Page/Button_Signup_Google'))

    WebUI.setText(findTestObject('ADMIN/Admin Onboarding Page/Create_Account_Page/Google_Username'), GlobalVariable.googleusername_admin)

    WebUI.click(findTestObject('ADMIN/Admin Onboarding Page/Create_Account_Page/Button_Google_Next'))

    WebUI.delay(1)

    WebUI.setText(findTestObject('ADMIN/Admin Onboarding Page/Create_Account_Page/Google_Password'), GlobalVariable.googlepassword_admin)

    WebUI.delay(1)

    WebUI.click(findTestObject('ADMIN/Admin Onboarding Page/Create_Account_Page/Button_Google_Next'))
} else if (GlobalVariable.admincredential == 'facebook') {
    WebUI.click(findTestObject('ADMIN/Admin Onboarding Page/Create_Account_Page/Button_Signup_Facebook'))

    WebUI.setText(findTestObject('ADMIN/Admin Onboarding Page/Create_Account_Page/Facebook_Email'), GlobalVariable.fbusername_admin)

    WebUI.setText(findTestObject('ADMIN/Admin Onboarding Page/Create_Account_Page/Facebook_Password'), GlobalVariable.fbpassword_admin)

    WebUI.click(findTestObject('ADMIN/Admin Onboarding Page/Create_Account_Page/Button_Login_Facebook'))
}

WebUI.waitForElementVisible(findTestObject('ADMIN/Advanced/Login Config/link_Advanced'), 0)

WebUI.verifyElementNotVisible(findTestObject('Dashboard/Dashboard - Notice Page/notice_EVENT'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Time/Admin/Admin Menu/Logout_Link'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Login Page/textfield_username'), 0)

