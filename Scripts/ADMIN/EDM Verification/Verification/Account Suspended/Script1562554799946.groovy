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

WebUI.navigateToUrl('www.gmail.com')

WebUI.waitForElementVisible(findTestObject('ADMIN/EDM/Gmail Page/textfield_username'), 0)

WebUI.setText(findTestObject('ADMIN/EDM/Gmail Page/textfield_username'), 'taylorallison820@gmail.com')

WebUI.sendKeys(findTestObject('ADMIN/EDM/Gmail Page/textfield_username'), Keys.chord(Keys.ENTER))

WebUI.waitForElementVisible(findTestObject('ADMIN/EDM/Gmail Page/textfield_password'), 0)

WebUI.setText(findTestObject('ADMIN/EDM/Gmail Page/textfield_password'), 'P@ssw0rd_820')

WebUI.sendKeys(findTestObject('ADMIN/EDM/Gmail Page/textfield_password'), Keys.chord(Keys.ENTER))

WebUI.waitForElementVisible(findTestObject('ADMIN/EDM/Gmail Page/textfield_searchbar'), 0)

WebUI.setText(findTestObject('ADMIN/EDM/Gmail Page/textfield_searchbar'), 'Marketplace Account Suspended')

WebUI.sendKeys(findTestObject('ADMIN/EDM/Gmail Page/textfield_searchbar'), Keys.chord(Keys.ENTER))

WebUI.waitForElementVisible(findTestObject('ADMIN/EDM/Account Suspended/linktext_subject'), 0)

WebUI.click(findTestObject('ADMIN/EDM/Account Suspended/linktext_subject'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/EDM/Account Suspended/logo_marketplace'), 0)

WebUI.verifyElementVisible(findTestObject('ADMIN/EDM/Account Suspended/textlabel_greetings'))

WebUI.verifyElementVisible(findTestObject('ADMIN/EDM/Account Suspended/textlabel_content'))

WebUI.verifyElementVisible(findTestObject('ADMIN/EDM/Account Suspended/textlabel_regards'))

WebUI.verifyElementText(findTestObject('ADMIN/EDM/Account Suspended/textlabel_greetings'), greetings, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('ADMIN/EDM/Account Suspended/textlabel_content'), content, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('ADMIN/EDM/Account Suspended/textlabel_regards'), regards, FailureHandling.CONTINUE_ON_FAILURE)

