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

WebUI.openBrowser('http://preview.themeforest.net/item/se7en-bootstrap-3-responsive-admin-template/full_screen_preview/5423243?_ga=2.159799101.1638826239.1499748683-882079934.1480487329', 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Se7en - Bootstrap 3 Responsive/span_hightop-forms'))

WebUI.click(findTestObject('Page_Se7en - Bootstrap 3 Responsive/a_Form Components'))

WebUI.scrollToElement(findTestObject('Page_Se7en - Bootstrap 3 Responsive/input_file'), 0)

'Somehow, need to click on the parent div of the input file for upload to be success'
WebUI.click(findTestObject('Page_Se7en - Bootstrap 3 Responsive/div_file'))

WebUI.uploadFile(findTestObject('Page_Se7en - Bootstrap 3 Responsive/input_file'), 'C:\\sample.txt')

'Delay 10s to view the result'
WebUI.delay(10)

WebUI.scrollToElement(findTestObject('Page_Se7en - Bootstrap 3 Responsive/input_file_without_input'), 0)

'Somehow, need to click on the parent div of the input file for upload to be success'
WebUI.click(findTestObject('Page_Se7en - Bootstrap 3 Responsive/div_file_without_input'))

WebUI.uploadFile(findTestObject('Page_Se7en - Bootstrap 3 Responsive/input_file_without_input'), 'C:\\sample.txt')

'Delay 10s to view the result'
WebUI.delay(10)

WebUI.closeBrowser()

