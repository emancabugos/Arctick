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

WebUI.navigateToUrl(GlobalVariable.ArcDashboardURL)

WebUI.maximizeWindow()

WebUI.waitForElementVisible(findTestObject('ADMIN/Arcadier Dashboard/Dashboard/div_brand-logo'), 0)

WebUI.setText(findTestObject('ADMIN/Arcadier Dashboard/Dashboard/input_Email'), GlobalVariable.ArcDashboardUser)

WebUI.setText(findTestObject('ADMIN/Arcadier Dashboard/Dashboard/input_Password'), GlobalVariable.ArcDashboardPass)

WebUI.click(findTestObject('ADMIN/Arcadier Dashboard/Dashboard/input_btn btn-default'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Arcadier Dashboard/Dashboard/a_Announcement'), 0)

WebUI.click(findTestObject('ADMIN/Arcadier Dashboard/Dashboard/a_Announcement'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Arcadier Dashboard/Dashboard/h1_Announcement'), 0)

WebUI.delay(1)

WebUI.setText(findTestObject('ADMIN/Arcadier Dashboard/Dashboard/input_search'), 'edit')

WebUI.delay(1)

WebUI.sendKeys(findTestObject('ADMIN/Arcadier Dashboard/Dashboard/input_search'), Keys.chord(Keys.ENTER))

WebUI.delay(1)

WebUI.waitForElementVisible(findTestObject('ADMIN/Arcadier Dashboard/Dashboard/td_time 1st row'), 0)

WebUI.click(findTestObject('ADMIN/Arcadier Dashboard/Dashboard/a_Edit'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Arcadier Dashboard/Dashboard/label_Title'), 0)

WebUI.setText(findTestObject('ADMIN/Arcadier Dashboard/Dashboard/input_title'), 'EDITED')

WebUI.setText(findTestObject('ADMIN/Arcadier Dashboard/Dashboard/textarea_description'), 'But I must explain to you how all this mistaken idea of denouncing pleasure and praising pain was born and I will give you a complete account of the system, and expound the actual teachings of the great explorer of the truth, the master-builder of human happiness. No one rejects, dislikes, or avoids pleasure itself, ')

WebUI.setText(findTestObject('ADMIN/Arcadier Dashboard/Dashboard/input_hyperlink'), 'youtube.com')

WebUI.click(findTestObject('ADMIN/Arcadier Dashboard/Dashboard/button_Upload'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Arcadier Dashboard/Dashboard/td_time 1st row'), 0)

WebUI.verifyElementText(findTestObject('ADMIN/Arcadier Dashboard/Dashboard/td_title 1st row'), 'EDITED')

WebUI.waitForElementVisible(findTestObject('ADMIN/Arcadier Dashboard/Dashboard/logout_button'), 0)

WebUI.click(findTestObject('ADMIN/Arcadier Dashboard/Dashboard/logout_button'))

WebUI.closeBrowser()

