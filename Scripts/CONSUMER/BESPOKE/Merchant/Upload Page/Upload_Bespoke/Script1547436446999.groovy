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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl(search)

WebUI.maximizeWindow()

WebUI.verifyElementPresent(findTestObject('Time/Consumer/Homepage/BeASeller_Link'), 0)

/*policy = WebUI.verifyElementVisible(findTestObject('BESPOKE DEL 2/MERCHANT/Upload Page/button_Accept Cookies'),0)

if (policy == true)
{
	WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Upload Page/button_Accept Cookies'),0)
	WebUI.waitForElementNotVisible(findTestObject('BESPOKE DEL 2/MERCHANT/Upload Page/button_Accept Cookies'),0)
}	

if (policy == false)
{
	WebUI.delay(3)
}
	
WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Upload Page/button_Accept Cookies'))*/
WebUI.click(findTestObject('Time/Consumer/Homepage/BeASeller_Link'))

WebUI.waitForElementVisible(findTestObject('Time/Consumer/Register  Sign In/Create Account_button '), 0)

if (GlobalVariable.merchantcredential == 'custom') {
    WebUI.setText(findTestObject('Time/Consumer/Register  Sign In/Username_field'), GlobalVariable.customusername_merchant)

    WebUI.setText(findTestObject('Time/Consumer/Register  Sign In/Password_field'), GlobalVariable.custompassword_merchant)

    WebUI.click(findTestObject('Time/Consumer/Register  Sign In/Login_button'))
} else if (GlobalVariable.merchantcredential == 'google') {
    WebUI.click(findTestObject('ADMIN/Admin Onboarding Page/Create_Account_Page/Button_Signup_Google'))

    WebUI.setText(findTestObject('ADMIN/Admin Onboarding Page/Create_Account_Page/Google_Username'), GlobalVariable.googleusername_merchant)

    WebUI.click(findTestObject('ADMIN/Admin Onboarding Page/Create_Account_Page/Button_Google_Next'))

    WebUI.delay(1)

    WebUI.setText(findTestObject('ADMIN/Admin Onboarding Page/Create_Account_Page/Google_Password'), GlobalVariable.googlepassword_merchant)

    WebUI.delay(1)

    WebUI.click(findTestObject('ADMIN/Admin Onboarding Page/Create_Account_Page/Button_Google_Next'))
} else if (GlobalVariable.merchantcredential == 'facebook') {
    WebUI.click(findTestObject('ADMIN/Admin Onboarding Page/Create_Account_Page/Button_Signup_Facebook'))

    WebUI.setText(findTestObject('ADMIN/Admin Onboarding Page/Create_Account_Page/Facebook_Email'), GlobalVariable.fbusername_merchant)

    WebUI.setText(findTestObject('ADMIN/Admin Onboarding Page/Create_Account_Page/Facebook_Password'), GlobalVariable.fbpassword_merchant)

    WebUI.click(findTestObject('ADMIN/Admin Onboarding Page/Create_Account_Page/Button_Login_Facebook'))
}

WebUI.waitForElementPresent(findTestObject('Time/Merchant/Dashboard/label_Dashboard'), 0)

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Merchant Header/link_Upload'))

WebUI.delay(3)

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/MERCHANT/Upload Page/dropdown_Category'), 0)

WebUI.selectOptionByLabel(findTestObject('BESPOKE DEL 2/MERCHANT/Upload Page/dropdown_Category'), 'Category 1', 
    true)

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Upload Page/textfield_ItemName'), 'Item Checkout')

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Upload Page/textfield_Price'), '10')

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Upload Page/textfield_SKU'), 'Item Checkout')

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Upload Page/textarea_ItemDescription'), 'Item Checkout')

WebUI.scrollToElement(findTestObject('BESPOKE DEL 2/MERCHANT/Upload Page/textarea_ItemDescription'), 0)

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Upload Page/button_BROWSE'))

WebUI.delay(3)

WebUI.uploadFile(findTestObject('BESPOKE DEL 2/MERCHANT/Upload Page/upload_UploadImage'), 'C:\\Users\\Public\\Pictures\\Sample Pictures\\Tulips.jpg')

WebUI.delay(3)

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Upload Page/button_GreenCheck'))

WebUI.delay(3)

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Upload Page/textfield_Quantity'), '20')

WebUI.scrollToElement(findTestObject('BESPOKE DEL 2/MERCHANT/Upload Page/button_SAVE'), 0)

WebUI.delay(3)

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Upload Page/button_SAVE'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/MERCHANT/Upload Page/button_Later'), 0)

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Upload Page/button_Later'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/MERCHANT/Upload Page/button_Translate_List'), 0)

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/MERCHANT/Upload Page/textfield_search-item'), 0)

WebUI.mouseOver(findTestObject('Time/Merchant/User Settings/image_Seller'))

WebUI.waitForElementVisible(findTestObject('Time/Merchant/User Settings/link_Logout'), 0)

WebUI.click(findTestObject('Time/Merchant/User Settings/link_Logout'), FailureHandling.STOP_ON_FAILURE)

