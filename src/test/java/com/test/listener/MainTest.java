package com.test.listener;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(com.test.listener.MyISuiteListener.class)
//@Listeners(com.test.listener.MyITestListener.class)
//@Listeners(com.test.listener.MyInvokeListener.class)
public class MainTest {

    @BeforeClass
    public void myMethod() {
        System.out.println("This is my method");
    }

    @Test
    public void TestOne() {
        System.out.println("This is test one");
    }

    @Test
    public void TestTwo() {
        System.out.println("This is test two");
        Assert.assertTrue(false);
    }
}
