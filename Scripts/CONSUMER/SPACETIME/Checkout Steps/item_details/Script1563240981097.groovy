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

WebUI.comment('Verify in Item Details Page')

WebUI.waitForElementVisible(findTestObject('SPACETIME/CONSUMER/Item Details Page/button_ContactSeller'), 0)

WebUI.waitForPageLoad(0)

WebUI.verifyElementText(findTestObject('SPACETIME/CONSUMER/Item Details Page/textlabel_ItemDetailsPageRate'), rate, FailureHandling.CONTINUE_ON_FAILURE)

if (WebUI.verifyElementVisible(findTestObject('SPACETIME/CONSUMER/Item Details Page/timepicker_Time')) == true) {
    WebUI.verifyElementVisible(findTestObject('SPACETIME/CONSUMER/Item Details Page/timepicker_Time'))

    WebUI.click(findTestObject('SPACETIME/CONSUMER/Item Details Page/datepicker_Date'))

    WebUI.delay(1)

    WebUI.setText(findTestObject('SPACETIME/CONSUMER/Item Details Page/datepicker_Date'), date)

    WebUI.delay(1)

    WebUI.setText(findTestObject('SPACETIME/CONSUMER/Item Details Page/timepicker_Time'), time)

    WebUI.setText(findTestObject('SPACETIME/CONSUMER/Item Details Page/textfield_Duration'), duration)
} else if (WebUI.verifyElementVisible(findTestObject('SPACETIME/CONSUMER/Item Details Page/timepicker_Time')) == 
false) {
    WebUI.verifyElementNotVisible(findTestObject('SPACETIME/CONSUMER/Item Details Page/timepicker_Time'))

    WebUI.verifyElementVisible(findTestObject('SPACETIME/CONSUMER/Item Details Page/timepicker_Time'))

    WebUI.click(findTestObject('SPACETIME/CONSUMER/Item Details Page/datepicker_Date'))

    WebUI.delay(1)

    WebUI.setText(findTestObject('SPACETIME/CONSUMER/Item Details Page/datepicker_Date'), date)

    WebUI.delay(1)

    WebUI.setText(findTestObject('SPACETIME/CONSUMER/Item Details Page/textfield_Duration'), duration)

    WebUI.delay(1)

    WebUI.click(findTestObject('SPACETIME/CONSUMER/Item Details Page/button_BuyNow'))

    WebUI.delay(1)
}

