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

WebUI.comment('Step 8')

WebUI.waitForElementVisible(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step8/Textlabel_Review your marketplace pol'), 
    0)

WebUI.comment('Previous Button Test')

WebUI.click(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step8/Button_PREVIOUS_Step8'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step7/Textlabel_7. Now how would you like t'), 
    0)

WebUI.click(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step7/Button_Next_Step7'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step8/Textlabel_Review your marketplace pol'), 
    0)

WebUI.comment('Checkbox Return Policy')

WebUI.click(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step8/Checkbox_ReturnPolicy'))

WebUI.comment('Terms and Condition')

WebUI.click(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step8/Checkbox_IsAgreed'))

WebUI.click(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step8/Button_Next_Step8'))

