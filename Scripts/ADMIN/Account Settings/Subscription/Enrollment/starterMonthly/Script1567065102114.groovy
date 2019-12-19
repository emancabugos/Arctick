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

not_run: WebUI.callTestCase(findTestCase('Utilities/ADMIN/Admin Login'), [:], FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.waitForElementVisible(findTestObject('ADMIN/Subscription/sidemenu_Account Settings'), 0)

not_run: WebUI.click(findTestObject('ADMIN/Subscription/sidemenu_Account Settings'), FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.waitForElementVisible(findTestObject('ADMIN/Subscription/sidemenu_Subscription'), 0)

not_run: WebUI.click(findTestObject('ADMIN/Subscription/sidemenu_Subscription'), FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.waitForElementVisible(findTestObject('ADMIN/Subscription/h1_Subscription'), 0)

not_run: WebUI.verifyElementText(findTestObject('ADMIN/Subscription/textlabel_Free trial Package'), 'Free trial Package')

not_run: WebUI.comment('Billing')

not_run: WebUI.selectOptionByLabel(findTestObject('ADMIN/Subscription/dd_billing'), 'Daily', false)

not_run: WebUI.verifyOptionSelectedByLabel(findTestObject('ADMIN/Subscription/dd_billing'), 'Daily', false, 0)

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('ADMIN/Subscription/Button Daily/upgrade_starter'), FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.waitForElementVisible(findTestObject('ADMIN/Subscription/Payment/icon_payment'), 0)

not_run: WebUI.verifyElementPresent(findTestObject('ADMIN/Subscription/Payment/textalbel_Payment for Subscription'), 0)

not_run: WebUI.verifyElementText(findTestObject('ADMIN/Subscription/Payment/textlabel_subscription'), GlobalVariable.AdminSubscription)

not_run: WebUI.verifyElementText(findTestObject('ADMIN/Subscription/Payment/textlabel_billing'), GlobalVariable.AdminBilling)

not_run: WebUI.selectOptionByLabel(findTestObject('ADMIN/Subscription/Payment/dd_country'), 'Malaysia', false)

not_run: WebUI.setText(findTestObject('ADMIN/Subscription/Payment/input_state'), 'Selangor')

not_run: WebUI.setText(findTestObject('ADMIN/Subscription/Payment/input_lnamecity'), 'Selangor')

not_run: WebUI.setText(findTestObject('ADMIN/Subscription/Payment/input_postal-code'), '43800')

not_run: WebUI.click(findTestObject('ADMIN/Subscription/Payment/Card Test/input_cardnumber'), FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.setText(findTestObject('ADMIN/Subscription/Payment/Card Test/input_cardnumber'), '4000 0000 0000 3220')

WebUI.openBrowser('')

WebUI.navigateToUrl('https://startermonthly.test.arcadier.io/admin')

WebUI.setText(findTestObject('ADMIN/Subscription/Page_startermonthly/input_username'), 'startermonthly')

WebUI.setText(findTestObject('ADMIN/Subscription/Page_startermonthly/input_password'), 'welcome8')

WebUI.sendKeys(findTestObject('ADMIN/Subscription/Page_startermonthly/input_password'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('ADMIN/Subscription/Page_startermonthly/a_Account Settings'))

WebUI.click(findTestObject('ADMIN/Subscription/Page_startermonthly/a_Subscription'))

WebUI.click(findTestObject('ADMIN/Subscription/Page_startermonthly/span_Upgrade'))

WebUI.click(findTestObject('ADMIN/Subscription/Page_startermonthly/div_id(katalon-elementInfoDiv)'))

WebUI.setText(findTestObject('ADMIN/Subscription/Page_startermonthly/input_cardnumber'), '4242 4242 4242 4242')

WebUI.setText(findTestObject('ADMIN/Subscription/Page_startermonthly/input_exp-date'), '11 / 21')

WebUI.setText(findTestObject('ADMIN/Subscription/Page_startermonthly/input_cvc'), '123')

WebUI.click(findTestObject('ADMIN/Subscription/Page_startermonthly/form_Billing Information'))

