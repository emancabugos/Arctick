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

WebUI.comment('Step 3 (editable variables)')

WebUI.waitForElementVisible(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step4/Textlabel_Awesome Now tell us more'), 
    0)

WebUI.comment('Previous Button Test')

WebUI.click(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step4/Button_PREVIOUS_Step4'), FailureHandling.CONTINUE_ON_FAILURE)

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

WebUI.waitForElementVisible(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step3/TextLabel_What type of marketplace'), 
    0)

WebUI.comment('Input')

WebUI.uploadFile(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step4/Button_Browse_Step4'), 'C:\\\\Katalon\\\\Image\\\\logo2.jpg')

WebUI.setText(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step4/Textbox_Marketplace_Name'), GlobalVariable.AdminCustom)

WebUI.setText(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step4/Textbox_Slogan'), GlobalVariable.Theme)

WebUI.setText(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step4/Textbox_ContactNumber'), varContactNumber)

WebUI.setText(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step4/Textbox_ContactEmail'), GlobalVariable.AdminEmailNotif)

WebUI.click(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step4/Button_Next_Step4'), FailureHandling.CONTINUE_ON_FAILURE)

