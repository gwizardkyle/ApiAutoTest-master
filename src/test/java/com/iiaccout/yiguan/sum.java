package com.iiaccout.yiguan;

import io.qameta.allure.Feature;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners()
public class sum {
    @Feature("算数计算功能验证")
    @BeforeClass //只运行一次
    public void beforeClass() {
        System.out.println("this is before class");
    }

    @Test
    public void TestNgLearn() {
        System.out.println("this is TestNG test case");
    }

    @AfterClass //只运行一次
    public void afterClass() {
        System.out.println("this is after class");
    }
}



