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

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.ArcDashboardURL)

WebUI.maximizeWindow()

WebUI.waitForElementVisible(findTestObject('ADMIN/Arcadier Dashboard/Dashboard/div_brand-logo'), 0)

WebUI.setText(findTestObject('ADMIN/Arcadier Dashboard/Dashboard/input_Email'), GlobalVariable.ArcDashboardUser)

WebUI.setText(findTestObject('ADMIN/Arcadier Dashboard/Dashboard/input_Password'), GlobalVariable.ArcDashboardPass)

WebUI.click(findTestObject('ADMIN/Arcadier Dashboard/Dashboard/input_btn btn-default'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Arcadier Dashboard/Dashboard/a_Announcement'), 0)

WebUI.click(findTestObject('ADMIN/Arcadier Dashboard/Dashboard/a_Announcement'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Arcadier Dashboard/Dashboard/h1_Announcement'), 0)

WebUI.comment('Image Only')

WebUI.click(findTestObject('ADMIN/Arcadier Dashboard/Dashboard/a_Add New'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Arcadier Dashboard/Dashboard/label_Title'), 0)

WebUI.uploadFile(findTestObject('ADMIN/Arcadier Dashboard/Dashboard/div_Upload'), 'C:\\\\SeleniumIDE\\\\Image\\\\3412.jpg')

WebUI.click(findTestObject('ADMIN/Arcadier Dashboard/Dashboard/button_Upload'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Arcadier Dashboard/Dashboard/h1_Announcement'), 0)

WebUI.comment('Title Only')

WebUI.click(findTestObject('ADMIN/Arcadier Dashboard/Dashboard/a_Add New'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Arcadier Dashboard/Dashboard/label_Title'), 0)

WebUI.setText(findTestObject('ADMIN/Arcadier Dashboard/Dashboard/input_title'), 'Announcement ~!@#$%^&*()_+')

WebUI.click(findTestObject('ADMIN/Arcadier Dashboard/Dashboard/button_Upload'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Arcadier Dashboard/Dashboard/h1_Announcement'), 0)

WebUI.comment('Description only')

WebUI.click(findTestObject('ADMIN/Arcadier Dashboard/Dashboard/a_Add New'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Arcadier Dashboard/Dashboard/label_Title'), 0)

WebUI.setText(findTestObject('ADMIN/Arcadier Dashboard/Dashboard/textarea_description'), 'Lorem ipsum dolor sit amet, ad ius assum erant comprehensam, usu ex doctus constituam, movet probatus pertinax cum an. Quot magna disputationi duo ad. Copiosae persecuti eu qui, eam in error populo, nonumes invidunt ne vix. Ut malorum elaboraret ius, vel vero iusto no.')

WebUI.click(findTestObject('ADMIN/Arcadier Dashboard/Dashboard/button_Upload'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Arcadier Dashboard/Dashboard/h1_Announcement'), 0)

WebUI.comment('Hyperlink only')

WebUI.click(findTestObject('ADMIN/Arcadier Dashboard/Dashboard/a_Add New'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Arcadier Dashboard/Dashboard/label_Title'), 0)

WebUI.setText(findTestObject('ADMIN/Arcadier Dashboard/Dashboard/input_hyperlink'), 'google.com')

WebUI.click(findTestObject('ADMIN/Arcadier Dashboard/Dashboard/button_Upload'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Arcadier Dashboard/Dashboard/h1_Announcement'), 0)

WebUI.comment('All input')

WebUI.click(findTestObject('ADMIN/Arcadier Dashboard/Dashboard/a_Add New'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Arcadier Dashboard/Dashboard/label_Title'), 0)

WebUI.delay(1)

WebUI.uploadFile(findTestObject('ADMIN/Arcadier Dashboard/Dashboard/div_Upload'), 'C:\\\\SeleniumIDE\\\\Image\\\\image7.jpg')

WebUI.setText(findTestObject('ADMIN/Arcadier Dashboard/Dashboard/input_title'), 'Announcement ~!@#$%^&*()_+')

WebUI.setText(findTestObject('ADMIN/Arcadier Dashboard/Dashboard/textarea_description'), 'Lorem ipsum dolor sit amet, ad ius assum erant comprehensam, usu ex doctus constituam, movet probatus pertinax cum an. Quot magna disputationi duo ad. Copiosae persecuti eu qui, eam in error populo, nonumes invidunt ne vix. Ut malorum elaboraret ius, vel vero iusto no.')

WebUI.setText(findTestObject('ADMIN/Arcadier Dashboard/Dashboard/input_hyperlink'), 'google.com')

WebUI.click(findTestObject('ADMIN/Arcadier Dashboard/Dashboard/button_Upload'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Arcadier Dashboard/Dashboard/h1_Announcement'), 0)

WebUI.comment('for delete')

WebUI.click(findTestObject('ADMIN/Arcadier Dashboard/Dashboard/a_Add New'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Arcadier Dashboard/Dashboard/label_Title'), 0)

WebUI.delay(1)

WebUI.uploadFile(findTestObject('ADMIN/Arcadier Dashboard/Dashboard/div_Upload'), 'C:\\\\SeleniumIDE\\\\Image\\\\image3.jpg')

WebUI.setText(findTestObject('ADMIN/Arcadier Dashboard/Dashboard/input_title'), 'Delete this')

WebUI.setText(findTestObject('ADMIN/Arcadier Dashboard/Dashboard/textarea_description'), 'Lorem ipsum dolor sit amet, ad ius assum erant comprehensam, usu ex doctus constituam, movet probatus pertinax cum an. Quot magna disputationi duo ad. Copiosae persecuti eu qui, eam in error populo, nonumes invidunt ne vix. Ut malorum elaboraret ius, vel vero iusto no.')

WebUI.setText(findTestObject('ADMIN/Arcadier Dashboard/Dashboard/input_hyperlink'), 'google.com')

WebUI.click(findTestObject('ADMIN/Arcadier Dashboard/Dashboard/button_Upload'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Arcadier Dashboard/Dashboard/h1_Announcement'), 0)

WebUI.comment('for edit')

WebUI.click(findTestObject('ADMIN/Arcadier Dashboard/Dashboard/a_Add New'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Arcadier Dashboard/Dashboard/label_Title'), 0)

WebUI.delay(1)

WebUI.uploadFile(findTestObject('ADMIN/Arcadier Dashboard/Dashboard/div_Upload'), 'C:\\\\SeleniumIDE\\\\Image\\\\image2.jpg')

WebUI.setText(findTestObject('ADMIN/Arcadier Dashboard/Dashboard/input_title'), 'FOR EDIT')

WebUI.setText(findTestObject('ADMIN/Arcadier Dashboard/Dashboard/textarea_description'), 'Lorem ipsum dolor sit amet, ad ius assum erant comprehensam, usu ex doctus constituam, movet probatus pertinax cum an. Quot magna disputationi duo ad. Copiosae persecuti eu qui, eam in error populo, nonumes invidunt ne vix. Ut malorum elaboraret ius, vel vero iusto no.')

WebUI.setText(findTestObject('ADMIN/Arcadier Dashboard/Dashboard/input_hyperlink'), 'google.com')

WebUI.click(findTestObject('ADMIN/Arcadier Dashboard/Dashboard/button_Upload'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Arcadier Dashboard/Dashboard/h1_Announcement'), 0)

WebUI.comment('Search by title')

WebUI.delay(1)

WebUI.setText(findTestObject('ADMIN/Arcadier Dashboard/Dashboard/input_search'), 'announcement')

WebUI.sendKeys(findTestObject('ADMIN/Arcadier Dashboard/Dashboard/input_search'), Keys.chord(Keys.ENTER))

WebUI.waitForElementVisible(findTestObject('ADMIN/Arcadier Dashboard/Dashboard/td_time 1st row'), 0)

WebUI.verifyElementText(findTestObject('ADMIN/Arcadier Dashboard/Dashboard/td_title 1st row'), 'Announcement ~!@#$%^&*()_+')

WebUI.waitForElementVisible(findTestObject('ADMIN/Arcadier Dashboard/Dashboard/logout_button'), 0)

WebUI.click(findTestObject('ADMIN/Arcadier Dashboard/Dashboard/logout_button'))

WebUI.closeBrowser()

