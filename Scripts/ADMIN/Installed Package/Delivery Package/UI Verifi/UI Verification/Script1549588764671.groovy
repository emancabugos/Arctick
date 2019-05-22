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

WebUI.waitForElementVisible(findTestObject('ADMIN/Installed Packages/Delivery Package/menulink_Installed Packages'), 0)

WebUI.click(findTestObject('ADMIN/Installed Packages/Delivery Package/menulink_Installed Packages'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Installed Packages/Delivery Package/submenulink_Delivery Package'), 0)

WebUI.click(findTestObject('ADMIN/Installed Packages/Delivery Package/submenulink_Delivery Package'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Installed Packages/Delivery Package/button_AddDeliveryOption'), 0)

WebUI.verifyElementVisible(findTestObject('ADMIN/Installed Packages/Delivery Package/textlabel_CountrySurcharges'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('ADMIN/Installed Packages/Delivery Package/textlabel_DeliveryOptionsSettings'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('ADMIN/Installed Packages/Delivery Package/textlabel_Unit'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('ADMIN/Custom Item Fields Page/a_Default/textlabel_ApplySpecificCategory'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('ADMIN/Installed Packages/Delivery Package/textfield_Unit'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('ADMIN/Installed Packages/Delivery Package/icon_information'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('ADMIN/Installed Packages/Delivery Package/column_Name'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('ADMIN/Installed Packages/Delivery Package/column_Deliversto'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('ADMIN/Installed Packages/Delivery Package/button_Save'), FailureHandling.STOP_ON_FAILURE)

