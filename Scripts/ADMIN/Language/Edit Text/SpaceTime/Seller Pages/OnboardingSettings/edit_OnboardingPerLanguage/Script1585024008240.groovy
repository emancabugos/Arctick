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

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_UserSettings'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_Profile'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_AboutYou'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_DisplayName'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_Timezone'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_OpenLoginID'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_SellerLocation'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_TransactionFee'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_Address'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_SelectCountry'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_PaymentAcceptance'), 
    '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_SelectYourPaymentMethod'), 
    '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Buyer Pages/Checkout/textfield_SelectAPaymentMethod'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_LinkAccount'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_Verified'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_Compulsory'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_NoLinkAccount'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_Optional'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_FormOptional'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_SkipThisStep'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfieldDeliveryMethod'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_RemoveItem'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_RemovePopup'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_Back'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_AccountConfiguration'), 
    '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/tabLabel_OmiseConfiguration'), 
    '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_Type'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_TaxIdentificationNumber'), 
    '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_Individual'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_Corporate'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_BankBranchCode'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_BankAccountNumber'), 
    '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_BankAccountName'), 
    '*')

WebUI.delay(1)

WebUI.click(findTestObject('ADMIN/Edit Text/Spacetime/Language/button_save'))

WebUI.delay(1)

