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
import org.openqa.selenium.WebElement as WebElement


WebUI.waitForElementVisible(findTestObject('ADMIN/Subscription/sidemenu_Account Settings'), 0)

WebUI.click(findTestObject('ADMIN/Subscription/sidemenu_Account Settings'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Subscription/sidemenu_Subscription'), 0)

WebUI.click(findTestObject('ADMIN/Subscription/sidemenu_Subscription'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Subscription/h1_Subscription'), 0)

WebUI.verifyElementText(findTestObject('ADMIN/Subscription/textlabel_Free trial Package'), 'Free trial Package')

WebUI.comment('Billing')

WebUI.selectOptionByLabel(findTestObject('ADMIN/Subscription/dd_billing'), GlobalVariable.AdminBilling, false)

if (GlobalVariable.AdminBilling == 'Daily') {
    WebUI.comment('Subscription Daily')

    WebUI.delay(2)

    if (GlobalVariable.AdminSubscription == 'Starter') {
        WebUI.click(findTestObject('ADMIN/Subscription/Button Daily/upgrade_starter'), FailureHandling.CONTINUE_ON_FAILURE)
    } else if (GlobalVariable.AdminSubscription == 'Basic') {
        WebUI.click(findTestObject('ADMIN/Subscription/Button Daily/upgrade_basic'), FailureHandling.CONTINUE_ON_FAILURE)
    } else if (GlobalVariable.AdminSubscription == 'Growth') {
        WebUI.click(findTestObject('ADMIN/Subscription/Button Daily/upgrade_growth'), FailureHandling.CONTINUE_ON_FAILURE)
    } else if (GlobalVariable.AdminSubscription == 'Scale') {
        WebUI.click(findTestObject('ADMIN/Subscription/Button Daily/upgrade_scale'), FailureHandling.CONTINUE_ON_FAILURE)
    }
} else if (GlobalVariable.AdminBilling == '6 Months Billing (+) (2 Days)') {
    WebUI.comment('Subscription Monthly')

    WebUI.delay(2)

    if (GlobalVariable.AdminSubscription == 'Starter') {
        WebUI.click(findTestObject('ADMIN/Subscription/Button Monthly/upgrade_starter'), FailureHandling.CONTINUE_ON_FAILURE)
    } else if (GlobalVariable.AdminSubscription == 'Basic') {
        WebUI.click(findTestObject('ADMIN/Subscription/Button Monthly/upgrade_basic'), FailureHandling.CONTINUE_ON_FAILURE)
    } else if (GlobalVariable.AdminSubscription == 'Growth') {
        WebUI.click(findTestObject('ADMIN/Subscription/Button Monthly/upgrade_growth'), FailureHandling.CONTINUE_ON_FAILURE)
    } else if (GlobalVariable.AdminSubscription == 'Scale') {
        WebUI.click(findTestObject('ADMIN/Subscription/Button Monthly/upgrade_scale'), FailureHandling.CONTINUE_ON_FAILURE)
    }
} else if (GlobalVariable.AdminBilling == 'Yearly (3 Days)') {
    WebUI.comment('Subscription Yearly')

    WebUI.delay(2)

    if (GlobalVariable.AdminSubscription == 'Starter') {
        WebUI.click(findTestObject('ADMIN/Subscription/Button Yearly/upgrade_starter'), FailureHandling.CONTINUE_ON_FAILURE)
    } else if (GlobalVariable.AdminSubscription == 'Basic') {
        WebUI.click(findTestObject('ADMIN/Subscription/Button Yearly/upgrade_basic'), FailureHandling.CONTINUE_ON_FAILURE)
    } else if (GlobalVariable.AdminSubscription == 'Growth') {
        WebUI.click(findTestObject('ADMIN/Subscription/Button Yearly/upgrade_growth'), FailureHandling.CONTINUE_ON_FAILURE)
    } else if (GlobalVariable.AdminSubscription == 'Scale') {
        WebUI.click(findTestObject('ADMIN/Subscription/Button Yearly/upgrade_scale'), FailureHandling.CONTINUE_ON_FAILURE)
    }
}

WebUI.comment('Payment Page')

WebUI.waitForElementVisible(findTestObject('ADMIN/Subscription/Payment/icon_payment'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Subscription/Payment/textalbel_Payment for Subscription'), 0)

WebUI.verifyElementText(findTestObject('ADMIN/Subscription/Payment/textlabel_subscription'), GlobalVariable.AdminSubscription)

WebUI.verifyElementText(findTestObject('ADMIN/Subscription/Payment/textlabel_billing'), GlobalVariable.AdminBilling)

WebUI.selectOptionByLabel(findTestObject('ADMIN/Subscription/Payment/dd_country'), 'Malaysia', false)

WebUI.setText(findTestObject('ADMIN/Subscription/Payment/input_state'), 'Selangor')

WebUI.setText(findTestObject('ADMIN/Subscription/Payment/input_lnamecity'), 'Selangor')

WebUI.setText(findTestObject('ADMIN/Subscription/Payment/input_postal-code'), '43800')

WebUI.setText(findTestObject('ADMIN/Subscription/Payment/Card Test/input_cardnumber'), '43800')


