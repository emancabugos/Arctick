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

WebUI.waitForElementVisible(findTestObject('ADMIN/Admin Onboarding Page/Take_Me_There/Button_Take me there'), 0)

WebUI.comment('Auto Login Admin')

WebUI.waitForElementVisible(findTestObject('ADMIN/Admin Onboarding Page/Congratulations_Page/Popup_Congratulations'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Admin Onboarding Page/Congratulations_Page/Animation_Congratulations'), 
    0)

WebUI.verifyElementText(findTestObject('ADMIN/Admin Onboarding Page/Congratulations_Page/Textlabel_Congratulations'), 'Congratulations')

WebUI.verifyElementText(findTestObject('ADMIN/Admin Onboarding Page/Congratulations_Page/Textlabel_on opening your brand new'), 
    'on opening your brand new online marketplace!')

WebUI.verifyElementText(findTestObject('ADMIN/Admin Onboarding Page/Congratulations_Page/Textlabel_Welcome to your admin portal'), 
    'Welcome to your admin portal! This is where you can configure and edit your marketplace. To return in the future, kindly refer to the email we have sent on how to log back in.')

WebUI.click(findTestObject('ADMIN/Admin Onboarding Page/Congratulations_Page/Button_Okay_Congratulations'))

WebUI.click(findTestObject('Utilities/Admin Logout/button_Logout'))

WebUI.closeBrowser()

