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

'Edit Uploaded Image\r\n'
WebUI.callTestCase(findTestCase('Utilities/CONSUMER/Consumer Login'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/CONSUMER/Homepage/textfield_Search'), 0)

WebUI.mouseOver(findTestObject('Utilities/Header/BESPOKE/Merchant Header/usermenu'))

WebUI.waitForElementVisible(findTestObject('Utilities/Bespoke Usermenu/linktext_Settings'), 0)

WebUI.click(findTestObject('Utilities/Bespoke Usermenu/linktext_Settings'))

WebUI.waitForElementVisible(findTestObject('SPACETIME/CONSUMER/Onboarding/Profile Tab/button_Change'), 0)

WebUI.click(findTestObject('SPACETIME/CONSUMER/Onboarding/Profile Tab/button_Change'))

WebUI.waitForElementVisible(findTestObject('SPACETIME/CONSUMER/Onboarding/Profile Tab/Upload Image/popup_upload'), 0)

WebUI.uploadFile(findTestObject('SPACETIME/CONSUMER/Onboarding/Profile Tab/Upload Image/popup_upload'), 'C:\\Katalon\\Image\\photo8.jpg')

WebUI.waitForElementVisible(findTestObject('SPACETIME/CONSUMER/Onboarding/Profile Tab/Upload Image/button_zoomOut'), 0)

WebUI.click(findTestObject('SPACETIME/CONSUMER/Onboarding/Profile Tab/Upload Image/button_ok'))

WebUI.waitForElementVisible(findTestObject('SPACETIME/CONSUMER/Onboarding/Profile Tab/Upload Image/button_Save'), 0)

WebUI.click(findTestObject('SPACETIME/CONSUMER/Onboarding/Profile Tab/Upload Image/button_Save'))

WebUI.callTestCase(findTestCase('Utilities/MERCHANT/Logout'), [:], FailureHandling.CONTINUE_ON_FAILURE)

