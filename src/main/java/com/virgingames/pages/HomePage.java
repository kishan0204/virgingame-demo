package com.virgingames.pages;

import com.virgingames.utility.Utility;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.LogManager;
import java.util.logging.Logger;

public class HomePage extends Utility {
    By clickAccept = By.xpath("//div[@class = 'option']//label[@data-qa = 'accept-cookie-policy']");
    By loginButton = By.xpath("//a[contains(text(),'Login')]");
    By verifyMessage =By.xpath("//h1[contains(text(),'Pardon Our Interruption')]");

    public void clickOnLoginButton() {
        clickOnElement(loginButton);


    }

    public void clickOnAcceptButton() {
        clickOnElement(clickAccept);
    }
    public void verifyMessagelink(){
         verifyTextFromElements(verifyMessage,"Pardon Our Interruption"); //Pardon Our Interruption
    }
}
