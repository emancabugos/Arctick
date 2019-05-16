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

WebUI.callTestCase(findTestCase('Utilities/ADMIN/Admin Login'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Getting Started/Arcadier_image link'), 0)

WebUI.click(findTestObject('ADMIN/Getting Started/Arcadier_image link'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Step 3 Payment')

WebUI.waitForElementVisible(findTestObject('ADMIN/Getting Started/span_Welcome to Arcadier Marke'), 0)

WebUI.verifyElementText(findTestObject('ADMIN/Getting Started/span_Welcome to Arcadier Marke'), 'Welcome to Arcadier Marketplaces!')

WebUI.waitForElementVisible(findTestObject('ADMIN/Getting Started/Step 3/div_Step 3  Add your payment m'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Getting Started/Step 3/step3_image'), 0)

WebUI.waitForElementVisible(findTestObject('ADMIN/Getting Started/Step 3/div_Step 3  Add your payment m'), 0)

WebUI.verifyElementText(findTestObject('ADMIN/Getting Started/Step 3/p_Make sure to set up your pay'), 'Make sure to set up your payment methods to enable online transactions on your marketplace.')

WebUI.comment('Click video tutorial')

WebUI.waitForElementVisible(findTestObject('ADMIN/Getting Started/Step 3/step 3_video'), 0)

WebUI.click(findTestObject('ADMIN/Getting Started/Step 3/step 3_video'))

WebUI.delay(1)

WebUI.switchToWindowIndex(1)

WebUI.waitForElementVisible(findTestObject('ADMIN/Getting Started/Step 3/yt-formatted-string_Payments H'), 0)

WebUI.closeWindowIndex(1)

WebUI.delay(1)

WebUI.switchToWindowIndex(0)

WebUI.comment('add payment')

WebUI.waitForElementVisible(findTestObject('ADMIN/Getting Started/Step 3/div_Add Payments'), 0)

WebUI.click(findTestObject('ADMIN/Getting Started/Step 3/div_Add Payments'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Getting Started/Step 3/Link Stripe/status_grey'), 0)

WebUI.verifyElementText(findTestObject('ADMIN/Getting Started/Step 3/Link Stripe/div_Not Added'), 'Not Added')

WebUI.click(findTestObject('ADMIN/Getting Started/Step 3/Link Stripe/div_Link Account'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Getting Started/Step 3/Link Stripe/stripe_icon'), 0)

WebUI.setText(findTestObject('ADMIN/Getting Started/Step 3/Link Stripe/input_SecretKey'), 'sk_test_j30Ilbz4gtTntBTdblXHalHT')

WebUI.setText(findTestObject('ADMIN/Getting Started/Step 3/Link Stripe/input_PublicKey'), 'pk_test_9YHkrYCVufnDeLcJvdFpuV4H')

WebUI.delay(2)

WebUI.click(findTestObject('ADMIN/Getting Started/Step 3/Link Stripe/input_save_key'))

WebUI.delay(1)

WebUI.setText(findTestObject('ADMIN/Getting Started/Step 3/Link Stripe/input_ClientId'), 'ca_9BT1yF2mtBKgHRddurb6sOc0FCehNT2w')

WebUI.delay(2)

WebUI.click(findTestObject('ADMIN/Getting Started/Step 3/Link Stripe/input_save_client id'))

WebUI.delay(2)

WebUI.click(findTestObject('ADMIN/Getting Started/Step 3/Link Stripe/a_Back'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Getting Started/Step 3/Link Stripe/div_payment-status-color2'), 0)

WebUI.waitForElementVisible(findTestObject('ADMIN/Getting Started/Step 3/Link Stripe/div_Im Done here'), 0)

WebUI.click(findTestObject('ADMIN/Getting Started/Step 3/Link Stripe/div_Im Done here'))

WebUI.waitForElementVisible(findTestObject('Utilities/Admin Logout/button_Logout'), 0)

WebUI.click(findTestObject('Utilities/Admin Logout/button_Logout'), FailureHandling.CONTINUE_ON_FAILURE)

