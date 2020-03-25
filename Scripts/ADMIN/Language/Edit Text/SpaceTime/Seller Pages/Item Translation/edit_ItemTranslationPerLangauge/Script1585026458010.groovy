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

WebUI.waitForElementVisible(findTestObject('ADMIN/Edit Text/Spacetime/Language/dd_English'), 0)

WebUI.selectOptionByLabel(findTestObject('ADMIN/Edit Text/Spacetime/Language/dd_English'), selectLanguage, false)

WebUI.verifyOptionSelectedByLabel(findTestObject('ADMIN/Edit Text/Spacetime/Language/dd_English'), selectLanguage, false, 
    0)

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Item Translation/textfield_ServiceName'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Item Translation/textfield_ItemDescription'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Item Translation/textfield_ServiceAddOn'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Item Translation/textfield_ListingUpdated'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Item Translation/textfield_ItemHasBeenSaved'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Item Translation/textfield_DefaultLanguage'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Item Translation/textfield_AddTranslation'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Item Translation/textfield_AddOwnTranslation'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Item Translation/textfield_DifferentLanguage'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Item Translation/textfield_DoItLater'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Item Translation/textfield_AddTranslation'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Item Translation/textfield_EditTranslation'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Item Translation/textfield_HaveNotFinished'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Item Translation/textfield_LeavePage'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Item Translation/textfield_Cancel'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Item Translation/textfield_Continue'), '*')

WebUI.delay(1)

WebUI.click(findTestObject('ADMIN/Edit Text/Spacetime/Language/button_save'))

WebUI.delay(1)

