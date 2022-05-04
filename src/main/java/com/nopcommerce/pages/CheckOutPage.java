package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.openqa.selenium.By;

public class CheckOutPage extends Utility {
    By shopText = By.xpath("//div[@class='page-title']//h1");
//By quantityField  = By.xpath("//input[@id='itemquantity11220']");
By quantityField  = By.xpath("//input[starts-with(@id,'itemquantity')]");
By updateCart = By.xpath("//button[@id='updatecart']");
By totalPrice = By.xpath("//span[@class='value-summary']//strong[contains(text(),'$2,950.00')]");
By checkBox = By.xpath("//input[@id='termsofservice']");
By checkOut = By.xpath("//button[@id='checkout']");
By welCome = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");
By checkOutGest = By.xpath("//button[contains(text(),'Checkout as Guest')]");
    public String verifyShopText(){
        return getTextFromElement(shopText);
    }
    public void qtyField(){
        clickOnElement(quantityField);
        clearElement(quantityField);
        sendTextToElement(quantityField,"2");
    }
    public void setUpdateCart(){
        clickOnElement(updateCart);
    }
    public String verifyTotalPrice(){
        return getTextFromElement(totalPrice);
    }
    public void setCheckBox(){
        setCheckBoxElement(checkBox);
    }
    public void setCheckOut(){
        clickOnElement(checkOut);
    }
    public String verifyWelcome(){
        return getTextFromElement(welCome);
    }
    public void setCheckOutGest(){
        clickOnElement(checkOutGest);
    }
}
