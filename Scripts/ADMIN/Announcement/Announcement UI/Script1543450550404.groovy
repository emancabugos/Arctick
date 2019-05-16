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

WebUI.waitForElementVisible(findTestObject('ADMIN/Announcement/a_Announcement'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Announcement/i_sm-submenu submenu-icon6'), 0)

WebUI.verifyElementText(findTestObject('ADMIN/Announcement/h1_Announcements'), 'Announcements')

WebUI.verifyElementText(findTestObject('ADMIN/Announcement/h4_Notice'), 'Notice')

WebUI.verifyElementPresent(findTestObject('ADMIN/Announcement/img'), 0)

WebUI.verifyElementText(findTestObject('ADMIN/Announcement/h2_Have a question'), 'Have a question?')

WebUI.verifyElementPresent(findTestObject('ADMIN/Announcement/a_Visit our FAQ'), 0)

WebUI.verifyElementText(findTestObject('ADMIN/Announcement/a_Visit our FAQ'), 'Visit our FAQ')

WebUI.verifyElementText(findTestObject('ADMIN/Announcement/div_Follow us on'), 'Follow us on')

WebUI.comment('Click Visit FAQ')

WebUI.click(findTestObject('ADMIN/Announcement/a_Visit our FAQ'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Announcement/h4_Search for answers here'), 0)

WebUI.verifyElementText(findTestObject('ADMIN/Announcement/h4_Search for answers here'), 'Search for answers here!')

WebUI.back()

WebUI.waitForElementVisible(findTestObject('ADMIN/Announcement/a_Announcement'), 0)

WebUI.comment('Arcadier Links')

WebUI.verifyElementPresent(findTestObject('ADMIN/Announcement/imgfacebook'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Announcement/imgtwitter'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Announcement/imgig'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Announcement/imgoutube'), 0)

WebUI.verifyElementText(findTestObject('ADMIN/Announcement/span_ArcadierworldFB'), 'Arcadierworld')

WebUI.verifyElementText(findTestObject('ADMIN/Announcement/span_ArcadierTwitter'), 'Arcadier_')

WebUI.verifyElementText(findTestObject('ADMIN/Announcement/span_ArcadierIG'), 'Arcadier')

WebUI.verifyElementText(findTestObject('ADMIN/Announcement/span_ArcadierYoutube'), 'Arcadier Marketplaces')

WebUI.comment('Click FB link')

WebUI.verifyElementText(findTestObject('ADMIN/Announcement/span_ArcadierworldFB'), 'Arcadierworld')

WebUI.click(findTestObject('ADMIN/Announcement/imgfacebook'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1)

WebUI.switchToWindowIndex(1)

WebUI.waitForElementVisible(findTestObject('ADMIN/Announcement/arcadierlogoFB'), 0)

WebUI.closeWindowIndex(1)

WebUI.delay(1)

WebUI.switchToWindowIndex(0)

WebUI.comment('Click Twitter link')

WebUI.verifyElementText(findTestObject('ADMIN/Announcement/span_ArcadierTwitter'), 'Arcadier_')

WebUI.click(findTestObject('ADMIN/Announcement/imgtwitter'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1)

WebUI.switchToWindowIndex(1)

WebUI.waitForElementVisible(findTestObject('ADMIN/Announcement/arcadierlogoTwitter'), 0)

WebUI.closeWindowIndex(1)

WebUI.delay(1)

WebUI.switchToWindowIndex(0)

WebUI.comment('Click IG link')

WebUI.verifyElementText(findTestObject('ADMIN/Announcement/span_ArcadierIG'), 'Arcadier')

WebUI.click(findTestObject('ADMIN/Announcement/imgig'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1)

WebUI.switchToWindowIndex(1)

WebUI.waitForElementVisible(findTestObject('ADMIN/Announcement/arcadierlogoIG'), 0)

WebUI.closeWindowIndex(1)

WebUI.delay(1)

WebUI.switchToWindowIndex(0)

WebUI.comment('Click Youtube link')

WebUI.verifyElementText(findTestObject('ADMIN/Announcement/span_ArcadierYoutube'), 'Arcadier Marketplaces')

WebUI.click(findTestObject('ADMIN/Announcement/imgoutube'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1)

WebUI.switchToWindowIndex(1)

WebUI.waitForElementVisible(findTestObject('ADMIN/Announcement/arcadierlogoYoutube'), 0)

WebUI.closeWindowIndex(1)

WebUI.delay(1)

WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('ADMIN/Admin Permission/Admin Activity Log/a_Logout'))

WebUI.closeBrowser()

