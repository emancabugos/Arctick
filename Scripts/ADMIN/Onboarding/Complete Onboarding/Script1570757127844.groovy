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

if (varServer == 'Test') {
    WebUI.navigateToUrl('https://www.test.arcadier.io')
} else if (varServer == 'Staging') {
    WebUI.navigateToUrl('https://www.staging.arcadier.io')
} else if (varServer == 'Live') {
    WebUI.navigateToUrl('https://www.arcadier.io')
}

WebUI.maximizeWindow()

if (varAccountType == 'custom') {
    WebUI.click(findTestObject('ADMIN/Admin Onboarding Page/Create_Account_Page/Button_Create_Account'))

    WebUI.verifyElementPresent(findTestObject('ADMIN/Admin Onboarding Page/Admin Onboarding CustomAcc/Textbox_Username'), 
        0)

    WebUI.setText(findTestObject('ADMIN/Admin Onboarding Page/Admin Onboarding CustomAcc/Textbox_Username'), varUsername)

    WebUI.setText(findTestObject('ADMIN/Admin Onboarding Page/Admin Onboarding CustomAcc/Textbox_Password'), 'welcome8')

    WebUI.setText(findTestObject('ADMIN/Admin Onboarding Page/Admin Onboarding CustomAcc/Textbox_Reconfirm_Password'), 'welcome8')

    WebUI.click(findTestObject('ADMIN/Admin Onboarding Page/Admin Onboarding CustomAcc/Button_Sign_Up'))
} else if (varAccountType == 'google') {
    WebUI.click(findTestObject('ADMIN/Admin Onboarding Page/Create_Account_Page/Button_Signup_Google'))

    WebUI.setText(findTestObject('ADMIN/Admin Onboarding Page/Create_Account_Page/Google_Username'), varGoogle)

    WebUI.click(findTestObject('ADMIN/Admin Onboarding Page/Create_Account_Page/Button_Google_Next'))

    WebUI.delay(1)

    WebUI.setText(findTestObject('ADMIN/Admin Onboarding Page/Create_Account_Page/Google_Password'), varGooglePass)

    WebUI.delay(1)

    WebUI.click(findTestObject('ADMIN/Admin Onboarding Page/Create_Account_Page/Button_Google_Next'))
} else if (varAccountType == 'facebook') {
    WebUI.click(findTestObject('ADMIN/Admin Onboarding Page/Create_Account_Page/Button_Signup_Facebook'))

    WebUI.setText(findTestObject('ADMIN/Admin Onboarding Page/Create_Account_Page/Facebook_Email'), varFacebook)

    WebUI.setText(findTestObject('ADMIN/Admin Onboarding Page/Create_Account_Page/Facebook_Password'), varFacebookPass)

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

WebUI.delay(1)

if (varTemplate == 'Bespoke') {
    WebUI.mouseOver(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step3/Textlabel_Retail Goods'))

    WebUI.delay(1)

    WebUI.click(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step3/Button_Retail_Goods_Select'))
} else if (varTemplate == 'ServiceBookings(TIME)') {
    WebUI.mouseOver(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step3/Preview/div_ Preview Select Service Bo'))

    WebUI.delay(1)

    WebUI.click(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step3/Select/a_Select_Service Bookings'))
} else if (varTemplate == 'RentalGoods(TIME)') {
    WebUI.mouseOver(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step3/Preview/div_ Preview Select Rental Goo'))

    WebUI.delay(1)

    WebUI.click(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step3/Select/a_Select_Rental Goods Keyword'))
} else if (varTemplate == 'Space') {
    WebUI.mouseOver(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step3/Preview/div_ Preview Select Space Rent'))

    WebUI.delay(1)

    WebUI.click(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step3/Select/a_Select_Space Rental'))
} else if (varTemplate == 'RentalGoods(SPACE)') {
    WebUI.mouseOver(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step3/Preview/div_ Preview Select Rental Goo (1)'))

    WebUI.delay(1)

    WebUI.click(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step3/Select/a_Select_Rental Goods Location'))
}

WebUI.comment('Step 4')

WebUI.uploadFile(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step4/Button_Browse_Step4'), varLogo)

WebUI.setText(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step4/Textbox_Marketplace_Name'), varUsername)

WebUI.setText(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step4/Textbox_Slogan'), varTheme)

WebUI.setText(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step4/Textbox_ContactNumber'), varContactNumber)

WebUI.setText(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step4/Textbox_ContactEmail'), varEmail)

WebUI.click(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step4/Button_Next_Step4'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Step 5')

WebUI.waitForElementVisible(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step5/h1_5. Preview  pick out a mark'), 
    0)

if (varTemplate == 'Bespoke') {
    if (varTheme == 'Theme 1') {
        WebUI.click(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step5/Bespoke_Theme_Selection/Theme1_select'))
    } else if (varTheme == 'Theme 2') {
        WebUI.click(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step5/Bespoke_Theme_Selection/Theme2_select'))
    } else if (varTheme == 'Theme 3') {
        WebUI.click(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step5/Bespoke_Theme_Selection/Theme3_select'))
    } else if (varTheme == 'Theme 4') {
        WebUI.click(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step5/Bespoke_Theme_Selection/Theme4_select'))
    }
} else if (varTemplate == 'Space') {
    if (varTheme == 'Theme 1') {
        WebUI.click(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step5/Button_Theme1_Select'))
    } else if (varTheme == 'Theme 2') {
        WebUI.click(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step5/Button_Theme2_Select'))
    } else if (varTheme == 'Theme 3') {
        WebUI.click(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step5/Button_Theme3_Select'))
    } else if (varTheme == 'Theme 4') {
        WebUI.delay(1)

        WebUI.click(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step5/Button_Theme4_Select'))
    }
}

WebUI.click(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step5/Button_Next_Step5'))

WebUI.comment('Step 6')

WebUI.waitForElementVisible(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step6/Textlabel_Select your marketplace'), 
    0)

WebUI.click(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step6/Button_Browse_Step6'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.uploadFile(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step6/Image_Container'), varCoverImage)

WebUI.waitForElementVisible(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step6/Image Cropper/div_btn btn-success btn-ok'), 
    0)

WebUI.click(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step6/Image Cropper/div_btn btn-success btn-ok'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step6/Image Cropper/a_Save Photo'), 
    0)

WebUI.click(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step6/Image Cropper/a_Save Photo'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1)

WebUI.click(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step6/Button_Next_Step6'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Step 7 (editable variables)')

WebUI.waitForElementVisible(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step7/Textlabel_7. Now how would you like t'), 
    0)

WebUI.selectOptionByLabel(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step7/Dropdown_Currency'), varCurrency, 
    false)

WebUI.setText(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step7/Textbox_TransactionFee'), varAdminFee)

WebUI.click(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step7/Button_Next_Step7'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Step 8')

WebUI.waitForElementVisible(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step8/Textlabel_Review your marketplace pol'), 
    0)

WebUI.comment('Checkbox Return Policy')

WebUI.click(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step8/Checkbox_ReturnPolicy'))

WebUI.comment('Terms and Condition')

WebUI.click(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step8/Checkbox_IsAgreed'))

WebUI.click(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step8/Button_Next_Step8'))

