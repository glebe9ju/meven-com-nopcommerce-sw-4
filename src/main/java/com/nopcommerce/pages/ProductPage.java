package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.openqa.selenium.By;

public class ProductPage extends Utility {
By sortBy = By.xpath("//select[@id='products-orderby']");
By orderText = By.xpath("//select[@id='products-orderby']");
//select[@id='products-orderby']
By buildYourCom = By.xpath("//h2[@class='product-title']//a[normalize-space()='Build your own computer']");
By addCart =By.xpath("(//button[@type='button'][normalize-space()='Add to cart'])[1]");
By productName =By.xpath("//div[@class='product-name']//h1");
By processEle = By.xpath("//select[@id='product_attribute_1']");
By ramEle = By.xpath("//select[@id='product_attribute_2']");
By hddEle = By.xpath("//input[@id='product_attribute_3_7']");
By visPrem = By.xpath("//input[@id='product_attribute_4_9']");
By totalCommander = By.xpath("//input[@id='product_attribute_5_12']");
By price = By.xpath("//span[@id='price-value-1']");
By addToCart = By.xpath("//button[@id='add-to-cart-button-1']");
By verifyMessage = By.xpath("//body/div[@id='bar-notification']/div[1]/p[1]");
By closeBar = By.xpath("//span[@class='close']");
By cartHover = By.xpath("//span[contains(text(),'Shopping cart')]");
By goTocart = By.xpath("//button[normalize-space()='Go to cart']");

    public void clickOnMenu(String menu){
        clickOnElement(By.linkText(menu));
    }
    public void sortOrder(String order){
        selectByVisibleTextFromDropDown(sortBy,order);
    }
public void orderBy(){
    System.out.println(getTextFromElement(orderText));
}
public void addToCart(){
        clickOnElement(addCart);
}
public String verfityPro(){
        return getTextFromElement(productName);
}
public void builYourOwnComp(){
        clickOnElement(buildYourCom);
}
public void selectProcessor(String processor){
        selectByVisibleTextFromDropDown(processEle,processor);
}
public void selectRam(String ram){
        selectByVisibleTextFromDropDown(ramEle,ram);
}
public void seleHdd(){
       setRadioElement(hddEle);
}
public void vistaPremium(){
       setRadioElement(visPrem);
}
    public void commander(){
        clickOnElement(totalCommander);
}
public String selectPrice(){
        return getTextFromElement(price);
}
public void clickAddToCard(){
        clickOnElement(addToCart);
}
public String massage(){
        return getTextFromElement(verifyMessage);
}
public void closeCrossButton(){
        clickOnElement(closeBar);
}
public void setCartHover(){
        mouseHoverToElement(cartHover);
}
public void setGoTocart(){
        clickOnElement(goTocart);
}

}
