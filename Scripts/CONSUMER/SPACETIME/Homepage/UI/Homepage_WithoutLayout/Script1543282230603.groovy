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

WebUI.navigateToUrl('https://1008sbth1.test.arcadier.io/user')

WebUI.waitForElementVisible(findTestObject('Time/Consumer/Homepage/BeASeller_Link'), 0)

WebUI.verifyElementPresent(findTestObject('Time/Consumer/Homepage/Maketplace_Logo'), 0)

WebUI.verifyElementPresent(findTestObject('Time/Consumer/Homepage/BeASeller_Link'), 0)

WebUI.verifyElementPresent(findTestObject('Time/Consumer/Homepage/Language_Dropdown'), 0)

WebUI.verifyElementPresent(findTestObject('Time/Consumer/Homepage/RegisterSignIn_Link'), 0)

WebUI.verifyElementPresent(findTestObject('Time/Consumer/Homepage/Marketplace_Title'), 0)

WebUI.verifyElementPresent(findTestObject('Time/Consumer/Homepage/Marketplace_Slogan'), 0)

WebUI.verifyElementPresent(findTestObject('Time/Consumer/Homepage/Marketplace_Slogan'), 0)

WebUI.verifyElementPresent(findTestObject('Time/Consumer/Homepage/From_Datefield'), 0)

WebUI.verifyElementPresent(findTestObject('Time/Consumer/Homepage/To_Datefield'), 0)

WebUI.verifyElementPresent(findTestObject('Time/Consumer/Homepage/Search_button'), 0)

WebUI.verifyElementPresent(findTestObject('Time/Consumer/Homepage/AllDates_Checkbox'), 0)

WebUI.verifyElementPresent(findTestObject('Time/Consumer/Homepage/OurServices_Label'), 0)

WebUI.verifyElementPresent(findTestObject('Time/Consumer/Homepage/KindOfService_Label'), 0)

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.verifyElementPresent(findTestObject('Time/Consumer/Homepage/OurListings_Label'), 0)

WebUI.verifyElementPresent(findTestObject('Time/Consumer/Homepage/BestService_Label'), 0)

WebUI.verifyElementPresent(findTestObject('Time/Consumer/Homepage/ViewAllServices_Button'), 0)

WebUI.verifyElementPresent(findTestObject('Time/Consumer/Homepage/AboutUs_Footer'), 0)

WebUI.verifyElementPresent(findTestObject('Time/Consumer/Homepage/TermsOfService_Footer'), 0)

WebUI.verifyElementPresent(findTestObject('Time/Consumer/Homepage/PrivacyPolicy_Footer'), 0)

WebUI.verifyElementPresent(findTestObject('Time/Consumer/Homepage/ReturnPolicy_Footer'), 0)

WebUI.verifyElementPresent(findTestObject('Time/Consumer/Homepage/FAQ_Footer'), 0)

WebUI.verifyElementPresent(findTestObject('Time/Consumer/Homepage/ContactUs_Footer'), 0)

WebUI.closeBrowser()

