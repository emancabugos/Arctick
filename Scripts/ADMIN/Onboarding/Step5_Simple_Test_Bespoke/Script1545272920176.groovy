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

WebUI.comment('Step 5')

WebUI.waitForElementVisible(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step5/h1_5. Preview  pick out a mark'), 
    0)

WebUI.comment('Previous Button Test')

WebUI.waitForElementVisible(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step5/h1_5. Preview  pick out a mark'), 
    0)

WebUI.delay(2)

if (GlobalVariable.Theme == 'Theme 1') {
    WebUI.click(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step5/Bespoke_Theme_Selection/Theme1_select'))
} else if (GlobalVariable.Theme == 'Theme 2') {
    WebUI.click(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step5/Bespoke_Theme_Selection/Theme2_select'))
} else if (GlobalVariable.Theme == 'Theme 3') {
    WebUI.click(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step5/Bespoke_Theme_Selection/Theme3_select'))
} else if (GlobalVariable.Theme == 'Theme 4') {
    WebUI.click(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step5/Bespoke_Theme_Selection/Theme4_select'))
}

WebUI.click(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step5/Button_Next_Step5'))

