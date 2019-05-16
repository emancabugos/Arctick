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

WebUI.verifyElementPresent(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step1/Image_HeaderStep1'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step1/Arcadier_LogoStep1'), 0)

WebUI.verifyElementText(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step1/TextLabel_Tell us a little about y'), 
    '1. Tell us a little about yourself')

WebUI.verifyElementText(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step1/Textlabel_Are you already managing'), 
    'Are you already managing merchants or consumers?')

WebUI.verifyElementPresent(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step1/1stDropdown_Please select one...Im'), 
    0)

WebUI.verifyOptionsPresent(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step1/1stDropdown_Please select one...Im'), 
    ['Please select one...', 'I’m just playing around', 'I’m trying to test a new marketplace business', 'I intend to manage consumers, not merchants'
        , 'I’m managing them offline', 'I’m managing them on a different system'])

WebUI.verifyElementText(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step1/Textlabel_What type of marketplace'), 
    'What type of marketplace are you building?')

WebUI.verifyElementPresent(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step1/2ndDropdown_Please select one...Don'), 
    0)

WebUI.verifyOptionsPresent(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step1/2ndDropdown_Please select one...Don'), 
    ['Please select one...', 'Don’t know yet!', 'Selling and buying used items', 'Selling and buying new items', 'Selling and buying general items'
        , 'Space rental', 'Item rental', 'Hiring Professional Services', 'Hiring General Services', 'Farmer’s market', 'Online Tradeshow/Exhibition'
        , 'Something else!'])

WebUI.verifyElementText(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step1/Textlabel_Who are you'), 'Who are you?')

WebUI.verifyElementPresent(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step1/3rdDropdown_Im an individualIm work'), 
    0)

WebUI.verifyOptionsPresent(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step1/3rdDropdown_Im an individualIm work'), 
    ['I’m an individual', 'I’m working with other individuals on this', 'I’m representing a company', 'Someone else!'])

WebUI.verifyElementPresent(findTestObject('ADMIN/Admin Onboarding Page/Admin_Onboarding_Step1/Button_NEXT_Step1'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Admin Features and Control/Search Radius/select_10'), 0)

