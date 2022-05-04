package com.nopcommerce.testsuite;

import com.nopcommerce.pages.ElectronicsPage;
import com.nopcommerce.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ElectronicTest extends TestBase {
    ElectronicsPage electronicsPage = new ElectronicsPage();

    @Test
    public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully() throws InterruptedException {
        // Mouse Hover on “Electronics” Tab
        electronicsPage.setElectronicTab();
        //2.2 Mouse Hover on “Cell phones” and click
        electronicsPage.setCellPhone();
        //2.3 Verify the text “Cell phones”
        Assert.assertEquals(electronicsPage.verfyCellPhone(), "Cell phones", "message incorrect");
        // 	2.4 Click on List View Tab
        electronicsPage.setListView();
        //	2.5 Click on product name “Nokia Lumia 1020” link
        Thread.sleep(2000);
        electronicsPage.setNokiaLumia();
        //	2.6 Verify the text “Nokia Lumia 1020”
        Assert.assertEquals(electronicsPage.verifyNokia(), "Nokia Lumia 1020", "Wrong text");
//	2.7 Verify the price “$349.00”
        Assert.assertEquals(electronicsPage.verifyPrice(), "$349.00", "not matched");
        Thread.sleep(2000);
//	2.8 Change quantity to 2
        electronicsPage.setChangeQuntity("2");
        //	2.9 Click on “ADD TO CART” tab
        electronicsPage.setAddTocart();
        //	2.10 Verify the Message "The product has been added to your shopping cart" on Top green Bar
        Assert.assertEquals(electronicsPage.verifyProduct(), "The product has been added to your shopping cart", "incorrect");
//After that close the bar clicking on the cross button.
        electronicsPage.setClose();
        //	2.11 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
        electronicsPage.setShoppingCart();
        Thread.sleep(2000);
        electronicsPage.setGoToCart();
//	2.12 Verify the message "Shopping cart"
        Assert.assertEquals(electronicsPage.verifyShoppingCart(), "Shopping cart", "not matched");
//        electronicsPage.setClickQuntity();
//	2.13 Verify the quantity is 2
        System.out.println("Check: "+electronicsPage.verifyPriceTwo());
        String aQTY=electronicsPage.verifyPriceTwo();
        Assert.assertEquals(aQTY, "2", "not matched");
//2.14 Verify the Total $698.00
        Thread.sleep(2000);
        Assert.assertEquals(electronicsPage.verifyTotal(), "$698.00", "not matched");
//2.15 click on checkbox “I agree with the terms of service”
        electronicsPage.setTerms();
        //2.16 Click on checkout
        electronicsPage.setCheckOut();
//“2.17 Verify the Text “Welcome, Please Sign In!”
        Assert.assertEquals(electronicsPage.setWelCome(), "Welcome, Please Sign In!", "wrong text");
// 	2.18 Click on “REGISTER” tab
        electronicsPage.setRegister();
//	2.19 Verify the text “Register”
        Assert.assertEquals(electronicsPage.verifyRegister(), "Register", "not matched");
//	2.20 Fill the mandatory fields
        electronicsPage.setFirstName("Jackson");
        electronicsPage.setLastName("Michel");
        electronicsPage.setEmailId("jackson123@yahoo.com");
        electronicsPage.setPassWord("jakson123");
        electronicsPage.setConfirmPass("Jakson123");
        Thread.sleep(2000);
        //	2.21 Click on “REGISTER” Button
        electronicsPage.setRegiButton();
        //	2.22 Verify the message “Your registration completed”
        Assert.assertEquals(electronicsPage.verifyRegistration(), "Your registration completed", "error");
        ////	2.23 Click on “CONTINUE” tab
        electronicsPage.cliContinue();
////	2.24 Verify the text “Shopping cart”
        Assert.assertEquals(electronicsPage.verifyShop(), "Shopping cart", "error");
////	2.25 click on checkbox “I agree with the terms of service”
        electronicsPage.setAgree();
////	2.26 Click on “CHECKOUT”
        electronicsPage.setChekOt();
        Thread.sleep(2000);
        //click on checkout as guest
        electronicsPage.setAsGuest();
//        // //	2.27 Fill the Mandatory fields
        electronicsPage.setFirName("Jackson");
        electronicsPage.setLasName("Michel");
        electronicsPage.setEmailTab("jakson123yahoo.com");
        electronicsPage.setCountry("Denmark");
        electronicsPage.setCity("RedFord");
        electronicsPage.setAddress("65,RedFort");
        electronicsPage.setZip("AB12 34CD");
        electronicsPage.setCellPhone("12365478941");
        Thread.sleep(2000);
//	2.28 Click on “CONTINUE”
        electronicsPage.clicon();
        //	2.29 Click on Radio Button “2nd Day Air ($0.00)”
    electronicsPage.clickRadio();
    //2.30 Click on “CONTINUE”
electronicsPage.setCoBut();
//2.31 Select Radio Button “Credit Card”
    electronicsPage.setCreditCard();
////click on continue after credit card
electronicsPage.contiAfter();
////2.32 Select “Visa” From Select credit card dropdown
electronicsPage.setVisa();
Thread.sleep(2000);
//2.33 Fill all the details
electronicsPage.setCardHolder("Jakson");
electronicsPage.setCarNo("5061 5051 7469 9614");
electronicsPage.setMonth("12");
electronicsPage.setYear("2036");
electronicsPage.setCardCode("456");
//2.34 Click on “CONTINUE”CHECKOUT”
electronicsPage.setConCheck();
//2.35 Verify “Payment Method” is “Credit Card”
Assert.assertEquals(electronicsPage.verifyPayMent(),"Payment Method","error");
//2.36 Verify “Shipping Method” is “2nd Day Air”
Assert.assertEquals(electronicsPage.verifyShippping(),"Shipping Method","error");
//	2.37 Verify Total is “$698.00”
Assert.assertEquals(electronicsPage.verifyTotalCost(),"$698.00","error");
Thread.sleep(2000);
//	2.38 Click on “CONFIRM”
electronicsPage.setConfirm();
//	2.39 Verify the Text “Thank You”
Assert.assertEquals(electronicsPage.verifyThanks(),"Thank You","wrong message");
//	2.40 Verify the message “Your order has been successfully processed!”
Assert.assertEquals(electronicsPage.verifySuccessfull(),"Your order has been successfully processed!","worngText");
//	2.41 Click on “CONTINUE”
electronicsPage.cliconti();
//2.42 Verify the text “Welcome to our store”
Assert.assertEquals(electronicsPage.verifyStore(),"Welcome to our store","wrong message");
//2.43 Click on “Logout” link
electronicsPage.clickLogOut();

    }


}
