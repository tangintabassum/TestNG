package com.test.listener;

import org.testng.ISuite;
import org.testng.ISuiteListener;

public class MyISuiteListener implements ISuiteListener {
    /**
     * This method is invoked before the SuiteRunner starts.
     *
     * @param suite The suite
     */
    public void onStart(ISuite suite) {
        System.out.println("This will print before all the Test <tag>");
    }

    /**
     * This method is invoked after the SuiteRunner has run all the tests in the suite.
     *
     * @param suite The suite
     */
    public void onFinish(ISuite suite) {
        System.out.println("This will print after all the test <tag>");
    }
}
