
/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */

import com.kms.katalon.core.testobject.TestObject



def static "com.at.mobile.apps.androidTest.runApplications"() {
    (new com.at.mobile.apps.androidTest()).runApplications()
}


def static "com.at.mobile.apps.androidTest.getCurrentSessionMobileDriver"() {
    (new com.at.mobile.apps.androidTest()).getCurrentSessionMobileDriver()
}


def static "com.at.mobile.apps.androidTest.infoFirstLaunchApps"() {
    (new com.at.mobile.apps.androidTest()).infoFirstLaunchApps()
}


def static "com.at.mobile.apps.androidTest.verifyText"() {
    (new com.at.mobile.apps.androidTest()).verifyText()
}


def static "com.at.mobile.apps.androidTest.menuAccessbility"() {
    (new com.at.mobile.apps.androidTest()).menuAccessbility()
}

/**
	 * Check if element present in timeout
	 * @param to Katalon test object
	 * @param timeout time to wait for element to show up
	 * @return true if element present, otherwise false
	 */
def static "com.at.mobile.apps.sampleTest.isElementPresent_Mobile"(
    	TestObject to	
     , 	int timeout	) {
    (new com.at.mobile.apps.sampleTest()).isElementPresent_Mobile(
        	to
         , 	timeout)
}

/**
	 * Get mobile driver for current session
	 * @return mobile driver for current session
	 */
def static "com.at.mobile.apps.sampleTest.getCurrentSessionMobileDriver"() {
    (new com.at.mobile.apps.sampleTest()).getCurrentSessionMobileDriver()
}
