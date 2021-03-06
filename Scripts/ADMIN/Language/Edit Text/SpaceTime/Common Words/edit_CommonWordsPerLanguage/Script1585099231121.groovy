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

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Bookings/textfield_YourBookings'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Bookings/textfield_ServiceStartDate'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Bookings/textfiel_BuyerName'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Bookings/textfield_ServiceStartDateFrom'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Bookings/textfield_ExportCSV'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Bookings/textfield_BuyerInfo'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Bookings/textfield_AdminFee'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Bookings/textfield_ServiceDetails'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Bookings/textfield_Note'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Bookings/textfield_StatusChange'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Bookings/textarea_ItemOrderStatus'), '*')

WebUI.delay(1)

WebUI.click(findTestObject('ADMIN/Edit Text/Spacetime/Language/button_save'))

WebUI.delay(1)

