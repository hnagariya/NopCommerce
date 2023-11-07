package com.nopcommerce.demo.AutomationFramework.utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.nopcommerce.demo.AutomationFrameworkForNopcommerce.base.TestBase;

public class Utils extends TestBase {
	
	public static void takeScreenShot(String testName) {
		String timeStamp = new SimpleDateFormat("dd.mm.YYYY.HH:mm:ss").format(new Date());
		System.out.println(timeStamp);
	
    //take screenshot
	File screenshotFile = ((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
	
    // save screeshot
	try {
		FileUtils.copyFile(screenshotFile, new File ("./FailedTestScreenShots"+"_"+testName+"_"+timeStamp+".jpg"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}} 
