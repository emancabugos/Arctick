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

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Private Login/input_(Source is editable)_members_only'), 
    '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Private Login/input_Sign in as Buyer_browse_btn'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Private Login/input_Sign in as Seller_browse_btn'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Private Login/input_Interested in joining the marketplace_item_details'), 
    '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Private Login/input_Click here to let us know_browse_btn'), 
    '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Private Login/input_ABOUT US_location_service'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Private Login/textarea_Pluaks oaksi oakosok Cidepoe'), 
    '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Private Login/input_Learn More_btn_save'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Private Login/input_Buyer Sign in_location_service'), 
    '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Private Login/input_Seller Sign in_location_service'), 
    '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Private Login/input_Continue with Google_btn_save'), 
    '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Private Login/input_Continue with Facebook_btn_save'), 
    '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Private Login/input_Continue with Google_btn_save1'), 
    '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Private Login/input_Continue with Facebook_btn_save1'), 
    '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Private Login/input_Back_location_service'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Private Login/input_Register your interest below_location_service'), 
    '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Private Login/input_Your Name_location_service'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Private Login/input_Your Email_location_service'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Private Login/input_I am interested in being a buyer_location_service'), 
    '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Private Login/input_I am interested in being a seller_location_service'), 
    '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Private Login/input_Send_btn_save'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Private Login/input_Back_location_service 1'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Private Login/input_Register_location_service'), '*')

WebUI.click(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Homepage/button_save'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Homepage/toaster_success'), 0)

