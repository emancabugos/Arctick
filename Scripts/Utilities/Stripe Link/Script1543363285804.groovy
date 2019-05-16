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

WebUI.navigateToUrl(GlobalVariable.StripeURL)

WebUI.maximizeWindow()

WebUI.waitForElementVisible(findTestObject('Stripe Login/input_email'), 0)

WebUI.setText(findTestObject('Stripe Login/input_email'), '03qabonsol@gmail.com')

WebUI.setText(findTestObject('Stripe Login/input_password'), 'welcomeqa')

WebUI.click(findTestObject('Stripe Login/span_Sign in to your account'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Stripe Login/Page_Dashboard/span_Connect'), 0)

WebUI.click(findTestObject('Stripe Login/Page_Dashboard/span_Connect'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Stripe Login/Page_Connect overview/span_Settings'), 0)

WebUI.click(findTestObject('Stripe Login/Page_Connect overview/span_Settings'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Stripe Login/Page_Dashboard/span_Add redirect URI'), 0)

WebUI.click(findTestObject('Stripe Login/Page_Dashboard/span_View test data'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Stripe Login/Page_Dashboard/span_Add redirect URI'), 0)

WebUI.click(findTestObject('Stripe Login/Page_Dashboard/span_Add redirect URI'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Stripe Login/Page_Dashboard/input_redirectURI'), 0)

WebUI.setText(findTestObject('Stripe Login/Page_Dashboard/input_redirectURI'), GlobalVariable.StripeConnect)

WebUI.click(findTestObject('Stripe Login/Page_Dashboard/span_Add URI'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Stripe Login/Page_Dashboard/span_Save'), 0)

WebUI.click(findTestObject('Stripe Login/Page_Dashboard/span_Save'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Stripe Login/svg_SVGInline-svg SVGInline--c'), 0)

WebUI.click(findTestObject('Stripe Login/svg_SVGInline-svg SVGInline--c'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Stripe Login/button_Sign out'), 0)

WebUI.click(findTestObject('Stripe Login/button_Sign out'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Stripe Login/input_email'), 0)

WebUI.closeBrowser()

