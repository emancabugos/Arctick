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

WebUI.waitForElementVisible(findTestObject('ADMIN/Categories/Category List/button_Content Mgmt'), 0)

WebUI.click(findTestObject('ADMIN/Categories/Category List/button_Content Mgmt'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Categories/Category List/button_Categories'), 0)

WebUI.click(findTestObject('ADMIN/Categories/Category List/button_Categories'))

WebUI.waitForPageLoad(0, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('ADMIN/Categories/Category List/button_Add a Category'))

WebUI.waitForElementPresent(findTestObject('ADMIN/Categories/Category/dropdown_Parent'), 2)

WebUI.delay(1)

WebUI.setText(findTestObject('ADMIN/Categories/Category/textfield_Category Name'), CategoryNametext)

WebUI.click(findTestObject('ADMIN/Categories/Category/dropdown_Parent'))

WebUI.delay(2)

WebUI.click(findTestObject('ADMIN/Categories/Category/dropdown_Parent'))

WebUI.selectOptionByLabel(findTestObject('ADMIN/Categories/Category/dropdown_Parent'), ParentName, false)

WebUI.click(findTestObject('ADMIN/Categories/Category/button_Browse'))

WebUI.delay(2)

WebUI.uploadFile(findTestObject('ADMIN/Categories/Category/image_input image'), CategoryImageUpload)

WebUI.waitForElementVisible(findTestObject('ADMIN/Categories/Category/button_upload check'), 0)

WebUI.click(findTestObject('ADMIN/Categories/Category/button_upload check'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Categories/Category/button_upload save'), 0)

WebUI.click(findTestObject('ADMIN/Categories/Category/button_upload save'))

WebUI.setText(findTestObject('ADMIN/Categories/Category/textfield_category_description'), Description)

WebUI.click(findTestObject('ADMIN/Categories/Category/button_Save'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Categories/Category/label_edit popup'), 0)

WebUI.waitForElementNotPresent(findTestObject('ADMIN/Categories/Category/label_edit popup'), 0)

