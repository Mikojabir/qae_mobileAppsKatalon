import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.util.internal.PathUtil as PathUtil
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.annotation.Keyword


Mobile.comment('Hi.. Lest Play')
CustomKeywords.'com.at.mobile.apps.androidTest.runApplications'()

Mobile.delay(1)

