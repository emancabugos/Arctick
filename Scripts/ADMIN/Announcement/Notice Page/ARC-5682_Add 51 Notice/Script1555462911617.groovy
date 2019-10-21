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

findTestData('null').getValue(1, 1) == findTestData('null').getValue(1, 1)

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.dashboardurl)

WebUI.maximizeWindow()

WebUI.waitForElementVisible(findTestObject('ADMIN/Arcadier Dashboard (1)/Dashboard - Login Page/logo_Arcadier'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Arcadier Dashboard (1)/Dashboard - Login Page/logo_Arcadier'), 0)

WebUI.setText(findTestObject('ADMIN/Arcadier Dashboard (1)/Dashboard - Login Page/textfield_Email'), GlobalVariable.dashboardusername)

WebUI.setText(findTestObject('ADMIN/Arcadier Dashboard (1)/Dashboard - Login Page/textfield_Password'), GlobalVariable.dashboardpassword)

WebUI.click(findTestObject('ADMIN/Arcadier Dashboard (1)/Dashboard - Login Page/button_Login'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Arcadier Dashboard (1)/Dashboard - CS Support Page/link_Announcement'), 0)

WebUI.click(findTestObject('ADMIN/Arcadier Dashboard (1)/Dashboard - CS Support Page/link_Notice'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Arcadier Dashboard (1)/Dashboard - Notice Page/button_Add New'), 0)

for (def rowNum = 1; rowNum <= findTestData('null').getRowNumbers(); rowNum++) {
    WebUI.click(findTestObject('ADMIN/Arcadier Dashboard (1)/Dashboard - Notice Page/button_Add New'))

    WebUI.delay(2)

    WebUI.waitForElementVisible(findTestObject('ADMIN/Arcadier Dashboard (1)/Dashboard - Notice Page/popup_label_Title'), 0)

    WebUI.setText(findTestObject('ADMIN/Arcadier Dashboard (1)/Dashboard - Notice Page/popup_textfield_Title'), findTestData('null').getValue(
            1, rowNum))

    WebUI.setText(findTestObject('ADMIN/Arcadier Dashboard (1)/Dashboard - Notice Page/popup_textfield_Hyperlink'), findTestData('null').getValue(
            2, rowNum))

    WebUI.click(findTestObject('ADMIN/Arcadier Dashboard (1)/Dashboard - Notice Page/popup_button_Upload'))

    WebUI.delay(3)

    WebUI.waitForElementVisible(findTestObject('ADMIN/Arcadier Dashboard (1)/Dashboard - Notice Page/button_Delete'), 0)

    WebUI.verifyElementPresent(findTestObject('ADMIN/Arcadier Dashboard (1)/Dashboard - Notice Page/button_Add New'), 0)
}

WebUI.waitForElementVisible(findTestObject('ADMIN/Arcadier Dashboard (1)/Dashboard - Notice Page/button_Delete'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Arcadier Dashboard (1)/Dashboard - CS Support Page/button_Logout'), 0)

WebUI.delay(2)

WebUI.click(findTestObject('ADMIN/Arcadier Dashboard (1)/Dashboard - CS Support Page/button_Logout'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Arcadier Dashboard (1)/Dashboard - Login Page/textfield_Email'), 0)

