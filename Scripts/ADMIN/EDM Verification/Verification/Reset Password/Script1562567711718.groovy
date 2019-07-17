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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('www.gmail.com')

WebUI.waitForElementVisible(findTestObject('EDM/Gmail Page/textfield_username'), 0)

WebUI.setText(findTestObject('EDM/Gmail Page/textfield_username'), 'taylorallison820@gmail.com')

WebUI.sendKeys(findTestObject('EDM/Gmail Page/textfield_username'), Keys.chord(Keys.ENTER))

WebUI.waitForElementVisible(findTestObject('EDM/Gmail Page/textfield_password'), 0)

WebUI.setText(findTestObject('EDM/Gmail Page/textfield_password'), 'P@ssw0rd_820')

WebUI.sendKeys(findTestObject('EDM/Gmail Page/textfield_password'), Keys.chord(Keys.ENTER))

WebUI.waitForElementVisible(findTestObject('EDM/Gmail Page/textfield_searchbar'), 0)

WebUI.setText(findTestObject('EDM/Gmail Page/textfield_searchbar'), 'Change password request')

WebUI.sendKeys(findTestObject('EDM/Gmail Page/textfield_searchbar'), Keys.chord(Keys.ENTER))

WebUI.waitForElementVisible(findTestObject('EDM/Reset Password/linktext_subject'), 0)

WebUI.click(findTestObject('EDM/Reset Password/linktext_subject'))

WebUI.waitForElementVisible(findTestObject('EDM/Reset Password/logo_marketplace'), 0)

WebUI.verifyElementPresent(findTestObject('EDM/Reset Password/textlabel_1stlinecontent'), 0)

WebUI.verifyElementPresent(findTestObject('EDM/Reset Password/textlabel_link'), 0)

WebUI.verifyElementPresent(findTestObject('EDM/Reset Password/textlabel_2ndlinecontent'), 0)

WebUI.verifyElementText(findTestObject('EDM/Reset Password/textlabel_1stlinecontent'), '')

WebUI.verifyElementText(findTestObject('EDM/Reset Password/textlabel_link'), '')

WebUI.verifyElementText(findTestObject('EDM/Reset Password/textlabel_2ndlinecontent'), '')

