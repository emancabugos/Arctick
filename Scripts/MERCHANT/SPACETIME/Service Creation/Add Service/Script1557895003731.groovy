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
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper

WebUI.waitForElementVisible(findTestObject('MERCHANT/SpaceTime/Listing Page/header_Your Services'), 0)

WebUI.click(findTestObject('MERCHANT/SpaceTime/Listing Page/header_Your Services'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('MERCHANT/SpaceTime/Listing Page/button_Add listings'), 0)

WebUI.click(findTestObject('MERCHANT/SpaceTime/Listing Page/button_Add listings'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Select Category')

if (varCategory == 'Category 1') {
    WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Item Upload/searchbar_category-name'), varCategory)

    WebUI.click(findTestObject('MERCHANT/Upload Item Page/Category/Category 1'), FailureHandling.CONTINUE_ON_FAILURE)
} else if (varCategory == 'Category 2') {
    WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Item Upload/searchbar_category-name'), varCategory)

    WebUI.click(findTestObject('MERCHANT/Upload Item Page/Category/Category 2'), FailureHandling.CONTINUE_ON_FAILURE)
} else if (varCategory == 'Category 3') {
    WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Item Upload/searchbar_category-name'), varCategory)

    WebUI.click(findTestObject('MERCHANT/Upload Item Page/Category/Category 3'), FailureHandling.CONTINUE_ON_FAILURE)
} else if (varCategory == 'Category 4') {
    WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Item Upload/searchbar_category-name'), varCategory)

    WebUI.click(findTestObject('MERCHANT/Upload Item Page/Category/Category 4'), FailureHandling.CONTINUE_ON_FAILURE)
} else if (varCategory == 'Category 5') {
    WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Item Upload/searchbar_category-name'), varCategory)

    WebUI.click(findTestObject('MERCHANT/Upload Item Page/Category/Category 5'), FailureHandling.CONTINUE_ON_FAILURE)
} else if (varCategory == 'Category 6') {
    WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Item Upload/searchbar_category-name'), varCategory)

    WebUI.click(findTestObject('MERCHANT/Upload Item Page/Category/Category 6'), FailureHandling.CONTINUE_ON_FAILURE)
} else if (varCategory == 'Category 7') {
    WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Item Upload/searchbar_category-name'), varCategory)

    WebUI.click(findTestObject('MERCHANT/Upload Item Page/Category/Category 7'), FailureHandling.CONTINUE_ON_FAILURE)
} else if (varCategory == 'Category 8') {
    WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Item Upload/searchbar_category-name'), varCategory)

    WebUI.click(findTestObject('MERCHANT/Upload Item Page/Category/Category 8'), FailureHandling.CONTINUE_ON_FAILURE)
} else if (varCategory == 'Category 9') {
    WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Item Upload/searchbar_category-name'), varCategory)

    WebUI.click(findTestObject('MERCHANT/Upload Item Page/Category/Category 9'), FailureHandling.CONTINUE_ON_FAILURE)
} else if (varCategory == 'Category 10') {
    WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Item Upload/searchbar_category-name'), varCategory)

    WebUI.click(findTestObject('MERCHANT/Upload Item Page/Category/Category 10'), FailureHandling.CONTINUE_ON_FAILURE)
} else if (varCategory == 'Category 11') {
    WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Item Upload/searchbar_category-name'), varCategory)

    WebUI.click(findTestObject('MERCHANT/Upload Item Page/Category/Category 11'), FailureHandling.CONTINUE_ON_FAILURE)
} else if (varCategory == 'Category 12') {
    WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Item Upload/searchbar_category-name'), varCategory)

    WebUI.click(findTestObject('MERCHANT/Upload Item Page/Category/Category 12'), FailureHandling.CONTINUE_ON_FAILURE)
} else if (varCategory == 'Category 13') {
    WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Item Upload/searchbar_category-name'), varCategory)

    WebUI.click(findTestObject('MERCHANT/Upload Item Page/Category/Category 13'), FailureHandling.CONTINUE_ON_FAILURE)
} else if (varCategory == 'Category 14') {
    WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Item Upload/searchbar_category-name'), varCategory)

    WebUI.click(findTestObject('MERCHANT/Upload Item Page/Category/Category 14'), FailureHandling.CONTINUE_ON_FAILURE)
} else if (varCategory == 'Category 15') {
    WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Item Upload/searchbar_category-name'), varCategory)

    WebUI.click(findTestObject('MERCHANT/Upload Item Page/Category/Category 15'), FailureHandling.CONTINUE_ON_FAILURE)
} else if (varCategory == 'Category 16') {
    WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Item Upload/searchbar_category-name'), varCategory)

    WebUI.click(findTestObject('MERCHANT/Upload Item Page/Category/Category 16'), FailureHandling.CONTINUE_ON_FAILURE)
} else if (varCategory == 'Category 17') {
    WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Item Upload/searchbar_category-name'), varCategory)

    WebUI.click(findTestObject('MERCHANT/Upload Item Page/Category/Category 17'), FailureHandling.CONTINUE_ON_FAILURE)
} else if (varCategory == 'Category 18') {
    WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Item Upload/searchbar_category-name'), varCategory)

    WebUI.click(findTestObject('MERCHANT/Upload Item Page/Category/Category 18'), FailureHandling.CONTINUE_ON_FAILURE)
} else if (varCategory == 'Category 19') {
    WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Item Upload/searchbar_category-name'), varCategory)

    WebUI.click(findTestObject('MERCHANT/Upload Item Page/Category/Category 19'), FailureHandling.CONTINUE_ON_FAILURE)
} else if (varCategory == 'Category 20') {
    WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Item Upload/searchbar_category-name'), varCategory)

    WebUI.click(findTestObject('MERCHANT/Upload Item Page/Category/Category 20'), FailureHandling.CONTINUE_ON_FAILURE)
}

WebUI.setText(findTestObject('MERCHANT/SpaceTime/Service Creation/Basic Details/textbox_service name'), varServiceName)

WebUI.setText(findTestObject('MERCHANT/SpaceTime/Service Creation/Basic Details/textbox_description'), 'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.')

WebUI.selectOptionByLabel(findTestObject('MERCHANT/SpaceTime/Service Creation/Basic Details/dropdown_booking type'), varBookingsType, 
    false)

WebUI.comment('Service Duration')

if (varServiceDuration == 'hour') {
    WebUI.waitForElementVisible(findTestObject('MERCHANT/SpaceTime/Service Creation/Basic Details/Default Duration/label_ hour'), 
        0)

    WebUI.setText(findTestObject('MERCHANT/SpaceTime/Service Creation/Basic Details/textbox_price'), varPrice)
} else if (varServiceDuration == 'day') {
    WebUI.waitForElementVisible(findTestObject('MERCHANT/SpaceTime/Service Creation/Basic Details/Default Duration/label_ day'), 
        0)

    WebUI.click(findTestObject('MERCHANT/SpaceTime/Service Creation/Basic Details/Default Duration/label_ day'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.setText(findTestObject('MERCHANT/SpaceTime/Service Creation/Basic Details/textbox_price'), varPrice)
} else if (varServiceDuration == 'week') {
    WebUI.waitForElementVisible(findTestObject('MERCHANT/SpaceTime/Service Creation/Basic Details/Default Duration/label_ week'), 
        0)

    WebUI.click(findTestObject('MERCHANT/SpaceTime/Service Creation/Basic Details/Default Duration/label_ week'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.setText(findTestObject('MERCHANT/SpaceTime/Service Creation/Basic Details/textbox_price'), varPrice)
} else if (varServiceDuration == 'month') {
    WebUI.waitForElementVisible(findTestObject('MERCHANT/SpaceTime/Service Creation/Basic Details/Default Duration/label_ month'), 
        0)

    WebUI.click(findTestObject('MERCHANT/SpaceTime/Service Creation/Basic Details/Default Duration/label_ month'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.setText(findTestObject('MERCHANT/SpaceTime/Service Creation/Basic Details/textbox_price'), varPrice)
} else if (varServiceDuration == 'custom') {
    WebUI.waitForElementVisible(findTestObject('MERCHANT/SpaceTime/Service Creation/Basic Details/Default Duration/label_custom'), 
        0)

    WebUI.click(findTestObject('MERCHANT/SpaceTime/Service Creation/Basic Details/Default Duration/label_custom'), FailureHandling.CONTINUE_ON_FAILURE)

    if (varSpecifyDuration == 'min') {
        WebUI.selectOptionByLabel(findTestObject('MERCHANT/SpaceTime/Service Creation/Basic Details/Default Duration/dropdown_custom duration'), 
            'minute(s)', false)
    } else if (varSpecifyDuration == 'hour') {
        WebUI.selectOptionByLabel(findTestObject('MERCHANT/SpaceTime/Service Creation/Basic Details/Default Duration/dropdown_custom duration'), 
            'hour(s)', false)
    } else if (varSpecifyDuration == 'day') {
        WebUI.selectOptionByLabel(findTestObject('MERCHANT/SpaceTime/Service Creation/Basic Details/Default Duration/dropdown_custom duration'), 
            'day(s)', false)
    }
    
    def element = WebUiCommonHelper.findWebElement(findTestObject('MERCHANT/SpaceTime/Service Creation/Basic Details/Default Duration/number-duration1'), 
        30)

    if (varDuration == '150') {
        WebUI.executeJavaScript('arguments[0].value=\'150\';', Arrays.asList(element))
    } else if (varDuration == '23') {
        WebUI.executeJavaScript('arguments[0].value=\'28\';', Arrays.asList(element))
    } else if (varDuration == '28') {
        WebUI.executeJavaScript('arguments[0].value=\'28\';', Arrays.asList(element))
    }
    
    WebUI.setText(findTestObject('MERCHANT/SpaceTime/Service Creation/Basic Details/Default Duration/textbox_price custom'), 
        varPrice)
}

WebUI.comment('Unlimited Bookings')

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
        0 /*if (varSchedule == '9AM - 5PM') {
        WebUI.setText(findTestObject('MERCHANT/SpaceTime/Service Creation/Schedule/Operating Hours/mon_st'), '')
    } else if (varSchedule == '7AM - 10PM') {
        WebUI.click(findTestObject('MERCHANT/SpaceTime/Service Creation/Schedule/247 toggle/span_onoffswitch-switch'))
    } else if (varSchedule == '2PM - 11AM') {
        WebUI.click(findTestObject('MERCHANT/SpaceTime/Service Creation/Schedule/247 toggle/span_onoffswitch-switch'))
    }*/ )
} else if (varOperation == 'not 24/7') {
    WebUI.setText(findTestObject('MERCHANT/SpaceTime/Service Creation/Schedule/247 toggle/span_onoffswitch-switch'), '')
}

WebUI.setText(findTestObject('MERCHANT/SpaceTime/Service Creation/Schedule/select_st_date'), '25/12/2019')

WebUI.setText(findTestObject('MERCHANT/SpaceTime/Service Creation/Schedule/select_en_date'), '31/12/2019')

WebUI.click(findTestObject('MERCHANT/SpaceTime/Service Creation/Schedule/button_Block this datetime'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('MERCHANT/SpaceTime/Service Creation/Schedule/button_Next schedule'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Image')

WebUI.waitForElementVisible(findTestObject('MERCHANT/SpaceTime/Service Creation/Images/button_Browse'), 0)

WebUI.click(findTestObject('MERCHANT/SpaceTime/Service Creation/Images/button_Browse'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1)

WebUI.uploadFile(findTestObject('MERCHANT/SpaceTime/Service Creation/Images/browse_img/img_upload container'), varImage)

WebUI.delay(1)

WebUI.click(findTestObject('MERCHANT/SpaceTime/Service Creation/Images/browse_img/button_ok'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1)

WebUI.scrollToElement(findTestObject('MERCHANT/SpaceTime/Service Creation/Images/button_Next images'), 0)

WebUI.click(findTestObject('MERCHANT/SpaceTime/Service Creation/Images/button_Next images'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Add Ons')

WebUI.waitForElementVisible(findTestObject('MERCHANT/SpaceTime/Service Creation/Add Ons/textbox_add on name'), 0)

if (varAddons == 'yes') {
    WebUI.setText(findTestObject('MERCHANT/SpaceTime/Service Creation/Add Ons/textbox_add on name'), 'Extra Service')

    WebUI.comment('Location')

    WebUI.setText(findTestObject('MERCHANT/SpaceTime/Service Creation/Add Ons/textbox_surcharge'), '20')

    WebUI.click(findTestObject('MERCHANT/SpaceTime/Service Creation/Add Ons/button_Add'), FailureHandling.CONTINUE_ON_FAILURE)
} else if (varAddons == 'no') {
    WebUI.verifyElementPresent(findTestObject('MERCHANT/SpaceTime/Service Creation/Add Ons/textbox_add on name'), 0)
}

WebUI.comment('Custom Fields')

WebUI.callTestCase(findTestCase('MERCHANT/SPACETIME/Service Creation/Custom Field Input'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('MERCHANT/SpaceTime/Service Creation/Add Ons/button_Next add ons'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Location')

WebUI.waitForElementVisible(findTestObject('MERCHANT/SpaceTime/Service Creation/Location/textbox_address'), 0)

WebUI.setText(findTestObject('MERCHANT/SpaceTime/Service Creation/Location/textbox_address'), varLocation)

WebUI.selectOptionByLabel(findTestObject('MERCHANT/SpaceTime/Service Creation/Location/dropdown_(SELECT COUNTRY)'), varCountry, 
    false)

WebUI.setText(findTestObject('MERCHANT/SpaceTime/Service Creation/Location/textbox_state'), varState)

WebUI.setText(findTestObject('MERCHANT/SpaceTime/Service Creation/Location/textbox_city'), varCity)

WebUI.setText(findTestObject('MERCHANT/SpaceTime/Service Creation/Location/textbox_postalcode'), varPostalCode)


WebUI.click(findTestObject('SPACETIME/MERCHANT/Service Creation/Location/button_Next location'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Delivery Method')

WebUI.waitForElementVisible(findTestObject('SPACETIME/MERCHANT/Service Creation/Delivery/textlabel_Delivery'), 0)

if (varDelivery == 'Delivery 1') {
    WebUI.click(findTestObject('SPACETIME/MERCHANT/Service Creation/Delivery/delivery1'), FailureHandling.CONTINUE_ON_FAILURE)
} else if (varDelivery == 'Delivery 2') {
    WebUI.click(findTestObject('SPACETIME/MERCHANT/Service Creation/Delivery/delivery2'), FailureHandling.CONTINUE_ON_FAILURE)
} else if (varDelivery == 'Pickup 1') {
    WebUI.click(findTestObject('SPACETIME/MERCHANT/Service Creation/Delivery/pickup1'), FailureHandling.CONTINUE_ON_FAILURE)
} else if (varDelivery == 'Pickup 2') {
    WebUI.click(findTestObject('SPACETIME/MERCHANT/Service Creation/Delivery/pickup2'), FailureHandling.CONTINUE_ON_FAILURE)
}

WebUI.click(findTestObject('SPACETIME/MERCHANT/Service Creation/Delivery/button_Upload now'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('END')

WebUI.waitForElementVisible(findTestObject('MERCHANT/SpaceTime/Listing Page/button_Add listings'), 0)

