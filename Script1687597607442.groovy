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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Mobile.startExistingApplication('com.klg.chatime')

Mobile.tap(findTestObject('z/New Folder (1)/android.widget.EditText'), 0)

Mobile.setText(findTestObject('z/New Folder (1)/android.widget.EditText (1)'), 't36044354@gmail.com', 0)

Mobile.tap(findTestObject('z/New Folder (1)/android.widget.EditText (2)'), 0)

Mobile.setText(findTestObject('Object Repository/z/New Folder (1)/android.widget.EditText (3)'), 'Rifky1912', 0)

Mobile.tap(findTestObject('z/New Folder (1)/android.widget.Button'), 0)

WebUI.delay(10)

Mobile.verifyElementVisible(findTestObject('Object Repository/z/New Folder (1)/android.widget.Button verify x'), 0)

Mobile.tap(findTestObject('Object Repository/z/New Folder (1)/android.widget.Button x'), 0)

Mobile.tap(findTestObject('z/New Folder (1)/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('z/New Folder (1)/android.widget.Button k'), 0)

Mobile.tap(findTestObject('z/New Folder (1)/android.widget.Button y'), 0)

