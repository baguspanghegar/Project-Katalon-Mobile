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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Mobile.startApplication('/Users/bri/Documents/Pelatihan/FINAL PROJECTS/MOBILE/app-debug.apk', true)

Mobile.tap(findTestObject('Object Repository/perubahan 4/android.widget.ImageButton'), 0)

Mobile.tap(findTestObject('Object Repository/perubahan 4/android.widget.CheckedTextView - Make a Payment'), 0)

Mobile.tap(findTestObject('Object Repository/perubahan 4/android.widget.ImageButton (1)'), 0)

Mobile.setText(findTestObject('Object Repository/perubahan 4/android.widget.EditText - Payee Name'), 'Mouse', 0)

Mobile.tap(findTestObject('Object Repository/perubahan 4/android.widget.Button - ADD'), 0)

Mobile.tap(findTestObject('Object Repository/perubahan 4/android.widget.ImageButton (2)'), 0)

Mobile.setText(findTestObject('perubahan 4/android.widget.EditText - Payee Name'), 'Ram', 0)

Mobile.tap(findTestObject('perubahan 4/android.widget.Button - ADD'), 0)

Mobile.tap(findTestObject('Object Repository/perubahan 4/android.widget.Spinner'), 0)

Mobile.tap(findTestObject('Object Repository/perubahan 4/android.widget.CheckedTextView - Mouse (P1)'), 0)

Mobile.setText(findTestObject('Object Repository/perubahan 4/android.widget.EditText - Amount'), '650', 0)

Mobile.tap(findTestObject('Object Repository/perubahan 4/android.widget.Button - Make Payment'), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject('Object Repository/perubahan 4/android.widget.CheckedTextView - Make a Transfer'), 0)

Mobile.tap(findTestObject('Object Repository/perubahan 4/android.widget.Button - ADD ACCOUNT'), 0)

Mobile.setText(findTestObject('perubahan 4/android.widget.EditText - Account Name'), 'Store', 0)

Mobile.setText(findTestObject('Object Repository/perubahan 4/android.widget.EditText - Initial Balance (Optional)'), '5000', 
    0)

Mobile.tap(findTestObject('Object Repository/perubahan 4/android.widget.Button - ADD (1)'), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject('Object Repository/perubahan 4/android.widget.Spinner (1)'), 0)

Mobile.tap(findTestObject('Object Repository/perubahan 4/android.widget.CheckedTextView - Store (5000.00)'), 0)

Mobile.tap(findTestObject('Object Repository/perubahan 4/android.widget.Spinner (2)'), 0)

Mobile.tap(findTestObject('Object Repository/perubahan 4/android.widget.CheckedTextView - Gaming (350.00)'), 0)

Mobile.setText(findTestObject('Object Repository/perubahan 4/android.widget.EditText - Transfer Amount'), '4500', 0)

Mobile.tap(findTestObject('Object Repository/perubahan 4/android.widget.Button - Confirm Transfer'), 0)

Mobile.closeApplication()

