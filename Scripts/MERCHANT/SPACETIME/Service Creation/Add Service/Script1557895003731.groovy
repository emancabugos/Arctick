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

WebUI.waitForElementVisible(findTestObject('MERCHANT/SpaceTime/Listing Page/header_Your Services'), 0)

WebUI.click(findTestObject('MERCHANT/SpaceTime/Listing Page/header_Your Services'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('MERCHANT/SpaceTime/Listing Page/button_Add listings'), 0)

WebUI.click(findTestObject('MERCHANT/SpaceTime/Listing Page/button_Add listings'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Basic Details')

WebUI.waitForElementVisible(findTestObject('MERCHANT/SpaceTime/Service Creation/Basic Details/textbox_search cat'), 0)

WebUI.setText(findTestObject('MERCHANT/SpaceTime/Service Creation/Basic Details/textbox_search cat'), varCategory)

WebUI.comment('Select Category')

if (varCategory == 'Category 19') {
    WebUI.click(findTestObject('MERCHANT/SpaceTime/Service Creation/Category List/checkbox_cat19'))
} else if (varCategory == 'Category 20') {
    WebUI.click(findTestObject('MERCHANT/SpaceTime/Service Creation/Category List/checkbox_cat20'), 0)
}

WebUI.setText(findTestObject('MERCHANT/SpaceTime/Service Creation/Basic Details/textbox_service name'), varServiceName)

WebUI.setText(findTestObject('MERCHANT/SpaceTime/Service Creation/Basic Details/textbox_description'), 'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.')

WebUI.selectOptionByLabel(findTestObject('MERCHANT/SpaceTime/Service Creation/Basic Details/dropdown_booking type'), varBookingsType, 
    false)

WebUI.comment('Service Duration')

if (varServiceDuration == 'hour') {
    WebUI.waitForElementVisible(findTestObject('MERCHANT/SpaceTime/Service Creation/Basic Details/Default Duration/label_ hour'), 
        0)
} else if (varServiceDuration == 'day') {
    WebUI.waitForElementVisible(findTestObject('MERCHANT/SpaceTime/Service Creation/Basic Details/Default Duration/label_ day'), 
        0)

    WebUI.click(findTestObject('MERCHANT/SpaceTime/Service Creation/Basic Details/Default Duration/label_ day'), FailureHandling.CONTINUE_ON_FAILURE)
} else if (varServiceDuration == 'week') {
    WebUI.waitForElementVisible(findTestObject('MERCHANT/SpaceTime/Service Creation/Basic Details/Default Duration/label_ week'), 
        0)

    WebUI.click(findTestObject('MERCHANT/SpaceTime/Service Creation/Basic Details/Default Duration/label_ week'), FailureHandling.CONTINUE_ON_FAILURE)
} else if (varServiceDuration == 'month') {
    WebUI.waitForElementVisible(findTestObject('MERCHANT/SpaceTime/Service Creation/Basic Details/Default Duration/label_ month'), 
        0)

    WebUI.click(findTestObject('MERCHANT/SpaceTime/Service Creation/Basic Details/Default Duration/label_ month'), 0)
} else if (varServiceDuration == 'custom') {
    WebUI.waitForElementVisible(findTestObject('MERCHANT/SpaceTime/Service Creation/Basic Details/Default Duration/label_custom'), 
        0)

    WebUI.click(findTestObject('MERCHANT/SpaceTime/Service Creation/Basic Details/Default Duration/label_custom'), 0)
}

WebUI.setText(findTestObject('MERCHANT/SpaceTime/Service Creation/Basic Details/textbox_price'), varPrice)

if (varUnlimitedBookings == 'yes') {
    WebUI.delay(1)

    WebUI.click(findTestObject('MERCHANT/SpaceTime/Service Creation/Basic Details/Toggle/span_onoffswitch-switch'))
} else if (varUnlimitedBookings == 'no') {
    WebUI.verifyElementPresent(findTestObject('MERCHANT/SpaceTime/Service Creation/Basic Details/Toggle/span_onoffswitch-switch'), 
        0)
}

WebUI.setText(findTestObject('MERCHANT/SpaceTime/Service Creation/Basic Details/textbox_max bookings'), varBookingsPerSession)

if (varServiceType == 'negotiation') {
    WebUI.click(findTestObject('MERCHANT/SpaceTime/Service Creation/Basic Details/button_ Negotiation'))

    WebUI.click(findTestObject('MERCHANT/SpaceTime/Service Creation/Basic Details/button_ Instant buy'))
} else if (varServiceType == 'both') {
    WebUI.click(findTestObject('MERCHANT/SpaceTime/Service Creation/Basic Details/button_ Negotiation'))
} else if (varServiceType == 'instant') {
    WebUI.verifyElementPresent(findTestObject('MERCHANT/SpaceTime/Service Creation/Basic Details/button_ Instant buy'), 
        0)
}

WebUI.click(findTestObject('MERCHANT/SpaceTime/Service Creation/Basic Details/button_Next basic details'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Schedule')

WebUI.waitForElementVisible(findTestObject('MERCHANT/SpaceTime/Service Creation/Schedule/247 toggle/span_onoffswitch-switch'), 
    0)

if (varOperation == '24/7') {
    WebUI.verifyElementPresent(findTestObject('MERCHANT/SpaceTime/Service Creation/Schedule/247 toggle/span_onoffswitch-switch'), 
        0)
} else if (varOperation == 'not 24/7') {
    WebUI.click(findTestObject('MERCHANT/SpaceTime/Service Creation/Schedule/toggle_24 7'))
}

WebUI.click(findTestObject('MERCHANT/SpaceTime/Service Creation/Schedule/247 toggle/span_onoffswitch-switch'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('MERCHANT/SpaceTime/Service Creation/Schedule/button_Next schedule'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Image')

WebUI.waitForElementVisible(findTestObject('MERCHANT/SpaceTime/Service Creation/Images/button_Browse'), 0)

WebUI.click(findTestObject('MERCHANT/SpaceTime/Service Creation/Images/button_Browse'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1)

WebUI.uploadFile(findTestObject('MERCHANT/SpaceTime/Service Creation/Images/browse_img/img_upload container'), varImage)

WebUI.click(findTestObject('MERCHANT/SpaceTime/Service Creation/Images/browse_img/button_ok'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1)

WebUI.scrollToElement(findTestObject('MERCHANT/SpaceTime/Service Creation/Images/button_Next images'), 0)

WebUI.click(findTestObject('MERCHANT/SpaceTime/Service Creation/Images/button_Next images'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Add Ons')

WebUI.waitForElementVisible(findTestObject('MERCHANT/SpaceTime/Service Creation/Add Ons/textbox_add on name'), 0)

WebUI.setText(findTestObject('MERCHANT/SpaceTime/Service Creation/Add Ons/textbox_add on name'), 'Extra Service')

WebUI.setText(findTestObject('MERCHANT/SpaceTime/Service Creation/Add Ons/textbox_surcharge'), '20')

WebUI.click(findTestObject('MERCHANT/SpaceTime/Service Creation/Add Ons/button_Add'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('MERCHANT/SpaceTime/Service Creation/Add Ons/button_Next add ons'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Location')

WebUI.waitForElementVisible(findTestObject('MERCHANT/SpaceTime/Service Creation/Location/textbox_address'), 0)

WebUI.setText(findTestObject('MERCHANT/SpaceTime/Service Creation/Location/textbox_address'), varLocation)

WebUI.selectOptionByLabel(findTestObject('MERCHANT/SpaceTime/Service Creation/Location/dropdown_(SELECT COUNTRY)'), varCountry, 
    false)

WebUI.setText(findTestObject('MERCHANT/SpaceTime/Service Creation/Location/textbox_state'), varState)

WebUI.setText(findTestObject('MERCHANT/SpaceTime/Service Creation/Location/textbox_city'), varCity)

WebUI.setText(findTestObject('MERCHANT/SpaceTime/Service Creation/Location/textbox_postalcode'), varPostalCode)

WebUI.click(findTestObject('MERCHANT/SpaceTime/Service Creation/Location/button_Upload now'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('END')

