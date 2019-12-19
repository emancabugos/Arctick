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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.HomepageURL)

WebUI.waitForElementVisible(findTestObject('SPACETIME/CONSUMER/Homepage/a_BE A SELLER'), 0)

if (WebUI.verifyElementPresent(findTestObject('Utilities/Login Seller/Accept Cookies/a_Accept Cookies'), 3, FailureHandling.CONTINUE_ON_FAILURE) == 
true) {
    WebUI.click(findTestObject('Utilities/Login Seller/Accept Cookies/a_Accept Cookies'), FailureHandling.CONTINUE_ON_FAILURE)
} else {
    WebUI.verifyElementPresent(findTestObject('SPACETIME/CONSUMER/Homepage/a_BE A SELLER'), 0)
}

WebUI.click(findTestObject('SPACETIME/CONSUMER/Homepage/a_BE A SELLER'))

WebUI.click(findTestObject('BESPOKE/MERCHANT/Merchant Onboarding/Create Account/button_create-account'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('BESPOKE/MERCHANT/Merchant Onboarding/Create Account/textbox_username'), 0)

WebUI.setText(findTestObject('BESPOKE/MERCHANT/Merchant Onboarding/Create Account/textbox_username'), varSellerUsername)

WebUI.setText(findTestObject('BESPOKE/MERCHANT/Merchant Onboarding/Create Account/textbox_password'), 'welcome8')

WebUI.setText(findTestObject('BESPOKE/MERCHANT/Merchant Onboarding/Create Account/textbox_reconfirm-password'), 'welcome8')

WebUI.setText(findTestObject('BESPOKE/MERCHANT/Merchant Onboarding/Create Account/textbox_notificationemail'), varEmail)

WebUI.click(findTestObject('BESPOKE/MERCHANT/Merchant Onboarding/Create Account/button_create account'), FailureHandling.STOP_ON_FAILURE)

WebUI.comment('Profile')

WebUI.verifyElementPresent(findTestObject('BESPOKE/MERCHANT/Merchant Onboarding/Profile Page/Profile/button_CHANGE'), 0)

WebUI.click(findTestObject('BESPOKE/MERCHANT/Merchant Onboarding/Profile Page/Profile/button_CHANGE'))

WebUI.delay(1)

WebUI.uploadFile(findTestObject('Utilities/Image Cropper/image_container'), varImage)

WebUI.waitForElementVisible(findTestObject('Utilities/Image Cropper/button_ok'), 0)

WebUI.click(findTestObject('Utilities/Image Cropper/button_ok'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Utilities/Image Cropper/button_Save Photo'), 0)

WebUI.click(findTestObject('Utilities/Image Cropper/button_Save Photo'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.setText(findTestObject('BESPOKE/MERCHANT/Merchant Onboarding/Profile Page/Profile/textbox_DisplayName'), varFname)

WebUI.setText(findTestObject('BESPOKE/MERCHANT/Merchant Onboarding/Profile Page/Profile/textbox_description'), varDescription)

WebUI.setText(findTestObject('BESPOKE/MERCHANT/Merchant Onboarding/Profile Page/Profile/textbox_FirstName'), varFname)

WebUI.setText(findTestObject('BESPOKE/MERCHANT/Merchant Onboarding/Profile Page/Profile/textbox_LastName'), varLname)

WebUI.setText(findTestObject('BESPOKE/MERCHANT/Merchant Onboarding/Profile Page/Profile/textbox_PhoneNumber'), varContact)

WebUI.setText(findTestObject('BESPOKE/MERCHANT/Merchant Onboarding/Profile Page/Profile/textbox_SellerLocation'), varSellerLocation)

WebUI.click(findTestObject('BESPOKE/MERCHANT/Merchant Onboarding/Profile Page/Profile/button_NEXT profile'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Address')

WebUI.setText(findTestObject('BESPOKE/MERCHANT/Merchant Onboarding/Address Page/Address/textbox_first-name'), varAddFname)

WebUI.setText(findTestObject('BESPOKE/MERCHANT/Merchant Onboarding/Address Page/Address/textbox_last-name'), varAddLname)

WebUI.setText(findTestObject('BESPOKE/MERCHANT/Merchant Onboarding/Address Page/Address/textbox_myaddress'), varAddress)

WebUI.selectOptionByLabel(findTestObject('BESPOKE/MERCHANT/Merchant Onboarding/Address Page/Address/dropdown_(SELECT COUNTRY)'), 
    varCountry, false)

WebUI.setText(findTestObject('BESPOKE/MERCHANT/Merchant Onboarding/Address Page/Address/textbox_state'), varState)

WebUI.setText(findTestObject('BESPOKE/MERCHANT/Merchant Onboarding/Address Page/Address/textbox_city'), varCity)

WebUI.setText(findTestObject('BESPOKE/MERCHANT/Merchant Onboarding/Address Page/Address/textbox_postal-code'), varPostalCode)

WebUI.click(findTestObject('BESPOKE/MERCHANT/Merchant Onboarding/Address Page/Address/button_add address'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('BESPOKE/MERCHANT/Merchant Onboarding/Address Page/Address/cont_Address'), 0)

WebUI.scrollToElement(findTestObject('BESPOKE/MERCHANT/Merchant Onboarding/Address Page/Address/button_NEXT address'), 0)

WebUI.click(findTestObject('BESPOKE/MERCHANT/Merchant Onboarding/Address Page/Address/button_NEXT address'), FailureHandling.CONTINUE_ON_FAILURE)

