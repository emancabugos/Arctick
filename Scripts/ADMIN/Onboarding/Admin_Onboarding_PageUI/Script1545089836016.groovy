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
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.driver.KatalonWebDriverBackedSelenium as KatalonWebDriverBackedSelenium
import static com.kms.katalon.core.webui.driver.KatalonWebDriverBackedSelenium.*
import com.thoughtworks.selenium.Selenium as Selenium
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.firefox.FirefoxDriver as FirefoxDriver
import org.openqa.selenium.WebDriver as WebDriver
import static org.junit.Assert.*
import java.util.concurrent.Callable as Callable
import java.util.regex.Pattern as Pattern
import static org.apache.commons.lang3.StringUtils.join

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.Server)

WebUI.waitForPageLoad(0)

WebUI.verifyTextPresent('Start building your marketplace', false)

WebUI.verifyTextPresent('No credit card required. Upgrade when you\'re ready.', false)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Admin Onboarding Page/Create_Account_Page/Button_Signup_Google'), 
    'text', ' Sign up with Google', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Admin Onboarding Page/Create_Account_Page/Button_Signup_Facebook'), 
    'text', ' Sign up with Facebook', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Admin Onboarding Page/Create_Account_Page/Button_Create_Account'), 
    'text', ' Create your account', 0)

WebUI.verifyTextPresent('Already have an account? Sign in', false)

WebUI.verifyTextPresent('Need a preview?', false)

WebUI.verifyElementPresent(findTestObject('ADMIN/Admin Onboarding Page/Create_Account_Page/Arcadier_Logo_Img'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Admin Onboarding Page/Create_Account_Page/Preview_Video_Img'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Admin Onboarding Page/Create_Account_Page/Button_Support_Frame'), 0)

WebUI.click(findTestObject('ADMIN/Admin Onboarding Page/Create_Account_Page/Label_Need a preview'))

WebUI.switchToFrame(findTestObject('ADMIN/Admin Onboarding Page/Create_Account_Page/Video_Iframe'), 30)

WebUI.verifyElementPresent(findTestObject('ADMIN/Admin Onboarding Page/Create_Account_Page/Video_Tutorial'), 30)

WebUI.closeBrowser()

