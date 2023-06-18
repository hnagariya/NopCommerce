package com.nopcommerce.demo.AutomationFrameworkForNopcommerce.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	public static WebDriver wd;
	FileInputStream fileInputStream;
	Properties prop;

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
		wd.get(prop.getProperty("URL"));
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(Long.parseLong(prop.getProperty("Implicit_Wait")), TimeUnit.SECONDS);
	}

	public void tearDown() {
		wd.quit();
	}
}
