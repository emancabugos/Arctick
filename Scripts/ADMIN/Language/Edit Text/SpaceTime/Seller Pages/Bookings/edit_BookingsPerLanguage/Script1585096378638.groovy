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

WebUI.comment('Time')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Time/textfield_Hour'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Time/textfield_Day'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Time/textfield_Week'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Time/textfield_Month'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Time/textfield_Night'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Time/textfield_Custom'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Time/textfield_Hours'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Time/textfield_Days'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Time/textfield_Months'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Time/textfield_Nights'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Time/textfield_Minutes'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Time/textfield_NoOf'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Time/textfield_Per'), '*')

WebUI.comment('Toogle')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Toggle/texfield_Yes'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Toggle/textfield_No'), '*')

WebUI.comment('Scheduling')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Scheduling (Uploads Bookings)/textfield_Monday'), 
    '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Scheduling (Uploads Bookings)/textfield_Tuesday'), 
    '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Scheduling (Uploads Bookings)/textfield_Wednesday'), 
    '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Scheduling (Uploads Bookings)/textfield_Thursday'), 
    '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Scheduling (Uploads Bookings)/textfield_Friday'), 
    '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Scheduling (Uploads Bookings)/textfield_Saturday'), 
    '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Scheduling (Uploads Bookings)/textfield_Sunday'), 
    '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Scheduling (Uploads Bookings)/textfield_Date'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Scheduling (Uploads Bookings)/textfield_Time'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Scheduling (Uploads Bookings)/textfield_To'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Scheduling (Uploads Bookings)/textfield_Availability'), 
    '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Scheduling (Uploads Bookings)/textfield_AvailableFrom'), 
    '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Scheduling (Uploads Bookings)/textfield_CheckIn'), 
    '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Scheduling (Uploads Bookings)/textfield_Checkout'), 
    '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Scheduling (Uploads Bookings)/textfield_Booked'), 
    '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Scheduling (Uploads Bookings)/textfield_Blockout'), 
    '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Scheduling (Uploads Bookings)/textfield_DropYourImage'), 
    '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Scheduling (Uploads Bookings)/textfield_Mon'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Scheduling (Uploads Bookings)/textfield_Tue'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Scheduling (Uploads Bookings)/textfield_Wed'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Scheduling (Uploads Bookings)/textfield_Thu'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Scheduling (Uploads Bookings)/textfield_Fri'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Scheduling (Uploads Bookings)/textfield_Sat'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Scheduling (Uploads Bookings)/textfield_Sun'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Scheduling (Uploads Bookings)/textfield_AllDay'), 
    '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Scheduling (Uploads Bookings)/textfield_January'), 
    '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Scheduling (Uploads Bookings)/textfield_March'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Scheduling (Uploads Bookings)/textfield_April'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Scheduling (Uploads Bookings)/textfield_May'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Scheduling (Uploads Bookings)/textfield_June'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Scheduling (Uploads Bookings)/textfield_July'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Scheduling (Uploads Bookings)/textfield_August'), 
    '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Scheduling (Uploads Bookings)/textfiled_September'), 
    '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Scheduling (Uploads Bookings)/textfield_October'), 
    '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Scheduling (Uploads Bookings)/textfield_November'), 
    '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Scheduling (Uploads Bookings)/textfield_December'), 
    '*')

WebUI.comment('Order Status')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Order Status/textfield_OrderStatus'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Order Status/textfield_FullyPaid'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Order Status/textfield_Delivered'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Order Status/textfield_ReadyForPickup'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Order Status/textfield_Refunded'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Order Status/textfield_Pending'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Order Status/textfield_SKU'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Order Status/textfield_Acknowledged'), '*')

WebUI.comment('Location')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Location/textfield_Address'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Location/textfield_Country'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Location/textfield_State'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Location/textfield_City'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Location/textfield_PostalCode'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Location/textfield_SavedAddresses'), '*')

WebUI.comment('Delivery Settings')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Delivery Settings/textfield_Delivery'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Delivery Settings/textfield_PickUp'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Delivery Settings/textfield_DeliveryAddress'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Delivery Settings/textfield_DeliveryPickUpMethod'), 
    '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Delivery Settings/textfield_SelectDeliveryPickupMethod'), 
    '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Delivery Settings/textfield_DeliveryOptions'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Delivery Settings/textfield_SelectDeliveryPickupMethod'), 
    '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Delivery Settings/textfield_DeliveryService'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Delivery Settings/textfield_SurchargePerService'), 
    '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Delivery Settings/textfield_PickUpLocation'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Delivery Settings/textarea_ProvideTheAddress'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Delivery Settings/textfield_PickUpLocations'), '*')

WebUI.comment('Search')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Search/textfield_From'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Search/textfield_To'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Search/textfield_AllDates'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Search/textfield_All'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Search/texfield_Search'), '*')

WebUI.comment('Booking Details')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Booking Details/textfield_AddOns'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Booking Details/textfield_Rate'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Booking Details/textfield_Subtotal'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Booking Details/textfield_ServiceSubTotal'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Booking Details/textfield_AvailableDates'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Booking Details/textfield_Price'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Booking Details/textfield_NoteToSeller'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Booking Details/textfield_Upcoming'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Booking Details/textfield_OngoingPast'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Booking Details/textfield_SearchByNameAndInvoiceID'), 
    '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Booking Details/textfield_InvoiceID'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Booking Details/textfield_ViewOrder'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Booking Details/textfield_Message'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Booking Details/textfield_Timestamp'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Booking Details/textfield_PaymentMethod'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Booking Details/textfield_TransactionTotal'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Booking Details/textfield_NewReview'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Booking Details/textfield_Email'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Booking Details/textfield_Contact'), '*')

WebUI.comment('Removing Item')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Removing Item/textfield_RemoveItem'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Removing Item/textfield_RemovingFromTheList'), '*')

WebUI.comment('Feedback & Ratings')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Feedback  Ratings/textfield_LeaveAFeedbackFor'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Feedback  Ratings/textfield_HowMuchRateThisItem'), 
    '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Feedback  Ratings/textfield_LeaveAFeeback'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Feedback  Ratings/textfield_Submit'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Feedback  Ratings/textfield_RatingSummary'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Feedback  Ratings/textfield_PositiveFeedback'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Feedback  Ratings/textfield_Excellent'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Feedback  Ratings/textlabel_Great'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Feedback  Ratings/textfield_Good'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Feedback  Ratings/textfield_Okay'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Feedback  Ratings/textfield_Unsatisfied'), '*')

WebUI.comment('Buttons')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Buttons/textfield_Next'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Buttons/textfield_Search'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Buttons/textfield_AddNew'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Buttons/textfield_Apply'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Buttons/textfield_UploadNow'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Buttons/textfield_RequestToBook'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Buttons/textfield_Add'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Buttons/tetfield_BuyNow'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Buttons/textfield_Cancel'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Buttons/textfield_Checkout'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Buttons/textfield_Okay'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Buttons/textfield_Reply'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Buttons/textfield_Previous'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Buttons/textfield_LeftFeedback'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Buttons/textfield_Save'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Buttons/textfield_BackToList'), '*')

WebUI.comment('Error Messages')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Error Messages/textfield_MerchantAccessDenied'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Error Messages/textfield_ActionNotAllowed'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Error Messages/textfield_NoEmailAllowed'), '*')

WebUI.delay(1)

WebUI.click(findTestObject('ADMIN/Edit Text/Spacetime/Language/button_save'))

WebUI.delay(1)

