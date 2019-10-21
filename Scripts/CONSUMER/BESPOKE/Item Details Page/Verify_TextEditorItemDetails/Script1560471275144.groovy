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

WebUI.callTestCase(findTestCase('Utilities/CONSUMER/Consumer Login'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/CONSUMER/Homepage/textfield_Search'), 0)

WebUI.delay(1)

WebUI.comment('Search on Homepage')

WebUI.setText(findTestObject('BESPOKE DEL 2/CONSUMER/Homepage/textfield_Search'), 'Item Text Editor')

WebUI.sendKeys(findTestObject('BESPOKE DEL 2/CONSUMER/Homepage/textfield_Search'), Keys.chord(Keys.ENTER))

WebUI.waitForPageLoad(0)

WebUI.comment('Search Result Page')

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/CONSUMER/Search Results Page/button_Filters'), 0)

WebUI.click(findTestObject('BESPOKE DEL 2/CONSUMER/Search Results Page/item_Result'))

WebUI.switchToWindowIndex(1)

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/CONSUMER/Item Details Page/a_TextEditor/checkbox_TextEditor'), 0)

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/CONSUMER/Item Details Page/a_TextEditor/radiobutton_TextEditor'), 0)

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/CONSUMER/Item Details Page/a_TextEditor/bold_TextEditor'), 0)

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/CONSUMER/Item Details Page/a_TextEditor/italics_TextEditor'), 0)

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/CONSUMER/Item Details Page/a_TextEditor/underline_TextEditor'), 0)

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/CONSUMER/Item Details Page/a_TextEditor/strikethrough_TextEditor'), 
    0)

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/CONSUMER/Item Details Page/a_TextEditor/number1_TextEditor'), 0)

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/CONSUMER/Item Details Page/a_TextEditor/number2_TextEditor'), 0)

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/CONSUMER/Item Details Page/a_TextEditor/alignLeft_TextEditor'), 0)

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/CONSUMER/Item Details Page/a_TextEditor/center_TextEditor'), 0)

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/CONSUMER/Item Details Page/a_TextEditor/alignright_TextEditor'), 0)

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/CONSUMER/Item Details Page/a_TextEditor/justified_TextEditor'), 0)

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/CONSUMER/Item Details Page/a_TextEditor/table_TextEditor'), 0)

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/CONSUMER/Item Details Page/a_TextEditor/emoticonHeart_TextEditor'), 
    0)

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/CONSUMER/Item Details Page/a_TextEditor/emoticonSad_TextEditor'), 0)

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/CONSUMER/Item Details Page/a_TextEditor/emoticonBlush_TextEditor'), 
    0)

WebUI.closeBrowser()

