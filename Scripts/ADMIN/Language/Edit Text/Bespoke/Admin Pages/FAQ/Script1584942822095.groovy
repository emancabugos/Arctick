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

WebUI.waitForElementVisible(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Navigation/dd_language'), 0)

WebUI.selectOptionByLabel(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Navigation/dd_language'), varLanguage, false)

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/FAQ/FAQ'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/FAQ/input_How do I sign up_lbl_title'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/FAQ/textarea_This marketplace uses Facebook or Google open ID for all your logins'), 
    '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/FAQ/input_I forgot my password How do I reset it_lbl_title'), 
    '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/FAQ/textarea_You can reset your password through either your Google or Facebook account'), 
    '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/FAQ/input_Do you allow guest checkout_lbl_title'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/FAQ/textarea_Yes You can choose not'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/FAQ/input_What is an invoice ID_lbl_title'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/FAQ/textarea_An invoice ID is a number'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/FAQ/input_What is an order ID_lbl_title'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/FAQ/textarea_For every successful checkout'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/FAQ/input_What are Delivery options_lbl_title'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/FAQ/textarea_Delivery options are a list of seller'), 
    '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/FAQ/input_What are Pick-up options_lbl_title'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/FAQ/textarea_Pick-up options is a list of seller'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/FAQ/input_What are the different order statuses and what do they meant_lbl_title'), 
    '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/FAQ/textarea_There are different order statuse'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/FAQ/input_Will I be charged any fees for making a purchase_lbl_title'), 
    '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/FAQ/textarea_You the buyer w'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/FAQ/input_How do I check my order statuses_lbl_title'), 
    '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/FAQ/textarea_Simply hover the'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/FAQ/input_How do I make a creditdebit card payment_lbl_title'), 
    '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/FAQ/textarea_Click the shopping'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/FAQ/input_Are the creditdebit card payments safe_lbl_title'), 
    '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/FAQ/textarea_0210BP1 does not store'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/FAQ/input_How do I know that my online payment is secure_lbl_title'), 
    '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/FAQ/textarea_0210BP1 uses Secure So'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/FAQ/input_Can I cancel my order and get a refund_lbl_title'), 
    '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/FAQ/textarea_All sales made on'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/FAQ/input_I did not receive my item what am I supposed to do_lbl_title'), 
    '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/FAQ/textarea_If you did not receive an i'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/FAQ/input_The item condition has significant discrepancies'), 
    '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/FAQ/textarea_If there are any significant dis'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/FAQ/input_How do I sign up as a seller_lbl_title'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/FAQ/textarea_Simply click on the BE A SELLER'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/FAQ/input_How do I sell something on 0210BP1_lbl_title'), 
    '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/FAQ/textarea_Simply click on BE A'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/FAQ/input_How do I list an item_lbl_title'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/FAQ/textarea_You can list an item by'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/FAQ/input_Can I denote my items in another currency_lbl_title'), 
    '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/FAQ/textarea_No unfortunately not'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/FAQ/input_Why cant I log in to my seller dashboard_lbl_title'), 
    '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/FAQ/textarea_If you cant log in to your'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/FAQ/input_How do I edit my item information_lbl_title'), 
    '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/FAQ/textarea_1 On your seller menu click'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/FAQ/input_Can I add a few delivery'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/FAQ/textarea_Yes you can definitely do so'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/FAQ/input_What is the purchasable button for_lbl_title'), 
    '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/FAQ/textarea_If you receive any complaints'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/FAQ/input_Why cant I find the right category for my item_lbl_title'), 
    '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/FAQ/textarea_You are only able to add an ite'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/FAQ/input_How do I keep track of my sales_lbl_title'), 
    '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/FAQ/textarea_Click the Sales tab on t'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/FAQ/input_How can I keep track of orders that I receive_lbl_title'), 
    '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/FAQ/textarea_Click the Orders tab on'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/FAQ/input_What do the different order statuses mean_lbl_title'), 
    '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/FAQ/textarea_For pick up the order'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/FAQ/input_Are there any subscription fees or listing fees on 0210BP1_lbl_title'), 
    '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/FAQ/textarea_There are no listing fees o'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/FAQ/input_How do I receive my PayoutPayment_lbl_title'), 
    '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/FAQ/textarea_Stripe will automatically'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/FAQ/input_Stripe states that a transfer'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/FAQ/textarea_Stripe submits transfers every'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/FAQ/input_What items are prohibited on 0210BP1_lbl_title'), 
    '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/FAQ/textarea_This policy is part of our Terms of Use'), 
    '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/FAQ/input_Why is my product deletedbanned_lbl_title'), 
    '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/FAQ/textarea_If any product does not adhere'), '*')

WebUI.click(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Homepage/button_save'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Homepage/toaster_success FAQ'), 0)

