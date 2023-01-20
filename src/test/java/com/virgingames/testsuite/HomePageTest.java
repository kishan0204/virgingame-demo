package com.virgingames.testsuite;

import com.virgingames.pages.HomePage;
import com.virgingames.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {
HomePage homePage=new HomePage();
    @Test
    public void  verifyUserShouldNavigateToLoginPageSuccessfully() throws InterruptedException {
        //acceptAlert();
        homePage.clickOnAcceptButton();
        homePage.clickOnLoginButton();
        Thread.sleep(1500);
        homePage.verifyMessagelink();

    }
}
