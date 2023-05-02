package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utilities;
import org.openqa.selenium.By;

public class MacBookPage extends Utilities {
        By textMacBook=By.xpath("//h1[text()='MacBook']");
        By addToCartButton=By.cssSelector("#button-cart");
        By textSuccess=By.cssSelector(" .alert.alert-success.alert-dismissible");
        By linkShoppingCart=By.cssSelector(".alert.alert-success.alert-dismissible a:nth-of-type(2)");

        public String getTextMacBook(){
            return getTextFromElement(textMacBook);
        }
        public void clickOnAddToCartButton(){
            clickOnElement(addToCartButton);
        }
        public String getTextSuccess(){
            return getTextFromElement(textSuccess);
        }
        public void clickLinkShoppingCart(){
            clickOnElement(linkShoppingCart);
        }

}
