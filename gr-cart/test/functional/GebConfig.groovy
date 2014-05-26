import org.openqa.selenium.chrome.ChromeDriver

driver = { new ChromeDriver() }

private void downloadDriver(File file, String path) {
  if (!file.exists()) {
    def ant = new AntBuilder()
    ant.get(src: path, dest: 'driver.zip')
    ant.unzip(src: 'driver.zip', dest: file.parent)
    ant.delete(file: 'driver.zip')
    ant.chmod(file: file, perm: '700')
  }
}

environments {

	// run as “grails -Dgeb.env=chrome test-app”
	// See: http://code.google.com/p/selenium/wiki/ChromeDriver
	chrome {
		def chromeDriver = new File('/Users/gdboling/Development/chromedriver/chromedriver')
    	downloadDriver(chromeDriver, "http://chromedriver.storage.googleapis.com/2.9/chromedriver_mac32.zip")
    	System.setProperty('webdriver.chrome.driver', chromeDriver.absolutePath)
		driver = { new ChromeDriver() }
	}

	// run as “grails -Dgeb.env=firefox test-app”
	// See: http://code.google.com/p/selenium/wiki/FirefoxDriver
	firefox {
		//driver = { new FirefoxDriver() }
	}

}