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

WebUI.comment('Seller Service Upload')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_BasicDetails'), 
    '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_Schedule'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_Images'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listings/textfield_Listings'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_Additional'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_Location'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_Delivery'), '*')

WebUI.comment('Basic Details')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_BasicDetails - Copy'), 
    '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_Category'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_SelectAll'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_SelectNone'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_ServiceName'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_ItemDescription'), 
    '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_SellYourMarketplace'), 
    '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_InstantBuyOrNegotiation'), 
    '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_InstantBuy'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_Negotiation'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_OvernightBookingService'), 
    '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_Operate247'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_ServiceDuration'), 
    '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_AllowUnlimitedBookings'), 
    '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_MaximumBookingPerSession'), 
    '*')

WebUI.comment('Schedule')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_Schedule'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_OperatingHours'), 
    '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_CheckSpecifyDates'), 
    '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_CheckinCheckout'), 
    '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_CheckInTime'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_CheckoutTime'), 
    '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_AvailabilityCalendar'), 
    '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_SetDateRange'), 
    '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_BlockThisDate'), 
    '*')

WebUI.comment('Images')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_Images01'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_ServiceImage'), 
    '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_Maximum15Image'), 
    '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_ImageRatio'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_Browse'), '*')

WebUI.comment('Additional Services/Details')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_AdditionalService'), 
    '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_AddOnName'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_Surcharge'), '*')

WebUI.comment('Location/Details')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_LocationDetails'), 
    '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_ServiceLocation'), 
    '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_InputLocationDetails'), 
    '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_Note'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_DeliveryMethodsOrPickUpLocation'), 
    '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_Or'), '*')

WebUI.comment('Delivery')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_Delivery01'), '*')

WebUI.delay(1)

WebUI.click(findTestObject('ADMIN/Edit Text/Spacetime/Language/button_save'))

WebUI.delay(1)

