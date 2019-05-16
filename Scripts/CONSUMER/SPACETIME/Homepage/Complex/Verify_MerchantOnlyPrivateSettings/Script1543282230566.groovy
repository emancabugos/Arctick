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

WebUI.waitForElementPresent(findTestObject('Time/Admin/Login Page/AdminPortal_TextLabel'), 0)

if (GlobalVariable.credential == 'google') {
    WebUI.click(findTestObject('Time/Admin/Login Page/Google_Button'), 0)
} else if (GlobalVariable.credential == 'facebook') {
    WebUI.click(findTestObject('Time/Admin/Login Page/Facebook_Button'))
} else if (GlobalVariable.credential == 'custom') {
    WebUI.setText(findTestObject('Time/Admin/Login Page/Username_Textbox'), GlobalVariable.customusername)

    WebUI.setText(findTestObject('Time/Admin/Login Page/Password_Textbox'), GlobalVariable.custompassword)

    WebUI.click(findTestObject('Time/Admin/Login Page/SignIn_Button'))
}

WebUI.waitForElementPresent(findTestObject('Time/Admin/Admin Menu/Advanced_Link'), 0)

WebUI.click(findTestObject('Time/Admin/Admin Menu/Advanced_Link'))

WebUI.waitForElementVisible(findTestObject('Time/Admin/Private Settings/PrivateSettings_SubLink'), 0)

WebUI.click(findTestObject('Time/Admin/Private Settings/PrivateSettings_SubLink'))

WebUI.waitForElementVisible(findTestObject('Time/Admin/Private Settings/PrivateSettings_Logo'), 0)

WebUI.click(findTestObject('Time/Admin/Private Settings/PrivateSettings_ToggleButton'))

WebUI.waitForElementVisible(findTestObject('Time/Admin/Private Settings/PageTitle_Textbox'), 0)

WebUI.setText(findTestObject('Time/Admin/Private Settings/PageTitle_Textbox'), GlobalVariable.pagetitle)

WebUI.setText(findTestObject('Time/Admin/Private Settings/AboutUs_TextArea'), GlobalVariable.aboutus)

WebUI.setText(findTestObject('Time/Admin/Private Settings/URL_Textbox'), GlobalVariable.privatesettingsurl)

WebUI.click(findTestObject('Time/Admin/Private Settings/Browse_Button'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.uploadFile(findTestObject('Time/Admin/Private Settings/Test_upload'), 'C://SeleniumIDE//Image//Shikamaru_Nara.png')

WebUI.waitForElementPresent(findTestObject('Time/Admin/Private Settings/Ok_Button'), 0)

WebUI.click(findTestObject('Time/Admin/Private Settings/Ok_Button'))

WebUI.waitForElementVisible(findTestObject('Time/Admin/Private Settings/AddPhoto_Button'), 0)

WebUI.click(findTestObject('Time/Admin/Private Settings/AddPhoto_Button'))

WebUI.scrollToElement(findTestObject('Time/Admin/Private Settings/Save_Button'), 0)

WebUI.delay(2)

WebUI.click(findTestObject('Time/Admin/Private Settings/Save_Button'))

WebUI.waitForElementVisible(findTestObject('Time/Admin/Private Settings/ToasterMessage_Success'), 0)

WebUI.waitForElementVisible(findTestObject('Time/Admin/Private Settings/ViewBuyerList_Button'), 0)

WebUI.click(findTestObject('Time/Admin/Admin Menu/Logout_Link'))

WebUI.waitForElementVisible(findTestObject('Time/Admin/Login Page/Username_Textbox'), 0)

WebUI.navigateToUrl(GlobalVariable.homepage)

WebUI.waitForElementPresent(findTestObject('Time/Consumer/Homepage/BeASeller_Link'), 0)

WebUI.click(findTestObject('Time/Consumer/Homepage/BeASeller_Link'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Time/Consumer/Private Login Page/SignInSeller_Button'), 0)

WebUI.verifyElementPresent(findTestObject('Time/Consumer/Private Login Page/SignInSeller_Button'), 0)

