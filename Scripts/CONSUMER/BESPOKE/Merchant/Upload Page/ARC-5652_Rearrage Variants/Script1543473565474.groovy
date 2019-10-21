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

WebUI.navigateToUrl(GlobalVariable.homepage)

WebUI.verifyElementPresent(findTestObject('Time/Consumer/Homepage/BeASeller_Link'), 0)

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

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Upload Page/textfield_ItemName'), 'Test Rearrange Variants')

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Upload Page/textfield_Price'), '10')

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Upload Page/textfield_SKU'), 'Test Rearrange Variants')

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Upload Page/textarea_ItemDescription'), 'Test Rearrange Variants')

WebUI.scrollToElement(findTestObject('BESPOKE DEL 2/MERCHANT/Upload Page/textarea_ItemDescription'), 0)

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Upload Page/button_BROWSE'))

WebUI.delay(3)

WebUI.uploadFile(findTestObject('BESPOKE DEL 2/MERCHANT/Upload Page/upload_UploadImage'), 'C:\\Users\\Public\\Pictures\\Sample Pictures\\Tulips.jpg')

WebUI.delay(3)

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Upload Page/button_GreenCheck'))

WebUI.scrollToElement(findTestObject('BESPOKE DEL 2/MERCHANT/Upload Page/toggle_Quantity'), 0)

WebUI.delay(3)

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Upload Page/toggle_Variants'))

WebUI.delay(3)

WebUI.verifyElementText(findTestObject('BESPOKE DEL 2/MERCHANT/Upload Page/label_Variants'), 'Variants')

WebUI.verifyElementText(findTestObject('BESPOKE DEL 2/MERCHANT/Upload Page/label_Add up to 3 different available options for the item eg . Colour Size and Material'), 
    'Add up to 3 different available options for the item, e,g . Colour, Size, and Material')

WebUI.verifyElementText(findTestObject('BESPOKE DEL 2/MERCHANT/Upload Page/label_VARIANTS OPTIONS'), 'VARIANTS OPTIONS')

WebUI.verifyElementText(findTestObject('BESPOKE DEL 2/MERCHANT/Upload Page/label_VARIANTS CHOICES'), 'VARIANTS CHOICES')

WebUI.verifyElementText(findTestObject('BESPOKE DEL 2/MERCHANT/Upload Page/label_Image'), 'Image')

WebUI.verifyElementText(findTestObject('BESPOKE DEL 2/MERCHANT/Upload Page/label_Color'), 'Color')

WebUI.verifyElementText(findTestObject('BESPOKE DEL 2/MERCHANT/Upload Page/label_SKU'), 'SKU')

WebUI.verifyElementText(findTestObject('BESPOKE DEL 2/MERCHANT/Upload Page/label_Surcharge'), 'Surcharge')

WebUI.verifyElementText(findTestObject('BESPOKE DEL 2/MERCHANT/Upload Page/label_Total Price'), 'Total Price')

WebUI.verifyElementText(findTestObject('BESPOKE DEL 2/MERCHANT/Upload Page/label_Unlimited'), 'Unlimited')

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Upload Page/delete_Red'))

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Upload Page/textfield_VarOpt1'), 'Size')

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Upload Page/textfield_VarCho1'), 'S,M,L,')

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Upload Page/textfield_VarOpt2'), 'Colour')

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Upload Page/textfield_VarCho2'), 'Black,White,Green,')

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Upload Page/textfield_VarOpt3'), 'Design')

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Upload Page/textfield_VarCho3'), 'Plain,Stripes,Checkered,')

WebUI.delay(3)

WebUI.dragAndDropByOffset(findTestObject('BESPOKE DEL 2/MERCHANT/Upload Page/a_Variants_Options/Opt_1'), 50, 80)

WebUI.delay(3)

WebUI.dragAndDropToObject(findTestObject('BESPOKE DEL 2/MERCHANT/Upload Page/a_Variants_Options/Opt_3'), findTestObject('BESPOKE DEL 2/MERCHANT/Upload Page/a_Variants_Options/Opt_2'))

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Upload Page/label_Unlimited'))

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('BESPOKE DEL 2/MERCHANT/Upload Page/a_Custom Fields/custom_textfield'), 100)

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Upload Page/a_Custom Fields/custom_textfield'), 'Textfield')

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Upload Page/a_Custom Fields/custom_hyperlink'), 'www.google.com')

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Upload Page/a_Custom Fields/custom_email'), 'test@gmail.com')

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Upload Page/a_Custom Fields/custom_percentage'), '90')

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Upload Page/a_Custom Fields/custom_embedvideo'), '<blockquote class="embedly-card"><h4><a href="https://www.youtube.com/watch?v=qeh2zscThVw">ONE OK ROCK - We are [Official Video from "Ambitions" JAPAN TOUR]</a></h4><p>LIVE DVD&Blu-ray 「ONE OK ROCK 2017 "Ambitions" JAPAN TOUR」 May 16th, 2018 in stores https://www.asmart.jp/p_90006432 "ONE OK ROCK 2018 AMBITIONS JAPAN DOME TOUR" 03/31/2018 : KYOCERA DOME OSAKA 04/01/2018 : KYOCERA DOME OSAKA 04/04/2018 : TOKYO DOME 04/05/2018 : TOKYO DOME 04/14/2018 : NAGOYA DOME 04/15/2018 : NAGOYA DOME 04/21/2018 : FUKUOKA YAHUOKU!DOME 04/22/2018 : FUKUOKA YAHUOKU!DOME Get "Ambitions" on...</p></blockquote>')

WebUI.delay(3)

WebUI.uploadFile(findTestObject('BESPOKE DEL 2/MERCHANT/Upload Page/a_Custom Fields/custom_pdf'), 'C:\\Users\\April\\Downloads\\RT-0244.pdf')

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Upload Page/a_Custom Fields/custom_number'), '100')

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Upload Page/a_Custom Fields/custom_date'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Upload Page/a_Custom Fields/custom_time'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Upload Page/button_SAVE'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/MERCHANT/Upload Page/button_Later'), 0)

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Upload Page/button_Later'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/MERCHANT/Upload Page/textfield_search-item'), 0)

WebUI.mouseOver(findTestObject('Time/Merchant/User Settings/image_Seller'))

WebUI.waitForElementVisible(findTestObject('Time/Merchant/User Settings/link_Logout'), 0)

WebUI.click(findTestObject('Time/Merchant/User Settings/link_Logout'), FailureHandling.STOP_ON_FAILURE)

