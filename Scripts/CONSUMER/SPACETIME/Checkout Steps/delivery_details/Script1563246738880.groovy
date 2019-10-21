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

if (WebUI.verifyElementVisible(findTestObject('SPACETIME/CONSUMER/Delivery Popup Window/button_Checkout')) == true) {
    WebUI.verifyElementVisible(findTestObject('SPACETIME/CONSUMER/Delivery Popup Window/button_Checkout'))

    if (delivery == 'delivery1') {
        WebUI.click(findTestObject('SPACETIME/CONSUMER/Delivery Popup Window/button_Delivery1'))
    } else if (delivery == 'delivery2') {
        WebUI.click(findTestObject('SPACETIME/CONSUMER/Delivery Popup Window/button_Delivery2'))
    } else if (delivery == 'pickup1') {
        WebUI.click(findTestObject('SPACETIME/CONSUMER/Delivery Popup Window/button_PickUp1'))
    } else if (delivery == 'pickup2') {
        WebUI.click(findTestObject('SPACETIME/CONSUMER/Delivery Popup Window/button_PickUp2'))
    }
    
    WebUI.click(findTestObject('SPACETIME/CONSUMER/Delivery Popup Window/button_Checkout'))
} else if (WebUI.verifyElementNotVisible(findTestObject('SPACETIME/CONSUMER/Delivery Popup Window/button_Checkout'))) {
    WebUI.waitForElementVisible(findTestObject('SPACETIME/CONSUMER/Delivery Details Page/button_SelectAddress'), 0)
}

WebUI.waitForElementVisible(findTestObject('SPACETIME/CONSUMER/Delivery Details Page/button_SelectAddress'), 0)

WebUI.click(findTestObject('SPACETIME/CONSUMER/Delivery Details Page/button_SelectAddress'))

WebUI.waitForElementVisible(findTestObject('SPACETIME/CONSUMER/Delivery Details Page/button_Selected'), 0)

WebUI.scrollToElement(findTestObject('SPACETIME/CONSUMER/Delivery Details Page/buttonDelivery_Next'), 0)

WebUI.click(findTestObject('SPACETIME/CONSUMER/Delivery Details Page/buttonDelivery_Next'))

WebUI.waitForPageLoad(0)

WebUI.verifyElementText(findTestObject('SPACETIME/CONSUMER/Review Details Page/textlabel_ReviewDetailsPageRate'), rate, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('SPACETIME/CONSUMER/Review Details Page/button_Previous'), 0)

WebUI.scrollToElement(findTestObject('SPACETIME/CONSUMER/Review Details Page/buttonReview_Next'), 0)

WebUI.click(findTestObject('SPACETIME/CONSUMER/Review Details Page/buttonReview_Next'))

WebUI.waitForPageLoad(0)

WebUI.waitForElementVisible(findTestObject('SPACETIME/CONSUMER/Payment Details Page/dropdown_Payment'), 0)

