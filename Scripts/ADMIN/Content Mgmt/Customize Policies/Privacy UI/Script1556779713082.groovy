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

WebUI.callTestCase(findTestCase('Utilities/ADMIN/Admin Login'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Customize Policies/Terms/sidemenu_Content Mgmt.'), 0)

WebUI.click(findTestObject('ADMIN/Customize Policies/Terms/sidemenu_Content Mgmt.'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('ADMIN/Customize Policies/Terms/sidemenu_Customize Policies'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Customize Policies/Terms/img 1'), 0)

WebUI.verifyElementText(findTestObject('ADMIN/Customize Policies/Terms/textlabel_Customize Policies'), 'Customize Policies')

WebUI.verifyElementPresent(findTestObject('ADMIN/Customize Policies/Terms/img 2'), 0)

WebUI.verifyElementText(findTestObject('ADMIN/Customize Policies/Terms/textlabel_Customize your policies for'), 'Customize your policies for your own marketplace.')

WebUI.verifyElementText(findTestObject('ADMIN/Customize Policies/Privacy/tab_PRIVACY POLICY'), 'PRIVACY POLICY')

WebUI.click(findTestObject('ADMIN/Customize Policies/Privacy/tab_PRIVACY POLICY'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('ADMIN/Customize Policies/Privacy/textbox_'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Customize Policies/Privacy/button_Save'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Customize Policies/Privacy/button_Preview'), 0)

