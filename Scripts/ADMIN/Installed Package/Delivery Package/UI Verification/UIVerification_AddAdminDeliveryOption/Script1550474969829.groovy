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

WebUI.waitForElementVisible(findTestObject('ADMIN/Installed Packages/Delivery Package/menulink_Installed Packages'), 0)

WebUI.click(findTestObject('ADMIN/Installed Packages/Delivery Package/menulink_Installed Packages'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Installed Packages/Delivery Package/submenulink_Delivery Package'), 0)

WebUI.click(findTestObject('ADMIN/Installed Packages/Delivery Package/submenulink_Delivery Package'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Installed Packages/Delivery Package/button_AddDeliveryOption'), 0)

WebUI.setText(findTestObject('ADMIN/Installed Packages/Delivery Package/textfield_Unit'), 'Kg')

WebUI.click(findTestObject('ADMIN/Installed Packages/Delivery Package/button_Save'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementNotClickable(findTestObject('ADMIN/Installed Packages/Delivery Package/textfield_Unit'), 0)

WebUI.click(findTestObject('ADMIN/Installed Packages/Delivery Package/button_AddDeliveryOption'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryOption/textlabel_DeliveryOptionName'), 
    0)

WebUI.verifyElementVisible(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryOption/textfield_DeliveryOptionName'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryOption/textlabel_Deliversto'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryOption/dropdown_Country'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryOption/textlabel_MinimumleadTime'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryOption/textfield_MinimumleadTime'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryOption/textlabel_MinimumleadTime'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryOption/textfield_MinimumleadTime'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryOption/textlabel_DeliveringFrom'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryOption/textfield_DeliveringFrom'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryOption/textlabel_CalculateShipping'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryOption/radiobutton_Weight'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryOption/radiobutton_Price'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryOption/textlabel_Price'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryOption/textlabel_Weight'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryOption/textlabel_DeliveryRate'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryOption/column_Name'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryOption/column_Range'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryOption/textlabel_unit'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryOption/column_DeliveryCost'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryOption/button_AddDeliveryRate'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryOption/linktext_Cancel'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryOption/button_Save'))

WebUI.click(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryOption/button_AddDeliveryRate'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/textlabel_DeliveryRateName'), 
    0)

WebUI.verifyElementVisible(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/textlabel_DeliveryRateName'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/textlabel_Range'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/numericUpDown_RangeFrom'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/numericUpDown_RangeTo'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/label_Onwards'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/textlabel_DeliveryCost'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/textfield_DeliveryCost'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/button_Save'))

