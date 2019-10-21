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

WebUI.comment('Create Account')

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.Server)

WebUI.maximizeWindow()

if (GlobalVariable.AdminAccount == 'custom') {
    WebUI.click(findTestObject('ADMIN/Admin Onboarding Page/Create_Account_Page/Button_Create_Account'))

    WebUI.verifyElementPresent(findTestObject('ADMIN/Admin Onboarding Page/Admin Onboarding CustomAcc/Textbox_Username'), 
        0)

    WebUI.comment('Continue to Step 2')

    WebUI.setText(findTestObject('ADMIN/Admin Onboarding Page/Admin Onboarding CustomAcc/Textbox_Username'), GlobalVariable.AdminCustom)

    WebUI.setText(findTestObject('ADMIN/Admin Onboarding Page/Admin Onboarding CustomAcc/Textbox_Password'), GlobalVariable.CustomPass)

    WebUI.setText(findTestObject('ADMIN/Admin Onboarding Page/Admin Onboarding CustomAcc/Textbox_Reconfirm_Password'), GlobalVariable.CustomPass)

    WebUI.click(findTestObject('ADMIN/Admin Onboarding Page/Admin Onboarding CustomAcc/Button_Sign_Up'))
} else if (GlobalVariable.AdminAccount == 'google') {
    WebUI.click(findTestObject('ADMIN/Admin Onboarding Page/Create_Account_Page/Button_Signup_Google'))

    WebUI.setText(findTestObject('ADMIN/Admin Onboarding Page/Create_Account_Page/Google_Username'), GlobalVariable.AdminGoogle)

    WebUI.click(findTestObject('ADMIN/Admin Onboarding Page/Create_Account_Page/Button_Google_Next'))

    WebUI.delay(1)

    WebUI.setText(findTestObject('ADMIN/Admin Onboarding Page/Create_Account_Page/Google_Password'), GlobalVariable.GooglePass)

    WebUI.delay(1)

    WebUI.click(findTestObject('ADMIN/Admin Onboarding Page/Create_Account_Page/Button_Google_Next'))
} else if (GlobalVariable.AdminAccount == 'facebook') {
    WebUI.click(findTestObject('ADMIN/Admin Onboarding Page/Create_Account_Page/Button_Signup_Facebook'))

    WebUI.setText(findTestObject('ADMIN/Admin Onboarding Page/Create_Account_Page/Facebook_Email'), GlobalVariable.AdminFacebook)

    WebUI.setText(findTestObject('ADMIN/Admin Onboarding Page/Create_Account_Page/Facebook_Password'), GlobalVariable.FacebookPass)

    WebUI.click(findTestObject('ADMIN/Admin Onboarding Page/Create_Account_Page/Button_Login_Facebook'))
}

WebUI.comment('Step 1')

WebUI.selectOptionByLabel(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step1/1stDropdown_Please select one...Im'), 
    'I’m managing them offline', false)

WebUI.selectOptionByLabel(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step1/2ndDropdown_Please select one...Don'), 
    'Something else!', false)

WebUI.setText(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step1/2nddropdown_textbox_OtherMarketplaceType'), 
    'Marketplace')

WebUI.selectOptionByLabel(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step1/3rdDropdown_Im an individualIm work'), 
    'Someone else!', false)

WebUI.setText(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step1/3rddropdown_textbox_OtherEntityType'), 
    'Business Man')

WebUI.setText(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step1/3rddropdown_textbox_OtherEntityType'), 
    'Business Man')

WebUI.click(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step1/Button_NEXT_Step1'))

WebUI.comment('Step 2')

WebUI.waitForElementVisible(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step2/Textlabel_We will like to know mor'), 
    0)

WebUI.setText(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step2/Textbox_FirstName'), varFName)

WebUI.setText(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step2/Textbox_LastName'), varLName)

WebUI.setText(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step2/Textbox_Email'), varEmail)

WebUI.delay(1)

WebUI.selectOptionByLabel(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step2/Country_Dropdown'), varCountry, 
    false)

WebUI.setText(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step2/Address_Line1'), varAddress1)

WebUI.setText(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step2/Address_Line2'), varAddress2)

WebUI.setText(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step2/Textbox_PhoneNumber'), varContactNumber)

WebUI.click(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step2/Button_Next_Step2'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Step 3')

WebUI.waitForElementVisible(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step3/TextLabel_What type of marketplace'), 
    0)

if (GlobalVariable.Template == 'Bespoke') {
    WebUI.mouseOver(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step3/Textlabel_Retail Goods'))

    WebUI.delay(1)

    WebUI.click(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step3/Button_Retail_Goods_Select'))
} else if (GlobalVariable.Template == 'ServiceBookings(TIME)') {
    WebUI.mouseOver(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step3/Preview/div_ Preview Select Service Bo'))

    WebUI.delay(1)

    WebUI.click(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step3/Select/a_Select_Service Bookings'))
} else if (GlobalVariable.Template == 'RentalGoods(TIME)') {
    WebUI.mouseOver(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step3/Preview/div_ Preview Select Rental Goo'))

    WebUI.delay(1)

    WebUI.click(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step3/Select/a_Select_Rental Goods Keyword'))
} else if (GlobalVariable.Template == 'SpaceRental(SPACE)') {
    WebUI.mouseOver(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step3/Preview/div_ Preview Select Space Rent'))

    WebUI.delay(1)

    WebUI.click(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step3/Select/a_Select_Space Rental'))
} else if (GlobalVariable.Template == 'RentalGoods(SPACE)') {
    WebUI.mouseOver(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step3/Preview/div_ Preview Select Rental Goo (1)'))

    WebUI.delay(1)

    WebUI.click(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step3/Select/a_Select_Rental Goods Location'))
}

