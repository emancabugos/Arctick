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
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import org.openqa.selenium.WebElement as WebElement

WebUI.callTestCase(findTestCase('PLUGINS/Installation/Navigation_Plugins'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Plugins/tab_Installed'), 0)

WebUI.click(findTestObject('ADMIN/Plugins/tab_Available'))

WebUI.delay(0)

if (WebUI.verifyElementPresent(findTestObject('ADMIN/Plugins/RRP_buttonInstall'), 0, FailureHandling.CONTINUE_ON_FAILURE) == 
true) {
    WebUI.delay(1)

    WebElement element = WebUiCommonHelper.findWebElement(findTestObject('ADMIN/Plugins/RRP_buttonInstall'), 30)

    WebUI.executeJavaScript('arguments[0].click()', Arrays.asList(element))

    WebUI.waitForElementVisible(findTestObject('ADMIN/Plugins/button_Install'), 0)

    WebUI.click(findTestObject('ADMIN/Plugins/button_Install'))

    WebUI.waitForElementPresent(findTestObject('ADMIN/Plugins/button_Okay_installconfirmation'), 0)

    WebUI.click(findTestObject('ADMIN/Plugins/button_Okay_installconfirmation'))

    WebUI.waitForElementVisible(findTestObject('ADMIN/Plugins/toaster_successfullyinstalled'), 0)
} else {
    WebUI.click(findTestObject('ADMIN/Plugins/tab_Installed'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.delay(0)

    WebUI.verifyElementPresent(findTestObject('ADMIN/Plugins/RRP/button_detailsRRP'), 0)
}

