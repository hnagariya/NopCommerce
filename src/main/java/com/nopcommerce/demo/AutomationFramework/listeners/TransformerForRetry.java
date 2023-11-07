package com.nopcommerce.demo.AutomationFramework.listeners;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

import com.nopcommerce.demo.AutomationFrameworkForNopcommerce.base.TestBase;

public class TransformerForRetry extends TestBase implements IAnnotationTransformer {
	@Override
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		annotation.setRetryAnalyzer(RetryFailedTests.class);
	}

}
