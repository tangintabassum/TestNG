package com.test.listener;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

public class MyInvokeListener implements IInvokedMethodListener {

    @Override
    public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
        System.out.println("Before invocation");
        String str = method.getTestMethod().getQualifiedName();
        System.out.println(str);
    }

    @Override
    public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
        if (testResult.getStatus() == ITestResult.SUCCESS) {
            System.out.println("Success: " + testResult.getName());
        }
        else if (testResult.getStatus() == ITestResult.FAILURE) {
            /**
             * Screenshot code start from here
             * Add fail test screenshot in the report
             */
            System.out.println("Failed: " + testResult.getName());
        }
    }
}
