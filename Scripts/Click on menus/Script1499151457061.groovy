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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://codepen.io/Tont/full/hdsev/')

WebUI.mouseOver(findTestObject('Page_CodePen - Pure CSS Click DropD/label_Tasto menu 01'))

'Delay 5s to view the result'
WebUI.delay(5)

WebUI.click(findTestObject('Page_CodePen - Pure CSS Click DropD/label_Tasto menu 01'))

WebUI.click(findTestObject('Page_CodePen - Pure CSS Click DropD/a_Sotto menu 1'))

WebUI.click(findTestObject('Page_CodePen - Pure CSS Click DropD/a_Sotto menu 2'))

WebUI.click(findTestObject('Page_CodePen - Pure CSS Click DropD/label_Tasto menu 02'))

WebUI.click(findTestObject('Page_CodePen - Pure CSS Click DropD/a_Sotto menu 3 (long text)'))

WebUI.click(findTestObject('Page_CodePen - Pure CSS Click DropD/a_Sotto menu 4'))

WebUI.click(findTestObject('Page_CodePen - Pure CSS Click DropD/a_Sotto menu 5'))

'Delay 10s to view the result'
WebUI.delay(10)

WebUI.closeBrowser()

