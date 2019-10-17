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

'Empty Addressee Last Name'
WebUI.waitForElementVisible(findTestObject('SPACETIME/CONSUMER/Onboarding/Address Tab/textfield_AddresseeFirstName'), 0)

WebUI.setText(findTestObject('SPACETIME/CONSUMER/Onboarding/Address Tab/textfield_AddresseeFirstName'), 'Jane')

WebUI.setText(findTestObject('SPACETIME/CONSUMER/Onboarding/Address Tab/textfield_AddresseeLastName'), '')

WebUI.setText(findTestObject('SPACETIME/CONSUMER/Onboarding/Address Tab/textfield_Address'), 'Residencias de Manila Building 3')

WebUI.selectOptionByLabel(findTestObject('SPACETIME/CONSUMER/Onboarding/Address Tab/dropdown_Country'), 'Philippines', false)

WebUI.setText(findTestObject('SPACETIME/CONSUMER/Onboarding/Address Tab/textfield_State'), 'Pandacan')

WebUI.setText(findTestObject('SPACETIME/CONSUMER/Onboarding/Address Tab/textfield_City'), 'Metro Manila')

WebUI.setText(findTestObject('SPACETIME/CONSUMER/Onboarding/Address Tab/textfield_PostalCode'), '1011')

WebUI.click(findTestObject('SPACETIME/CONSUMER/Onboarding/Address Tab/button_AddAddress'))

WebUI.verifyElementNotVisible(findTestObject('SPACETIME/CONSUMER/Onboarding/Address Tab/button_delete'))

