import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords.click
import static com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords.setText
import java.lang.String as String
import java.util.concurrent.locks.Condition as Condition
import org.junit.After as After
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.testdata.reader.ExcelFactory as ExcelFactory
import com.kms.katalon.core.testdata.ExcelData as ExcelData

WebUI.callTestCase(findTestCase('Utilities/ADMIN/Admin Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Installed Packages/Delivery Package/menulink_Installed Packages'), 0)

WebUI.click(findTestObject('ADMIN/Installed Packages/Delivery Package/menulink_Installed Packages'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Installed Packages/Delivery Package/submenulink_Delivery Package'), 0)

WebUI.click(findTestObject('ADMIN/Installed Packages/Delivery Package/submenulink_Delivery Package'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Installed Packages/Delivery Package/button_AddDeliveryOption'), 0)

WebUI.click(findTestObject('ADMIN/Installed Packages/Delivery Package/button_AddDeliveryOption'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(0)

WebUI.waitForElementVisible(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryOption/textlabel_DeliveryOptionName'), 
    0)

WebUI.setText(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryOption/textfield_DeliveryOptionName'), 
    '')

WebUI.click(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryOption/dropdown_Country'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

Object excelData = ExcelFactory.getExcelDataWithDefaultSheet('C:\\Users\\April\\Documents\\Test Data\\country.xlsx', 'Sheet1', 
    true)

for (def index : (1..excelData.getRowNumbers() - 1)) {
    myTestObject = new TestObject('customObject')

    myTestObject.addProperty('value', ConditionType.EQUALS, excelData.getValue('data2', index))

    WebUI.setText('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryOption/z_Country/textfield_Country', excelData.getValue(
            'data1', index))

    WebUI.delay(2)

    WebUI.click(myTestObject)

    WebUI.delay(1)
}

