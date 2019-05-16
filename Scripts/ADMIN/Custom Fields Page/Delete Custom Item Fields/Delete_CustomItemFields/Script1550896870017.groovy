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

WebUI.callTestCase(findTestCase('Utilities/ADMIN/Admin Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Custom Item Fields List Page/menulink_Content Mgmt.'), 0)

WebUI.click(findTestObject('ADMIN/Custom Item Fields List Page/menulink_Content Mgmt.'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Custom Item Fields List Page/submenulink_Custom Fields'), 0)

WebUI.click(findTestObject('ADMIN/Custom Item Fields List Page/submenulink_Custom Fields'), FailureHandling.STOP_ON_FAILURE)

boolean S1 = WebUI.waitForElementVisible(findTestObject(null), 0)

boolean S1 = WebUI.verifyElementPresent(findTestObject('Object Repository/ADMIN/Custom Item Fields List Page/button_Delete'), 
    0)

while (S1 == true) {
    WebUI.delay(2)

    WebUI.click(findTestObject('Object Repository/ADMIN/Custom Item Fields List Page/button_Delete'))

    WebUI.delay(2)

    WebUI.verifyElementPresent(findTestObject('ADMIN/Custom Item Fields List Page/a_Delete Popup/textlabel_Delete'), 
        0)

    WebUI.click(findTestObject('ADMIN/Custom Item Fields List Page/a_Delete Popup/button_Okay'), 0)

    WebUI.waitForElementVisible(findTestObject('ADMIN/Custom Item Fields Page/a_ToasterMessage/toaster_Delete'), 0)

    WebUI.waitForElementNotVisible(findTestObject('ADMIN/Custom Item Fields Page/a_ToasterMessage/toaster_Delete'), 0)
}

