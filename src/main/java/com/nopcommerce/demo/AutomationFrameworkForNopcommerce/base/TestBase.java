
package com.nopcommerce.demo.AutomationFrameworkForNopcommerce.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;

import com.nopcommerce.demo.AutomationFramework.listeners.WebDriverEvents;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	public static WebDriver wd;
	FileInputStream fileInputStream;
	Properties prop;
	public WebDriverWait wait;
	public static Logger logger;
	private WebDriverEvents events;
	private EventFiringWebDriver eDriver;
	

	public TestBase() {
		prop = new Properties();
		try {
			fileInputStream = new FileInputStream(
					"C:\\Users\\Neelam Nagariya\\eclipse-workspace\\AutomationFrameworkForNopcommerce\\src\\main\\java\\com\\nopcommerce\\demo\\AutomationFrameworkForNopcommerce\\config\\config.properties");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			prop.load(fileInputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	@BeforeClass
	public void setUpLogger() {
		logger=Logger.getLogger(TestBase.class);
		PropertyConfigurator.configure("log4j.properties");
		BasicConfigurator.configure();
		logger.setLevel(Level.INFO);
	}
	
	public void initialisation() {
		String browserName = prop.getProperty("browser");
		switch (browserName) {
		case "Chrome":
			wd = WebDriverManager.chromedriver().create();
			break;
		case "Edge":
			wd = WebDriverManager.edgedriver().create();
			break;
		case "FireFox":
			wd = WebDriverManager.firefoxdriver().create();
			break;
		default:
			System.out.println("Not a valid driver name");
		}
		
		eDriver = new EventFiringWebDriver(wd);
		events = new WebDriverEvents();
		eDriver.register(events);
		wd = eDriver;

		wd.get(prop.getProperty("URL"));
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(Long.parseLong(prop.getProperty("Implicit_Wait")), TimeUnit.SECONDS);
		wait = new WebDriverWait(wd, 20);
	}

	public void tearDown() {
		wd.quit();
	}
}
