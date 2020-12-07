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

Mobile.tap(findTestObject('Object Repository/perubahan 3/android.widget.Button - CREATE A PROFILE'), 0)

Mobile.setText(findTestObject('Object Repository/perubahan 3/android.widget.EditText - First Name'), 'bagus', 0)

Mobile.setText(findTestObject('Object Repository/perubahan 3/android.widget.EditText - Last Name'), 'panghegar', 0)

Mobile.setText(findTestObject('Object Repository/perubahan 3/android.widget.EditText - Country'), 'indonesia', 0)

Mobile.setText(findTestObject('Object Repository/perubahan 3/android.widget.EditText - Username'), 'baguspanghegar', 0)

Mobile.setText(findTestObject('Object Repository/perubahan 3/android.widget.EditText - Password'), 'Supern0v@', 0)

Mobile.setText(findTestObject('Object Repository/perubahan 3/android.widget.EditText - Confirm Password'), 'Supern0v@', 
    0)

Mobile.tap(findTestObject('Object Repository/perubahan 3/android.widget.Button - Create Profile'), 0)

Mobile.tap(findTestObject('Object Repository/perubahan 3/android.widget.Button - LOGIN'), 0)

Mobile.tap(findTestObject('Object Repository/perubahan 3/android.widget.Button - ADD ACCOUNT'), 0)

Mobile.setText(findTestObject('Object Repository/perubahan 3/android.widget.EditText - Account Name'), 'Gaming', 0)

Mobile.setText(findTestObject('Object Repository/perubahan 3/android.widget.EditText - Initial Balance (Optional)'), '500', 
    0)

Mobile.tap(findTestObject('Object Repository/perubahan 3/android.widget.Button - ADD'), 0)

Mobile.tap(findTestObject('Object Repository/perubahan 3/android.widget.ImageButton'), 0)

Mobile.tap(findTestObject('Object Repository/perubahan 3/android.widget.CheckedTextView - Make a Deposit'), 0)

Mobile.setText(findTestObject('Object Repository/perubahan 3/android.widget.EditText - Enter Deposit Amount ()'), '500', 
    0)

Mobile.tap(findTestObject('Object Repository/perubahan 3/android.widget.Button - DEPOSIT'), 0)

Mobile.closeApplication()

