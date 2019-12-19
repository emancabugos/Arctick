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

WebUI.callTestCase(findTestCase('Utilities/CONSUMER/Consumer Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.comment('Validation on Homepage')

WebUI.waitForElementVisible(findTestObject('SPACETIME/CONSUMER/Search Function/button_Search'), 0)

WebUI.verifyElementVisible(findTestObject('SPACETIME/CONSUMER/Search Function/textfield_Location'))

WebUI.verifyElementVisible(findTestObject('SPACETIME/CONSUMER/Search Function/textfield_Keyword'))

WebUI.verifyElementVisible(findTestObject('SPACETIME/CONSUMER/Search Function/datepicker'))

WebUI.delay(1)

WebUI.click(findTestObject('SPACETIME/CONSUMER/Search Function/button_Search'))

WebUI.comment('Verify in Search Result Page')

WebUI.waitForPageLoad(0)

WebUI.waitForElementVisible(findTestObject('SPACETIME/CONSUMER/Search Result Page/image_Item'), 0)

WebUI.verifyElementVisible(findTestObject('SPACETIME/CONSUMER/Search Function/perPage_Location'))

WebUI.verifyElementVisible(findTestObject('SPACETIME/CONSUMER/Search Function/perPage_Keyword'))

WebUI.click(findTestObject('SPACETIME/CONSUMER/Search Result Page/image_Item'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForPageLoad(0)

WebUI.comment('Verify in Item Details Page')

WebUI.waitForElementVisible(findTestObject('SPACETIME/CONSUMER/Item Details Page/button_ContactSeller'), 0)

if (WebUI.verifyElementVisible(findTestObject('SPACETIME/CONSUMER/Item Details Page/timepicker_Time')) == true)
 {
    WebUI.verifyElementVisible(findTestObject('SPACETIME/CONSUMER/Item Details Page/timepicker_Time'))

    WebUI.click(findTestObject('SPACETIME/CONSUMER/Item Details Page/datepicker_Date'))

    WebUI.setText(findTestObject('SPACETIME/CONSUMER/Item Details Page/datepicker_Date'), '23/05/2019')

    WebUI.delay(1)

    WebUI.setText(findTestObject('SPACETIME/CONSUMER/Item Details Page/timepicker_Time'), '10:15 AM')

    WebUI.setText(findTestObject('SPACETIME/CONSUMER/Item Details Page/textfield_Duration'), '2')
} else if (WebUI.verifyElementNotVisible(findTestObject('SPACETIME/CONSUMER/Item Details Page/timepicker_Time'))) {
    WebUI.verifyElementNotVisible(findTestObject('SPACETIME/CONSUMER/Item Details Page/timepicker_Time'))

    WebUI.setText(findTestObject('SPACETIME/CONSUMER/Item Details Page/datepicker_Date'), '')

    WebUI.setText(findTestObject('SPACETIME/CONSUMER/Item Details Page/textfield_Duration'), '')
}

WebUI.delay(0.5)

WebUI.click(findTestObject('SPACETIME/CONSUMER/Item Details Page/button_BuyNow'))

WebUI.delay(1)

if (WebUI.verifyElementVisible(findTestObject('SPACETIME/CONSUMER/Delivery Popup Window/button_Checkout')) == true) {
    WebUI.verifyElementVisible(findTestObject('SPACETIME/CONSUMER/Delivery Popup Window/button_Checkout'))

    WebUI.click(findTestObject('SPACETIME/CONSUMER/Delivery Popup Window/button_Delivery1'))

    WebUI.delay(0.5)

    WebUI.click(findTestObject('SPACETIME/CONSUMER/Delivery Popup Window/button_Checkout'))
} else if (WebUI.verifyElementNotVisible(findTestObject('SPACETIME/CONSUMER/Delivery Popup Window/button_Checkout'))) {
    WebUI.waitForElementVisible(findTestObject('SPACETIME/CONSUMER/Delivery Details Page/button_SelectAddress'), 0)
}

WebUI.waitForElementVisible(findTestObject('SPACETIME/CONSUMER/Delivery Details Page/button_SelectAddress'), 0)

