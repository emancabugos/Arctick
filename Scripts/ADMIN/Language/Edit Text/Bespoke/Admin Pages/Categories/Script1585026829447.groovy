import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.waitForElementVisible(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Navigation/dd_language'), 0)

WebUI.selectOptionByLabel(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Navigation/dd_language'), varLanguage, false)

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Category/input_Category 01_main-category1'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Category/input_Category 02_main-category1'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Category/input_Category 03_main-category1'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Category/input_Category 04_main-category1'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Category/input_Category 05_main-category1'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Category/input_Category 06_main-category1'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Category/input_Category 07_main-category1'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Category/input_Category 08_main-category1'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Category/input_Category 09_main-category1'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Category/input_Category 10_main-category1'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Category/input_Category 11_main-category1'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Category/input_Category 12_main-category1'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Category/input_Category 13_main-category1'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Category/input_Category 14_main-category1'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Category/input_Category 15_main-category1'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Category/input_Category 16_main-category1'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Category/input_Category 17_main-category1'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Category/input_Category 18_main-category1'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Category/input_Category 19_main-category1'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Category/input_Category 20_main-category1'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Category/input_Category Name mAx 021_main-category1'), 
    '*')

WebUI.click(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Homepage/button_save'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Homepage/toaster_success Categories'), 0)

